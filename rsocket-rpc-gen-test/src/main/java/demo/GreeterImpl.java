package demo;

import com.google.protobuf.Empty;
import demo.proto.HelloRequest;
import demo.proto.HelloResponse;
import demo.proto.RsocketGreeterRpc;
import io.netty.buffer.ByteBuf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public class GreeterImpl implements RsocketGreeterRpc.GreeterImplBase {
  
  Logger logger = LoggerFactory.getLogger(GreeterImpl.class);

  @Override
  public Mono<HelloResponse> greet(HelloRequest request, ByteBuf metadata) {
    logger.info("Inside the greet function");
    return Mono.just(
        HelloResponse.newBuilder().setMessage("hello response:" + request.getName()).build())
        .doOnNext(helloResponse -> logger.info("replying back result {}",helloResponse.getMessage()));
  }

  @Override
  public Mono<Empty> greetAndForget(HelloRequest request, ByteBuf metadata) {
    logger.info("inside the greetAndForget service impl");
    return Mono.empty();
  }

  @Override
  public Flux<HelloResponse> multiGreet(HelloRequest request, ByteBuf metadata) {
    logger.info("inside the multiGreet service implementation");
    return Flux.<HelloResponse>create(
            emmiter -> {
              for (int i = 0; i < 10; i++)
                emmiter.next(HelloResponse.newBuilder().setMessage("hello" + i).build());
              emmiter.complete();
            })
        .doOnNext(e -> logger.info("emmiting {}" , e.getMessage()))
        .doFinally(
            signalType -> logger.info("server doOnFinally signal {}" ,signalType.toString()))
        .doOnError(er -> logger.info("error in server impl {}", er.getMessage()))
        .doOnCancel(
            () -> {
              logger.info("server inside the doCancel");
            });
  }

  @Override
  public Flux<HelloResponse> streamGreet(Flux<HelloRequest> request, ByteBuf metadata) {
    return Flux.create(
        emmiter -> {
          for (int i = 0; i < 10; i++)
            emmiter.next(HelloResponse.newBuilder().setMessage("hello" + i).build());
          emmiter.complete();
        });
  }
}

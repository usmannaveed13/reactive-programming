import reactor.core.publisher.Flux;

public class FirstFlux {
    public static void main(String[] args) {
        Flux<String> stringFlux = Flux.just("Usman", "Naveed", "Arizonan");
        stringFlux.subscribe(System.out::println);
    }
}

package com.nttada.bcp1.mscredit.proxy;
import com.nttada.bcp1.mscredit.model.Customer;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class CreditProxy {
    private final WebClient.Builder webClientBuilder = WebClient.builder();
    //get client by id
    public Mono<Customer> getCustomer(String idCustomer){
        return webClientBuilder.build()
                .get()
                .uri("http://localhost:9020/customer/{idCustomer}", idCustomer)
                .retrieve()
                .bodyToMono(Customer.class);
    }
}

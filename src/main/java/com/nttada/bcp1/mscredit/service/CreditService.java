package com.nttada.bcp1.mscredit.service;

import com.nttada.bcp1.mscredit.model.Credit;
import com.nttada.bcp1.mscredit.model.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {
    Flux<Credit> getAll();
    Flux<Credit> getAllByIdCustomer(String idCustomer);
    Mono<Credit> getCreditById(String id);
    Mono<Credit> save(Credit credit);
    Mono<Credit> getCreditByIdCustomer(String idCustomer);
    void delete(String id);
    Mono<Customer> test(String idCustomer);
}

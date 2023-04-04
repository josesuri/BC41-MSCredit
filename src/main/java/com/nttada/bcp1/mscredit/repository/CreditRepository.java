package com.nttada.bcp1.mscredit.repository;

import com.nttada.bcp1.mscredit.model.Credit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CreditRepository extends ReactiveMongoRepository<Credit, String> {
    public Mono<Credit> findByIdCustomer(String idCustomer);
    public Flux<Credit> findAllByIdCustomer(String idCustomer);
}

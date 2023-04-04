package com.nttada.bcp1.mscredit.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("credit")
public class Credit {
    @Id
    private String id;
    private String idCustomer;
    private String cardNumber;
    private String creditType;
    private String accountNumber;
    private Float balance;
    private Float creditLine;
    private Float debt;
}
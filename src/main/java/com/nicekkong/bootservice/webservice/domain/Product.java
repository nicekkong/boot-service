package com.nicekkong.bootservice.webservice.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private long price;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    public void updateStore(Store store) {
        this.store = store;
    }
}

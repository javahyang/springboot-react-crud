package com.example.springbootreactcrud.domain.client;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    @Builder
    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

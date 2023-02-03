package com.monkilatech.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonInclude(Include.NON_EMPTY)
    private String name;

    @JsonInclude(Include.NON_EMPTY)
    private String categorie;

    @JsonInclude(Include.NON_EMPTY)
    private String price;

    @JsonInclude(Include.NON_EMPTY)
    private String image;
}

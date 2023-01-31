package com.monkilatech.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class User {

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonInclude(Include.NON_EMPTY)
    private String username;

    @JsonInclude(Include.NON_EMPTY)
    private String password;

    @JsonInclude(Include.NON_EMPTY)
    private String phoneNumber;

    @JsonInclude(Include.NON_EMPTY)
    private String email;

    @JsonInclude(Include.NON_EMPTY)
    private String photo;

    @JsonInclude(Include.NON_EMPTY)
    private String typeCompte;
}

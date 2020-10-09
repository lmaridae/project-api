package ru.ulmaridae.projectapi.models;

import org.springframework.data.annotation.Id;

public class Card {

    @Id
    private String id;

    private String description;
    private String data;
}

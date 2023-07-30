package com.example.Chatbot.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@Table(name = "Joke")
@Getter
@Setter
@ToString
public class Joke {
    @Id
    @Column(name = "id")
    private int joke_id;

    @Column(name = "joke_text")
    private String joke_text;

    @Column(name = "joke_date")
    private Timestamp joke_date;

    public Joke(int joke_id, String joke_text, Timestamp joke_date) {
        this.joke_id = joke_id;
        this.joke_text = joke_text;
        this.joke_date = joke_date;
    }
}

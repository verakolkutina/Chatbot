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
@Getter
@Setter
@ToString
@Table(name = "Horoscope")

public class Horoscope {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "zodiac_sign")
    private String zodiac_sign;

    @Column(name = "prediction")
    private String prediction_text;

    @Column(name = "zodiac_date")
    private Timestamp zodiac_date;

    public Horoscope(int id, String zodiac_sign, String prediction_text, Timestamp zodiac_date) {
        this.id = id;
        this.zodiac_sign = zodiac_sign;
        this.prediction_text = prediction_text;
        this.zodiac_date = zodiac_date;
    }
}

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
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    private Long  chat_id;

    @Column(name = "name")
    private String user_name;

    @Column(name = "birth_date")
    private Timestamp birth_date;

    @Column(name = "isActive")
    private Boolean isActive;

    public User(Long chat_id, String user_name, Timestamp birth_date, Boolean isActive) {
        this.chat_id = chat_id;
        this.user_name = user_name;
        this.birth_date = birth_date;
        this.isActive = isActive;
    }
}


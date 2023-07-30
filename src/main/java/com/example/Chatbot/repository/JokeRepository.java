package com.example.Chatbot.repository;

import com.example.Chatbot.entity.Joke;
import org.springframework.data.repository.CrudRepository;

public interface JokeRepository extends CrudRepository<Joke, Integer> {
}

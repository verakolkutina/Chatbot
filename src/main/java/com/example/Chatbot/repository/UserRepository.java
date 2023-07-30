package com.example.Chatbot.repository;

import com.example.Chatbot.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}

package org.generation.MyFirstWebApp.service;

import org.generation.MyFirstWebApp.model.User;
import org.springframework.stereotype.Controller;

import java.util.List;

public interface UserService
{
    List<User> getAll();

    void add(User user);

    void remove(User user);

    int size();

    User getUser(int position);

}

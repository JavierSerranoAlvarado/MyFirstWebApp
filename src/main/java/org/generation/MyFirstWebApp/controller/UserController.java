package org.generation.MyFirstWebApp.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.generation.MyFirstWebApp.model.User;
import org.generation.MyFirstWebApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController
{
    final UserService userService;

    final Log LOGGER = LogFactory.getLog(UserController.class);

    public UserController( @Autowired UserService userService )
    {

        this.userService = userService;
        userService.add( new User( 1, "Santiago", "Fernandez" ) );
        userService.add( new User( 2, "Pedro", "Carrillo" ) );
        userService.add( new User( 3, "Mariana", "Solorio" ) );
        userService.add( new User( 4, "Mireya", "Audiffred" ) );

        LOGGER.info("EL usuario es " + userService.getAll());

    }

    @GetMapping( "/user" )
    public User getUser()
    {
        return userService.getUser( 0 );
    }

    @GetMapping("/user/all")
    public int totalUsers(){
        return userService.size();
    }

    @GetMapping("/users/all")
    public List<User> allUsers(){
        return userService.getAll();
    }






}

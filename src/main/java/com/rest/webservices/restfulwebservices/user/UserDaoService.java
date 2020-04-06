package com.rest.webservices.restfulwebservices.user;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.hibernate.engine.jdbc.connections.internal.UserSuppliedConnectionProviderImpl;
import org.springframework.stereotype.Component;

import java.util.*;

// @Repository also works
@Component
public class UserDaoService {

    // public List<User> findAll();
    // public User save(User user);
    // public User find(int id);

    private static List<User> users = new ArrayList<User>() {
        {
            add(new User(1, "Rahul", new Date()));
            add(new User(2, "Tom", new Date()));
            add(new User(3, "Harry", new Date()));
        }
    };

    private static int usersCount = users.size();

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if(user.getId()==null){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findUser(int id){
        for (User user:users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();
        if(iterator.hasNext()){
            User user = iterator.next();
            if (user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}

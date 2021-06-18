package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();

        User u1 = new User();
        u1.setAge(10);
        u1.setName("Quang");
        u1.setAccount("quang");
        u1.setEmail("quang@gmail.com");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(10);
        u2.setName("Thien");
        u2.setAccount("thien");
        u2.setEmail("thien@gmail.com");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(10);
        u3.setName("Nam");
        u3.setAccount("nam");
        u3.setEmail("nam@gmail.com");
        u3.setPassword("123456");
        users.add(u3);
    }

    public static User checkLogin(Login login){
        for(User u : users){
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }

    public User findByAccount(String account){
        return users.get(Integer.parseInt(account));
    }
}

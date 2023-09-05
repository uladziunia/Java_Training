package org.example.bankaccount;

import java.util.ArrayList;
import java.util.List;

public class User {
    int ID;
    String login;
    String password;

    public User(int ID, String login, String password, List<String> userLogin) {
        this.ID = ID;
        this.login = login;
        this.password = password;
        this.userLogin = userLogin;
    }

    private String login(){
      return this.login;
    }

    private String password(){
      return this.password;
    }

    List<String> userLogin = new ArrayList<>();

}

package org.example.bankaccount;

import java.util.List;

public class User {
    int IDUser;
    String login;
    String password;
    List<String> userLogin;

    public User(int IDUser, String login, String password, int userLogin) {
        this.IDUser = IDUser;
        this.login = login;
        this.password = password;
    }

    public int getIDUser() {
        return IDUser;
    }

    public void setIDUser(int IDUser) {
        this.IDUser = IDUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

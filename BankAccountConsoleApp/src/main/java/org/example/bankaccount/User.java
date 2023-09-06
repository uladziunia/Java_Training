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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public List<String> getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(List<String> userLogin) {
        this.userLogin = userLogin;
    }
}

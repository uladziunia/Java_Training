package org.example.bankaccount;

import java.time.LocalDateTime;
import java.util.UUID;

public class UserAccount {

    private int userID = 0;
    private String userFirstName = "XXX";
    private String userLastName = "YYY";
    private String userLogin;
    private String userEMail;
    private String userPassword = UUID.randomUUID().toString();
//    private boolean forceChangePassword = false;
    private LocalDateTime lastSuccessfulLoginDateTime;
    private LocalDateTime lastUnsuccessfulLoginDateTime;
    private Double accountBalance;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
        setUserLogin();
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
        setUserLogin();
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
        setUserLogin();
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin() {
        this.userLogin = this.userFirstName.substring(0, 3).toLowerCase() + this.userLastName.substring(0, 3).toLowerCase() + this.userID;
        setUserEMail();
    }

    public String getUserEMail() {
        return userEMail;
    }

    public void setUserEMail() {
        this.userEMail = this.userLogin + "@company.com";
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String _userPassword) {
        this.userPassword = _userPassword;
    }

    public String getUserInfo(String _userLogin) {
        if (_userLogin.equals(userLogin)) {
//            addToLogger(ltInfo, "getUserInfo", _userLogin);
            return (userFirstName + " " + userLastName + " (" + userEMail + ")\nLast successful login: " + this.lastSuccessfulLoginDateTime + "\nLast unsuccessful login: " + this.lastUnsuccessfulLoginDateTime);
        } else {
//            addToLogger(ltError, "getUserInfo", "Unknown login:"+_userLogin);
            return ("Unknown user.");
        }
    }

    public void setSuccessfulLoginDateTime() {
        lastSuccessfulLoginDateTime = LocalDateTime.now();
    }

    public void setUnSuccessfulLoginDateTime() {
        lastUnsuccessfulLoginDateTime = LocalDateTime.now();
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

}
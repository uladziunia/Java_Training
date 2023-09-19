package org.example.bankaccount;

import java.time.LocalDateTime;

public class UserAccount {

    private int userID = 1111;
    private String userFirstName = "Krzysztof";
    private String userLastName = "Kolumb";
    private String userLogin = userFirstName.substring(0, 3).toLowerCase() + userLastName.substring(0, 3).toLowerCase() + userID;
    private String userEMail = userLogin + "@company.com";
    private String userPassword = "ququ";
    private boolean forceChangePassword = false;
    private LocalDateTime lastSuccessfulLogin = LocalDateTime.parse("2023-09-11T10:15:30");
    private LocalDateTime lastUnsuccessfulLogin = LocalDateTime.parse("2023-08-12T13:25:30");
    private Double accountBalance;

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    private String accountDetails() {
       return accountDetails();
    }

    public boolean checkCredentials(String _userLogin, String _userPassword) {
        return ((_userLogin.equalsIgnoreCase(userLogin)) && (_userPassword.equalsIgnoreCase(userPassword)));
    }

    public String getUserInfo(String _userLogin) {
        return (userFirstName + " " + userLastName + " (" + userEMail + ")\nLast successful login: " + lastSuccessfulLogin + "\nLast unsuccessful login: " + lastUnsuccessfulLogin);
    }

    public void setSuccessfulLogin() {
        lastSuccessfulLogin = LocalDateTime.now();
    }
    public void setUnsuccessfulLogin() {
        lastUnsuccessfulLogin = LocalDateTime.now();
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }
    //    public void logout() {
//        System.out.println("You have safely logged out of SuperCredit Bank Application.");
//    }

}
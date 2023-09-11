package org.example.bankaccount;

import java.time.LocalDateTime;

public class UserAccount {

    private int userID = 9815;
    private String userFirstName = "Krzysztof";
    private String userLastName = "Kolumb";
//    private String userLogin = userFirstName.substring(0,3).toLowerCase(Locale.ROOT)+ userLastName.substring(0,3).toLowerCase(Locale.ROOT)+ userID;
    private String userLogin = userFirstName.substring(0, 3).toLowerCase() + userLastName.substring(0, 3).toLowerCase() + userID;
    private String userEMail = userLogin + "@company.com";
    private String userPassword = "ququlka";
    private LocalDateTime lastSuccesfullLogin = LocalDateTime.parse("2023-09-11T10:15:30");
    private LocalDateTime lastUnsuccesfullLogin = LocalDateTime.parse("2023-08-12T13:25:30");

    private String accountDetails() {
        System.out.println("On your profile you can: view/edit/close details");
        return accountDetails();
    }

    public boolean checkCredentials(String _userLogin, String _userPassword) {
//        System.out.println("*"+_userLogin+"*");
//        System.out.println("*"+userLogin+"*");
//        System.out.println("*"+_userPassword+"*");
//        System.out.println("*"+userPassword+"*");
//        return ((_userLogin == userLogin) && (_userPassword == userPassword));
        return ((_userLogin.equalsIgnoreCase(userLogin)) && (_userPassword.equalsIgnoreCase(userPassword)));
    }

    public String getUserInfo(String _userLogin) {
        return (userFirstName + " " + userLastName + " (" + userEMail + ")\nLast succesfull login: " + lastSuccesfullLogin + "\nLast unsuccesfull login: " + lastUnsuccesfullLogin);
    }

    public void setSuccesfullLogin() {
        lastSuccesfullLogin = LocalDateTime.now();
    }

    public void setUnsuccesfullLogin() {
        lastUnsuccesfullLogin = LocalDateTime.now();
    }
}
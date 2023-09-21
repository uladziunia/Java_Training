package org.example.bankaccount;

import java.util.ArrayList;
import java.util.List;


public class UserAccounts {
    static List<UserAccount> userAccounts = new ArrayList();

    public static void initUsersPseudoDB() {
        userAccounts.add(createUser(1001, "Krzysztof", "Kolumb"));
        userAccounts.add(createUser(1002, "Francis", "Drake"));

// Let's set some initial secrets for our users ...
        userAccounts.get(0).setUserPassword("ququ");
        userAccounts.get(1).setUserPassword("lala");
    }

    public static UserAccount createUser(int _userID, String _userFirstName, String _userLastName) {
        UserAccount userAccountDetails = new UserAccount();
        userAccountDetails.setUserID(_userID);
        userAccountDetails.setUserFirstName(_userFirstName);
        userAccountDetails.setUserLastName(_userLastName);
        return userAccountDetails;
    }

    public static boolean checkCredentials(String _userLogin, String _userPassword) {
        int idx = 0;
        boolean credentialsFound;
        do {
            credentialsFound = ((_userLogin.equals(userAccounts.get(idx).getUserLogin())) && (_userPassword.equals(userAccounts.get(idx).getUserPassword())));
            idx++;
        }
        while ((!credentialsFound) && (idx < userAccounts.size()));
        return credentialsFound;
    }

    public static boolean proceedLoginWithCredentials(String _userLogin, String _userPassword) {
//            addToLogger(ltInfo, "proceedLoginWithCredentials", _userLogin+"/"+_userPassword);
        int idx = 0;
        boolean credentialsFound;
        do{
            credentialsFound = ((_userLogin.equals(userAccounts.get(idx).getUserLogin())) && (_userPassword.equals(userAccounts.get(idx).getUserPassword())));
            idx++;
        }
        while ((!credentialsFound) && (idx < userAccounts.size()));
        if (credentialsFound){
            userAccounts.get(idx-1).setSuccessfulLoginDateTime();
        } else{
            idx = getUserIndex(_userLogin);
            if (idx >= 0){
                userAccounts.get(idx).setUnSuccessfulLoginDateTime();
            }
        }
        return credentialsFound;
    }

    public static String getUserInfo(String _userLogin) {
        int idx = 0;
        boolean userLoginFound;
        do{
            userLoginFound = (_userLogin.equals(userAccounts.get(idx).getUserLogin()));
            idx++;
        }
        while ((!userLoginFound) && (idx < userAccounts.size()));
        if (!userLoginFound){
//            addToLogger(ltError, "getUserInfo", _userLogin+" not found ?!");
            return "unknown";
        } else {
            return userAccounts.get(idx-1).getUserInfo(_userLogin);
        }
    }

    public static int getUserIndex(String _userLogin) {
        int idx = 0;
        boolean userLoginFound;
        do{
            userLoginFound = (_userLogin.equals(userAccounts.get(idx).getUserLogin()));
            idx++;
        }
        while ((!userLoginFound) && (idx < userAccounts.size()));
        if (!userLoginFound){
//            addToLogger(ltError, "getUserIndex", _userLogin+" not found ?!");
            return -1;
        } else {
            return idx-1;
        }
    }

    public static String getUserLogin(int _userIndex) {
        return userAccounts.get(_userIndex).getUserLogin();
    }

    public static void setUserPassword(int _userIndex, String _userPassword) {
        userAccounts.get(_userIndex).setUserPassword(_userPassword);
    }

}
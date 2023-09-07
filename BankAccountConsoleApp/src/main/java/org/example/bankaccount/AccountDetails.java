package org.example.bankaccount;

public class AccountDetails {

    private int account = 9815;

    private String accountDetails()
    {
        System.out.println("On your profile you can: view/edit/close details");
        return accountDetails();
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

//        if(int==9815)
//        {
//            System.out.println("You entered the wrong account.");
//        }
}
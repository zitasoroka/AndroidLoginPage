package com.example.zsor0001.login;

/**
 * Created by zsor0001 on 21/06/2016.
 */

public class LoginValidator {

    private String mUserName;
    private String mPassword;


    public LoginValidator(String uname, String password){

        mUserName=uname;
        mPassword=password;
    }

    public boolean validateLogin(String name, String password){

        if(name.isEmpty() || password.isEmpty()){
            return false;
        }

        if (name.equals(mUserName) && password.equals(mPassword)){
            return true;
        }

        return false;
    }
}

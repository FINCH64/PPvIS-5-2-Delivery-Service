package controller;

import model.Product;

import java.util.List;

public class RegistrationCreation implements DataController{

    public void authorisation(String login,String password) {
        this.askLogin(login);
        this.askPassword(password);
        this.createUser();
    }

    private boolean askLogin(String login){
        return true;
    }

    private boolean askPassword(String password){
        return true;
    }

    private boolean askName(String name){
        return true;
    }

    private boolean askSecondName(String secondName){
        return true;
    }

    private boolean askPhoneNumber(String PhoneNumber){
        return true;
    }

    private boolean askStatus(String status){
        return true;
    }

    private User createUser(){
        return new User();
    }
}

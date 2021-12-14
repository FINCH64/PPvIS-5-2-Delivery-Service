package controller;

public class AuthorisationCreation implements DataController{

    public void authorisation(String login,String password) {
        this.askLogin(login);
        this.askPassword(password);
    }

    private boolean askLogin(String login){
        return true;
    }

    private boolean askPassword(String password){
        return true;
    }
}

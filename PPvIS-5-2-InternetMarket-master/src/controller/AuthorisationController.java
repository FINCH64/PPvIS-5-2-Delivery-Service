package controller;

public class AuthorisationController {
    
    public void authorisation(String login,String password) {
        this.askLogin(login);
        this.askPassword(password);
        this.checkData(login, password);
        this.getResult();
    }

    private boolean askLogin(String login){
        return true;
    }

    private boolean askPassword(String password){
        return true;
    }

    private boolean checkData(String login,String password) {
        return true;
    }
    private boolean getResult() {
        return true;
    }
}

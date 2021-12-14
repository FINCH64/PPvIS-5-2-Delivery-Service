package controller;

import model.Model;

public class Controller {
    public Controller(Model model) {}

    private AuthorisationController AuthorisationController;
    private AuthorisationCreation AuthorisationCreation;
    private DataController DataController;
    private KuraActionsController KuraActionsController;
    private KuraController KuraController;
    private ProductController ProductController;
    private ProductList ProductList;
    private RegistrationController RegistrationController;
    private RegistrationCreation RegistrationCreation;
    private SearchController SearchController;
    private UserActionController UserActionController;
    private MainWindowController MainWindowController;

    public void createMainWindowController() {}
    public void createAuthorisationController() {}
    public void createAuthorisationCreation() {}
    public void createDataController() {}
    public void createKuraActionsController() {}
    public void createKuraController() {}
    public void createProductController() {}
    public void createProductList() {}
    public void createRegistrationController() {}
    public void createRegistrationCreation() {}
    public void createSearchController() {}
    public void createUserActionController() {}

    public MainWindowController getMainWindowController() {
        return MainWindowController;
    }
   
    public RegistrationCreation getRegistrationCreation() {
        return RegistrationCreation;
    }

    public AuthorisationController getAuthorisationController() {
        return AuthorisationController;
    }

    public AuthorisationCreation getAuthorisationCreation() {
        return AuthorisationCreation;
    }

    public DataController getDataController() {
        return DataController;
    }

    public ProductController getProductController() {
        return ProductController;
    }

    public ProductList getProductList() {
        return ProductList;
    }

    public RegistrationController getRegistrationController() {
        return RegistrationController;
    }

    public SearchController getSearchController() {
        return SearchController;
    }

    public KuraActionsController getKuraActionsController() {
        return KuraActionsController;
    }
    public KuraController getKuraController() {
        return KuraController;
    }

    public UserActionController getUserActionController() {
        return UserActionController;
    }
}

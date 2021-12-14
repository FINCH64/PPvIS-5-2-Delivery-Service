package controller;

import java.util.List;

import model.Kura;
import model.Order;
import model.Product;

public class KuraController {


    public Kura addKura(String login,String secondName,String password,String phoneNumber){
        return new Kura(login,secondName,password,phoneNumber);
    }
    public List<Kura> deleteKura(Kura kura) {
        return List<Kura>;
    }
    public boolean sendOrder(Order order) {
        return true;
    }
}

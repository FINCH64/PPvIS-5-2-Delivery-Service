package model;

import java.util.List;

public class Order {
    public Order (){
    
    }

    public int id;
    public List<Product> productList;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProductList() {
        return this.productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

}

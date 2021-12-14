package model;

import java.util.List;

public class Cart implements CartAndFavouritesOperations{
    public Cart (){
    
    }

    public List<Product> productList;

    public List<Product> getProductList() {
        return this.productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

}

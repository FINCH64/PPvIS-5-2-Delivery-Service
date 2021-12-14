package model;

import java.util.List;

public class ProductList2 {
    public ProductList2 (){
    
    }

    public String name;
    public List<Product> productList;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return this.productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    
}

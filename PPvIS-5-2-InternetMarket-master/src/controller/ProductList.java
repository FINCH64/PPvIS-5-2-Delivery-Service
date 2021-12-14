package controller;

import java.util.List;

import model.Product;

public class ProductList {
    public boolean addProductToCatalog(List<Product> product){
        return true;
    }
    
    public Product changeProduct(String name,String info){
        return new Product(name,info);
    }
    public boolean deleteProduct(Product product) {
        return true;
    }
}

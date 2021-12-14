package model;

public class Model {

    private Admin Admin;
    private Buyer Buyer;
    private Cart Cart;
    private Favourites Favourites;
    private Kura Kura;
    private Model Model;
    private Order Order;
    private Product Product;
    private ProductList ProductList;
    private ProductList2 productList2;

    public void createAdmin() { Admin = new Admin();}

    public void createBuyer() { Buyer = new Buyer(); }

    public void createCart() { Cart = new Cart(); }

    public void createFavourites() { Favourites = new Favourites();}
    
    public void createKura() { Kura = new Kura();}
    
    public void createModel() { Model = new Model();}

    public void createOrder() { Order = new Order();}

    public void createProduct() { Product = new Product();}

    public void createProductList() { ProductList = new ProductList();}

    public void createproductList2() { productList2 = new ProductList2();}

}
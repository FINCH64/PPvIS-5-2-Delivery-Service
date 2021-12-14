package view;

import javax.swing.*;

public class Cart extends JFrame {


    public Cart(Cart  registrationController){
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnInfo = new JButton("Просмотреть товары.");

        btnInfo.addActionListener(e ->{});

        JButton btndeleteFromFavourites = new JButton("Удалить товар из избранного.");

        btndeleteFromFavourites.addActionListener(e ->{});

        JButton btnClearCart = new JButton("Очистить корзину.");

        btnClearCart.addActionListener(e ->{});

        JButton btnDoOrder = new JButton("Сделать заказ.");

        btnClearCart.addActionListener(e ->{});

        this.add(btnInfo);
        this.add(btndeleteFromFavourites);
        this.add(btnClearCart);
        this.add(btnDoOrder);
    }
}

package view;

import javax.swing.*;

public class MenuPageWindow extends JFrame {


    public MenuPageWindow(MenuPageWindow  registrationController){
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnInfo = new JButton("Просмотреть инфо о товаре.");

        btnInfo.addActionListener(e ->{});

        JButton btnaddProductToCart = new JButton("Добавить товар в корзину.");

        btnaddProductToCart.addActionListener(e ->{});

        JButton btnAddToFavourites = new JButton("Добавить товар в избранное.");

        btnAddToFavourites.addActionListener(e ->{});

        JButton btnShowCatalog = new JButton("отобразить панель с каталогом.");

        btnShowCatalog.addActionListener(e ->{});

        JButton btnCreateCart = new JButton("Создать корзину.");

        btnCreateCart.addActionListener(e ->{});

        JButton btnCreateFavourites= new JButton("Создать избранное.");

        btnCreateFavourites.addActionListener(e ->{});



        this.add(btnInfo);
        this.add(btnaddProductToCart);
        this.add(btnAddToFavourites);
        this.add(btnaddProductToCart);
        this.add(btnShowCatalog);
        this.add(btnCreateCart);
        this.add(btnCreateFavourites);
    }
}

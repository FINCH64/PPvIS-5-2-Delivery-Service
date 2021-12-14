package view;

import controller.UserActionController;
import javax.swing.*;

public class AdminWindow extends JFrame {

    UserActionController buyerController;
    public AdminWindow(UserActionController buyerController){

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnOrder = new JButton("Отобразить инфо о пользователе.");
        btnOrder.addActionListener(e ->{});

        JButton btnCatalog = new JButton("Редактировать инфо о пользователе");
        btnCatalog.addActionListener(e ->{});

        JButton btnFavorite = new JButton("Выйти из аккаунта");
        btnFavorite.addActionListener(e ->{});

        

        this.buyerController = buyerController;
        this.add(btnOrder);
        this.add(btnCatalog);
        this.add(btnFavorite);
    }

}
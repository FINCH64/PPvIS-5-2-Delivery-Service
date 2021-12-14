package view;

import controller.ProductController;

import javax.swing.*;

public class OrderWindow extends JFrame {

    ProductController orderController;
    public OrderWindow(ProductController orderController){

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnInfo = new JButton("Отобразить инфо заказа.");
        btnInfo.addActionListener(e ->{});

        JButton btnKura = new JButton("Отобразить курьера.");
        btnKura.addActionListener(e ->{});
    
        JLabel lblStatusOrder = new JLabel("Статус заказа");

        JButton btnCancel = new JButton("Назад");
        btnCancel.addActionListener(e ->{});

        this.orderController = orderController;
        this.add(btnInfo);
        this.add(btnKura);
        this.add(lblStatusOrder);
        this.add(btnCancel);
    }
}

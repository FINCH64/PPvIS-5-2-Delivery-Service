package view;

import controller.MainWindowController;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    MainWindowController mainWindowController;

    public MainWindow(MainWindowController mainWindowController) {

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);
        setTitle("Главное окно");

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(e -> dispose());

        JButton btnRegistration = new JButton("Регистрация");

        btnRegistration.addActionListener(e ->{
            JOptionPane.showMessageDialog(this,
                    "На самом деле оно работает!",
                    "Ошибка регистрации",
                    JOptionPane.ERROR_MESSAGE);
        });

        JButton btnAuthorization = new JButton("Авторизация");

        btnAuthorization.addActionListener(e ->{
            JOptionPane.showMessageDialog(this,
                    "Или не работает",
                    "Ошибка авторизации",
                    JOptionPane.ERROR_MESSAGE);
        });

        JButton btnForum = new JButton("Страница меню");

        btnForum.addActionListener(e ->{
            JOptionPane.showMessageDialog(this,
                    "Всё таки не работает",
                    "Ошибка входа на форум",
                    JOptionPane.ERROR_MESSAGE);
        });

        JButton btnSeller = new JButton("Корзина");

        btnSeller.addActionListener(e ->{
            JOptionPane.showMessageDialog(this,
                    "Но это не точно",
                    "Ошибка входа",
                    JOptionPane.ERROR_MESSAGE);
        });

        JButton btnBuyer = new JButton("Избранное");

        btnBuyer.addActionListener(e ->{
            JOptionPane.showMessageDialog(this,
                    "Хм",
                    "Ошибка входа",
                    JOptionPane.ERROR_MESSAGE);
        });

        btnRegistration.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnAuthorization.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnForum.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnSeller.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnBuyer.setAlignmentX(Component.CENTER_ALIGNMENT);

        this.mainWindowController = mainWindowController;
        this.add(btnRegistration);
        this.add(btnAuthorization);
        this.add(btnForum);
        this.add(btnSeller);
        this.add(btnBuyer);
    }

    public void display(){
        setVisible(true);
    }

}

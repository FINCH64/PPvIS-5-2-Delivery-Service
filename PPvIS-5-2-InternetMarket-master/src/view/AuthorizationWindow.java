package view;

import controller.UserActionController;
import javax.swing.*;

public class AuthorizationWindow extends JFrame {


    UserActionController userActionController;

    public AuthorizationWindow(UserActionController userActionController){
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnEnter = new JButton("Войти");

        btnEnter.addActionListener(e ->{});

        JTextField txtName = new JFormattedTextField("Логин");
        JTextField txtPass = new JFormattedTextField("Пароль");



        this.userActionController = userActionController;
        this.add(btnEnter);
        this.add(txtName);
        this.add(txtPass);
    }

}

package view;

import controller.RegistrationController;

import javax.swing.*;

public class RegistrationWindow extends JFrame {

    RegistrationController registrationController;

    public RegistrationWindow(RegistrationController registrationController){
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnRegistration = new JButton("Регистрация");

        btnRegistration.addActionListener(e ->{});

        JTextField txtName = new JFormattedTextField("Имя");
        JTextField txtName2 = new JFormattedTextField("Фамилия");
        JTextField txtPass = new JFormattedTextField("Пароль");
        JTextField txtPass2 = new JFormattedTextField("Пароль Повторно");
        JTextField txtPhone = new JFormattedTextField("Телефон");
        String[] items = { "Курьер", "Пользователь","Администратор"};
        JComboBox role = new JComboBox(items);


        this.registrationController = registrationController;
        this.add(btnRegistration);
        this.add(txtName);
        this.add(txtName2);
        this.add(txtPass);
        this.add(txtPass2);
        this.add(txtPhone);
        this.add(role);
    }

}

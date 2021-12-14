package view;
    import controller.KuraController;
    import javax.swing.*;

public class KuraWindow  extends JFrame{
    KuraController kuraController;
        public KuraWindow(KuraController kuraController){
    
            setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            setBounds(100, 100, 300, 300);
    
            JButton btnOrder = new JButton("Отобразить инфо о пользователе.");
            btnOrder.addActionListener(e ->{});
    
            JButton btnCatalog = new JButton("Редактировать инфо о пользователе");
            btnCatalog.addActionListener(e ->{});
    
            JButton btnFavorite = new JButton("Выйти из аккаунта");
            btnFavorite.addActionListener(e ->{});

            JButton btnOrders = new JButton("Отобразить список заказов.");
            btnFavorite.addActionListener(e ->{});
    
            this.kuraController = kuraController;
            this.add(btnOrder);
            this.add(btnCatalog);
            this.add(btnFavorite);
            this.add(btnOrders);
    
        }
    
    }
     

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        cb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pf = new javax.swing.JPasswordField();
        tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        cb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT FROM BELOW:", "Receptionist", "Dining incharge", "Salon incharge", "Laundry incharge", "Manager" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Username :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Password :");

        pf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("HOTEL ORCHID LOGIN");

        jB1.setText("Login");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB2.setText("Clear");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB3.setText("Exit");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(cb, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jB1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jB2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jB3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 87, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jB2)
                        .addGap(41, 41, 41)
                        .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jB3)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(51, 51, 51)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pf, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(137, 137, 137)))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB3)
                    .addComponent(jB2)
                    .addComponent(jB1))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        if("".equals(tf.getText())){
            JOptionPane.showMessageDialog(null, "Enter Username.");
            return;
        }
        if("".equals((pf.getPassword()).toString())){
            JOptionPane.showMessageDialog(null, "Enter Password.");
            return;
        }
        if("Receptionist".equals(cb.getSelectedItem().toString())) {
            String pass="Heisenberg";
            String user = "Reception Emp";
            String inpass = new String(pf.getPassword());
            String inuser = tf.getText();
            if(user.equals(inuser) && pass.equals(inpass)){
                this.setVisible(false);
                new CHECKIN().setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Username and password does not match. Try again");
                tf.setText("");
                pf.setText("");
            }
        }
        else if("Dining incharge".equals(cb.getSelectedItem().toString())) {
            String pass="Heisenberg";
            String user = "Dining Emp";
            String inpass=new String(pf.getPassword());
            String inuser = tf.getText();
            if(user.equals(inuser) && pass.equals(inpass)){
                this.setVisible(false);
                new Dining_Service().setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Username and password does not match. Try again");
                tf.setText("");
                pf.setText("");
            }
        }
        else if("Laundry incharge".equals(cb.getSelectedItem().toString())) {
            String pass="Heisenberg";
            String user = "Laundry Emp";
            String inpass=new String(pf.getPassword());
            String inuser = tf.getText();
            if(user.equals(inuser) && pass.equals(inpass)){
                this.setVisible(false);
                new Laundry_Service().setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Username and password does not match. Try again");
                tf.setText("");
                pf.setText("");
            }
        }
        else if("Salon incharge".equals(cb.getSelectedItem().toString())) {
            String pass="Heisenberg";
            String user = "Salon Emp";
            String inpass=new String(pf.getPassword());
            String inuser = tf.getText();
            if(user.equals(inuser) && pass.equals(inpass)){
                this.setVisible(false);
                new Salon_Service().setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Username and password does not match. Try again");
                tf.setText("");
                pf.setText("");
            }
        }
        else if("Manager".equals(cb.getSelectedItem().toString())) {
            String pass="admin";
            String user = "admin";
            String inpass=new String(pf.getPassword());
            String inuser = tf.getText();
            if(user.equals(inuser) && pass.equals(inpass)){
                this.setVisible(false);
                new NewJFrame().setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Username and password does not match. Try again");
                tf.setText("");
                pf.setText("");
            }
        }
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        tf.setText("");
        pf.setText("");
    }//GEN-LAST:event_jB2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPasswordField pf;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}

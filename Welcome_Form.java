
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adnan
 */
public class Welcome_Form extends javax.swing.JFrame {

    /**
     * Creates new form Welcome_Form
     */
    public Welcome_Form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Input_Password = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        Input_Username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(403, 308));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Welcome to Admintration");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(68, 29, 250, 40);

        Username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Username.setText("Username");
        getContentPane().add(Username);
        Username.setBounds(60, 100, 80, 30);

        Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Password.setText("Password");
        getContentPane().add(Password);
        Password.setBounds(60, 170, 80, 30);

        Input_Password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Input_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Input_Password);
        Input_Password.setBounds(230, 170, 130, 30);

        Login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(150, 240, 90, 30);

        Input_Username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Input_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Input_Username);
        Input_Username.setBounds(230, 95, 130, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sunset-sky-airplane-clouds-wallpaper-thumb.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 410, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Input_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_UsernameActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
           String uname = new String(Input_Username.getText());
        String upass = new String(Input_Password.getText());
        String cuname = "adnan";
         String cupass = "12345";
       if(uname.isEmpty() && upass.isEmpty())    {
          JOptionPane.showMessageDialog(null, "Login Failed");
       }
       else if(cuname.equalsIgnoreCase(uname) && cupass.equalsIgnoreCase(upass)){
            JOptionPane.showMessageDialog(null, "Login Sucessfully");
            Adminstration_Side adm = new Adminstration_Side();
            this.dispose();
            adm.show();
        }
        else{
         JOptionPane.showMessageDialog(null, "Login Failed");
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void Input_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_PasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Welcome_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Input_Password;
    private javax.swing.JTextField Input_Username;
    private javax.swing.JButton Login;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
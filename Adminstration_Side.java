
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;






/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adnan
 */
public class Adminstration_Side extends javax.swing.JFrame {

    /**
     * Creates new form Adminstration_Side
     */
    public Adminstration_Side() {
       
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

        User_Information = new javax.swing.JButton();
        Cancel_Booking = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 320));
        setResizable(false);
        getContentPane().setLayout(null);

        User_Information.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        User_Information.setText("Show User Information");
        User_Information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_InformationActionPerformed(evt);
            }
        });
        getContentPane().add(User_Information);
        User_Information.setBounds(100, 57, 195, 30);

        Cancel_Booking.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cancel_Booking.setText("Cancel Booking");
        Cancel_Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_BookingActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel_Booking);
        Cancel_Booking.setBounds(100, 125, 195, 30);

        Logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout);
        Logout.setBounds(100, 197, 195, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pexels-photo-731217.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void User_InformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_InformationActionPerformed
Show_User_Info unifo = new Show_User_Info();
this.dispose();
unifo.show();

  
    }//GEN-LAST:event_User_InformationActionPerformed
    
    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
     Main_Page mp = new Main_Page();
     this.dispose();
     mp.show();
     
    }//GEN-LAST:event_LogoutActionPerformed

    private void Cancel_BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_BookingActionPerformed
   Main_Page mpg = new Main_Page();
       JOptionPane.showMessageDialog(null, "Flight Cancellation operation performs successfully ", "Successfully Flight Cancel", WIDTH);
       this.dispose();
       mpg.show();
    }//GEN-LAST:event_Cancel_BookingActionPerformed

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
            java.util.logging.Logger.getLogger(Adminstration_Side.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminstration_Side.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminstration_Side.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminstration_Side.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminstration_Side().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_Booking;
    private javax.swing.JButton Logout;
    private javax.swing.JButton User_Information;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

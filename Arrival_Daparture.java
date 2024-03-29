
import static java.awt.image.ImageObserver.WIDTH;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
public class Arrival_Daparture extends javax.swing.JFrame {

    /**
     * Creates new form Arrival_Daparture
     */
    public Arrival_Daparture() {
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
        Arrival_Location = new javax.swing.JLabel();
        Arrival_Time = new javax.swing.JLabel();
        Daparture_Location = new javax.swing.JLabel();
        Daparture_Time = new javax.swing.JLabel();
        Input_Arrival_Location = new javax.swing.JTextField();
        Input_Daparture_Location = new javax.swing.JTextField();
        ADate = new javax.swing.JComboBox<>();
        AMonth = new javax.swing.JComboBox<>();
        AYear = new javax.swing.JComboBox<>();
        DDate = new javax.swing.JComboBox<>();
        DMonth = new javax.swing.JComboBox<>();
        DYear = new javax.swing.JComboBox<>();
        A_Next = new javax.swing.JButton();
        A_Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(471, 303));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Arrival & Daparture");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(123, 27, 200, 30);

        Arrival_Location.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Arrival_Location.setText("Arrival Location");
        getContentPane().add(Arrival_Location);
        Arrival_Location.setBounds(61, 76, 107, 17);

        Arrival_Time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Arrival_Time.setText("Arrival Time");
        getContentPane().add(Arrival_Time);
        Arrival_Time.setBounds(61, 120, 81, 17);

        Daparture_Location.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Daparture_Location.setText("Daparture Location");
        getContentPane().add(Daparture_Location);
        Daparture_Location.setBounds(61, 159, 133, 17);

        Daparture_Time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Daparture_Time.setText("Daparture Time");
        getContentPane().add(Daparture_Time);
        Daparture_Time.setBounds(61, 201, 107, 17);

        Input_Arrival_Location.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(Input_Arrival_Location);
        Input_Arrival_Location.setBounds(260, 70, 200, 30);

        Input_Daparture_Location.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(Input_Daparture_Location);
        Input_Daparture_Location.setBounds(260, 149, 200, 30);

        ADate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ADate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        ADate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADateActionPerformed(evt);
            }
        });
        getContentPane().add(ADate);
        ADate.setBounds(260, 110, 60, 30);

        AMonth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        AMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMonthActionPerformed(evt);
            }
        });
        getContentPane().add(AMonth);
        AMonth.setBounds(330, 110, 60, 30);

        AYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A.M", "P.M" }));
        getContentPane().add(AYear);
        AYear.setBounds(400, 111, 60, 30);

        DDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        getContentPane().add(DDate);
        DDate.setBounds(260, 191, 60, 30);

        DMonth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(DMonth);
        DMonth.setBounds(330, 191, 60, 30);

        DYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A.M", "P.M" }));
        getContentPane().add(DYear);
        DYear.setBounds(400, 190, 60, 30);

        A_Next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        A_Next.setText("Next");
        A_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_NextActionPerformed(evt);
            }
        });
        getContentPane().add(A_Next);
        A_Next.setBounds(294, 236, 100, 30);

        A_Back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        A_Back.setText("Back");
        A_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_BackActionPerformed(evt);
            }
        });
        getContentPane().add(A_Back);
        A_Back.setBounds(88, 236, 90, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/airplane-landing-sky-nature-wallpaper-preview.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, 0, 480, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AMonthActionPerformed

    private void ADateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADateActionPerformed

    private void A_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_BackActionPerformed
        User_Information uinfo = new User_Information();
        this.dispose();
        uinfo.show();
    }//GEN-LAST:event_A_BackActionPerformed

    private void A_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_NextActionPerformed
        String al = Input_Arrival_Location.getText();
        IAdapter ext = new StringExtensions();
        if(ext.isStringEmpty(al)){
            System.out.println("Arrival location is required");
            return;
        }
        String at = (String) ADate.getSelectedItem() + " " + (String) AMonth.getSelectedItem() + " " + (String) AYear.getSelectedItem();
        String dl = Input_Daparture_Location.getText();
        String dt = (String) DDate.getSelectedItem() + " " + (String) DMonth.getSelectedItem() + " " + (String) DYear.getSelectedItem();

        if (al.isEmpty() || dl.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all mandatory fields");
        } else {
             try {

                File file = new File("D:\\4th Semester\\Software Design and Architecture\\Muhammad Adnan Farooq Butt_023\\OnlineAeroplaneTicketBanking\\src\\userinfo.txt");

                // if file doesnt exists, then create it
                if (!file.exists()) {
                    file.createNewFile();
                }

                FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);
               
                bw.write(al);    //step2: write it
                bw.write("\n");
                bw.write(at);
                bw.write("\n");
                bw.write(dl);
                bw.write("\n");
                bw.write(dt);
                bw.write("\n");
               
                bw.close();

                System.out.println("Done");
            
                this.dispose();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Ticket tk = new Ticket();
            this.dispose();
            tk.show();
        }

    }//GEN-LAST:event_A_NextActionPerformed

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
            java.util.logging.Logger.getLogger(Arrival_Daparture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arrival_Daparture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arrival_Daparture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arrival_Daparture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arrival_Daparture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ADate;
    private javax.swing.JComboBox<String> AMonth;
    private javax.swing.JComboBox<String> AYear;
    private javax.swing.JButton A_Back;
    private javax.swing.JButton A_Next;
    private javax.swing.JLabel Arrival_Location;
    private javax.swing.JLabel Arrival_Time;
    private javax.swing.JComboBox<String> DDate;
    private javax.swing.JComboBox<String> DMonth;
    private javax.swing.JComboBox<String> DYear;
    private javax.swing.JLabel Daparture_Location;
    private javax.swing.JLabel Daparture_Time;
    private javax.swing.JTextField Input_Arrival_Location;
    private javax.swing.JTextField Input_Daparture_Location;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

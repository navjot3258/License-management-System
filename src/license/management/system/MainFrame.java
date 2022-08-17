/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package license.management.system;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import java.io.File;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        result.setVisible(false);
        try{
                    Class.forName("java.sql.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/license","root","krroot");
            Statement stmt=con.createStatement();
            String query="select * from login";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
System.out.println(rs.getString(1));
                
                cb_username.addItem(rs.getString(1).toString());
                
                

            }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, e);
                }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfc = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edt_userid = new javax.swing.JTextField();
        edt_key = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cb_username = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        btn_read = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();
        btn_read1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Device_ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Key");

        edt_userid.setEditable(false);
        edt_userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_useridActionPerformed(evt);
            }
        });

        edt_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_keyActionPerformed(evt);
            }
        });

        jButton1.setText("Save Response");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cb_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_usernameActionPerformed(evt);
            }
        });

        jButton2.setText("Add User");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_read.setText("Read Response");
        btn_read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_readActionPerformed(evt);
            }
        });

        result.setEditable(false);
        result.setColumns(20);
        result.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        result.setRows(5);
        jScrollPane1.setViewportView(result);

        btn_read1.setText("Check From Database");
        btn_read1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_read1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(btn_read1)
                        .addGap(50, 50, 50)
                        .addComponent(btn_read))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edt_key, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_username, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edt_userid, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edt_userid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edt_key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_read)
                    .addComponent(btn_read1))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edt_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_keyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_keyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try{
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          LocalDate ld = LocalDate.now();
          String date = dtf.format(ld);
           Class.forName("java.sql.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/license","root","krroot");
           
            String query="insert into license_keys values(?,?,?)";
            java.sql.PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, edt_key.getText());
            pstmt.setString(2, cb_username.getSelectedItem().toString());
            pstmt.setString(3, edt_userid.getText());
            pstmt.executeUpdate();
            File myFile = new File(cb_username.getSelectedItem().toString()+"_license");
            if(myFile.createNewFile())
            {
                FileWriter myWriter = new FileWriter(cb_username.getSelectedItem().toString()+"_license");
                myWriter.write("License Key Generated\n_______________________\nUserName ="+cb_username.getSelectedItem().toString()+"\nYour Device ID = "+edt_userid.getText()+"\nYour Key =  "+edt_key.getText());
                myWriter.close();
            }
             JOptionPane.showMessageDialog(rootPane, "Response Sucessfull");
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(rootPane, e);
      }
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void edt_useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_useridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_useridActionPerformed

    private void cb_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_usernameActionPerformed
      try{
           Class.forName("java.sql.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/license","root","krroot");
            Statement stmt=con.createStatement();
            String query="select device_id from login where Username='"+cb_username.getSelectedItem().toString()+"' ";
            
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                
                edt_userid.setText(rs.getString(1));
            }
           /* String query2 = "select Key_ID from license_keys where User='"+cb_username.getSelectedItem().toString()+"' ";
            ResultSet rs2 = stmt.executeQuery(query2);
            while(rs2.next())
            {
                    if(!rs2.wasNull()==true)
                    {
                    System.out.println(rs2.getString(1).toString());
                    edt_key.setText(rs2.getString(1).toString());
                    edt_key.setEditable(false);
                    }
                    else{
                        edt_key.setText("");
                        edt_key.setEditable(true);
                    }
                
            }*/
          
            
    }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(rootPane, e);
      }
    }//GEN-LAST:event_cb_usernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       adduserDialog Info = new adduserDialog();
       Info.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_readActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_readActionPerformed
   
  JFileChooser fc = new JFileChooser();  
  int i = fc.showOpenDialog(this);  
  if (i == JFileChooser.APPROVE_OPTION)   
  {  
   File f = fc.getSelectedFile();
   //f.read();
   System.out.println(f);
   String filepath = f.getPath();  
  System.out.println(filepath);  
  BufferedReader br;  
      try {
          br = new BufferedReader(new FileReader(filepath));
          String s1 = "", s2 = "";  
         // String line = File.readAllLines(f.get(filepath)).get(1);
   while ((s1 = br.readLine()) != null)   
   {  
    s2 += s1 + "\n";  
   }  
 System.out.println(s2); 
result.setText(s2);
result.setVisible(true);
   br.close(); 
      } catch (FileNotFoundException ex) {
          Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
      }
   
  }
    }//GEN-LAST:event_btn_readActionPerformed

    private void btn_read1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_read1ActionPerformed
        new dbCheck().setVisible(true);
    }//GEN-LAST:event_btn_read1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_read;
    private javax.swing.JButton btn_read1;
    public static javax.swing.JComboBox<String> cb_username;
    private javax.swing.JTextField edt_key;
    private javax.swing.JTextField edt_userid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFileChooser jfc;
    private javax.swing.JTextArea result;
    // End of variables declaration//GEN-END:variables
}
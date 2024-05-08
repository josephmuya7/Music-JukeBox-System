package pkgfinal;

//imported library functions
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UpdateLibrary extends javax.swing.JFrame {

   
    public UpdateLibrary() {
        initComponents();
        playlist = new Connection() ;
        if(playlist == null)
        {
            JOptionPane.showMessageDialog(this, "B Connection not available", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
Connection playlist;
PreparedStatement s;
ResultSet rt;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtrating = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        jlabel1 = new javax.swing.JLabel();
        txttno = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        txttname = new javax.swing.JTextField();
        txtartist = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jlabel4 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UpdateLibrary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(255, 51, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 255, 153));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setForeground(new java.awt.Color(0, 255, 153));
        jLabel2.setText("rating");

        Update.setBackground(new java.awt.Color(0, 51, 0));
        Update.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Update.setForeground(new java.awt.Color(0, 255, 153));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jlabel1.setForeground(new java.awt.Color(0, 255, 153));
        jlabel1.setText("track_no");

        txttno.setText("0");

        search.setBackground(new java.awt.Color(153, 0, 0));
        search.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        search.setForeground(new java.awt.Color(0, 255, 153));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 153));
        jLabel1.setText("track_name:");

        jlabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlabel4.setForeground(new java.awt.Color(0, 255, 153));
        jlabel4.setText("artist");

        delete.setBackground(new java.awt.Color(0, 102, 51));
        delete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 255, 153));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Update))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtrating, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(txttno)
                            .addComponent(txttname)
                            .addComponent(txtartist))
                        .addGap(100, 100, 100))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(search)
                        .addGap(41, 41, 41)
                        .addComponent(delete)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel1)
                    .addComponent(txttno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtartist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update)
                    .addComponent(search)
                    .addComponent(delete))
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//update button 
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
       
        //track_no is Auto inc
        String track_no = txttno.getText();
        String track_name = txttname.getText();
        String artist = txtartist.getText();
        String rating = txtrating.getText();
        if(playlist != null)
        {
          java.sql.Connection playlist = Connection.B(); //connecting to the database
           
        try
        {
            s= playlist.prepareStatement("INSERT INTO music_app(TrackName,Artist,Rating) VALUES(?,?,?)");
            s.executeUpdate("UPDATE music_app SET Rating='"+rating+"' WHERE TrackNo = '"+track_no+"' ");
            JOptionPane.showMessageDialog(this, "track successfully updated", "MSG",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(this, "'"+track_name+"','"+artist+"','"+rating+"'", "MSG",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
        }
        else
        {
            System.out.println("The connection not available");
        }   
       
    }//GEN-LAST:event_UpdateActionPerformed
//search button
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        java.sql.Connection playlist = Connection.B();//connecting to the database
        if(playlist != null)
        {
            try
            { 
            s= playlist.prepareStatement("INSERT INTO music_app(TrackName,Artist,Rating) VALUES(?,?,?)");
            ResultSet rt = s.executeQuery("SELECT * FROM music_app WHERE TrackNo = '"+txttno.getText()+"'");
            if(rt.next()){
                txttname.setText(rt.getString("TrackName"));
                txtartist.setText(rt.getString("Artist"));
                txtrating.setText(rt.getString("Rating"));
            }
            else
            {
                JOptionPane.showMessageDialog(this, "no search track exists!", "Error",JOptionPane.INFORMATION_MESSAGE);
            }
            }
           catch(SQLException ex)
           {
               System.out.println(ex); 
        }
          
        } 
    }//GEN-LAST:event_searchActionPerformed

    //delete button
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String track_no = txttno.getText();
          if(playlist != null)
        {
          java.sql.Connection playlist = Connection.B(); //connecting to the database  
        try
        {
            s= playlist.prepareStatement("INSERT INTO music_app(TrackName,Artist,Rating) VALUES(?,?,?)");
            s.executeUpdate("DELETE FROM music_app WHERE TrackNo = '"+track_no+"'");
            JOptionPane.showMessageDialog(this, "track successfully deleted", "MSG",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
        }
        else
        {
            System.out.println("The connection not available");
        }   
        
    }//GEN-LAST:event_deleteActionPerformed

    //main method
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
            java.util.logging.Logger.getLogger(UpdateLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateLibrary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JButton search;
    private javax.swing.JTextField txtartist;
    private javax.swing.JTextField txtrating;
    private javax.swing.JTextField txttname;
    private javax.swing.JTextField txttno;
    // End of variables declaration//GEN-END:variables

   
}

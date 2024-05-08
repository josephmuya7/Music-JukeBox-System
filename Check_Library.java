package pkgfinal;

import pkgfinal.Connection;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.ImageIcon;
import net.proteanit.sql.DbUtils;

public class Check_Library extends javax.swing.JFrame {

    public Check_Library() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txttno = new javax.swing.JTextField();
        check = new javax.swing.JButton();
        list = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlibrarydata = new javax.swing.JTable();
        cba = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtartist = new javax.swing.JTextField();
        artisttrack = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Check_Library\n");
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(100, 100, 400, 200));
        setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Check Library", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Enter Track Number:");

        check.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        check.setText("Check Track");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        list.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        list.setText("List All Tracks");
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });

        jlibrarydata.setBackground(new java.awt.Color(102, 0, 102));
        jlibrarydata.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlibrarydata.setForeground(new java.awt.Color(255, 255, 0));
        jlibrarydata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TrackNo", "TrackName", "Artist", "rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jlibrarydata);

        cba.setBackground(new java.awt.Color(0, 153, 102));
        cba.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cba.setForeground(new java.awt.Color(255, 255, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Enter artist name:");

        artisttrack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        artisttrack.setText("Display artist track");
        artisttrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artisttrackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtartist, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(artisttrack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(list)
                    .addComponent(cba, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check)
                    .addComponent(list))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtartist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artisttrack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cba, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 750, 430));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//check button when clicked
    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        
        //connecting to the database
        java.sql.Connection playlist = Connection.B();
        if(playlist != null)
        {
            
            try
            { 
            s= playlist.prepareStatement("SELECT * FROM music_app WHERE TrackNo = '"+txttno.getText()+"'");
            ResultSet rt = s.executeQuery();//fetches data
           DefaultTableModel music_app = (DefaultTableModel)jlibrarydata.getModel();
           music_app.setRowCount(0);
           
           if(rt.next())
           {
               
              Object b[]={rt.getInt("TrackNo"),rt.getString("TrackName"),rt.getString("Artist"),rt.getString("Rating")}; 
              music_app.addRow(b);
           }
           else
           {
               JOptionPane.showMessageDialog(this, "no search TrackNo exists or has been recently deleted!", "Error",JOptionPane.INFORMATION_MESSAGE);
           }
            }
           catch(SQLException ex)
           {
               System.out.println(ex); 
        }
            
        }
        
    }//GEN-LAST:event_checkActionPerformed
//list button when clicked
    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        
       //connecting to the database
        java.sql.Connection playlist = Connection.B();
        if(playlist != null)
        {
            try
            {  
          String sql = "select * from music_app";
        PreparedStatement s = playlist.prepareStatement(sql);
        ResultSet rt = s.executeQuery();
        jlibrarydata.setModel(DbUtils.resultSetToTableModel(rt));
            }
           catch(SQLException ex)
           {
               System.out.println(ex); 
           }
            
        }
       
    }//GEN-LAST:event_listActionPerformed

    //artisttrack button for displaying track of specified artist searched in a jcombobox
    private void artisttrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artisttrackActionPerformed
          
        //connecting to the database
        java.sql.Connection playlist = Connection.B();
        if(playlist != null)
        {
            
            try
            { 
            s= playlist.prepareStatement("SELECT * FROM music_app WHERE Artist = '"+txtartist.getText()+"'");
            ResultSet rt = s.executeQuery();//fetches data
            //we get all track_names of artist searched and add into combobox 
            if(rt.next()){
                String track_name = rt.getString("TrackName");//track_name is actual column name of table librarydata
                cba.addItem(track_name);//add into jcombobox
            }
            else
            {
                JOptionPane.showMessageDialog(this, "no search artist exists!", "Error",JOptionPane.INFORMATION_MESSAGE);
            }
            }
           catch(SQLException ex)
           {
               System.out.println(ex); 
        }
          
        } 
    }//GEN-LAST:event_artisttrackActionPerformed
 
      
   

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
            java.util.logging.Logger.getLogger(Check_Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Check_Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Check_Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check_Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Check_Library().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton artisttrack;
    private javax.swing.JComboBox<String> cba;
    private javax.swing.JButton check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jlibrarydata;
    private javax.swing.JButton list;
    private javax.swing.JTextField txtartist;
    private javax.swing.JTextField txttno;
    // End of variables declaration//GEN-END:variables

    
}

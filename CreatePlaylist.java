package pkgfinal;

//imported library functions
import jaco.mp3.player.MP3Player;
import java.awt.*;
import java.io.File;
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
import javax.swing.JOptionPane;

public class CreatePlaylist extends javax.swing.JFrame {
 /*   
    //Define File for Song
    File songFile;
    //Define Current Directory Like If We JFileChooser then where it stays
    String currentDirectory="home.user";
     //Here I define current path of the running app class
    //Define MP3Player Class From JACO Mp3Player
    MP3Player player;
    String currentPath;
    
 */

    
    public CreatePlaylist() {
        initComponents();
        //Now make a String to get file name
       // String fileName=songFile.getName();

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
        jPanel2 = new javax.swing.JPanel();
        addTrackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txttno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttname = new javax.swing.JTextField();
        txtartist = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtrating = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlibrarydata = new javax.swing.JTable();
        getFromPcBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CreatePlaylist", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(204, 204, 0))); // NOI18N

        addTrackBtn.setBackground(new java.awt.Color(0, 51, 51));
        addTrackBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addTrackBtn.setForeground(new java.awt.Color(255, 255, 0));
        addTrackBtn.setText("Add Track");
        addTrackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTrackBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Enter track_no:");

        txttno.setText("0");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Enter track_name:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Enter artist:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Enter rating:");

        jlibrarydata.setBackground(new java.awt.Color(51, 0, 102));
        jlibrarydata.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlibrarydata.setForeground(new java.awt.Color(255, 153, 0));
        jlibrarydata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "track_no", "track_name", "artist", "rating"
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

        getFromPcBtn.setText("Get From PC");
        getFromPcBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getFromPcBtnMouseClicked(evt);
            }
        });
        getFromPcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getFromPcBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(addTrackBtn)
                        .addGap(46, 666, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(287, 287, 287))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txttname, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtartist, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtrating, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txttno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBtn)
                            .addComponent(getFromPcBtn))
                        .addGap(128, 128, 128))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 300, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(getFromPcBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txttno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addBtn)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txttname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtartist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtrating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addTrackBtn)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //add button
    private void addTrackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTrackBtnActionPerformed
        //track_no is Auto inc
        String track_name = txttname.getText();
        String artist = txtartist.getText();
        String rating = txtrating.getText();
        if(track_name.isEmpty()||artist.isEmpty()||rating.isEmpty())
        {
             JOptionPane.showMessageDialog(this,"details not fully filled!","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            add(track_name,artist,rating);
        }
       
    }//GEN-LAST:event_addTrackBtnActionPerformed

    private void getFromPcBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getFromPcBtnMouseClicked
        // TODO add your handling code here:
        
    /*  
        JFileChooser openFileChooser=new JFileChooser(currentDirectory);
        openFileChooser.setFileFilter(new FileTypeFilter(".mp3","open MP3 Files Only!"));
        int result=openFileChooser.showOpenDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
              songFile=openFileChooser.getSelectedFile();
             player.addToPlayList(songFile);
             player.skipForward();
             currentDirectory=songFile.getAbsolutePath();
       // songNameDisplay.setText("Playing Now...."+songFile.getName());
        }
        String track_name = songFile.getName();
      //  String artist = txtartist.getText();
      //  String rating = txtrating.getText();
        
     */
        
    }//GEN-LAST:event_getFromPcBtnMouseClicked

    private void getFromPcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getFromPcBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getFromPcBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CreatePlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatePlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatePlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatePlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatePlaylist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addTrackBtn;
    private javax.swing.JButton getFromPcBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jlibrarydata;
    private javax.swing.JTextField txtartist;
    private javax.swing.JTextField txtrating;
    private javax.swing.JTextField txttname;
    private javax.swing.JTextField txttno;
    // End of variables declaration//GEN-END:variables

//add method
    private void add(String track_name, String artist, String rating) {
        java.sql.Connection playlist = Connection.B();//connecting to the database
        if(playlist != null)
        {
           try
            {
            s= playlist.prepareStatement("INSERT INTO music_app(TrackName,Artist,Rating) VALUES(?,?,?)");
            s.setString(1, track_name);
            s.setString(2, artist);
            s.setString(3, rating);
            s.executeUpdate();
             JOptionPane.showMessageDialog(this, "track successfully added", "MSG",JOptionPane.INFORMATION_MESSAGE);
             txttname.setText("");
             txtartist.setText("");
             txtrating.setText(""); 
            }
           catch(SQLException ex)
           {                
               Logger.getLogger(CreatePlaylist.class.getName()).log(Level.SEVERE,null,ex);
           }
        try
    {
        String sql = "select * from music_app";
        PreparedStatement s = playlist.prepareStatement(sql);
        ResultSet rt = s.executeQuery();
        jlibrarydata.setModel(DbUtils.resultSetToTableModel(rt)); 
    }
        catch(SQLException ex)
    {
        Logger.getLogger(CreatePlaylist.class.getName()).log(Level.SEVERE,null,ex);
    } }
        else
        {
            System.out.println("The connection not available");
        }
        
        
    }
    
  
}

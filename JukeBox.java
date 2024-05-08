
package pkgfinal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JukeBox extends javax.swing.JFrame {

    
    public JukeBox() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        check = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        playlist = new javax.swing.JButton();
        update = new javax.swing.JButton();
        quit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JUKE BOX");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 51, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jukebox", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(0, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        check.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        check.setText("Check Library");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        jPanel3.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Select an option by clicking one of the buttons below:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 431, -1));

        playlist.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        playlist.setText("Create Playlist");
        playlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlistActionPerformed(evt);
            }
        });
        jPanel3.add(playlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        update.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        update.setText("Update Library");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        quit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        quit.setText("Exit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });
        jPanel3.add(quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 740, 220));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 270));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Check_Library  button
    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        Check_Library c = new Check_Library();
        c.setVisible(true);
    }//GEN-LAST:event_checkActionPerformed

    //exit button
    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        
        JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to EXIT", "The JukeBox", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
            LibraryData.close();
        }
        
    }//GEN-LAST:event_quitActionPerformed

    //CreatePlaylist button
    private void playlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlistActionPerformed
     
        CreatePlaylist c = new CreatePlaylist();
        c.setVisible(true);
        
    }//GEN-LAST:event_playlistActionPerformed

    //UpdateLibrary button
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
      
        UpdateLibrary u = new UpdateLibrary();
        u.setVisible(true);
    }//GEN-LAST:event_updateActionPerformed


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
            java.util.logging.Logger.getLogger(JukeBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JukeBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JukeBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JukeBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JukeBox().setVisible(true);
            }
        });
    }

     

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton check;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton playlist;
    private javax.swing.JButton quit;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}
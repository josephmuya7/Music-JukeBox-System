
package pkgfinal;

import com.jmex.audio.player.AudioPlayer;
import jaco.mp3.player.MP3Player;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class player extends javax.swing.JFrame {

    static void addToPlayList(File songFile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void skipForward() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form player
     */
     Duration songLength;

    public player(Duration songLength) {
        this.songLength = songLength;
    }

    
    //Define MP3Player Class From JACO Mp3Player
    MP3Player player;
    //Define File for Song
    File songFile;
    //Define Current Directory Like If We JFileChooser then where it statys
    String currentDirectory="home.user";
    //Here I define current path of the running app class
    String currentPath;
    //This String Will Be For Image Name
    String imagePath;
    //We need to set app title as a String
    String  appName="COMMART MUSIC JUKEBOX -(MP3 Player)";
    //Now check if repeat button is enabled or not
    boolean repeat=false;
    //Here I am making a boolean for windowcollapsed
    boolean windowCollapsed=false;
    //Here I need to define mouse x and y for for to get a mouse position on screen.
    int xMouse,yMouse;
    
    
    public player() {
        initComponents();

    
        
        //strech background image
        Icon i=label.getIcon();
        ImageIcon icon=(ImageIcon)i;
        Image image=icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(image));
        //Set App Title
        appTitle.setText(appName);
        //Here I am going to set a default song file. 
        songFile=new File("C:\\Users\\Smoker\\Music\\Hott Headzz   Hmmm-HottHeadzzVEVO-1fa85aca1894596471a36a3ab915e965.mp3");
        //Now make a String to get file name
        String fileName=songFile.getName();
        //Her set our song name label with this name
        songNameDisplay.setText(fileName);
        //Add our method to player variable
        player=mp3Player();
        //Now add song to player as playlist
        player.addToPlayList(songFile);
        //Here get current path and image path in strings
        currentPath=Paths.get(".").toAbsolutePath().normalize().toString();
        imagePath="\\images";
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        repeatBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pauseBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        muteBtn = new javax.swing.JButton();
        volumeDownBtn = new javax.swing.JButton();
        volumeUpBtn = new javax.swing.JButton();
        settingBtn = new javax.swing.JButton();
        lordbar = new javax.swing.JProgressBar();
        songNameDisplay = new javax.swing.JLabel();
        appTitle = new javax.swing.JLabel();
        volumeFullBtn = new javax.swing.JButton();
        playBtn = new javax.swing.JButton();
        stopBtn = new javax.swing.JButton();
        quitBtn = new javax.swing.JButton();
        openBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lbllord = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        repeatBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loop.png"))); // NOI18N
        repeatBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repeatBtnMouseClicked(evt);
            }
        });
        getContentPane().add(repeatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 268, 49, 51));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/previous.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 268, 50, -1));

        pauseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pauseit.png"))); // NOI18N
        pauseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pauseBtnMouseClicked(evt);
            }
        });
        getContentPane().add(pauseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 268, 42, 51));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 268, 50, -1));

        muteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mute.png"))); // NOI18N
        muteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                muteBtnMouseClicked(evt);
            }
        });
        getContentPane().add(muteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 363, 31, -1));

        volumeDownBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lowVolume.png"))); // NOI18N
        volumeDownBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeDownBtnMouseClicked(evt);
            }
        });
        getContentPane().add(volumeDownBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 363, 26, -1));

        volumeUpBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mediumVolume.png"))); // NOI18N
        volumeUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeUpBtnMouseClicked(evt);
            }
        });
        getContentPane().add(volumeUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 363, 32, 37));

        settingBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/setting1.png"))); // NOI18N
        settingBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingBtnMouseClicked(evt);
            }
        });
        settingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingBtnActionPerformed(evt);
            }
        });
        getContentPane().add(settingBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 46, 55));
        getContentPane().add(lordbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 248, 290, -1));

        songNameDisplay.setText("Playing.....");
        getContentPane().add(songNameDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 290, 22));

        appTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        appTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appTitleMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                appTitleMousePressed(evt);
            }
        });
        getContentPane().add(appTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 440, 26));

        volumeFullBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fullVolume1_1.png"))); // NOI18N
        volumeFullBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeFullBtnMouseClicked(evt);
            }
        });
        getContentPane().add(volumeFullBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 365, 32, -1));

        playBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play21.png"))); // NOI18N
        playBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playBtnMouseClicked(evt);
            }
        });
        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });
        getContentPane().add(playBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 268, 54, -1));

        stopBtn.setText("Stop");
        stopBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopBtnMouseClicked(evt);
            }
        });
        getContentPane().add(stopBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 268, -1, 51));

        quitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back2.png"))); // NOI18N
        quitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitBtnMouseClicked(evt);
            }
        });
        getContentPane().add(quitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 50, 70));

        openBtn.setText("Load From Pc");
        openBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openBtnMouseClicked(evt);
            }
        });
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtnActionPerformed(evt);
            }
        });
        getContentPane().add(openBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 110, 40));

        jButton1.setText("Create Playlist");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 110, 30));

        jButton3.setText("Load From online");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, 40));

        jButton5.setText("Help");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, -1, -1));

        lbllord.setText("0.00");
        getContentPane().add(lbllord, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/widget.jpg"))); // NOI18N
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 710, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void playBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBtnMouseClicked
        // TODO add your handling code here:
        player.play();
       
    }//GEN-LAST:event_playBtnMouseClicked

    private void stopBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopBtnMouseClicked
        // TODO add your handling code here:
        player.stop();
    }//GEN-LAST:event_stopBtnMouseClicked

    private void pauseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseBtnMouseClicked
        // TODO add your handling code here:
        player.pause();
    }//GEN-LAST:event_pauseBtnMouseClicked

    private void repeatBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repeatBtnMouseClicked
        // TODO add your handling code here:
        if(repeat==false){
        repeat=true;
        player.setRepeat(repeat);
        String image=currentPath+imagePath+"\\repeat_enabled.png";
        repeatBtn.setIcon(new ImageIcon(image));
        }else if(repeat==true){
        player.setRepeat(repeat);
        
        String image=currentPath+imagePath+"\\repeat.png";
        repeatBtn.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_repeatBtnMouseClicked

    private void appTitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTitleMousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_appTitleMousePressed

    private void quitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitBtnMouseClicked
        // TODO add your handling code here:
        JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame, "Do you want to EXIT", "Music Player", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_quitBtnMouseClicked

    private void settingBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new setting().setVisible(true);
    }//GEN-LAST:event_settingBtnMouseClicked

    private void openBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openBtnMouseClicked
        // TODO add your handling code here:
        JFileChooser openFileChooser=new JFileChooser(currentDirectory);
        openFileChooser.setFileFilter(new FileTypeFilter(".mp3","open MP3 Files Only!"));
        int result=openFileChooser.showOpenDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
        songFile=openFileChooser.getSelectedFile();
        player.addToPlayList(songFile);
        player.skipForward();
        currentDirectory=songFile.getAbsolutePath();
        songNameDisplay.setText("Playing Now...."+songFile.getName());
        }
        
    }//GEN-LAST:event_openBtnMouseClicked

    private void appTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTitleMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
        if(windowCollapsed==false){
        windowCollapsed=true;
        this.setSize (new Dimension(this.getSize().width,80));
        
        appTitle.setFont(new Font("Nirmala UI",0,12));
        appTitle.setText("Playing Now..."+songFile.getName());
        }else if(windowCollapsed==true){
        windowCollapsed=false;
        this.setSize (new Dimension(this.getSize().width,700));
        
        appTitle.setFont(new Font("Nirmala UI",0,18));
        appTitle.setText(appName);
        }
        }
    }//GEN-LAST:event_appTitleMouseClicked

    private void volumeDownBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeDownBtnMouseClicked
        // TODO add your handling code here:
        volumeDownControl(0.1);
    }//GEN-LAST:event_volumeDownBtnMouseClicked

    private void volumeUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeUpBtnMouseClicked
        // TODO add your handling code here:
        volumeUpControl(0.1);
    }//GEN-LAST:event_volumeUpBtnMouseClicked

    private void volumeFullBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeFullBtnMouseClicked
        // TODO add your handling code here:
        volumeControl(1.0);
    }//GEN-LAST:event_volumeFullBtnMouseClicked

    private void muteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muteBtnMouseClicked
        // TODO add your handling code here:
        volumeControl(0.0);
    }//GEN-LAST:event_muteBtnMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new help().setVisible(true);

    }//GEN-LAST:event_jButton5MouseClicked

    private void openBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openBtnActionPerformed

    private void settingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settingBtnActionPerformed

    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_playBtnActionPerformed

     private void appTitleMouseDragged(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        
        this.setLocation(x-xMouse, y-yMouse);
        
    }      
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
            java.util.logging.Logger.getLogger(player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new player().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appTitle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel label;
    public static javax.swing.JLabel lbllord;
    public static javax.swing.JProgressBar lordbar;
    private javax.swing.JButton muteBtn;
    private javax.swing.JButton openBtn;
    private javax.swing.JButton pauseBtn;
    private javax.swing.JButton playBtn;
    private javax.swing.JButton quitBtn;
    private javax.swing.JButton repeatBtn;
    private javax.swing.JButton settingBtn;
    private javax.swing.JLabel songNameDisplay;
    private javax.swing.JButton stopBtn;
    private javax.swing.JButton volumeDownBtn;
    private javax.swing.JButton volumeFullBtn;
    private javax.swing.JButton volumeUpBtn;
    // End of variables declaration//GEN-END:variables
//I am going to create a custom MP3Player Method
    private MP3Player mp3Player(){
    MP3Player mp3Player=new MP3Player();
    return mp3Player;
    
    }
    //Let's Set Volume Down Method 
    private void volumeDownControl(Double valueToPlusMinus){
    //Get Mixer Information From AudioSystems
    Mixer.Info[]mixers=AudioSystem.getMixerInfo();
    //Now use a for loop to list all mixers
    for(Mixer.Info mixerInfo:mixers){
        //Get Mixer
        Mixer mixer=AudioSystem.getMixer(mixerInfo);
        //Now get Target Line
        Line.Info[]lineInfos=mixer.getTargetLineInfo();
        //here again use for loop to list lines
        for(Line.Info lineInfo:lineInfos){
        //Make a null line
        Line line=null;
        //make a boolean as opened
        boolean opened=true;
            try {
                //Now use try exeptions for opening a line
                line=mixer.getLine(lineInfo);
                opened=line.isOpen()||line instanceof Clip;
                //Now Check if line is not  opened
                if(!opened){
                //Openline
                line.open();
                }
                //Make a float control
                FloatControl volControl=(FloatControl) line.getControl(FloatControl.Type.VOLUME);
                //get current Volume now
                float currentVolume=volControl.getValue();
                //Make a temp double variable and store valuePlusMinus
                Double volumeToCut=valueToPlusMinus;
                //Make a float calculate the addition or subtraction in volume
                float changedCalc=(float)((float)currentVolume-(double)volumeToCut);
                //Now Set this changed value into volume line
                volControl.setValue(changedCalc);
                
            } catch (LineUnavailableException lineExeption) {
                
            }catch(IllegalArgumentException illException){
            }finally{
                //Close Line if it is opened
            if(line!=null && !opened){
                line.close();
            
            }
            }
        }
    }
    }
    //Let's Set Volume Up Method 
    private void volumeUpControl(Double valueToPlusMinus){
    //Get Mixer Information From AudioSystems
    Mixer.Info[]mixers=AudioSystem.getMixerInfo();
    //Now use a for loop to list all mixers
    for(Mixer.Info mixerInfo:mixers){
        //Get Mixer
        Mixer mixer=AudioSystem.getMixer(mixerInfo);
        //Now get Target Line
        Line.Info[]lineInfos=mixer.getTargetLineInfo();
        //here again use for loop to list lines
        for(Line.Info lineInfo:lineInfos){
        //Make a null line
        Line line=null;
        //make a boolean as opened
        boolean opened=true;
            try {
                //Now use try exeptions for opening a line
                line=mixer.getLine(lineInfo);
                opened=line.isOpen()||line instanceof Clip;
                //Now Check if line is not  opened
                if(!opened){
                //Openline
                line.open();
                }
                //Make a float control
                FloatControl volControl=(FloatControl) line.getControl(FloatControl.Type.VOLUME);
                //get current Volume now
                float currentVolume=volControl.getValue();
                //Make a temp double variable and store valuePlusMinus
                Double volumeToCut=valueToPlusMinus;
                //Make a float calculate the addition or subtraction in volume
                float changedCalc=(float)((float)currentVolume+(double)volumeToCut);
                //Now Set this changed value into volume line
                volControl.setValue(changedCalc);
                
            } catch (LineUnavailableException lineExeption) {
                
            }catch(IllegalArgumentException illException){
            }finally{
                //Close Line if it is opened
            if(line!=null && !opened){
                line.close();
            
            }
            }
        }
    }
    }
    //Let's Set Volume control Method 
    private void volumeControl(Double valueToPlusMinus){
    //Get Mixer Information From AudioSystems
    Mixer.Info[]mixers=AudioSystem.getMixerInfo();
    //Now use a for loop to list all mixers
    for(Mixer.Info mixerInfo:mixers){
        //Get Mixer
        Mixer mixer=AudioSystem.getMixer(mixerInfo);
        //Now get Target Line
        Line.Info[]lineInfos=mixer.getTargetLineInfo();
        //here again use for loop to list lines
        for(Line.Info lineInfo:lineInfos){
        //Make a null line
        Line line=null;
        //make a boolean as opened
        boolean opened=true;
            try {
                //Now use try exeptions for opening a line
                line=mixer.getLine(lineInfo);
                opened=line.isOpen()||line instanceof Clip;
                //Now Check if line is not  opened
                if(!opened){
                //Openline
                line.open();
                }
                //Make a float control
                FloatControl volControl=(FloatControl) line.getControl(FloatControl.Type.VOLUME);
                //get current Volume now
                float currentVolume=volControl.getValue();
                //Make a temp double variable and store valuePlusMinus
                Double volumeToCut=valueToPlusMinus;
                //Make a float calculate the addition or subtraction in volume
                float changedCalc=(float)((double)volumeToCut);
                //Now Set this changed value into volume line
                volControl.setValue(changedCalc);
                
            } catch (LineUnavailableException lineExeption) {
                
            }catch(IllegalArgumentException illException){
            }finally{
                //Close Line if it is opened
            if(line!=null && !opened){
                line.close();
            
            }
            }
        }
    }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkgfinal;

/**
 *
 * @author user
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
                player pl=new player();
        pl.setVisible(true);
        
        try {
        for(int x=0;x<=100;x++){
            
                Thread.sleep(50);
                player.lbllord.setText(Integer.toString(x)+"%");
                player.lordbar.setValue(x);
            }} catch (Exception e) {
                
            }
        
        
        }
    }
    


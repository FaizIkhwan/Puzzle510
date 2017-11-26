

import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.*;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shah & Ikhwan
 */
public class Data {
    public String[] Ship={"French Ship","Greek Ship","Brazilian Ship",
                          "English Ship","Spanish Ship"};
    public String[] Content={"Tea","Coffee","Cocoa","Rice","Corn"};
    public String[] Arrival={"5.00am","6.00pm","8.00pm","9.00pm","7.00pm"};
    public String[] Chimney={"Blue","Red","Black","White","Green"};
    public String[] Destination={"Genoa","Hamburg","Manila","Marseille","Port Said"};
    public String[] Picture={"FrenchShip.png","GreekShip.png","BrazilianShip.png",
                             "EnglishShip.png","SpanishShip.png"};
    
    public void musicPlay()
    {
        try{
            JFXPanel j = new JFXPanel();
            String uri = new File("GameSong.wav").toURI().toString();
            new MediaPlayer(new Media(uri)).play();
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    
    }
}

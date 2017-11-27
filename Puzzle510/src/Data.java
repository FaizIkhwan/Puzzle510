

import java.io.File;
import java.io.InputStream;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


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
        try
        {
            // get the sound file as a resource out of my jar file;
            // the sound file must be in the same directory as this class file.
            // the input stream portion of this recipe comes from a javaworld.com article.
            InputStream inputStream = getClass().getResourceAsStream("GameSong.wav");
            AudioStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void musicStop()
    {
        try
        {
            // get the sound file as a resource out of my jar file;
            // the sound file must be in the same directory as this class file.
            // the input stream portion of this recipe comes from a javaworld.com article.
            InputStream inputStream = getClass().getResourceAsStream("GameSong.wav");
            AudioStream audioStream = new AudioStream(inputStream);
            if(audioStream != null)
            {
                AudioPlayer.player.stop(audioStream);
            }
            
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}

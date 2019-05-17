/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbtv;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author kanip
 */
public class BBtv extends Application {
    
    private String[] playList;
    private String filePath;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        playList[0] = "10 Małych Indian";
        playList[1] ="Jesteśmy Jagódki czarne jagódki";
        playList[2] ="Kółko graniaste";
        playList[3] ="Kręć się dookoła";
        playList[4] ="Pięć małpek";
        playList[5] ="RE-RE KUM-KUM - Była sobie żabka mała";
        playList[6] ="Ta Dorotka";
        
        Random rnd = new Random(); 
        int startSong = rnd.nextInt(6);
        filePath = "media."+playList[startSong]+".mp4";
        
        Parent root = FXMLLoader.load(getClass().getResource("BBtvDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

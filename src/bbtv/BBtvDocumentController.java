/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbtv;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

/**
 *
 * @author kanip
 */
public class BBtvDocumentController implements Initializable {
    
    
    private MediaPlayer mediaPlayer;
    //private ArrayList<ArrayList> playList;
    private String filePath;
    private boolean isLoaded = false;
    
    @FXML
    private MediaView mediaView;
    
    /*@FXML
    private void choseMovieButton(ActionEvent event){
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Select a File (*.mp4*)", "*.mp4");
            fileChooser.getExtensionFilters().add(filter);    
            File file = fileChooser.showOpenDialog(null);
            filePath = file.toURI().toString();
            
            if(filePath != null){
                Media media = new Media(filePath);
                mediaPlayer = new MediaPlayer(media);
                mediaView.setMediaPlayer(mediaPlayer);
                    DoubleProperty width = mediaView.fitWidthProperty();
                    DoubleProperty hight = mediaView.fitHeightProperty();
                    
                    width.bind(Bindings.selectDouble(mediaView.sceneProperty(), "width"));
                    hight.bind(Bindings.selectDouble(mediaView.sceneProperty(), "hight"));
                mediaPlayer.play();
            }
    }*/
    
    @FXML
    private void playButton(ActionEvent event) {
            if(isLoaded = false){
                Media media = new Media(filePath);
                mediaPlayer = new MediaPlayer(media);
                mediaView.setMediaPlayer(mediaPlayer);
                    DoubleProperty width = mediaView.fitWidthProperty();
                    DoubleProperty hight = mediaView.fitHeightProperty();
                    
                    width.bind(Bindings.selectDouble(mediaView.sceneProperty(), "width"));
                    hight.bind(Bindings.selectDouble(mediaView.sceneProperty(), "hight"));
                mediaPlayer.play();
            }
    }
    
    @FXML
    private void pauseButton(ActionEvent event){
        mediaPlayer.pause();
    }
    
    @FXML
    private void lowerButton(ActionEvent event){
        
    }
    
    @FXML
    private void higherButton(ActionEvent event){
        
    }
    
    @FXML
    private void addSongsButton(ActionEvent event){
        
    }
    @FXML
    private void exit(ActionEvent event){
        System.exit(4);
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

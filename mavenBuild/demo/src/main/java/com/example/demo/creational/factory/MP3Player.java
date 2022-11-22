package com.example.demo.creational.factory;

import com.example.demo.creational.factory.exception.MediaPlayerException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MP3Player implements MusicPlayer {
    @Override
    public void play(String mediaPath) throws MediaPlayerException {
    /*    try {

            Player player = new Player(new FileInputStream(new File(mediaPath)));
            player.play();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }*/
    }
}

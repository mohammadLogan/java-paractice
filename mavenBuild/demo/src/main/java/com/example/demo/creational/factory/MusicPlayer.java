package com.example.demo.creational.factory;

import com.example.demo.creational.factory.exception.MediaPlayerException;

public interface MusicPlayer {

    void play(String mediaPath) throws MediaPlayerException;
}

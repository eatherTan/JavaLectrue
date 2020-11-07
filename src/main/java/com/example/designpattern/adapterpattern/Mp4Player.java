package com.example.designpattern.adapterpattern;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //什么也不做
        System.out.println("Mp4Player  Playing Vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4Player  Playing mp4 file. Name: "+ fileName);
    }
}

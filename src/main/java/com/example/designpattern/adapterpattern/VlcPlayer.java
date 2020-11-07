package com.example.designpattern.adapterpattern;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("VlcPlayer Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
        System.out.println("VlcPlayer Playing mp4 file. Name: "+ fileName);
    }
}

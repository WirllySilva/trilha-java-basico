package com.smartdevice;

import com.smartdevice.camera.Camera;
import com.smartdevice.media.MediaPlayer;
import com.smartdevice.phone.Phone;
import com.smartdevice.web.Web;

public class SmartDevice implements MediaPlayer, Camera, Phone, Web {

    @Override
    public void takePicture() {
        System.out.println("Taking picture.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video.");
    }

    @Override
    public void playMedia() {
        System.out.println("Playing media.");
    }

    @Override
    public void pauseMedia() {
        System.out.println("Media paused.");

    }

    @Override
    public void chooseTrack(String track) {
        System.out.println("Choosing track" + track);
    }

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Calling: " + phoneNumber);
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving a call.");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voicemail.");
    }

    @Override
    public void displayWebPage(String url) {
        System.out.println("Displaying webpage: " + url);
    }

    @Override
    public void openNewTab() {
        System.out.println("opening new tab.");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing the page.");
    }
}
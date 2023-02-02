package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;


    public int getCurrentRadioStation() {
        return currentRadioStation;

    }

    public int getCurrentVolume() {

        return currentVolume;
    }


    public void NextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;

        }
    }

    public void PrevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setRadioStation(int currentRadioStation) {
        if (currentRadioStation >= 0 && currentRadioStation <= 9) {
            this.currentRadioStation = currentRadioStation;
        }

    }

    public void increaseVolume() {

        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }


    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

    public void setVolume(int currentVolume) {
            this.currentVolume = currentVolume;
        }
    }





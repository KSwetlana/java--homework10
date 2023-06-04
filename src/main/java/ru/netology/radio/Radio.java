package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxStationNum = 10;

    public Radio(int maxStationNum) {
        this.maxStationNum = maxStationNum;
    }

    public Radio() {

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;

    }

    public int getCurrentVolume() {
        return currentVolume;

    }

    public void NextRadioStation() {
        if (maxStationNum >= 10) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = maxStationNum;

        }
    }

    public void PrevRadioStation() {
        if (maxStationNum <= 1) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = maxStationNum - 2;
        }
    }

    public void setMaxStationNum() {
        if (maxStationNum >= 1 && maxStationNum <= 10) {
            this.currentRadioStation = currentRadioStation;

        }
    }

    public void increaseVolume() {

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
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
        if (currentVolume >= 0 && currentVolume <= 100) {
            this.currentVolume = currentVolume;
        }
    }
}







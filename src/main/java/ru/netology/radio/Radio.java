package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxStationNum;

    public Radio(int maxStationNum) {
        this.maxStationNum = 10;
        if (maxStationNum <=0 && maxStationNum > 10) {
            System.out.println ("Задан не верный диапозон");
        }
    }

    public Radio() {

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;

    }

    public int getCurrentVolume() {
        return currentVolume;

    }

    public int getMaxStationNum() {
        return maxStationNum;
    }

    public void NextRadioStation() {
        if (currentRadioStation == maxStationNum -1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;

        }
    }
    public void PrevRadioStation() {
        if (currentRadioStation == maxStationNum -10) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setRadioStation(int currentRadioStation, int maxStationNum) {
        if (currentRadioStation >= maxStationNum -10 && currentRadioStation <= maxStationNum -1 ) {
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





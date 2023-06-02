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

    public int getMaxStationNum() {
        return maxStationNum;
            }


    public void NextRadioStation() {
        if (currentRadioStation == maxStationNum - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;

        }
    }

    public void PrevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = maxStationNum -1 ;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setRadioStation(int currentRadioStation) {
        if (currentRadioStation >= 0 && currentRadioStation < maxStationNum) {
            this.currentRadioStation = currentRadioStation;

        } else {
            System.out.println("error");
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





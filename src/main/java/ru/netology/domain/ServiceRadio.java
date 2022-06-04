package ru.netology.domain;

public class ServiceRadio {
    private int currentRadio;
    private int currentVolume;

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio < 0) {
            return;
        }
        if (currentRadio > 9) {
            return;
        }
        this.currentRadio = currentRadio;
    }

    public void next() {
        if (currentRadio == 9) {
            setCurrentRadio(0);
            return;
        }
        currentRadio++;
    }

    public void prev() {
        if (currentRadio == 0) {
            setCurrentRadio(9);
            return;
        }
        currentRadio--;
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


}

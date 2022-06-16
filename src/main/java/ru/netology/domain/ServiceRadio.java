package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ServiceRadio {
    private int numberStation = 10;
    private int currentStation;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int maxVolume = 100;
    private int minVolume = 0;

    public ServiceRadio(int numberStation) {
        this.numberStation = numberStation;
        this.numberStation = numberStation - 1;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation > 0) {
            this.numberStation = numberStation;
            return;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation == maxStation) {
            setCurrentStation(minStation);
            return;
        }
        currentStation++;
    }

    public void prev() {
        if (currentStation == minStation) {
            setCurrentStation(maxStation);
            return;
        }
        currentStation--;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        return;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        return;
    }
}

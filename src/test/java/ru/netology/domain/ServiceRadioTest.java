package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceRadioTest {

    @Test
    void nextStations() {
        ServiceRadio radio = new ServiceRadio();

        radio.setCurrentRadio(9);
        radio.next();

        int actual = radio.getCurrentRadio();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStationsBorders() {
        ServiceRadio radio = new ServiceRadio();

        radio.setCurrentRadio(10);
        radio.next();

        int actual = radio.getCurrentRadio();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStations() {
        ServiceRadio radio = new ServiceRadio();

        radio.setCurrentRadio(5);
        radio.prev();

        int actual = radio.getCurrentRadio();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationsMax() {
        ServiceRadio radio = new ServiceRadio();

        radio.setCurrentRadio(0);
        radio.prev();

        int actual = radio.getCurrentRadio();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationsBorders() {
        ServiceRadio radio = new ServiceRadio();

        radio.setCurrentRadio(-1);
        radio.prev();

        int actual = radio.getCurrentRadio();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        ServiceRadio radio = new ServiceRadio();

        radio.setCurrentVolume(8);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMax() {
        ServiceRadio radio = new ServiceRadio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeBorders() {
        ServiceRadio radio = new ServiceRadio();

        radio.setCurrentVolume(11);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        ServiceRadio radio = new ServiceRadio();

        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeMin() {
        ServiceRadio radio = new ServiceRadio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeBorders() {
        ServiceRadio radio = new ServiceRadio();

        radio.setCurrentVolume(-1);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}

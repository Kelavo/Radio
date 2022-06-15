package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceRadioTest {
    ServiceRadio radio = new ServiceRadio(10);

    @Test
    void setCurrentStation() {
        int expected = 9;
        radio.setCurrentStation(expected);
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationLimit() {
        radio.setCurrentStation(11);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void nextStations() {

        radio.setCurrentStation(9);
        radio.next();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void nextStationsMax() {

        radio.setCurrentStation(10);
        radio.next();

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void nextStationsLimit() {

        radio.setCurrentStation(11);
        radio.next();

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void prevStations() {

        radio.setCurrentStation(2);
        radio.prev();

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void prevStationsMax() {

        radio.setCurrentStation(0);
        radio.prev();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void prevStationsBorders() {

        radio.setCurrentStation(-3);
        radio.prev();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void increaseVolume() {

        radio.setCurrentVolume(51);
        radio.increaseVolume();

        Assertions.assertEquals(52, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeMax() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeBorders() {

        radio.setCurrentVolume(101);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {

        radio.setCurrentVolume(2);
        radio.decreaseVolume();

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeMin() {

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeBorders() {

        radio.setCurrentVolume(-1);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}

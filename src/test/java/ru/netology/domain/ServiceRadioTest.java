package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ServiceRadioTest {
    ServiceRadio serviceRadio = new ServiceRadio(10);

    @Test
    void setCurrentStation() {
        int expected = 9;
        serviceRadio.setCurrentStation(expected);
        Assertions.assertEquals(expected, serviceRadio.getCurrentStation());
    }

    @Test
    void setCurrentStationLimit() {
        serviceRadio.setCurrentStation(11);
        Assertions.assertEquals(0, serviceRadio.getCurrentStation());
    }

    @Test
    void nextStations() {

        serviceRadio.setCurrentStation(9);
        serviceRadio.next();

        Assertions.assertEquals(0, serviceRadio.getCurrentStation());
    }

    @Test
    void nextStationsMax() {

        serviceRadio.setCurrentStation(10);
        serviceRadio.next();

        Assertions.assertEquals(1, serviceRadio.getCurrentStation());
    }

    @Test
    void nextStationsLimit() {

        serviceRadio.setCurrentStation(11);
        serviceRadio.next();

        Assertions.assertEquals(1, serviceRadio.getCurrentStation());
    }

    @Test
    void prevStations() {

        serviceRadio.setCurrentStation(2);
        serviceRadio.prev();

        Assertions.assertEquals(1, serviceRadio.getCurrentStation());
    }

    @Test
    void prevStationsMax() {

        serviceRadio.setCurrentStation(0);
        serviceRadio.prev();

        Assertions.assertEquals(9, serviceRadio.getCurrentStation());
    }

    @Test
    void prevStationsBorders() {

        serviceRadio.setCurrentStation(-3);
        serviceRadio.prev();

        Assertions.assertEquals(9, serviceRadio.getCurrentStation());
    }

    @Test
    void increaseVolume() {

        serviceRadio.setCurrentVolume(51);
        serviceRadio.increaseVolume();

        Assertions.assertEquals(52, serviceRadio.getCurrentVolume());
    }

    @Test
    void increaseVolumeMax() {

        serviceRadio.setCurrentVolume(100);
        serviceRadio.increaseVolume();

        Assertions.assertEquals(100, serviceRadio.getCurrentVolume());
    }

    @Test
    void increaseVolumeBorders() {

        serviceRadio.setCurrentVolume(101);
        serviceRadio.increaseVolume();

        Assertions.assertEquals(100, serviceRadio.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {

        serviceRadio.setCurrentVolume(2);
        serviceRadio.decreaseVolume();

        Assertions.assertEquals(1, serviceRadio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeMin() {

        serviceRadio.setCurrentVolume(0);
        serviceRadio.decreaseVolume();

        Assertions.assertEquals(0, serviceRadio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeBorders() {

        serviceRadio.setCurrentVolume(-1);
        serviceRadio.decreaseVolume();

        Assertions.assertEquals(0, serviceRadio.getCurrentVolume());
    }
}

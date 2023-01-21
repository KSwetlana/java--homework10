package ru.netology.radio;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldNextRadioStation() {

        Radio service = new Radio();
        service.setRadioStation(3);
        service.NextRadioStation();

        int expected = 4;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNextRadioStation2() {

        Radio service = new Radio();
        service.setRadioStation(9);
        service.NextRadioStation();

        int expected = 0;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldPrevRadioStation() {
        Radio service = new Radio();
        service.setRadioStation(3);
        service.PrevRadioStation();

        int expected = 2;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void souldPrevRadioStation2() {
        Radio service = new Radio();
        service.setRadioStation(0);
        service.PrevRadioStation();

        int expected = 9;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldsetRadioStation1() {
        Radio service = new Radio();
        service.setRadioStation(0);

        int expected = 0;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldsetRadioStation2() {
        Radio service = new Radio();
        service.setRadioStation(1);

        int expected = 1;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldsetRadioStation3() {
        Radio service = new Radio();
        service.setRadioStation(9);

        int expected = 9;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldsetRadioStation4() {
        Radio service = new Radio();
        service.setRadioStation(10);

        int expected = 0;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldsetRadioStation5() {
        Radio service = new Radio();
        service.setRadioStation(-1);

        int expected = 0;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }




    @Test
    public void shouldincreaseVolume1() {
        Radio service = new Radio();
        service.setVolume(10);
        service.increaseVolume();

        int expected = 10;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldincreaseVolume2() {
        Radio service = new Radio();
        service.setVolume(8);
        service. increaseVolume();

        int expected = 9;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldreduceVolume1() {
        Radio service = new Radio();
        service.setVolume(8);
        service.reduceVolume();

        int expected = 7;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldreduceVolume2() {
        Radio service = new Radio();
        service.setVolume(-1);
        service.reduceVolume();

        int expected = 0;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setVolume1() {
        Radio service = new Radio();
        service.setVolume(1);


        int expected = 1;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void setVolume2() {
        Radio service = new Radio();
        service.setVolume(10);


        int expected = 0;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setVolume3() {
        Radio service = new Radio();
        service.setVolume(-1);


        int expected = 0;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

}

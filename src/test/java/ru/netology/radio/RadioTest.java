package ru.netology.radio;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldNextRadioStation() {

        Radio service = new Radio(3);
        service.NextRadioStation();
        int expected = 3;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextRadioStation2() {

        Radio service = new Radio(10);
        service.NextRadioStation();
        int expected = 0;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextRadioStation3() {

        Radio service = new Radio(11);
        service.NextRadioStation();
        int expected = 0;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test

    public void shouldPrevRadioStation() {
        Radio service = new Radio(3);
        service.PrevRadioStation();
        int expected = 1;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test

    public void shouldPrevRadioStation2() {
        Radio service = new Radio(5);
        service.PrevRadioStation();
        int expected = 3;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldPrevRadioStation3() {
        Radio service = new Radio(1);
        service.PrevRadioStation();
        int expected = 9;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldPrevRadioStation4() {
        Radio service = new Radio(0);
        service.PrevRadioStation();
        int expected = 9;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }




    @Test
    public void shouldSetMaxRadioStation1() {

        Radio service = new Radio(1);
        service.setMaxStationNum();
        int expected = 0;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxRadioStation3() {

        Radio service = new Radio(4);
        service.setMaxStationNum();
        int expected = 0;
        int actual = service.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldincreaseVolume1() {
        Radio service = new Radio();
        service.setVolume(8);
        service.increaseVolume();

        int expected = 9;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldincreaseVolume2() {
        Radio service = new Radio();
        service.setVolume(104);
        service.increaseVolume();

        int expected = 1;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldincreaseVolume3() {
        Radio service = new Radio();
        service.setVolume(100);
        service.increaseVolume();

        int expected = 100;
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
        service.setVolume(0);
        service.reduceVolume();

        int expected = 0;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldreduceVolume3() {
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
        service.setVolume(103);
        int expected = 0;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setVolume3() {
        Radio service = new Radio();
        service.setVolume(100);
        int expected = 100;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setVolume4() {
        Radio service = new Radio();
        service.setVolume(0);
        int expected = 0;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

}

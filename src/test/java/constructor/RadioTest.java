package constructor;

import constructor.Radio;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.netology.RadioAdvanced;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    private String name;
    private int maxStation;
    private int currentVolume;
    private int maxVolumeLevel;
    private int minVolumeLevel;
    private int currentStation;
    private int minStation;
    private boolean on;


    @Test
    public void shouldCreate() {
        Radio radio = new Radio();

        assertNull(radio.name);
        assertEquals(10, radio.maxStation);
        assertEquals(0, radio.minStation);
        assertEquals(0, radio.currentStation);
        assertEquals(100, radio.maxVolumeLevel);
        assertEquals(0, radio.minVolumeLevel);
        assertEquals(0, radio.currentVolume);
        assertFalse(radio.on);
    }

    @Test
    public void shouldMinStation()  {
        RadioAdvanced radio = new RadioAdvanced();

        int currentStation = 7;
        radio.setCurrentStation(currentStation);
        radio.changeOnPreviousRadioStation();
        int  expected=6;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void shouldNextStation()  {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 0;
        radio.setMinStation(currentStation);
        radio.changeOnNextRadioStation();
        int  expected=1;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldUseRadio() {
        RadioAdvanced radio = new RadioAdvanced();
    }




    @Test
    public void shouldIncreaseStation()  {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.changeOnNextRadioStation();
        int  expected=1;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldMaxStation()  {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 9;
        radio.setMaxStation(currentStation);
        radio.changeOnNextRadioStation();
        int  expected=1;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldMaxVolume()  {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 9;
        radio.setMaxVolumeLevel(currentStation);
        radio.volumeUpForOne();
        int  expected=10;
        assertEquals(expected, radio.getMaxVolumeLevel());
    }


    @Test
    public void shouldMinVolume()  {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 0;
        radio.setMinVolumeLevel(currentStation);
        radio.volumeDownForOne();
        int  expected=0;
        assertEquals(expected, radio.getMinVolumeLevel());
    }

    @Test
    void shouldChangeOnNextRadioStation() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 5;
        radio.setCurrentStation(currentStation);
        radio.changeOnNextRadioStation();
        int expected = 6;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldGetAndSet() {
        RadioAdvanced radio = new RadioAdvanced();
        String expected = "radio";

        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    void shouldSetCurrentRadioStationBackToZero() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 10;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentRadioStation() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = -99;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    void shouldChangeOnMaxRadioStationIfStationIsMin() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.changeOnPreviousRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }



    @Test
    void shouldChangeOnPreviousRadioStation() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.changeOnPreviousRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getMaxStation());
    }




    @Test
    void shouldChangeOnPreviousRadioStationIfStationIsMax() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 9;
        radio.setCurrentStation(currentStation);
        radio.changeOnNextRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    void shouldSetVolumeIfVolumeIsOverMax() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = 11;
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsUnderMin() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = -1;
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }


    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = 0;
        radio.setCurrentVolume(currentVolume);
        radio.volumeDownForOne();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());

    }

    @Test
    void volumeUpForOne() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = 8;
        radio.setCurrentVolume(currentVolume);
        radio.volumeUpForOne();
        int expected = 9;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = 10;
        radio.setCurrentVolume(currentVolume);
        radio.volumeUpForOne();
        int expected = 10;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void volumeDownForOne() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = 7;
        radio.setCurrentVolume(currentVolume);
        radio.volumeDownForOne();
        int expected = 6;
        assertEquals(expected, radio.getCurrentVolume());

    }

    @Test
    public void shouldCreate7() {
        RadioAdvanced Radio = new RadioAdvanced();
    }

    @Test
    public void shouldInitField() {
        RadioAdvanced Radio = new RadioAdvanced();
        assertNull(Radio.getName());
        assertEquals(9, Radio.getMaxStation());
        assertEquals(0, Radio.getMinStation());
        assertEquals(0, Radio.getCurrentStation());
        assertEquals(10, Radio.getMaxVolumeLevel());
        assertEquals(0, Radio.getMinVolumeLevel());
        assertEquals(0, Radio.getCurrentVolume());
        assertFalse(Radio.isOn());
    }



    @Test
    public void shouldChangeFields() {
        Radio radio = new Radio();
        assertEquals(0, radio.currentStation);
        radio.currentStation = 5;
        assertEquals(5, radio.currentStation);
    }
}


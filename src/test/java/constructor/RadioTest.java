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
        assertEquals(9, radio.maxStation);
        assertEquals(0, radio.minStation);
        assertEquals(0, radio.currentStation);
        assertEquals(10, radio.maxVolumeLevel);
        assertEquals(0, radio.minVolumeLevel);
        assertEquals(0, radio.currentVolume);
        assertFalse(radio.on);
    }

}
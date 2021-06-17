package constructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
    public class Radio {
    public int currentStation;
    String name;

    int maxStation = 9;
    int minStation = 0;
    int currentVolume;
    int maxVolumeLevel = 10;
    int minVolumeLevel = 0;
    boolean on;
}
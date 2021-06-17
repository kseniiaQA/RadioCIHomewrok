package constructor;



    public class Radio {
      public int currentStation;
        String name;

        int maxStation = 9;
        int minStation = 0;
        int currentVolume;
        int maxVolumeLevel = 10;
        int minVolumeLevel = 0;
        boolean on;


    public Radio(int maxVolumeLevel, int minVolumeLevel, String name, int maxStation, int minStation, int currentStation, int currentVolume, boolean on) {
        this.maxVolumeLevel = maxVolumeLevel;
        this.minVolumeLevel = minVolumeLevel;
        this.name = name;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.on = on;
    }


    public Radio() {

    }
}
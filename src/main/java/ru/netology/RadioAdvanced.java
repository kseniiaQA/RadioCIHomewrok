package ru.netology;

public class RadioAdvanced{
    private String name;
    private int currentStation = 0;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume = 0;
    private int maxVolumeLevel = 100;
    private int minVolumeLevel = 0;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {

            if (currentStation > maxStation) {
                return;
            }
            if (currentStation < minStation) {
                return;
            }
            this.currentStation = currentStation;
        }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        minStation = minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolumeLevel) {
            return;
        }
        if (currentVolume < minVolumeLevel) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolumeLevel() {
        return maxVolumeLevel;
    }

    public void setMaxVolumeLevel(int maxVolumeLevel) {
        maxVolumeLevel = maxVolumeLevel;
    }

    public int getMinVolumeLevel() {
        return minVolumeLevel;
    }

    public void setMinVolumeLevel(int minVolumeLevel) {
        minVolumeLevel = minVolumeLevel;
    }

    public void volumeUpForOne() {

        if (currentVolume == maxVolumeLevel) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume < maxVolumeLevel) {
            this.currentVolume++;
        }
    }

    public void volumeDownForOne() {
        if (currentVolume == minVolumeLevel) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume > minVolumeLevel) {
            this.currentVolume--;
        }
    }

    public int changeOnPreviousRadioStation() {
            if (currentStation > minStation) {
                currentStation = currentStation - 1;
            }
            if(currentStation == 0) {
                currentStation = maxStation;
            }
            return currentStation;
        }

    public int changeOnNextRadioStation() {
        if (currentStation < maxStation | currentStation == minStation) {
            currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
        return currentStation;

    }

        public boolean isOn() {
            return on;
        }
    }
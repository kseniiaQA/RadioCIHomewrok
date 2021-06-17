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
    public int getCurrentStation() {
        return this.currentStation;
    }

    public String getName() {
        return this.name;
    }

    public int getMaxStation() {
        return this.maxStation;
    }

    public int getMinStation() {
        return this.minStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public int getMaxVolumeLevel() {
        return this.maxVolumeLevel;
    }

    public int getMinVolumeLevel() {
        return this.minVolumeLevel;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setMaxVolumeLevel(int maxVolumeLevel) {
        this.maxVolumeLevel = maxVolumeLevel;
    }

    public void setMinVolumeLevel(int minVolumeLevel) {
        this.minVolumeLevel = minVolumeLevel;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCurrentStation() != other.getCurrentStation()) {
                return false;
            } else if (this.getMaxStation() != other.getMaxStation()) {
                return false;
            } else if (this.getMinStation() != other.getMinStation()) {
                return false;
            } else if (this.getCurrentVolume() != other.getCurrentVolume()) {
                return false;
            } else if (this.getMaxVolumeLevel() != other.getMaxVolumeLevel()) {
                return false;
            } else if (this.getMinVolumeLevel() != other.getMinVolumeLevel()) {
                return false;
            } else if (this.isOn() != other.isOn()) {
                return false;
            } else {
                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        result = result * 59 + this.getCurrentStation();
        result = result * 59 + this.getMaxStation();
        result = result * 59 + this.getMinStation();
        result = result * 59 + this.getCurrentVolume();
        result = result * 59 + this.getMaxVolumeLevel();
        result = result * 59 + this.getMinVolumeLevel();
        result = result * 59 + (this.isOn() ? 79 : 97);
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        int var10000 = this.getCurrentStation();
        return "Radio(currentStation=" + var10000 + ", name=" + this.getName() + ", maxStation=" + this.getMaxStation() + ", minStation=" + this.getMinStation() + ", currentVolume=" + this.getCurrentVolume() + ", maxVolumeLevel=" + this.getMaxVolumeLevel() + ", minVolumeLevel=" + this.getMinVolumeLevel() + ", on=" + this.isOn() + ")";
    }
}



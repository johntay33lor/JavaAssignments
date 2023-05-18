package standardSensor;

public class StandardSensor implements Sensor {
    private final int value;

    public StandardSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        // No effect
    }

    @Override
    public void setOff() {
        // No effect
    }

    @Override
    public int read() {
        return value;
    }
}
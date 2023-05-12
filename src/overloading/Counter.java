package overloading;

public class Counter {

    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public void increaseBy (int Increase) {
        if (Increase > 0) {
            this.value += Increase;
        }
    }

    public void decreaseBy (int Decrease) {
        if (Decrease > 0) {
            this.value -= Decrease;
        }
    }
}

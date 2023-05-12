package overloading;

public class Main_Counter {
    public static void main(String[] args) {
        Counter count1 = new Counter(2);
        Counter count2 = new Counter();

        System.out.println("Count1's value is: " + count1.value());
        System.out.println("Count2's value is: " + count2.value());

        count1.increase();
        System.out.println("Count1 after increase by 1: " + count1.value());

        count2.decrease();
        System.out.println("Count2 after decrease by 1: " + count2.value());

        count1.increaseBy(5);
        System.out.println("Count1 after increase by 5: " + count1.value());
        count1.increaseBy(12);
        System.out.println("Count1 after increase by 12: " + count1.value());

        count2.decreaseBy(3);
        System.out.println("Count2 decrease by 3: " + count2.value());
        count2.decreaseBy(7);
        System.out.println("Count2 decrease by 7: "+ count2.value());

    }
}

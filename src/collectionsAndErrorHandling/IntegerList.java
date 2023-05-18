package collectionsAndErrorHandling;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class IntegerList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(13);
        list.add(17);
        list.add(11);
        list.add(7);
        list.add(3); //Duplicate int
        System.out.println(list);

        //Remove duplicates
        Set<Integer> uniqueSet = new HashSet<>(list);
        System.out.println(uniqueSet);

        try {
            //Sum
            int sum = 0;
            for (Integer num : list) {
                sum += num;
            }

            //Throw an IndexOutOfBoundsException
            //int index = 10;
            //int element = list.get(index);


            //Average
            double average = (double) sum / list.size();

            //double average = -5;
            // Throw an IllegalArgumentException
            if (average < 0) {
                throw new IllegalArgumentException("Average is negative.");
            }

            // Throw an ArithmeticException
//            int dividend = 0;
//            int quotient = sum / dividend;

            //Print sum and average
            System.out.println("Sum: " + sum);
            System.out.println("Avg: " + average);

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Index out of bounds.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: Illegal argument.");
        } catch (ArithmeticException e) {
            System.err.println("Error: Arithmetic exception.");
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}

//10. Infinite Streams:
//Create a stream of random numbers and limit it to generate 10 random numbers.
package assignment_19;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class InfiniteStreams_10 {
    public static void main(String[] args) {
        List<Object> numbers =  new Random().ints(0,350).limit(10).boxed().collect(Collectors.toList());
        System.out.println(numbers);
    }
}
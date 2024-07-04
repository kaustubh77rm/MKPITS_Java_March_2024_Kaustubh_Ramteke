//6. Finding Max and Min:
//Create a list of objects (e.g., custom objects with attributes like name and age)
//and use a stream to
//find the oldest and youngest objects based on a certain attribute (e.g., age).
package assignment_19;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindingMaxandMin {
    public static void main(String[] args) {
    List<MarksAgeClassforMaxMin> list=new ArrayList<>(){{
        add(new MarksAgeClassforMaxMin("Rohit",30));
        add(new MarksAgeClassforMaxMin("Uday",45));
        add(new MarksAgeClassforMaxMin("Kaustubh",25)); //youngest
        add(new MarksAgeClassforMaxMin("Sudama",55)); //oldest
    }};
        Optional<MarksAgeClassforMaxMin>min= list.stream().min(Comparator.comparing(MarksAgeClassforMaxMin::getAge));
        Optional<MarksAgeClassforMaxMin>max= list.stream().max(Comparator.comparing(MarksAgeClassforMaxMin::getAge));
        System.out.print("Youngest: ");
        min.ifPresent(System.out::println);
        System.out.print("Oldest: ");
        max.ifPresent(System.out::println);
    }
}
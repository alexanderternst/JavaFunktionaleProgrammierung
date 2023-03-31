package vordefiniert;

import java.util.List;
import java.util.function.Predicate;

public class WahrFalsch {
    public static void main(String[] args) {
        List<String> students = List.of("Max", "Moritz", "Fritz");
        Predicate<String> studentTest = student -> student.startsWith("M");
            
        for (int x = 0; x < students.size(); x++)
            System.out.println(studentTest.test(students.get(x)));

        System.out.println("-----");
        boolean b = students.stream().anyMatch(studentTest);
        System.out.println(b);
    }
}
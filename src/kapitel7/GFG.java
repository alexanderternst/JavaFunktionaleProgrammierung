package kapitel7;

// Java code to print the elements of Stream
// using double colon operator
  
import java.util.stream.*;
  
public class GFG {
    public static void main(String[] args)
    {
  
        // Get the stream
        Stream<String> stream
            = Stream.of("Geeks", "For",
                        "Geeks", "A",
                        "Computer",
                        "Portal");
  
        // Print the stream
        // stream.forEach(System.out::println);
        stream.forEach(s -> System.out.println(s));
    }
}


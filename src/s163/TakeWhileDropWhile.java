package s163;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeWhileDropWhile 
{
    public static void main(String[] args)
    {
	  
        // create a stream of numbers from 1 to 10
        Stream<Integer> stream1
            = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);
	  
        // apply takeWhile to take all the numbers
        // matches passed predicate
        List<Integer> list
            = stream1.takeWhile(number -> (number / 4 == 1))
                  .collect(Collectors.toList());
	  
        // print list
        System.out.println(list);
        
        //-------------------------------------
        
        
        
        // create a stream of numbers from 1 to 10
        //Stream<Integer> stream
        //    = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);
  
        // apply dropWhile to drop all the numbers
        // matches passed predicate
        
        Stream<Integer> stream2
        = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2
            = stream2.dropWhile(number -> (number / 4 == 1))
                  .collect(Collectors.toList());
  
        // print list
        System.out.println(list2);
        
        
    }
}




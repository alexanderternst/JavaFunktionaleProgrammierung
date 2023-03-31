package vordefiniert;

import java.util.function.Function;

public class UndDann {
    public static void main(String[] args){
        Function<Integer, Integer> addTwo = number -> number + 2;
        Function<Integer, Integer> multThree = number -> number * 3; 
        
        int result = addTwo.andThen(multThree).apply(4);
        System.out.println(result);

        result = addTwo.compose(multThree).apply(4);
        System.out.println(result);
    }
}

package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzResolver {
    public static void main(String[] args) {
        List<Integer> listNum = List.of(1,2,3,4,5,6,7,8,10,11,12,13,14,15);
        FizzBuzzResolver obj = new FizzBuzzResolver();
        List<String> resultString = obj.playFizzBuzz(listNum);
        System.out.println(resultString.toString());

    }

    public List<String> playFizzBuzz(List<Integer> listNum) {
        List<String> result = new ArrayList<>();
        for (int i: listNum) {
            if(i % 3 == 0 && i % 5 ==0) {
                result.add("FizzBuzz");
            } else if(i%3 ==0) {
                result.add("Fizz");
            } else if(i%5 ==0) {
                result.add("Buzz");
            }
        }
        return result;
    }
}

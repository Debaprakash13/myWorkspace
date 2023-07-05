package FizzBuzzTest;

import FizzBuzz.FizzBuzzResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzResolverTest {

    FizzBuzzResolver obj;
    List<String> result;

    @BeforeEach
    public void createInstance() {
        obj = new FizzBuzzResolver();
        result = List.of("Fizz", "Buzz", "Fizz",  "Buzz", "Fizz", "FizzBuzz");
    }

    @Test
    public void testFizzBuzz() {
        List<Integer> listNum = List.of(1,2,3,4,5,6,7,8,10,11,12,13,14,15);

        Assertions.assertNotNull(obj.playFizzBuzz(listNum));
        Assertions.assertEquals(result,obj.playFizzBuzz(listNum));
        List<Integer> emptyList = new ArrayList<>();
    }

    @Test()
    public void TestFizzBUzzWithNull() {

    }

}

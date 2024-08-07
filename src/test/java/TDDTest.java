import org.assertj.core.api.Assertions;
import org.beta.curs14.code.NullParameterException;
import org.beta.curs14.code.TDD;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/*
    Create a function TDD.find that receives a list and a number and returns the index or -1 if not found
 */
public class TDDTest {

    @Test
    public void instantiationClass() {
        TDD tdd = new TDD();
    }

    @Test
    public void callMethod() {
        TDD.find(List.of(), 4);
    }

    @Test
    public void testMethodReturnsMinusOneIfNotFound() {
        Integer result = TDD.find(List.of(), 4);
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void testMethodReturnsIndexIfFound() {
        //SETUP
        List<Integer> numbers = Arrays.asList(1, 4, 6);
        Integer numberToBeFound = 4;

        //TEST RUN
        Integer result = TDD.find(numbers, numberToBeFound);

        //ASSERTIONS
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("WHEN one value in the list is null THEN an exception is thrown")
    public void testMethodThrowsExceptionIfOneValueInListIsNull() {
        //SETUP
        List<Integer> numbers = Arrays.asList(1, null, 6);
        Integer numberToBeFound = 4;

        org.junit.jupiter.api.Assertions.assertThrows(NullParameterException.class, () -> TDD.find(numbers, numberToBeFound));
    }

    @Test
    public void testMultipleEqualNumbersInList() {
        //SETUP
        List<Integer> numbers = Arrays.asList(1, 4, 4, 4, 4);
        Integer numberToBeFound = 4;

        //TEST RUN
        Integer result = TDD.find(numbers, numberToBeFound);

        //ASSERTIONS
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testListIsNull() {
        //SETUP
        List<Integer> numbers = null;
        Integer numberToBeFound = 4;

        org.junit.jupiter.api.Assertions.assertThrows(NullParameterException.class, () -> TDD.find(numbers, numberToBeFound));
    }

    @Test
    public void testNumberToBeFoundIsNull() {
        //SETUP
        List<Integer> numbers = Arrays.asList(1, 4, 4, 4, 4);
        ;
        Integer numberToBeFound = null;

        org.junit.jupiter.api.Assertions.assertThrows(NullParameterException.class, () -> TDD.find(numbers, numberToBeFound));
    }
}
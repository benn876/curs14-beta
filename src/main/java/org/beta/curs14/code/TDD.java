package org.beta.curs14.code;

import java.util.List;

public class TDD {
    public static Integer find(List<Integer> list, Integer numberToBeFound) {
        if (list == null || numberToBeFound == null) {
            throw new NullParameterException("Null value present");
        }

        for (int index = 0; index < list.size(); index++) {
            Integer currentNumber = list.get(index);
            if (currentNumber == null) {
                throw new NullParameterException("The value in the list at index:%s is null".formatted(index));
            }
            if (currentNumber.equals(numberToBeFound)) {
                return index;
            }
        }
        return -1;
    }
}

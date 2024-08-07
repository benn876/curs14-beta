package org.beta.curs14.lombok;

import lombok.Builder;

@Builder
public record Person(
        String name,
        Integer age,
        String cnp,
        String nationality
){

}

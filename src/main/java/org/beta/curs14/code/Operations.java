package org.beta.curs14.code;

public class Operations {
    public Integer sum(Integer a, Integer b){
        if(a == null || b == null){
            throw new NullParameterException("One of the parameters is null: a=%s, b=%s".formatted(a,b));
        }
        return a+b;
    }
}

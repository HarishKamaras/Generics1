package com.bridgelabz.maximumgenerics;

public class GenericClass {
    public Integer testMaxium(Integer x, Integer y, Integer z) {
        Integer max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }
    public Float testMaxium(Float x, Float y, Float z) {
        Float max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }

}

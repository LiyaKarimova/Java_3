package ru.geekbrains;

import com.sun.org.apache.xpath.internal.Arg;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.stream.Stream;

public class TestLesson6 {
    private static Lesson6 arrClass ;

    @BeforeAll
    public static void init () {
        arrClass = new Lesson6();
    }


    @ParameterizedTest
    @MethodSource ("dataForTest1")
    public void test1 (int [] arr, int [] result){
        Assertions.assertArrayEquals(result,arrClass.arrayAfter4(arr));
    }

    public static Stream <Arguments> dataForTest1 () {
        ArrayList <Arguments> out = new ArrayList<>();
        int [] result = {0};
        int [] arr = {1,2,3,4,5,6,4,0};
        out.add(Arguments.arguments(arr,result));
        return out.stream();
    }

    @ParameterizedTest
    @MethodSource ("dataForTest2")
    public void test2 (int [] data, boolean result) {
        Assertions.assertEquals(result, arrClass.isInArray4Or1(data));
    }

    public static Stream <Arguments> dataForTest2 () {
        ArrayList <Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int [] { 1, 1, 1, 4, 4, 1, 4, 4},true));
        out.add(Arguments.arguments(new int [] { 1, 1, 1, 1, 1,},false));
        out.add(Arguments.arguments(new int [] {4, 4, 4, 4},false));
        out.add(Arguments.arguments(new int [] { 1, 1, 1, 4, 4, 1, 4, 4},true));
        return out.stream();
    }




}



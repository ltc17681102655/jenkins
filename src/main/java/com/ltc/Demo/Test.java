package com.ltc.Demo;

import java.util.Arrays;
import java.util.List;

/**
 * @author YHL
 * @version V1.0
 * @Description: 1
 * @date 2019-01-08
 */
public class Test {


    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);


        resize(integers, 4, 8, 8, 8);


    }

    private static void resize(List<Integer> integers, Integer dbcount, Integer tableCount,
                               Integer adbCount, Integer atableCount) {

        for (Integer id : integers) {
            System.out.println("id ：" + id + "\tdbIndex: " + (id % dbcount) + "\ttableIndex：" + (id / tableCount % tableCount));
            System.out.println("id ：" + id + "\tdbIndex: " + (id % adbCount) + "\ttableIndex：" + (id / atableCount % atableCount));
            System.out.println();
        }
    }


}

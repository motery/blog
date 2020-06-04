package com.motery.blog.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author motery
 * @create 2020-06-01 18:09
 */
public class Test2 extends Test1 {
    @Override
    public void say(){

    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();
        LinkedList<Integer> b = new LinkedList<>();
        long time = new Date().getTime();
        System.out.println(new Date().getTime()-time);

        for (int i = 0; i < 100000; i++) {
            b.set(b.size()/2,i);
        }
        System.out.println(new Date().getTime()-time);
        for (int i = 0; i < 100000; i++) {
            a.set(a.size()/2,i);
        }
        System.out.println(new Date().getTime()-time);
    }
}

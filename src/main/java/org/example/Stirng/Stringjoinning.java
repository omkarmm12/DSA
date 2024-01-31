package org.example.Stirng;

import java.util.StringJoiner; // it introduced on java 8

public class Stringjoinning {

    public static void main(String[] args){
        StringJoiner sj=new StringJoiner(",","[","]");
        sj.add("java");
        sj.add("c++");
        System.out.println(sj);
        StringJoiner sj1=new StringJoiner(":","[","]");
        sj1.add("javascript");
        sj1.add("python");
        System.out.println(sj1);
        System.out.println(sj.merge(sj1));
    }
}

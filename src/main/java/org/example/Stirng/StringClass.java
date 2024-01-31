package org.example.Stirng;

import java.io.Serializable;
import java.util.Scanner;

public class StringClass {
     // String literal
     // immutable mean can't be change but create new obj in String constant pool
     Serializable s;
     Comparable c;          // performance while append string     <            <
     CharSequence cs;  // represent sequence of char impl by String,StringBuffer,StringBuilder

    public static Class<?> findType(String var) {

        if (!var.isEmpty()&&!var.isBlank()) {

            try {
                int integer = Integer.parseInt(var);
                return int.class;
            } catch (Exception e) {
                try {
                    double d = Double.parseDouble(var);
                    return double.class;
                } catch (Exception e2) {
                        return String.class;
                }
            }
        }  else
            return null;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        // creating string obj by literal
        String s="one"; // immutable because multiple reference var can refer to one string obj so if we change any reference that effect on all other reference variables
        String m="one";

        String n=new String("one");
        n.concat(" two");
        System.out.println(m);
        s.concat("two");
        System.out.println(s);
        System.out.println(s==n); // compares reference var in pool
        System.out.println(s.equals(n)); // compares actual object
        int value=10;
        value++;
        System.out.println(value);

        char[] arr={'j','a','v','a',' ','p','r','o','g','r','a','m'};

        String str=new String(arr);
        String str1="java program";
        String s1="hello";
        String s2="world";

        System.out.println("String : "+str);
        System.out.println("charAt(1) : "+str.charAt(1));
        System.out.println("length : "+str.length());
        System.out.println("is Empty : "+str.isEmpty());
        System.out.println("is Blank : "+str.isBlank());
        System.out.println("concat(language) : "+str.concat(" language"));
        System.out.println("join(language) : "+String.join(" ",s1,s2));
        System.out.println("contains(pro) : "+str.contains("pro"));
        System.out.println("index of j : "+str.indexOf('j'));
        System.out.println("last index of a : "+str.lastIndexOf('a'));
        System.out.println("upperCase : "+str.toUpperCase());
        System.out.println("lowerCase : "+str.toLowerCase());
        System.out.println("replace j to J : "+str.replace('j','J'));
        System.out.println("trim : "+str.trim());
        System.out.println("contentEquals(java program) : "+str.contentEquals("java program"));
        System.out.println("substring : "+str.substring(str.indexOf('p'),str.length()));
        System.out.println("equals : "+str.equals(str1));                                   // diff b/w equals(),compareTo() and == Operator
        System.out.println("compareTo(java program) : "+str.compareTo("java program"));     // equals()->compare actual objs
        System.out.println("startWith(java) : "+str.startsWith("java"));                    // == compare reference in pool
        System.out.println("endsWith(gram) : "+str.endsWith("gram"));                       // compareTo() return int 0 -> s1==s2  int 1 -> s1>s2  int -1 -> s1<s2
        String values= String.valueOf(value);
        System.out.println("10value + 10 :"+values+value);
        System.out.println("get type of var : "+values.getClass());
            while (true) {
                System.out.println("enter var for type find");
                try {
                    String var=sc.next();
                    System.out.println("var type is : " + StringClass.findType(var));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        }


    }


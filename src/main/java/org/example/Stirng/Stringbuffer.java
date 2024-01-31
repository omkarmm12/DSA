package org.example.Stirng;

public class Stringbuffer {  // thread safe , mutable , can change   || modifiable strings r call mutable strings

    public static void main(String[] args){

        StringBuffer sb=new StringBuffer();
        sb.append("java");
        System.out.println(sb);
        sb.append(" program");
        System.out.println(sb);
        sb.insert(sb.length()," language");
        System.out.println(sb);
        sb.replace(11,12,"mming");
        System.out.println(sb);
        sb.delete(12,16);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.ensureCapacity(40);// (oldcapacity*2)+2=74
        System.out.println(sb.capacity());
        sb.reverse();
        System.out.println(sb.charAt(0));
        System.out.println(sb.substring(0,4));
        System.out.println(sb.length());


    }

}

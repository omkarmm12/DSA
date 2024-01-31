package org.example.Stirng;

 class TOString {
    int id;
    String name;

   public TOString(int id, String name){
        this.id=id;
        this.name=name;
    }

     @Override
     public String toString() {
         return id+" "+name;
     }

     public static void main(String [] args){
        TOString ts=new TOString(1,"name1");
        System.out.println(ts);
    }
}


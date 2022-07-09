package com.vinod.javafeatures18;

interface Sayable3{  
    void say();  
}  
public class MethodReference1 {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable3 sayable = MethodReference1::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  

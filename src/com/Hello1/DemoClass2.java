package com.Hello1;

import com.Hello.DemoClass;

class Parent{
Parent ()
{
 System.out.println("Parent 0-arg Constructor");
}
 }
class Child extends Parent
{
 Child (int a){
 
 System.out.println("Child 0-arg Constructor");
 }
 public static void main(String[] xyz) {
 
 new Child (10);
 }
}

package nestedClass;

import nestedClass.OuterClass.StaticNestedClass;

//Driver class
public class StaticNestedClassDemo
{
 public static void main(String[] args)
 {
     // accessing a static nested class
	 nestedClass.OuterClass.outer_x=9;
	 OuterClass obj= new OuterClass();
	// StaticNestedClass nestedObject = new StaticNestedClass();
	 obj.outer_x=9;
      
     //nestedObject.display();
    
     
      
 }
}
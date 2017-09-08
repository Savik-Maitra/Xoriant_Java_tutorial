package localInnerClass;

//Java code to demonstrate
//the scope of inner class
public class ScopeOuter
{
 private void myMethod()
 {
     class Inner
     {
    	 
         private  void innerMethod()
         {
             System.out.println("Inside inner class");
			
         }                
     }
     Inner inner = new Inner();
     inner.innerMethod();
    
 }
  
 public static void main(String[] args)
 {
     ScopeOuter outer = new ScopeOuter();
     //Inner inner = new Inner();
     outer.myMethod();
 }
}

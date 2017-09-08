package nestedClass;

public class InnerClassDemo
{
    public static void main(String[] args)
    {
        // accessing an inner class
    	OuterClass1 outerObject = new OuterClass1();
    	OuterClass1.InnerClass1 innerObject = outerObject.new InnerClass1();
         
        innerObject.display();
         
    }
}
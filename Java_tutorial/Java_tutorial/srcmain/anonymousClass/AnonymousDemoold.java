package anonymousClass;

//Java program to demonstrate need of Anonymous Inner class
interface Ageold
{
  int x = 21;
  void getAge();
}
class AnonymousDemoold
{
  public static void main(String[] args) 
  {
      // Myclass is implementation class of Age interface
      MyClass obj=new MyClass();

      // calling getage() method implemented at Myclass
      obj.getAge();     
  }
}

//Myclass implement the methods of Age Interface
class MyClass implements Ageold
{
  @Override
  public void getAge() 
  {
      // printing the age
      System.out.print("Age is "+x);
      int a=1
  }
}
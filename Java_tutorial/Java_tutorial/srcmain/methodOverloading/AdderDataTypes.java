package methodOverloading;

public class AdderDataTypes {
	 
		static int add(int a, int b){return a+b;}  
		static double add(double a, double b){return a+b;}  
		}  
		class TestOverloading2{  
		public static void main(String[] args){  
		System.out.println(AdderDataTypes.add(11,11));  
		System.out.println(AdderDataTypes.add(12.3,12.6));  
		} 

}
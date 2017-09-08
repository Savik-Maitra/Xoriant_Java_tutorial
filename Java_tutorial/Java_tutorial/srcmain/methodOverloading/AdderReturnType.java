package methodOverloading;

public class AdderReturnType {
	
	 
		static int add(int a,int b){return a+b;}  
		//static double add(int a,int b){return a+b;}  
		}  
		class TestOverloading3{  
		public static void main(String[] args){  
		System.out.println(AdderReturnType.add(11,11));//ambiguity  
		}

}

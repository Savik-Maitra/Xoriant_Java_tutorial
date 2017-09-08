package methodOverloading;

public class MatchFound {
	
	  	void sum(int a,long b){System.out.println("long arg method invoked");} 
		// void sum(long a,int b){System.out.println("int arg method invoked");}  
		
		  
		  //int long,long,int
		  
		  public static void main(String args[]){  
			  MatchFound obj=new MatchFound();  
		  obj.sum(20,20);//now int arg sum() method gets invoked  
		   
		}  

}

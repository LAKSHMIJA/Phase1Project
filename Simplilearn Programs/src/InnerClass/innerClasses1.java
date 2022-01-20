package InnerClass;

public class innerClasses1 {

	private String msg=" Hi Inner Classes1";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		innerClasses1   ob=new innerClasses1  ();  
		ob.display();  
		}
	
}

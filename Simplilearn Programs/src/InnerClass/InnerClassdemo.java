package InnerClass;


public class InnerClassdemo {

	
		private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){
			  System.out.println(msg+", welcome to InnerClasses");}  
		 }  


		public static void main(String[] args) {
			InnerClassdemo obj=new InnerClassdemo();
			InnerClassdemo.Inner in=obj.new Inner();  
			in.hello();  
		}


	
	}



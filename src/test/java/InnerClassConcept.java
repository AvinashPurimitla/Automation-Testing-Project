import java.security.PublicKey;

public class  InnerClassConcept {
	int a=10;
	
	
	public void methodOfInnerclass() {
		System.out.println("this is method of innerclass");
	}
	 public   static   class ChildclassofInnerClass{
		 public int y=500;
		 public static  void methodOfChildInnerClass() {
			   int x=20;
			 
			 System.out.println("this is method of childInnerclass");
			 
		 }
		
		
		
	}
	 public static void main(String[] args) {
		InnerClassConcept itc=new InnerClassConcept();
		//InnerClassConcept.ChildclassofInnerClass ictc = itc.new ChildclassofInnerClass();
		ChildclassofInnerClass.methodOfChildInnerClass();
	}

}

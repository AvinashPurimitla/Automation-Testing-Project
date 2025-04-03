

public class LocalClassConcept {
	
	
	public  static void localclassMethodA() {
		int a=200;
		
		 class childlocalclassOfMethodA{
			 public static final int m=2000;
			void methodAofLocalClass() {
				
				System.out.println("this is child  local class methodA");
				
			}
			
			
			
		}
		
	}public static void main(String[] args) {
		localclassMethodA();
		
	}

}

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApi {
  public static void methodA() {
		
		System.out.println("This is methodA of Reflection class");
		
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
      String name="methodA";
		
		Method mthd = ReflectionApi.class.getMethod(name);
		mthd.invoke(mthd);
	}

}

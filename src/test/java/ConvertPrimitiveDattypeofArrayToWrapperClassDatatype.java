import java.util.Arrays;
import java.util.Collections;

public class ConvertPrimitiveDattypeofArrayToWrapperClassDatatype {
	public static void main(String[] args) {
		int[] arrays= {15,23,86,54,83};
		Integer[] arr = Arrays.stream(arrays).boxed().toArray(Integer[]::new);
		//for descending sort
		 Arrays.sort(arr,Collections.reverseOrder());
		 System.out.println(Arrays.toString(arr));
	}

}

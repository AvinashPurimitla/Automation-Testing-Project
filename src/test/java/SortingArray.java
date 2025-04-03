
public class SortingArray{
	public static void main(String[] args) {
		int[] number= {5,25,50,80,150,96,100};
		int temp=0;
		
		for(int i=0;i<number.length;i++) {
			
			for(int j=i+1;j<number.length;j++) {
				
				if(number[i]>number[j]) {
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
	
				}}}
		
	
	for(int i=0;i<number.length;i++) {
		System.out.print(number[i]+" ");
	}
	
	
	
	}}



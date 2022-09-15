package Array_Assignments;

public class CountDuplicate {

	public static void main(String[] args) {
		
		int[] arr = {10, 15, 25, 10, 8, 12, 10, 15, 55, 10, 60};
		
		for (int i = 0; i < arr.length; i++) {
			int count=1;
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]==0)
					continue;
				if(arr[i]==arr[j])
				{
					count++;
				
					arr[j]=0;
				}
				
				
			}
			if(count>1)
				System.out.println("Count :- "+arr[i]+" "+"Number :- "+count);
			
		}
		
	}
}

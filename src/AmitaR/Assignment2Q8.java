package AmitaR;

public class Assignment2Q8 {
	
	static void differIndex()
	{
		int array1[]={10,2,9,15,3};
		int array2[]={10,2,18,14,3};
		
		//int array2[]={10,2,9,15,3};
		
		for(int i =0;i<array1.length;i++)
		{
			if(array1[i] != array2[i])
			{
				System.out.println("The differ Index is " + i);
				break;
			}
		}
		
		}		
	

	public static void main(String[] args) {
		differIndex();

	}

}

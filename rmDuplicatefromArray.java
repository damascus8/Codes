//How are duplicates removed from a given array in Java?

class futur
{
	public static void main(String args[])
	{

		int arr[]={2,12,88,7,1,6,7,99};
		int len=arr.length;
		int temp=0;

		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len-1;j++)
			{
				if(arr[i]==arr[j])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					len--;
				}
			}
			
		}

		for(int z=0;z<len;z++)
		{
			System.out.println(arr[z]);
		}

		
	}

}

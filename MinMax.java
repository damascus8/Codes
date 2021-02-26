//How do you find the largest and smallest number in an unsorted integer array?


class futur
{
	public static void main(String args[])
	{

		int arr[]={2,12,88,1,6,7,99};
		int len=arr.length;
		int min=arr[0];
		int max=0;

		for(int i=0;i<len;i++)
		{
				// System.out.println("x"+arr[i]);
				if(max<arr[i])
				{
					max=arr[i];
				}
				else if(min>arr[i])
				{
					min=arr[i];
				}
			}
		System.out.println("min = "+min+"\nmax = "+max);
	}

}

//How do you find the duplicate number on a given integer array?

class futur
{
public static void main(String args[])
{

int[] arr = {1,2,4,1,2,6,8};
			
int len = arr.length;

System.out.println("repeated numbers");
for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length-1;j++)
	{
		if(arr[i]==arr[j])
		{
			System.out.print(arr[i]+" ");
		}
	}
}



}

}

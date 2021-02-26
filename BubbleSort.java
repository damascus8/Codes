class futur
{

public static void main(String args[])
{

int[] arr={12,9,1,22,5,6,7,8,34,10};

/*System.out.println("len="+arr.length);
*/

int temp=0;

int len=arr.length;
for(int i=0;i<len-1;i++)
{

for(int j=0;j<len-i-1;j++)
{
	if(arr[j]>arr[j+1])
	{
		temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;	
	}
}

}

for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}

}


}

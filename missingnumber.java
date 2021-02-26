//missing number

class futur
{

public static void main(String args[])
{

int[] arr={1,2,3,4,5,6,8};
int len=arr.length;
int val=len;
val=((val+1)*(val+2))/2;
int sum=0;
for(int i=0;i<len;i++)
{
	sum=sum+arr[i];
}
System.out.println("missing number is : "+(val-sum));
}
}

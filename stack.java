import java.util.Scanner;

class stack
{
	//declare size,stack,top
	public static final int MAX=5;
	int stk[]=new int[MAX];
	int top=-1;

	public void pop()
	{
		if(!isUnderflow())
		{
			int element=stk[top];
			System.out.println("popped "+element+"\n");
			top--;
		}
		else
		{
			System.out.println("Stack is empty....");
		}
	}

	public void push(int element)
	{
		if(!isOverflow())
		{
			top=top+1;
			stk[top]=element;
			System.out.println("Element inserted in stack..at position"+top+" = "+stk[top]+"\n");
		}
		else
		{
			System.out.println("Stack is full....");
		}
	}


	public boolean isOverflow()
	{
		if(top==MAX)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isUnderflow(){
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void traverse()
	{
		if(!isUnderflow())
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(stk[i]+" ");
			}
		}
		else
		{
			System.out.println("No elements in elements...");
		}
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		stack obj=new stack();

		do{


			System.out.println("press 1 to Push element in stack");
			System.out.println("press 2 to Pop element from stack");
			System.out.println("press 3 to traverse stack");
			System.out.println("press 0 to end actions");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:System.out.println("enter number you want to insert");
						int element=sc.nextInt();
						obj.push(element);
						break;
				case 2:obj.pop();
						break;
				case 3:obj.traverse();
						break;
				case 0: System.exit(0);					

			}




		}while(true);

	}
}
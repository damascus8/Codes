//methods enQ, DeQ,isEmpty,isFull,Size
//vars size,front,rear, array



class Queue
{
	int queue[]=new int[5];
	int qSize=queue.length;
	int size=0;
	int front=0;
	int rear=0;




	public void enQueue(int data)
	{

		if(!isFull()){
			queue[rear]=data;
			rear=(rear+1)%qSize;
			size=size+1;
		}
		else
		{
			System.out.println("Queue is Full !!!");
		}
	}

	public int deQueue()
	{
		int data =queue[front];
		if(!isEmpty()){
			front =(front+1)%qSize;
			size=size-1;
		}
		else
		{
			System.out.println("Queue is Empty !!!");	
		}
		return data;

	}


	public boolean isFull()
	{
		return getSize()==qSize;
	}

	public boolean isEmpty()
	{
		return getSize()==0;
	}

	public void show()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(queue[(front+i)%qSize]+" ");
		}
		System.out.println("\n");
		/*for(int i=0;i<qSize;i++)
		{
			System.out.println(queue[i]);
		}*/
	}


	public int getSize()
	{
		return size;
	}

	public static void main(String[] args) {
	
		Queue Q=new Queue();
		Q.enQueue(1);
		Q.enQueue(2);
		Q.enQueue(3);
		Q.deQueue();
		Q.deQueue();

		Q.enQueue(4);
		Q.enQueue(5);

		// Q.enQueue(6);
		// Q.enQueue(7);
		// Q.enQueue(8);

		System.out.println("size of Queue is :"+Q.getSize());

		Q.show();
	}



}



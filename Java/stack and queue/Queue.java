
public class Queue {
	
	Node head;
	int length;
	
	public Queue(){
		
		head = null;
		length = 0;				
	}
	
	
	public void enqueue(int data){
		 Node newnode = new Node(data);

		 if (head == null){
			 head = newnode;
		 }
		 else {
			 Node tempnode = head;
			 while(tempnode.next!=null){
				 tempnode=tempnode.next;
			 }
			 tempnode.next=newnode;
		 }
		 length++;
	}
	
	public int dequeue(){
		 if (head == null){
			 System.out.println("Stack is empty! ");
			 return -9999999;
		 }
		 else {
			 int result = head.data;
			 head = head.next;
			 length--;
			 return result;
		 }


	}
	
	public void printqueue(Queue queue){
		Node temp = queue.head;
		System.out.print("[" +temp.data );
		for(int i = 1;i < queue.length;i++){
			temp = temp.next;
			System.out.print(", " +temp.data );
		}
		System.out.print("]\n");
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q1 = new Queue();
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.printqueue(q1);
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.printqueue(q1);
		
	}

}


public class Stack {
	
	Node top;
	int length;
	
	public Stack(){
		
		top = null;
		length = 0;				
	}

	
	public void push(int data){
		 Node newnode = new Node(data);
		 if (top == null){
			 top = newnode;
		 }
		 else {
			 newnode.next = top;
			 top = newnode;
		 }
		 System.out.println("Pushed "+ top.data+" into stack!");
		 length++;
	}
	
	public int pop(){
		 if (top == null){
			 System.out.println("Stack is empty! ");
			 return -9999999;
		 }
		 else {
			 int result = top.data;
			 top = top.next;
			 length--;
			 return result;
		 }


	}
	
	public int peek(){
		 if (top == null){
			 System.out.println("Stack is empty! ");
			 return -9999999;
		 }
		 else {
			 int result = top.data;
			 return result;
		 }
	}
	
	public void printstack(Stack stack){
		Node temp = stack.top;
		System.out.print("[" +temp.data );
		for(int i = 1;i < stack.length;i++){
			temp = temp.next;
			System.out.print(", " +temp.data );
		}
		System.out.print("]\n");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1 = new Stack();
		s1.push(1);
		s1.push(2);
		s1.push(2);
		s1.push(6);
		s1.push(2);
		s1.push(2);
		s1.push(2);
		s1.push(1);
		s1.printstack(s1);
		int num1 = s1.pop();
		int num2 = s1.pop();
		int num3 = s1.pop();
		
		System.out.println("num1 is :"+ num1 );
		System.out.println("num2 is :"+ num2 );
		System.out.println("num3 is :"+ num3 );
		
		

	}

}

ublic class queue {
	int rear;
	int front;
	
	int [] arr; 
	
	
	public queue(int size) {
		System.out.println("Stack size: " + size);
		arr = new int [size]; 
		rear = -1;
		front= -1;
	}
	
	Public void insert(int c){ 
	   if (front=-1){
		   front=front+1;
		   rear=rear+1;
		   arr[rear]=c;
	   }
	   public int remove(){
		   int x=arr[rear]
	
	
	
	
	
	
	
	public char pop() {		
		if(top == -1) {
			System.out.println("Stack is empty");
			return '@';
		}
		char x = arr[top];
		System.out.println("popped: " + x);
		
		top = top -1;
		return x;	
	}
	
	public void push(char a) {
		if(top == (arr.length-1)) {
			System.out.println("Stack is full");
			return;
		}
		System.out.println("Pushing: " + a);
		top = top + 1;
		arr[top] = a;		
	}

    public boolean isEmpty() {
		boolean empty = false;
     if(top == -1) {
		 System.out.println("Stack is empty");
		 empty = true;
	  } else {
		 System.out.println("Stack is not empty");
		 empty = false; 
	  }
	 return empty;
    }	
}
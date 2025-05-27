public class Test{
	private int stk[];
	private int top;
	
	public boolean isFull(){
		return top == stk.length - 1;
	}
	public void push(){
		if(isFull()){
			System.out.println("Stack is Overflow");
		}
		else{
		stk[++top] =item;
		}
	}
	public int pop(){
		if(isEmpty(){
			System.out.println("Stack is Underrflow");
			return 0;
		}
		else{
			int item = stk[top++};
			return item;
		}
	}


}
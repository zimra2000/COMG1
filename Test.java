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

}
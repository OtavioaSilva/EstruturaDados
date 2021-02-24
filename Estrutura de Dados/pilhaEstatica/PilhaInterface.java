package pilhaEstatica;

public interface PilhaInterface {
	
	public void push(int e);
	
	public int pop();
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	public int top();

}

package file;

public interface Stack <T >{
	
	public T pop();
	public void push(T e);
	public boolean empty() ; 
	public boolean full() ; 
	public int multiPop(T els[], int k   ) ; 
	public int multiPush(T els[] , int k ) ; 
	
	
	

}

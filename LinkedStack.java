package file;

public class LinkedStack <T> implements Stack <T>{

	
	
	private Node<T> top ; 
	
	
	public LinkedStack() {
		
		top = null ; 
		
	}
	
	public boolean empty(){
		
		
		boolean check = false ; 
		
		if(top == null)
			check = true ; 
		
		return check ; 
		
	}
	public boolean full () {
		
		return false ; 
		
	}
	
	public void push(T val) {
		
		
		if (!full()) {
		Node<T> el = new Node<T>(val); 
		el.next = top  ; 
		top = el ; 
		
		
		}
		
	}
	
	public T pop() {
		 
		
		if (!empty()) {
		 T t = top.data; 
		top = top.next ; 
		 
		return t; 
		}
		return null ; 
		
		
	}
	
	
	public int multiPush(T els[] , int k ) {
		int l = 0 ; 
		
		for (int i =0 ; i< k ; i++) {
			
			if (!full()) {
				
				push(els[i]);
				l++; 
				
				
				
			}
			
		}
		return l ; 
		
		
		
	}
	
	public int multiPop(T els[], int k   ) {
		int  l = 0 ; 
		
		for (int i =0 ; i<k ; i++) {
			
			if (!empty()) {
				
				els[i]= pop() ; 
				l++; 
				
			}
			
		}
		return l; 
		
	}
}



package file;

public class ArrayQueue<T> implements Queue<T> {
	
	private int size , maxsize,head,tail ; 
	private T[] nodes; 
	
	@SuppressWarnings("unchecked")
	public ArrayQueue (int n) {
		
		
		maxsize= n ; 
		size =0;
		head = 0 ; 
		tail =0 ; 
		nodes = (T[]) new Object[n];
		
		
	}
	
	public boolean full() {
		
		boolean check = false ; 
		if (size == maxsize) {
			
			check = true;
			
		}
		return check ; 
		
	}
	
	public int length() {
		return size; 
		
	}
	
	public void enqueue(T e) {
		if (!full()) {
			
			nodes[tail] = e ; 
			tail = (tail+1) % maxsize ; 
			size ++ ;
			
		}
		
		
		
	}
	
	public T serve() {
		 T e = null ; 
		if (size!=0) {
			e = nodes[head]; 
			head = (head +1) % maxsize ;
			size-- ; 
			
			
			
			
			
		}
		return e; 
		
		
		
		
	}
	
	public int multiEnqueue(T els[], int k ) {
	 int l =0 ;
	
		
		for (int i =0 ; i<k ; i++) {
			
			if (!full()) {
				enqueue(els[i]);
			l++;
				
				
				
			}
			
			
		}
		return l ; 
		
		
	}

	public int multiServe(T[] els, int k  ) {
		
		int l =0 ; 
		
		for (int i = 0 ; i <k ; i++) {
			
			if (size != 0 ) {
				
				T e = serve();
				els[i]= e ;
				l++;
				
				
			}
			
			
			
			
		}
		return l ; 
		
	}
	


}

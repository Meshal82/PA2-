package file ;

import java.io.*;
public class SimpleEncrypt {

	
	
	public static void encrypt (Stack <Queue<Character>>q , int k) {
		
		Queue<Character> myQ =new  ArrayQueue <Character> (q.length());
		
		Stack<Queue<Character>> revStack = new LinkedStack<Character> ();
		int Qs = q.length();
		
		
		for(int i = 0 ; i < Qs; i++) {
			myQ.enqueue(q.serve());
		}
		
		int size ;
		size=(Qs/k);
		
		     
		for(;size!=0;) {
		int i =0 ; 
		while(i<k) {
			revStack.push(q.serve());
			i= i+1;
		}
		int j =0 ; 
		while(j<k) {
		
			q.enqueue(revStack.pop());
			j ++ ; 
			
		}
		size = size -1;
		}
		
		
		size=Qs%k;
		int f =0 ; 
		while (f<size) {
			revStack.push(myQ.serve());
			f++;
		}
		for(int j = 0 ; j < size ; j++) {
			
			q.enqueue(revStack.pop());
		}
		size=q.length();
		f = 0;
		while (f<size) {
		
			q.enqueue(revStack.pop());
		}
	}
		
	public static void decrypt (Queue<Character> q , int k) {
		Queue<Character> myQ =new  ArrayQueue<Character> (q.length());
		
		int Qs = q.length();
		int j =0 ; 
		while (j<Qs){
			myQ.enqueue(q.serve());
			j++;
		}
		
		
		
		int s = (Qs/k);
		Stack<Character> revStack = new LinkedStack<Character> ();
		for (;s!=0;) {
		int z = 0 ;
		while ( z< k) {
			revStack.push(myQ.serve());
			z++ ; 
			
		}
		z = 0 ; 
		while( z < k ) {
		
			q.enqueue(revStack.pop());
			z++; 
			
		}
		s = s -1 ; 
		
		}
		
		s=Qs%k;
		int m =0 ; 
		while ( m < s ) {
			revStack.push(myQ.serve());
			m++ ; 
		}
		m = 0 ; 
		while( m < s ) {
			
			q.enqueue(revStack.pop());
			m++ ;
			
		}
		s=q.length();
	}
		
	public static Stack<Queue<Character>> readSentences (String fileName) throws IOException {
		FileReader file ; 
		BufferedReader read ; 

		Stack<Queue<Character>> st = new LinkedStack<Queue<Character>> ();
		Stack<Queue<Character>> rstack = new LinkedStack<Queue<Character>> ();

		
		try {
		 file = new FileReader(fileName);
		 read = new BufferedReader(file);
		String L ; 
		
		
		
		
		

		
		while ((L = read.readLine()) != null ) {
			
			Queue<Character> Q = new ArrayQueue <Character>(L.length());
			
			 for (int j =0 ; j<L.length() ; j++) {
				 Q.enqueue(L.charAt(j));
				 
				 
				 
			 }
			 
			 st.push(Q);
			 
			 
			
		
		}
		while (st.empty()) {
			
			rstack.push(st.pop());
		}
		
		
		}
		catch (Exception e) {
		return null ; 
		
		}
		read.close();
		return rstack ; 
		
		
		
	}
}

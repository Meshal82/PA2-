package file;

public class Testy {

	public static void main(String[] args) {

		
		ArrayQueue <Integer> s = new   ArrayQueue <Integer> (4)  ; 
		
		
		Integer [] a = new Integer [ 5]; 
		
		
		
		for (int k = 0 ; k<4 ; k++) {
			
			a[k] = k ; 
			
		}
		s.multiEnqueue(a, 4) ; 
		
for (int i = 0 ; i<4 ; i++) {
			
			System.out.println(s.serve()); 
		
		}
		
		

	}
}
package file;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Rule;

public class PA2TestComp {
	@Rule
	public Timeout globalTimeout = new Timeout(1000);

	Stack<Queue<Character>> st;
	Queue<Character> q;
	LinkedStack<Character> s;

	@Test
	public void testEnqueue1() {
		try {
			ArrayQueue<Integer> ds = new ArrayQueue<Integer>(3);
			ds.enqueue(12);
		} catch (Exception e) {
			fail("Your program threw an exception.");
			e.printStackTrace();
		}
	}

	@Test
	public void testMultiEnqueue1() {
		try {
			Character[] els = { 'A', 'B' };
			int k = 2;
			q = new ArrayQueue<Character>(10);
			int nb = q.multiEnqueue(els, k);
		} catch (Exception e) {
			fail("Your program threw an exception!");
			e.printStackTrace();
		}
	}

	@Test
	public void testMultiServe1() {
		try {
			Character[] els = new Character[2];
			int k = 2;
			q = new ArrayQueue<Character>(10);
			q.enqueue('A');
			q.enqueue('A');
			int nb = q.multiServe(els, k);
		} catch (Exception e) {
			fail("Your program threw an exception!");
			e.printStackTrace();
		}
	}

	@Test
	public void testMultiPush1() {
		try {
			Character[] els = { 'A', 'B' };
			int k = 2;
			s = new LinkedStack<Character>();
			int nb = s.multiPush(els, k);
		} catch (Exception e) {
			fail("Your program threw an exception!");
			e.printStackTrace();
		}
	}

	@Test
	public void testMultiPop1() {
		try {
			Character[] els = new Character[2];
			int k = 2;
			s = new LinkedStack<Character>();
			s.push('A');
			s.push('A');
			int nb = s.multiPop(els, k);
		} catch (Exception e) {
			fail("Your program threw an exception!");
			e.printStackTrace();
		}
	}

	@Test
	public void testReadSentences1() {

		try {
			st = SimpleEncrypt.readSentences("Sample.txt");
		} catch (Exception e) {
			fail("Your program threw an exception!");
			e.printStackTrace();
		}
	}

	@Test
	public void testEncrypt1() {
		try {
			int k = 2;
			q = new ArrayQueue<Character>(10);
			q.enqueue('A');
			q.enqueue('B');
			SimpleEncrypt.encrypt(q, k);
		} catch (Exception e) {
			fail("Your porgram threw an exception!");
			e.printStackTrace();
		}
	}

	@Test
	public void testEncrypt2() {
		try {
			int k = 2;
			st = SimpleEncrypt.readSentences("Sample.txt");
			SimpleEncrypt.encrypt(st, k);
		} catch (Exception e) {
			fail("Your porgram threw an exception!");
			e.printStackTrace();
		}
	}

	@Test
	public void testDecrypt1() {
		try {
			int k = 2;
			q = new ArrayQueue<Character>(10);
			q.enqueue('A');
			q.enqueue('B');
			SimpleEncrypt.decrypt(q, k);
		} catch (Exception e) {
			fail("Your porgram threw an exception!");
			e.printStackTrace();
		}
	}

	@Test
	public void testDecrypt2() {
		try {
			int k = 2;
			st = SimpleEncrypt.readSentences("Sample.txt");
			SimpleEncrypt.decrypt(st, k);
		} catch (Exception e) {
			fail("Your porgram threw an exception!");
			e.printStackTrace();
		}
	}
}
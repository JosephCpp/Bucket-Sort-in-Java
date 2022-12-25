public class Stack implements StackInterface {

	private Node first; //top

	public Stack(){
		first = null;
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public void push(String item) {
		Node x = new Node();
		x.item =item;
		x.next = first;
		first = x;
	}

	public String pop() {
		String val = first.item;
		first = first.next;
		return val;
	}

	private class Node {
		String item;
		Node next;
	}

	@Override
	public String toString() {
		String s = "";
		Node x = first;
		while(x!=null) {
			//s = x.item + " "+ s;
			s = s + " " + x.item;
			x = x.next;
		}	
		return "T[" + s + " ]B";
	}

	public static void main(String[] args) {
		Stack test = new Stack();
		test.push("al");
		test.push("bob");
		test.push("cam");
		test.push("dave");
		System.out.println(test);
	}
}

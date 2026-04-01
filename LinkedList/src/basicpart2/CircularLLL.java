package basicpart2;

public class CircularLLL {
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node addToEmpty(Node last, int data) {
		if (last != null) {
			return last;
		}
		Node newNode = new Node(data);
		newNode.data = data;
		last = newNode;
		newNode.next = last;
		return last;
	}

	public static void print(Node last) {
		if (last == null) {
			System.out.println("Circular LL is empty");
			return;
		}
		Node p = last.next;
		do {
			System.out.print(p.data + "<->");
			p = p.next;
		} while (p != last.next);
		System.out.println();
	}

	public static Node addFront(Node last, int data) {
		if (last == null) {
			return addToEmpty(last, data);
		}
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.next = last.next;
		last.next = newNode;
		return last;
	}

	public static Node addEnd(Node last, int data) {
		if (last == null) {
			return addToEmpty(last, data);
		}
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.next = last.next;
		last.next = newNode;
		last = last.next;
		return last;
	}

	public static Node addAfter(Node last, int item, int data) {
		if (last == null) {
			return null;
		}
		Node p = last.next;
		do {
			if (p.data == item) {
				Node newNode = new Node(data);
				newNode.data = data;
				newNode.next = p.next;
				p.next = newNode;
				if (p == last) {
					last = newNode;
				}
				return last;
			}
			p = p.next;
		} while (p != last.next);

		System.out.println("The given element " + item + " is not present in ll");
		return last;
	}

	public static Node deleteNode(Node last, int data) {
		// empty ll
		if (last == null) {
			return null;
		}
		// only one element
		if (last.data == data && last.next == null) {
			return null;
		}
		 Node temp = last;

	        // If last node is to be deleted
	        if (last.data == data) {
	            while (temp.next != last) {
	                temp = temp.next;
	            }

	            temp.next = last.next;
	            last = temp;
	        }

	        // Find the node before the one to delete
	        while (temp.next != last && temp.next.data != data) {
	            temp = temp.next;
	        }

	        // If found
	        if (temp.next.data == data) {
	            temp.next = temp.next.next;
	        }
		return last;
	}

	public static void main(String[] args) {
		Node last = null;
		last = addToEmpty(last, 2);
		print(last);
		last = addFront(last, 1);
		print(last);
		last = addEnd(last, 3);
		print(last);
		last = addAfter(last, 2, 4);
		print(last);
		last = deleteNode(last, 4);
		print(last);
	}
}

package basicpart2;

public class Doublell {
	class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;

	public void addFirst(int data) {
		Node newNode = new Node(data);
		size++;
		if (head == null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head.prev = newNode;
		head = head.prev;
	}
	
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"<->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public void addLast(int data) {
		Node lastNode = new Node(data);
		size++;
		if(head == null) {
			head = tail = lastNode;
			return;
		}
		tail.next = lastNode;
		lastNode.prev = tail;
		tail = tail.next;	
	}

	public void removeFirst() {
		if(head == null) {
			System.out.println("dll is empty");
			return;
		}
		if(head.next == null) {
			head = tail = null;
			return;
		}
		head = head.next;
		head.prev = null;
		size--;
	}
	public void removeLast() {
		if(head == null) {
			System.out.println("dll is empty");
			return;
		}
		if(head.next == null) {
			head = tail = null;
			return;
		}
		tail = tail.prev;
		tail.next =null;
		size--;
	}
	public void reverse() {
		Node curr = head;
		Node prev = null;
		Node nex ;
		
		while(curr != null) {
			nex = curr.next;
			curr.next = prev;
			curr.prev = nex;
			prev = curr;
			curr = nex;
		}
		head = prev;
	}
	public static void main(String[] args) {
		Doublell dll = new Doublell();
		dll.addFirst(3);
		dll.addFirst(2);
		dll.addFirst(1);
		dll.addLast(4);
		dll.print();
//		dll.removeFirst();
//		dll.print();
//		dll.removeLast();
//		dll.print();
		dll.reverse();
		dll.print();
		System.out.println(size);
	}
}
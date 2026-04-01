package basicpart2;

public class Circularll {

    static class Node {
        int data;
        Node next;
    }

    // Add to empty list
    static Node addToEmpty(Node last, int data) {
        if (last != null) {
            return last;
        }
        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        newNode.next = last;
        return last;
    }

    // Add at front
    static Node addFront(Node last, int data) {
        if (last == null) {
            return addToEmpty(last, data);
        }

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;

        return last;
    }

    // Add at end
    static Node addEnd(Node last, int data) {
        if (last == null) {
            return addToEmpty(last, data);
        }

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;

        return last;
    }

    // Add after a specific item
    static Node addAfter(Node last, int data, int item) {
        if (last == null) {
            return null;
        }

        Node p = last.next;

        do {
            if (p.data == item) {
                Node newNode = new Node();
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

        System.out.println(item + " The given node is not present in the list");
        return last;
    }

    // Delete a node
    static Node deleteNode(Node last, int key) {
        if (last == null) {
            return null;
        }

        // Only one node
        if (last.data == key && last.next == last) {
            return null;
        }

        Node temp = last;

        // If last node is to be deleted
        if (last.data == key) {
            while (temp.next != last) {
                temp = temp.next;
            }

            temp.next = last.next;
            last = temp;
        }

        // Find the node before the one to delete
        while (temp.next != last && temp.next.data != key) {
            temp = temp.next;
        }

        // If found
        if (temp.next.data == key) {
            temp.next = temp.next.next;
        }

        return last;
    }

    // Traverse the list
    static void traverse(Node last) {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        Node p = last.next;

        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != last.next);

        System.out.println();
    }

    public static void main(String[] args) {
        Node last = null;

        last = addToEmpty(last, 6);
        last = addEnd(last, 8);
        last = addFront(last, 2);
        last = addAfter(last, 10, 2);

        traverse(last);

        last = deleteNode(last, 8); // 🔥 important: reassign

        traverse(last);
    }
}
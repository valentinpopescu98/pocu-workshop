package ex7_linked_list;

public class LinkedList<T> {
    Node head;

    static class Node<T> {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }
    }

    public LinkedList insert(T value)
    {
        // Create a new node with given value
        Node new_node = new Node(value);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (this.head == null) {
            this.head = new_node;
        }
        else {
            // Else traverse till the last node
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the linked list
        return this;
    }
}

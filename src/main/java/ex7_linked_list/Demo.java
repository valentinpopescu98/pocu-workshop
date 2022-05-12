package ex7_linked_list;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);

        LinkedList.Node currentNode = numbers.head;

        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }
}

package Seminar3;


// Связный список
public class LinkedList<T> {

    // Указатель на первый элемент
    private Node head;
    // Узел связного списка
    public class Node{


        public Node next;

        // Можем не привязываться к типу значения
        // он привязан к обощенному типу T;
        public T value;
    }


    // Добавление нового элемента в начало связного списка
    public void addFirst(T value){

        Node node = new Node();
        node.value = value;

        if (head != null){
            node.next = head;
        }

        head = node;

    }

    // Удалить первый элемент связанного списка
    public void removeFirst (T value){

        if (head!=null){
            head = head.next;
        }

    }

    /**
     * Поиск элемента в связном списке по значению
     * @param value
     * @return
     */
    public boolean contains(T value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void sort(){
        Node node = head;
        while (node != null){
            Node minValueNode = node;
            Node node2 = node.next;

        }
    }

}

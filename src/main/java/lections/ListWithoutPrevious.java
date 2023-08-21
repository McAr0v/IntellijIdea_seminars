package lections;

public class ListWithoutPrevious {

    Node1 head; // Описывает начала списка

    public void push (int value){
        Node1 node = new Node1();
        node.value = value;
        node.next = head;
        head = node;
    }

    public Integer pop(){
        Integer result = null;

        if (head != null){
            result = head.value;
            head = head.next;
        }

        return result;


    }

    // Функция вызова разворота связного списка

    public void revertWithoutPrevious (){
        // Если список не пустой (имеет head) и есть хотя бы 2 элемента
        if (head != null && head.next != null){
            revertWithoutPrevious(head.next, head);
        }
    }

    // Функция разворота связного одностороннего списка (без previous)
    private void revertWithoutPrevious (Node1 currentNode, Node1 previousNode){
        // Если элемент последний, то он должен стать head
        if (currentNode.next == null){
            head = currentNode;
        } else {
            // Если все таки есть элементы после ноды, то нужно запустить рекурсию дальше
            revertWithoutPrevious(currentNode.next, currentNode);
        }

        currentNode.next = previousNode;
        previousNode.next = null;
    }

    public class Node1{
        int value; // Значние
        Node1 next; // Ссылка на следующий элемент
    }

}

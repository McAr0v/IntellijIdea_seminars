package lections;

public class List {

    Node head; // Описывает начала списка
    Node tail; // Ссылка на последнюю ноду нашего списка (tail - хвост)

    // Метод вставки элемента в конец списка

    public void add (int value){
        Node node = new Node(); //  Создаем новую ноду
        node.value = value; // записываем туда наше значение

        // Проверяем, есть ли уже элементы в связном списке
        // Если голова пустая, то делаем нашу ноду и головой и хвостом
        if (head == null){
            head = node;
            tail = node;
        } else {
            tail.next = node; // Ноде хвоста говорим, что его следующая нода равна нашей ноде
            node.previous = tail; // Нашему вставляемому элементу говорим, что предыдущий элемент это тейл
            tail = node; // А в хвост добавляем нашу ноду
            // Т.е добавили элемент в конец списка
        }



    }

    // Метод поиска элементов

    public Node find (int value){
        Node currentNode = head;
        while (currentNode != null){
            if (currentNode.value == value){
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }
    public class Node{
            int value; // Значние
            Node next; // Ссылка на следующий элемент
            Node previous; // Ссылка на предыдущий элемент
    }

}

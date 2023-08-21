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

    // Метод вставки элемента после искомого элемента

    public void addAfterItem (int value, Node node){

        Node next = node.next;

        Node newNode = new Node(); //  Создаем новую ноду
        newNode.value = value; // записываем туда наше значение
        node.next = newNode; // берем текущую ноду и говорим, что ее значение - это новая нода, newNode
        newNode.previous = node; // Берем новую ноду и говорим, что ее предыдущее значение теперь это нода

        // Делаем проверку - место куда мы вставляем, это не последняя ли нода?
        if (next == null){
            tail = newNode; // если последнего элемента нет, то назначем newNode в качестве хвоста
        } else {
            next.previous = newNode; //
            newNode.next = next;
        }

    }

    // Метод удаления элемента после искомого элемента

    public void deleteNode (Node node){

        Node next = node.next; // создаем ноду, следующую после нашей удаляемой нодой
        Node previous = node.previous; // создаем ноду, идущую позади удаляемой ноды

        // Нужно предусмотреть, не является ли наша нода head или tile

        if (previous == null){
            // если наша нода первая в списке
            next.previous = null; // по сути удаляем первое значение
            head = next; // и говорим, что теперь хэд это следующее значение
        } else {
            if (next == null){
                // если наша нода в конце списка
                previous.next = null; // удаляем последнее значние
                tail = previous; // хвост теперь - это предпоследнее значение
            } else {
                // Если все это не в начале или в конце списка
                // То переприсваиваем ссылки

                next.previous = previous;
                previous.next = next;

            }
        }
    }

    // Разворот связного списка
    public void revert(){
        Node currentNode = head;
        while (currentNode != null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;

            if (previous == null){
                tail = currentNode;
            }

            if (next == null){
                head = currentNode;
            }

            currentNode = next;
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

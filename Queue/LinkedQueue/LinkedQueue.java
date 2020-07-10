public class LinkedQueue<T> implements QueueADT<T> {
    private int count;
    private LinearNode<T> head, tail;

    public LinkedQueue(){
        count = 0;
        head = tail = null;
    }

    public void enqueue(T element) {
        LinearNode<T> node = new LinearNode<T>(element);
        if(isEmpty())
            head = node;
        else 
            tail.setNext(node);
        tail = node;
        count++;
    }

    public T dequeue() throws EmptyCollectionException {
        if(isEmpty())
        throw new EmptyCollectionException("Queue");

        T result = head.getElement();
        head = head.getNext();
        count--;

        if(isEmpty())
        tail = null;

        return result;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public T first(){
        return head.getElement();
    }

    public int size() {
        return count;
    }

    public String toString() {
        String message = "[head]";
        LinearNode<T> aux = head;
        if(!isEmpty()){
            while(aux.getElement() != null && aux.getNext() != null){
                message = aux.getElement().toString() + " -> " + message;
                aux = aux.getNext();
            }
            message = aux.getElement().toString() + " -> " + message;
        }
        message = "[tail] -> " + message;

        return message;
    }

}
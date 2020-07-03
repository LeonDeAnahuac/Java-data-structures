public class LinkedStack<T> implements StackADT<T>{
    private int count;
    private LinearNode<T> top;

    public LinkedStack(){
        count = 0;
        top = null;
    }

    public void push(T element) {
        LinearNode<T> temp = new LinearNode<T>(element);

        temp.setNext(top);
        top = temp;
        count++;
    }

    public T pop() throws EmptyCollectionException{
        if(isEmpty()) 
        throw new EmptyCollectionException("Stack");

        T result = top.getElement();
        top = top.getNext();
        count--;
        
        return result;
    }

    public T peek() {
        return top.getElement();
    }

    public boolean isEmpty(){
        return count ==0;
    }

    public int size() {
        return count;
    }

    public String toString(){
        String message = "[top]";
        LinearNode<T> aux = top;
        if(!isEmpty()){
            while(aux.getElement() != null && aux.getNext() != null) {
                message += " -> " + aux.getElement().toString();
                aux = aux.getNext();
            }
            message += " -> " + aux.getElement().toString();
        }
        return message;
    }
}
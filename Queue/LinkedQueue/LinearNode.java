public class LinearNode<T> {
    private LinearNode<T> next;
    private T element;

    public LinearNode(){
        next = null;
        element = null;
    }

    public LinearNode(T elem){
        next = null;
        element = elem;
    }

    public LinearNode<T> getNext(){
        return next;
    }

    public T getElement() {
        return element;
    }

    public void setNext(LinearNode<T> node) {
        next = node;
    }

    public void setElement(T elem) {
        element = elem;
    }

}
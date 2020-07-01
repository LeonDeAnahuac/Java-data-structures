import java.util.Arrays;

public class ArrayStack<T> implements StackADT<T> {
    private final static int DEFAULT_CAPACITY = 100;
    private int top; //es el indice del siguiente elemento a insertar con push
    private T[] stack;

    public ArrayStack(){
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int initialCapacity) {
        top = 0;
        stack = (T[])(new Object[initialCapacity]);
        //we cannot instantiate a generic type new T();
        //this also means that we cannot instantiate an array of a generic type new T[5];
        //So, we are instantiating an array of Objects and then casting it as an array
        //of our generic type.
        //This will create a compile-time warning for an unchecked type conversion
        //because the Java compiler cannot guarantee the type safety of this casst
        //this warning can be suppressed using @SuppressWarnings("unchecked") before the statement
    }

    private void expandCapacity(){
        stack = Arrays.copyOf(stack, stack.length*2);
    }

    public void push(T element) {
        if(size() == stack.length)
        expandCapacity();

        stack[top] = element;
        top++;
    }

    public T pop() throws EmptyCollectionException {
        if(isEmpty()) 
        throw new EmptyCollectionException("Stack");

        top--;
        T result = stack[top];
        stack[top] = null;

        return result;
    }

    public T peek() throws EmptyCollectionException {
        if(isEmpty())
        throw new EmptyCollectionException("Stack");

        return stack[top-1];
    }

    public boolean isEmpty() {
        return top==0;
    }

    public int size(){
        return top;
    }
    public String toString() {
        String message = "[top]";
        for(int i=top-1; i>=0; i--) {
            message += " -> " + stack[i];
        }
        return message;
    }

}
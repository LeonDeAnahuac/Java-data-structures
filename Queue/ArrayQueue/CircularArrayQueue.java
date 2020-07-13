public class CircularArrayQueue<T> implements QueueADT<T> {
    private final static int DEFAULT_CAPACITY = 100;
    private int front, rear, count;
    private T[] queue;

    public CircularArrayQueue(){
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public CircularArrayQueue(int initialCapacity){
        queue = (T[]) (new Object[initialCapacity]);
        front = rear = count = 0;
    }

    public int size() {
        return count;
    }

    @SuppressWarnings("unchecked")
    private void expandCapacity(){
        T[] larger = (T[]) (new Object[queue.length*2]);
        for(int scan = 0; scan < count; scan++) {
            larger[scan] = queue[front];
            front = (front + 1)%queue.length;
        }
        front = 0;
        rear = count;
        queue = larger;
    }

    public void enqueue(T element) {
        if(size() == queue.length)
            expandCapacity();
            
        queue[rear] = element;
        rear = (rear+1)%queue.length;
        count++;
    
    }

    public T first(){
        return queue[front];
    }

    public boolean isEmpty() {
        return count==0;
    }

    public T dequeue() throws EmptyCollectionException {
        if(isEmpty())
            throw new EmptyCollectionException("Queue");
        T result = queue[front];
        queue[front] = null;
        front = (front+1)%queue.length;

        count--;
        return result;
    }

    public String toString(){
        String message = "[head]";
        if(!isEmpty()){
            if((rear-front)>0){
                for(int i=front; i<rear; i++)
                message = queue[i] + " -> " + message;
            } else {
                for(int i=front; i<queue.length;i++)
                message = queue[i] + " -> " + message;
                for(int i=0; i<rear; i++)
                message = queue[i] + " -> " + message;
            }
        }
        message = "[tail] -> " + message;
        return message;
    }
}
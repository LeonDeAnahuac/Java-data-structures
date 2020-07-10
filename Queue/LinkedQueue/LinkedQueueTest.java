public class LinkedQueueTest {
    public static void main(String[] args) {
        
        LinkedQueue<String> comida = new LinkedQueue<String>();
        String msg = comida.toString();
        System.out.println(msg);
        comida.enqueue("Pozole");
        comida.enqueue("Mixiote");
        comida.enqueue("Pizza");
        comida.enqueue("Chilaquiles");
        comida.dequeue();
        msg = comida.toString();
        System.out.println(msg);
    }
}
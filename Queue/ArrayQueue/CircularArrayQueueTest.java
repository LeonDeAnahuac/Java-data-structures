public class CircularArrayQueueTest {
    public static void main(String[] args) {

        CircularArrayQueue<String> comida = new CircularArrayQueue<String>(4);
        String msg = comida.toString();
        System.out.println(msg);
        comida.enqueue("Pozole");
        comida.enqueue("Mixiote");
        comida.enqueue("Pizza");
        comida.enqueue("Chilaquiles");
        comida.dequeue();
        comida.dequeue();
        comida.enqueue("Molletes");
        msg = comida.toString();
        System.out.println(msg);
    }
}
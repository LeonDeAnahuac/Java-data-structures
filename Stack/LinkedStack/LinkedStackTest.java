public class LinkedStackTest {
    public static void main(String[] args) {
        LinkedStack<String> comida = new LinkedStack<String>();
        comida.push("manzana");
        comida.push("pollo");
        comida.push("mole");
        comida.pop();
        comida.push("pizza");
        comida.push("carne asada");
        comida.pop();
        comida.push("helado");
        comida.push("torta");
        comida.push("pan");
        System.out.println(comida);
    }
}

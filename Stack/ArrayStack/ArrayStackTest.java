public class ArrayStackTest{
    public static void main(String[] args) {
        ArrayStack<String> comida = new ArrayStack<String>();
        comida.push("manzana");
        comida.push("pollo");
        comida.push("mole");
        comida.push("pizza");
        comida.push("carne asada");
        comida.pop();
        comida.push("helado");
        comida.push("torta");
        comida.push("pan");
        System.out.println(comida);
    }
}

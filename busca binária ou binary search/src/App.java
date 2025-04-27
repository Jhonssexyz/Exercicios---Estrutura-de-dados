import lista.lista;

public class App {
    public static void main(String[] args) throws Exception {
        lista lista = new lista();

        lista.insert("Janeiro");
        lista.insert("Fevereiro");
        lista.insert("Março");
        lista.insert("Abril");

        System.out.println(lista.mostrar());

        System.out.println(lista.binary(2));
    }
}

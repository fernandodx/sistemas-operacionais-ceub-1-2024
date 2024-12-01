public class ExemploMemoria {

    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i <= 10000; i++) {
            resultado.append(" ").append(i);
        }
        System.out.println(resultado.toString());
    }

}

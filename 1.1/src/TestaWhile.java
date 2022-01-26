public class TestaWhile {
    public static void main(String[] args) {
        int contador = 0;
        while(contador <= 10) {
            System.out.println(contador);
//            contador = contador + 1;
//            contador += 1;
              contador++;

        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            // break; faz sair do laço mais interno e ir pra fora
        }
    }
}

public class TestaEscopo {
    public static void main(String[] args) {
        int quantidadePessoa = 3;
        boolean acompanhado;
        if(quantidadePessoa >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println(acompanhado);
    }
}

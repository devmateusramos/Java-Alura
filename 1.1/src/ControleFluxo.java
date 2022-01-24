public class ControleFluxo {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 19;
        int acompanhado = 2;
        boolean satisfazAcompanhado = acompanhado > 2;
//        if (idade >= 18) {
//            System.out.println("Você pode entrar");
//        } else {
//            if(acompanhado >= 3) {
//                System.out.println("Pode entrar pq tá acompanhado");
//            } else {
//                System.out.println("Não pode entrar");
//            }
        if(idade >= 18 && satisfazAcompanhado) {
            // Pode usar o || para ser OU
            System.out.println("Seja bem vindo");
    } else {
            System.out.println("Não passou");
        }
}}

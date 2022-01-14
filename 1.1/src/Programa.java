public class Programa {
    public static void main(String[] args) {
        int inteiros = 23 / 2;
        System.out.println(inteiros);
        double doubleSemPonto = 23 / 2;
        System.out.println(doubleSemPonto);
        double doubleComPonto = 23.0 / 2;
        System.out.println(doubleComPonto);
        double valorDouble = 123.5;
        int doubleConvertido = (int) valorDouble;
        System.out.println(doubleConvertido);
        double decimalGrande = 123.45678;
        System.out.println(decimalGrande);
        long numeroGrande = 43124234234L;
        System.out.println(numeroGrande);
        short numeroPequeno = 2131;
        System.out.println(numeroPequeno);
        byte numeroNanico = 127;
        System.out.println(numeroNanico);
        // outra lang mesmos problem situations
        double valor1 = 0.2;
        double valor2 = 0.1;
        double soma = valor1 + valor2; // numero maluco comum
        System.out.println(soma);
        /* tem o float pra ponto flutuante mas é 32 bits então
         se prefere usar só o double msm q é 64, mas
          dá pra usar float passando o (float) ou pondo f no final*/
    }
}

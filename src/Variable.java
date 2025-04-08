public class Variable {
    /*
    * O que é uma variável? Como declarar uma variável? Quais os tipos de variáveis?
    * Variáveis são espaços que estão na memória do computador onde armazenamos dados.
    * Para declarar uma variável precisamos especificar o nome dela e o tipo.
    * Os tipos são: byte, short, int, long, float, double, char e boolean.
    * */
    public static void main(String[] args) {
        int age = 21;
        double salarioMensal = 4500.00;
        char genero = 'F';
        boolean empregadaJava = false;

        System.out.println("Idade: " + age);
        System.out.println("Salário: " + salarioMensal);
        System.out.println("Gênero: " + genero);
        System.out.println("Empregada? " + empregadaJava);

    }
}

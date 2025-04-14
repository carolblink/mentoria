public class Carro {

    // O que são classes?
    //Uma classe define um TIPO de objeto, ou seja, representa a estrutura de dados; atributos construtores, métodos...

    //atributos
    String nome;
    String marca;
    int ano;
    int vel;

    //métodos
    void acelerar(int aceleracao){
     vel+=aceleracao;
    }

    void freiar(int reduzir) {
        vel-=reduzir;
    }

    void buzinar(){
        System.out.println("bibibi");

    }


}
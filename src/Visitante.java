public class Visitante {
/* Como declarar uma variavel constante no java usando static final
Conversão java para variaveis estaticas e finais o nome da variavel
* precisa estar toda em maiusculo.Ela não pode ser alterada.*/
    static final int IDADE_MINIMA_ACESSO_IRRESTRITO = 16;

    String nome;
    int idade;

    boolean possuiAcessoRestritoPorIdade() {
        return idade < IDADE_MINIMA_ACESSO_IRRESTRITO;
    }
}

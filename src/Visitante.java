public class Visitante {

    static final int IDADE_MINIMA_ACESSO_IRRESTRITO = 16;
/* O var não funciona como variavel de instância como é o exemplo aqui
* var nome = "João";*/
    String nome;
    int idade;

    boolean possuiAcessoRestritoPorIdade() {

        return idade < IDADE_MINIMA_ACESSO_IRRESTRITO;
    }
}
/*Aprendi na 05.39 — Inferência de tipo com var
var permite que o compilador infira o tipo da variável local
automaticamente.
Só funciona em variáveis locais — não funciona em atributos de instância
Precisa de inicializador na mesma linha: var x; sem valor não compila
Não aceita null: var nome = null; não compila pois não há tipo para inferir
Não funciona em parâmetros de métodos
var é palavra-chave mas não reservada — var var = 1; compila, mas evite
Só use quando o lado direito deixa o tipo óbvio — não saia usando em tudo*/

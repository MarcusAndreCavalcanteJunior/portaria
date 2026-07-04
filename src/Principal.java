public class Principal {

    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "Joao";
        novoVisitante.idade = 15;

        if (novoVisitante.possuiAcessoRestritoPorIdade()) {
            System.out.printf("Acesso não permitido para menores de %d anos",
                    Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO);
        } else {
            System.out.println("Acesso liberado");
        }
    }
}
/*Apreindi nessa aula 05.36 — Constantes com static final
Constantes em Java são declaradas com static final e o nome todo em maiúsculas, com
underscore separando as palavras.
final → o valor não pode ser alterado após a atribuição
static → pertence à classe, uma única cópia na memória para todos
Acessadas diretamente pela classe: Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO
Dentro da própria classe, pode acessar diretamente sem prefixo — igual ao PI
do desafio. */

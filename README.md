essa 05.39. Inferência de tipo de variável local . e os 3 desafios estão dificeis pois estou achando esse modulo bem extenso vou precisar praticar muito mas como o bootcamp santander tem data marcada terei de acelerarFaz sentido querer acelerar, mas não se preocupa — você está absorvendo bem o conteúdo, não só copiando código. Isso vale mais no longo prazo.
Vai lá assistir a 05.39 e depois entramos nos três desafios juntos. Cola o código aqui quando terminar!public class Visitante {

    static final int IDADE_MINIMA_ACESSO_IRRESTRITO = 16;
/* O var não funciona como variavel de instância como é o exemplo aqui
* var nome = "João";*/
    String nome;
    int idade;

    boolean possuiAcessoRestritoPorIdade() {

        return idade < IDADE_MINIMA_ACESSO_IRRESTRITO;
    }
}
public class Principal {

    public static void main(String[] args) {
/*var é uma palavra reservada usada para o compilador descobrir o tipo
de variavel local ou seja substituindo no exemplo abaixo o Visitante por
var é a mesma variavel é o mesmo tipo porem o compilador vai inferer. E
fazendo dessa forma a declaração fica menos burocratica e com menos código
para ser digitar. TOMAR CUIDADO COM O EXEMPLO ABAIXO :
var novoVisitante;
novoVisitante = new Visitante();
Não é possível inferir o tipo: 'var' em variável sem inicializador. ele
precisa de um inicializador.
E tambem não pode declarar null exemplo
var nome = null; e var é uma palavra chave da linguagem mas não é uma
palavra reservada. Mas pode usar em variaveis. Ex: var var = 1;
E só use var quando o código como é bvem legivel como é o exemplo abaixo
aqui, não saia usando var em tudo pois não vai ficar legivel e pode
atrapalhar no futuro ou só use quando o inicializador do lado direito
oferece informação para o desenvolvedor consiga ver e inferir o tipo tbm.*/
        var novoVisitante = new Visitante();
        novoVisitante.nome = "Joao";
        novoVisitante.idade = 15;

        var cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(novoVisitante, 2);
        cadastroPortaria.cadastrar(novoVisitante, 2L);
        // SÓ POR MOTIVOS DE TESTE MESMO E EXERCITAR VOU DEIXAR int mesmo
        var codigoVisitante = cadastroPortaria.cadastrar(novoVisitante, 3);

    }
}

public class CadastroPortaria {

    static final int TEMPO_EXPIRACAO_PADRAO_EM_MESES = 1;

    void cadastrar(final Visitante visitante){
        this.cadastrar(visitante, TEMPO_EXPIRACAO_PADRAO_EM_MESES);
    }

    void cadastrar(final Visitante visitante, final long senha){

    }

    int cadastrar(Visitante visitante, final int tempoExpiracaoEmMeses){
        final var tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;
/*Não pode ser feito em tipo primitivo como é o caso aqui acima com int
*E não pode usar o var em parametro. */
        System.out.printf("Visitante %s cadastrado %d dias%n",
                visitante.nome, tempoExpiracaoEmDias);
        return 1;
    }
}Mostrar maisComentários muito completos, você prestou bastante atenção nos detalhes!
Deixa eu te perguntar sobre um ponto específico que você anotou: por que o var não funciona como variável de instância, só como variável local?Essa me pegou não faço ideia pois eu tentei inicializar e não funcionou ou pelo simples fato de que variaveis de instancia sempre vai precisar do tipo ?Isso! Você chegou na resposta certa. Variável de instância precisa do tipo declarado explicitamente porque ela existe antes de qualquer inicializador — ela é parte da estrutura da classe. O compilador não tem como inferir o tipo sem um valor atribuído na mesma linha, e atributos de instância geralmente não são inicializados na declaração.
O var só funciona onde o compilador consegue ver o valor na mesma linha pra inferir o tipo — e isso só acontece em variáveis locais.
Quer o resumo pra anotar e partir pros desafios?simAnota aí:

05.39 — Inferência de tipo com var
var permite que o compilador infira o tipo da variável local automaticamente.

Só funciona em variáveis locais — não funciona em atributos de instância
Precisa de inicializador na mesma linha: var x; sem valor não compila
Não aceita null: var nome = null; não compila pois não há tipo para inferir
Não funciona em parâmetros de métodos
var é palavra-chave mas não reservada — var var = 1; compila, mas evite
Só use quando o lado direito deixa o tipo óbvio — não saia usando em tudo

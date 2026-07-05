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


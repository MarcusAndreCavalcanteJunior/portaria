public class CadastroPortaria {

    void cadastrar(Visitante visitante, final int tempoExpiracaoEmMeses){
        final int tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado %d dias%n",
                visitante.nome, tempoExpiracaoEmDias);
    }
}
/*Aprendi na 05.37 — Modificador final em variáveis locais
O final pode ser usado em variáveis locais (dentro de métodos)
e em parâmetros de métodos.

Uma vez atribuído o valor, não pode ser reatribuído — o compilador bloqueia
Serve como intenção explícita: quem ler o código sabe que aquele valor
nunca muda no metodo. Evita bugs e confusão em métodos mais complexos

Diferença do static final de atributos de classe: aqui o final é só local,
existe apenas durante a execução do metodo.*/

public class CadastroPortaria {

    static final int TEMPO_EXPIRACAO_PADRAO_EM_MESES = 1;
/*Para criar criar o mesmo metodo com parametros diferentes não precisamos
copiar e colar só basta chamar ele com chamar ele com o this.cadastrar
e depois passar os parametros abaixo e foi criado uma variavel por
causa do numero 1 magico que estava solto dae criamos a variavel constante
uma static final como mostra acima, deixando mais interessante.
static final int TEMPO_EXPIRACAO_PADRAO_EM_MESES = 1;
Lembrando que o this. é opcional como são 2 metodos de instancia se tirar
o this da na mesma*/
    void cadastrar(final Visitante visitante){
        this.cadastrar(visitante, TEMPO_EXPIRACAO_PADRAO_EM_MESES);
    }

    void cadastrar(final Visitante visitante, final long senha){

    }

    void cadastrar(Visitante visitante, final int tempoExpiracaoEmMeses){
        final int tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado %d dias%n",
                visitante.nome, tempoExpiracaoEmDias);
    }
}
/*Nessa aula aprendi que não é possivel ter 2 versões de metodos com a
mesma assinatura essa é uma restrição que a linguagem impoe, vc pode ter
quantos metodos vc quiser com o mesmo nome mas com assinaturas diferentes
ou parametros diferentes sempre de tipos diferentes ou quantidades
diferentes.Não pode ser por exemplo
void cadastrar(Visitante visitante, final int senha)
pois ele entende os parametros como (Visitante, final int mesmo sendo nome
 diferente) e ja dessa outra maneira funcionaria pois seria um long.
 void cadastrar(Visitante visitante, final long senha e não esquecer de
 por o L para forçar a entrada no long. E para voltar para o int só tirar
 o L) para assim funcionar a sobrecarga de metodos com assinaturas
 diferentes como mostra no exemplo acima*/



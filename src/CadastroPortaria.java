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
}




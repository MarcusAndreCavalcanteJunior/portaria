public class Principal {

    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "Joao";
        novoVisitante.idade = 15;

        CadastroPortaria cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(novoVisitante, 2);
        cadastroPortaria.cadastrar(novoVisitante, 2L);

    }
}
/*
05.38 — Sobrecarga de métodos
Sobrecarga (overload) é ter vários métodos com o mesmo nome mas assinaturas
 diferentes — tipo ou quantidade de parâmetros diferentes.

O Java decide qual versão executar pelos parâmetros passados na chamada
Não pode ter dois métodos com mesmo nome e mesma assinatura —
o compilador bloqueia
(Visitante, int) e (Visitante, long) são assinaturas diferentes ✅
(Visitante, int senha) e (Visitante, int tempo) são a mesma assinatura ❌
 — o nome do parâmetro não conta

Dica extra: um metodo sobrecarregado pode chamar outro da mesma
classe com this.cadastrar(...), evitando duplicação de código.
*/

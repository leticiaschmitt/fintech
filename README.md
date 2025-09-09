# Easy Finanças – Projeto Fintech em Java

Projeto acadêmico desenvolvido na **FIAP** para a disciplina de *Programação Orientada a Objetos em Java*.  
Simula uma **fintech** com funcionalidades de movimentações financeiras, categorias, usuários e metas, evoluindo a cada capítulo.

---

## Evolução por Capítulo

- **Capítulo 6 – Métodos em Java**  
  Criação das classes principais (`Usuario`, `Categoria`, `Conta`, `Movimentacao`, `MetaFinanceira`, `RelatorioService`) com atributos, métodos simulados e relacionamentos.

- **Capítulo 8 – Herança e Polimorfismo**  
  Introdução de superclasses e subclasses:
  * `Pessoa` → `Usuario`
  * `Conta` (abstrata) → `ContaCorrente` / `ContaPoupanca`
  * Polimorfismo em `aplicarAtualizacaoMensal()`  
  * Tarifa/rendimento registrados como movimentações automáticas.

---

## Estrutura do Projeto

```
Fintech/
├─ src/
│  └─ br/com/easyfinancas/
│      ├─ app/
│      │   └─ Main.java
│      ├─ model/
│      │   ├─ Pessoa.java
│      │   ├─ Usuario.java
│      │   ├─ Conta.java
│      │   ├─ ContaCorrente.java
│      │   ├─ ContaPoupanca.java
│      │   ├─ Categoria.java
│      │   ├─ Movimentacao.java
│      │   ├─ TipoMovimentacao.java
│      │   └─ MetaFinanceira.java
│      └─ service/
│          └─ RelatorioService.java
├─ README.md            ← resumo global
├─ README-cap06.md      ← relatório da atividade Cap 6
└─ README-cap08.md      ← relatório da atividade Cap 8

```

---

## Como Executar

1. Abra o projeto no **IntelliJ** ou **VS Code** com JDK 8+.  
2. Rode a classe `Main` (`br.com.easyfinancas.app.Main`).  
3. Veja no console: criação de usuário, categorias, lançamentos, extrato, totais por tipo, tarifa e rendimento aplicados.

---

## Exemplo de Execução (trecho)

```
Usuário → Letícia Rocha | email: leticia@email.com | notificações ativas
Cadastrando categoria: Salário (ENTRADA)
Cadastrando categoria: Aluguel (DESPESA)
Registrando movimentação M001 → ENTRADA | valor=3500.00 | categoria=Salário
Registrando movimentação M002 → DESPESA | valor=1200.00 | categoria=Aluguel
Adicionando movimentação na conta 0001-9 → ENTRADA de R$ 3.500,00
Adicionando movimentação na conta 0001-9 → DESPESA de R$ 1.200,00
Recalculando saldo da conta 0001-9 com base nas movimentações...
Saldo atualizado: R$ 2.300,00
Exibindo extrato da conta 0001-9 | titular=Letícia Rocha | total lançamentos=2
Saldo atual: R$ 2.300,00
Aplicando tarifa mensal de R$ 19,90 na conta corrente 0001-9
Adicionando movimentação na conta 0001-9 → DESPESA de R$ 19,90
Recalculando saldo da conta 0001-9 com base nas movimentações...
Saldo atualizado: R$ 2.280,10
Aplicando rendimento de 0.500% na conta poupança 0002-1
Sem rendimento (saldo zero ou negativo).
===== EXTRATO DETALHADO (0001-9) =====
2025-09-09 | ENTRADA | R$ 3.500,00 | Salário | Salário do mês
2025-09-09 | DESPESA | R$ 1.200,00 | Aluguel | Aluguel
2025-09-09 | DESPESA | R$ 19,90 | Tarifas | Tarifa mensal de manutenção
===============================================
Totais por tipo → ENTRADA: R$ 3.500,00 | CUSTO: R$ 0,00 | DESPESA: R$ 1.219,90
Gerando resumo do dia 2025-09-09 para a conta 0001-9
Exportando relatório da conta 0001-9 em formato CSV (simulado).
Meta → 'Reserva de emergência' | Objetivo: R$ 10.000,00 | Prazo: 2025-12-31
Progresso da meta 'Reserva de emergência': saldo atual = R$ 2.280,10 de R$ 10.000,00
Fim da simulação.
```

---

## Critérios Atendidos até o momento

- [x] Mínimo de 4 classes implementadas.  
- [x] Atributos e métodos corretos.  
- [x] Encapsulamento aplicado.  
- [x] Herança e polimorfismo.  
- [x] Relatórios funcionais.  
- [x] Estrutura em packages organizada.  
- [x] Projeto compila e executa sem erros.  

---

## Autora

**Letícia Schmitt Rocha**  
- RM: 562713
- Análise e Desenvolvimento de Sistemas – FIAP
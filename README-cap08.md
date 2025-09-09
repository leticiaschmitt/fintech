# Easy Finanças – Herança e Polimorfismo (Capítulo 8)

Continuação do projeto acadêmico na disciplina de *Programação Orientada a Objetos em Java* (FIAP).  
Nesta etapa, aplicamos o pilar da **Herança** e demonstramos **Polimorfismo** para evoluir o sistema Fintech.

---

## Objetivo

Exercitar:

* Criação de **superclasses** e **subclasses**.
* Uso de **abstração** (`abstract class`).
* Aplicação de **polimorfismo** em métodos com implementações distintas.
* Encapsulamento + construtores reutilizando `super(...)`.

---

## Implementações da Atividade

### Pessoa → Usuario
* Criada superclasse **`Pessoa`** com atributos `nome` e `email`.
* Classe **`Usuario`** agora **herda de Pessoa**, mantendo `notificacoesAtivas` e métodos de perfil.

### Conta (abstrata) → ContaCorrente / ContaPoupanca
* **`Conta`** tornou-se **abstrata**, com o método polimórfico `aplicarAtualizacaoMensal()`.
* **`ContaCorrente`**:
  * Aplica **tarifa mensal** (`BigDecimal 19.90`).
  * Tarifa registrada como **movimentação do tipo DESPESA**, visível no extrato.
* **`ContaPoupanca`**:
  * Aplica **rendimento mensal** (`0,5% a.m.` padrão).
  * Rendimento registrado como **movimentação do tipo ENTRADA**, visível no extrato.

### Relatório
* `RelatorioService.calcularTotaisPorTipo()` agora calcula de fato os totais de cada tipo.
* Transparência: extrato detalhado lista também as movimentações automáticas (tarifa/rendimento).

---

## Exemplo de Execução
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

## Critérios Atendidos

* Herança implementada (`Pessoa` / `Usuario`, `Conta` / `ContaCorrente` / `ContaPoupanca`).

* Polimorfismo aplicado em `aplicarAtualizacaoMensal()`.

* Construtores com `super(...)` usados.

* Classe de teste (`Main`) instanciando objetos e chamando métodos.

* Projeto exportável e funcional.  

---

## Autora

**Letícia Schmitt Rocha**  
- RM: 562713
- Curso: Análise e Desenvolvimento de Sistemas – FIAP

# Easy Finanças – Métodos em Java (Fase 05)

Projeto acadêmico desenvolvido na **FIAP** para a disciplina de *Programação Orientada a Objetos em Java*.
Simula um sistema de **fintech** com funcionalidades básicas de movimentações financeiras, categorias, usuários e metas.

---

## Objetivo

Exercitar:

* Criação de **classes** em Java.
* Definição de **atributos** com tipos adequados (`String`, `BigDecimal`, `LocalDate`, `boolean`, `List`, `enum`).
* Implementação de **métodos** com `System.out.println()` para simular comportamentos.
* Estruturação de um projeto Java em **packages** (`app`, `model`, `service`).
* Uso de **enum** e relacionamento entre classes.

---

## Estrutura do Projeto

```
Fintech/
├─ src/
│  └─ br/com/easyfinancas/
│      ├─ app/
│      │   └─ Main.java
│      ├─ model/
│      │   ├─ Categoria.java
│      │   ├─ Conta.java
│      │   ├─ MetaFinanceira.java
│      │   ├─ Movimentacao.java
│      │   ├─ TipoMovimentacao.java
│      │   └─ Usuario.java
│      └─ service/
│          └─ RelatorioService.java
└─ README.md
```

---

## Como Executar

1. Abra o projeto no **VS Code** ou **IntelliJ**.
2. Navegue até `src/br/com/easyfinancas/app/Main.java`.
3. Rode a aplicação (`Run` ou `java Main` via terminal).
4. A saída aparecerá no console.

---

## Classes e Responsabilidades
### - `Usuario`
* **Atributos:** `nome`, `email`, `notificacoesAtivas`.
* **Métodos:** `exibirPerfil()`, `ativarNotificacoes()`, `desativarNotificacoes()`.

### - `Categoria`
* **Atributos:** `nome`, `corHex`, `tipo`, `ativa`.
* **Métodos:** `cadastrar()`, `editar()`, `ativar()`, `desativar()`, `exibirResumo()`.

### - `TipoMovimentacao` *(enum)*

* Valores possíveis: `ENTRADA`, `CUSTO`, `DESPESA`.

### - `Movimentacao`

* **Atributos:** `id`, `tipo`, `valor`, `data`, `descricao`, `categoria`.
* **Métodos:** `registrar()`, `estornar()`, `exibirDetalhes()`.
* Inclui sobrescrita de `toString()` para debug.

### - `Conta`

* **Atributos:** `numero`, `usuario`, `saldo`, `historico (List)`.
* **Métodos:** `adicionarMovimentacao()`, `calcularSaldo()`, `exibirExtrato()`, `aplicarLimiteNegativo()`.
* Usa formatação monetária BRL (`R$`) nos saldos.

### - `RelatorioService`

* **Métodos:**

  * `imprimirExtratoDetalhado()` → lista todas as movimentações.
  * `gerarResumoDia()` / `gerarResumoPeriodo()`
  * `calcularTotaisPorTipo()`
  * `exportarCsv()` (simulado).

### - `MetaFinanceira`

* **Atributos:** `descricao`, `valorObjetivo`, `prazo`.
* **Métodos:** `exibirMeta()`, `verificarProgresso()`.
* Exibe valores formatados em `R$`.

---

## Exemplo de Execução

Saída no console ao rodar `Main.java`:

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
===== EXTRATO DETALHADO (0001-9) =====
2025-08-25 | ENTRADA | R$ 3.500,00 | Salário | Salário do mês
2025-08-25 | DESPESA | R$ 1.200,00 | Aluguel | Aluguel
===============================================
Calculando totais por tipo (ENTRADA/CUSTO/DESPESA) para a conta 0001-9
Gerando resumo do dia 2025-08-25 para a conta 0001-9
Exportando relatório da conta 0001-9 em formato CSV (simulado).
Meta → 'Reserva de emergência' | Objetivo: R$ 10.000,00 | Prazo: 2025-12-31
Progresso da meta 'Reserva de emergência': saldo atual = R$ 2.300,00 de R$ 10.000,00
Fim da simulação.
```

---

## Critérios Atendidos

* [x] Mínimo de 4 classes criadas (projeto contém 6 + enum).

* [x] Atributos com tipos de dados corretos.

* [x] Métodos simulados com System.out.println()

* [x] Estrutura organizada em **packages**.

* [x] Projeto compila e executa sem erros.

---

## Autora

**Letícia Schmitt Rocha**

RM: 562713 – Curso: Análise e Desenvolvimento de Sistemas – FIAP
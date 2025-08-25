package br.com.easyfinancas.service;

import br.com.easyfinancas.model.Conta;
import br.com.easyfinancas.model.Movimentacao;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class RelatorioService {

    public void gerarResumoDia(Conta conta, LocalDate dia) {
        System.out.println("Gerando resumo do dia " + dia + " para a conta " + conta.getNumero());
    }

    public void gerarResumoPeriodo(Conta conta, LocalDate inicio, LocalDate fim) {
        System.out.println("Gerando resumo do período " + inicio + " até " + fim + " para a conta " + conta.getNumero());
    }

    public void calcularTotaisPorTipo(Conta conta) {
        System.out.println("Calculando totais por tipo (ENTRADA/CUSTO/DESPESA) para a conta " + conta.getNumero());
    }

    public void exportarCsv(Conta conta) {
        System.out.println("Exportando relatório da conta " + conta.getNumero() + " em formato CSV (simulado).");
    }

    public void imprimirExtratoDetalhado(Conta conta) {
        NumberFormat brl = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("===== EXTRATO DETALHADO (" + conta.getNumero() + ") =====");
        if (conta.getHistorico().isEmpty()) {
            System.out.println("Nenhuma movimentação encontrada.");
            return;
        }
        for (Movimentacao m : conta.getHistorico()) {
            System.out.println(
                m.getData() + " | " + m.getTipo() + " | " + brl.format(m.getValor())
                + " | " + (m.getCategoria() != null ? m.getCategoria().getNome() : "Sem categoria")
                + " | " + m.getDescricao()
            );
        }
        System.out.println("===============================================");
    }
}

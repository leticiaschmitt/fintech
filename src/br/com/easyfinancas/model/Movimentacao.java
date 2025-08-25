package br.com.easyfinancas.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Movimentacao {
    private String id;
    private TipoMovimentacao tipo;
    private BigDecimal valor;
    private LocalDate data;
    private String descricao;
    private Categoria categoria;

    public Movimentacao() { }

    public Movimentacao(String id, TipoMovimentacao tipo, BigDecimal valor, LocalDate data, String descricao, Categoria categoria) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
        this.categoria = categoria;

        if (valor == null || valor.signum() <= 0) {
            System.out.println("Valor inválido para movimentação '" + id + "'. Deve ser > 0.");
        }
    }

    public void registrar() {
        System.out.println("Registrando movimentação " + id + " → " + tipo + " | valor=" + valor
                + " | categoria=" + (categoria != null ? categoria.getNome() : "N/A"));
    }

    public void estornar() {
        System.out.println("Estornando movimentação " + id + " (tipo=" + tipo + ", valor=" + valor + ")");
    }

    public void exibirDetalhes() {
        System.out.println("Movimentação → id=" + id + ", tipo=" + tipo + ", valor=" + valor + ", data=" + data + ", desc='" + descricao + "'");
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public TipoMovimentacao getTipo() { return tipo; }
    public void setTipo(TipoMovimentacao tipo) { this.tipo = tipo; }
    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    @Override
    public String toString() {
        return "Movimentacao{id='" + id + "', tipo=" + tipo + ", valor=" + valor + ", data=" + data + "}";
    }
}

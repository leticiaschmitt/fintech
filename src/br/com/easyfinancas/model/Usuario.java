package br.com.easyfinancas.model;

public class Usuario {
    private String nome;
    private String email;
    private boolean notificacoesAtivas = true;

    public Usuario() { }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void exibirPerfil() {
        System.out.println("Usuário → " + nome + " | email: " + email + " | notificações " + (notificacoesAtivas ? "ativas" : "inativas"));
    }

    public void ativarNotificacoes() {
        notificacoesAtivas = true;
        System.out.println("Notificações ativadas para " + nome);
    }

    public void desativarNotificacoes() {
        notificacoesAtivas = false;
        System.out.println("Notificações desativadas para " + nome);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public boolean isNotificacoesAtivas() { return notificacoesAtivas; }
}

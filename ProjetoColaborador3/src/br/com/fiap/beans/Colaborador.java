package br.com.fiap.beans;

public class Colaborador {
    //definindo as variáveis
    private String nome;
    private String cargo;
    private Endereco endereco;

    //metodo construtor vazio
    public Colaborador() {
        super();
    }

    //metodo construtor cheio
    public Colaborador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    //metodo getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //metodo toString

    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}

package br.com.fiap.main;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

import javax.swing.*;

public class TesteSistema {

    static String texto (String j) {return JOptionPane.showInputDialog(j);}
    static int inteiro (String j) {return Integer.parseInt(JOptionPane.showInputDialog(j));}
    static double real (String j) {return Double.parseDouble(JOptionPane.showInputDialog(j));}

    public static void main(String[] args) {

        //String nome, String cargo
        Colaborador objColaborador = new Colaborador(
                texto("Nome"),
                texto("Cargo")
        );

        //objEndColaborador String logradouro, int numero, String complemento, String cep, String cidade
        Endereco objEndColaborador = new Endereco(
                texto("Logradouro"),
                inteiro("Numero"),
                texto("Complemento"),
                texto("Cep"),
                texto("Cidade")
        );

        objColaborador.setEndereco(objEndColaborador);

        //Empresa String cnpj, String razaoSocial
        Empresa objEmpresa = new Empresa(
                texto("CNPJ"),
                texto("Razao Social")
        );

        Endereco objEndEmpresa = new Endereco(
                texto("Logradouro"),
                inteiro("Numero"),
                texto("Complemento"),
                texto("Cep"),
                texto("Cidade")
        );

        objEmpresa.setEndereco(objEndEmpresa);

        System.out.println(
                "Informações sobre o colaborador: \n"
                        + objColaborador + "\n" +
                        "Informações sobre a empresa: \n"
                        + objEmpresa + "\n"
        );

    }
}

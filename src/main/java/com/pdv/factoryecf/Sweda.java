/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pdv.factoryecf;

/**
 *
 * @author cesar
 */
public class Sweda extends ECF {

    public Sweda() {
        System.out.println("Carrega a DLL Sweda");
    }

    @Override
    public String abrirCupom() {
        return ("Implementa o metodo abrirCupom Sweda");
    }

    @Override
    public String registrarItem(String descricaoProduto, double quantidade, double valorUnitario) {
        return ("Implementa o metodo registrarItem Sweda");
    }

    @Override
    public String registraPagamento(int tipoPagamento, double valorPagamento) {
        return ("Implementa o metodo registraPagamento Sweda");
    }

    @Override
    public String fecharVenda() {
        return ("Implementa o metodo fecharVenda Sweda");
    }

}

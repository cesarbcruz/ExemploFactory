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
public class Daruma extends ECF {

    public Daruma() {
        System.out.println("Carrega a DLL Daruma");
    }

    @Override
    public String abrirCupom() {
        return ("Implementa o metodo abrirCupom Daruma");
    }

    @Override
    public String registrarItem(String descricaoProduto, double quantidade, double valorUnitario) {
        return ("Implementa o metodo registrarItem Daruma");
    }

    @Override
    public String registraPagamento(int tipoPagamento, double valorPagamento) {
        return ("Implementa o metodo registraPagamento Daruma");
    }

    @Override
    public String fecharVenda() {
        return ("Implementa o metodo fecharVenda Daruma");
    }

}

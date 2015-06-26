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
public abstract class ECF {

    public abstract String abrirCupom();

    public abstract String registrarItem(String descricaoProduto, double quantidade, double valorUnitario);

    public abstract String registraPagamento(int tipoPagamento, double valorPagamento);

    public abstract String fecharVenda();
}

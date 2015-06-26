/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pdv.factoryecf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cesar
 */
public class ECFFactoryIT {

    public ECFFactoryIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getECF method, of class ECFFactory.
     */
    @Test
    public void testGetECF() {
        System.out.println("getECF");
        int idModeloECFParametrizado = 1;
        ModeloECFEnum modelo = ModeloECFEnum.getModelo(idModeloECFParametrizado);
        String expResult = "Implementa o metodo abrirCupom Epson";
        ECF ecfSelecionado = ECFFactory.getECF(modelo);
        assertEquals(expResult, ecfSelecionado.abrirCupom());
        
        idModeloECFParametrizado = 2;
        modelo = ModeloECFEnum.getModelo(idModeloECFParametrizado);
        expResult = "Implementa o metodo fecharVenda Daruma";
        ecfSelecionado = ECFFactory.getECF(modelo);
        assertEquals(expResult, ecfSelecionado.fecharVenda());
        
        idModeloECFParametrizado = 0;
        modelo = ModeloECFEnum.getModelo(idModeloECFParametrizado);
        expResult = "Implementa o metodo registraPagamento Sweda";
        ecfSelecionado = ECFFactory.getECF(modelo);
        assertEquals(expResult, ecfSelecionado.registraPagamento(0, 0D));
        
        idModeloECFParametrizado = 3;
        modelo = ModeloECFEnum.getModelo(idModeloECFParametrizado);
        expResult = "Implementa o metodo registrarItem Sweda";
        ecfSelecionado = ECFFactory.getECF(modelo);
        assertEquals(expResult, ecfSelecionado.registrarItem("", 0D, 0D));
    }
}

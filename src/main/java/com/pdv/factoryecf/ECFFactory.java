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
public class ECFFactory {


    public static ECF getECF(ModeloECFEnum modeloECF) {
        switch (modeloECF) {
            case EPSON:
                return new Epson();
            case DARUMA:
                return new Daruma();
            default:
                return new Sweda();
        }
    }
}

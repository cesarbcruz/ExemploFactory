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
public enum ModeloECFEnum {

    EPSON(1), DARUMA(2), SWEDA(3);
    int id;

    private ModeloECFEnum(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static ModeloECFEnum getModelo(int idModelo) {
        for (ModeloECFEnum m : ModeloECFEnum.values()) {
            if (m.getId() == idModelo) {
                return m;
            }
        }
        return SWEDA;
    }
}

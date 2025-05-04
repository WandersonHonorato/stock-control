package com.novaterra.stock_control.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Category {

    OFICINA(1, "Oficina"),
    OPERACIONAL(2, "Operacional"),
    COMUM(3, "Comum"),
    SAUDE(4, "Saude"),
    ADM_OPERACIONAL(6, "Adm_Operacional"),
    RECICLADO(5, "Reciclado"),
    ADMINISTRATIVO(7, "Administrativo");

    private final int codigo;
    private final String descricao;
}


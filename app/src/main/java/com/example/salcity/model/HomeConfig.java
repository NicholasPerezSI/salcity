package com.example.salcity.model;

import com.google.android.gms.maps.model.LatLng;

/** Constantes da Home: mapa, orçamento e termos de busca. */
public final class HomeConfig {

    // Mapa
    public static final LatLng SALVADOR_CENTRO = new LatLng(-12.9714, -38.5014);
    public static final float ZOOM_INICIAL = 12.5f;
    public static final float ZOOM_FOCO = 15f;

    // Orçamento padrão (padronizado em um único lugar)
    public static final int ORCAMENTO_MIN_PADRAO = 0;
    public static final int ORCAMENTO_MAX_PADRAO = 500;

    // Termos de busca demonstrativa
    public static final String TERMO_PELOURINHO = "pelourinho";
    public static final String TERMO_FAROL    = "farol";
    public static final String TERMO_BARRA    = "barra";
    public static final String TERMO_MERCADO  = "mercado";
    public static final String TERMO_MODELO   = "modelo";

    private HomeConfig() { /* utilitária */ }
}

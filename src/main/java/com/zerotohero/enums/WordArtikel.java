package com.zerotohero.enums;

public enum WordArtikel {
    DER("der"), DIE("die"), DAS("das");

    private final String value;

    WordArtikel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
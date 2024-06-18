package com.project.crm.persistence.enumeration;

public enum Priorite {
    Faible("Faible"),
    Moyenne("Moyenne"),
    Élevée("Élevée");

    private final String frenchTranslation;

    Priorite(String frenchTranslation) {
        this.frenchTranslation = frenchTranslation;
    }

    public String getFrenchTranslation() {
        return frenchTranslation;
    }
}

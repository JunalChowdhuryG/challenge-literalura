package com.alura.literalura.model;

import java.util.Arrays;
import java.util.List;

public enum Languages {
    ENGLISH("en"),
    SPANISH("es");

    private final String language;

    Languages(String language){
        this.language = language;
    }


    public static Languages getLanguage(String language){
        return Arrays.stream(Languages.values()).filter(l -> l.language.equals(language)).findFirst().orElse(null);
    }

    public static List<Languages> getLanguages(List<String> languages){
        return Arrays.stream(Languages.values()).map(l ->{
            if(languages.contains(l.language)){
                return l;
            }
            return null;
        }).toList();
    }
}

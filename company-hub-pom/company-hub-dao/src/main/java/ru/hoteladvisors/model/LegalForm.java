package ru.hoteladvisors.model;

public enum LegalForm {

    OOO("ООО"),
    IP("ИП"),
    AO("АО");

    private final String text;

    LegalForm(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

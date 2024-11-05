package FactoryDesignPatterns.AbstractFactoryGUI;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
    Menu createMenu();
}

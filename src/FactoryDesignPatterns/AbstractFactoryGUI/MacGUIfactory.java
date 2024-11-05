package FactoryDesignPatterns.AbstractFactoryGUI;

public class MacGUIfactory implements GUIFactory {
    public Button createButton(){
        return new MacButton();
    }

    public Checkbox createCheckbox(){
        return new MacCheckbox();
    }

    public Menu createMenu(){
        return new MacMenu();
    }
}

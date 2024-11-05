package FactoryDesignPatterns.AbstractFactoryGUI;

public class WindowsGUIFactory implements GUIFactory {

    public Button createButton(){
        return new WindowsButton();
    }

    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }

    public Menu createMenu(){
        return new WindowsMenu();
    }
}

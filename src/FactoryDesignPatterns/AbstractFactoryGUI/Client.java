package FactoryDesignPatterns.AbstractFactoryGUI;

public class Client {

    public static void main(String[] args) {

        GUIFactory vishmacgui = new MacGUIfactory();
        Button vishmacbutton = vishmacgui.createButton();

        vishmacbutton.click();
    }
}

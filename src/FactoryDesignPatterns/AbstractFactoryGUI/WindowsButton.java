package FactoryDesignPatterns.AbstractFactoryGUI;

public class WindowsButton implements Button {
    public void click(){
        System.out.println("Clicked WindowsButton");
    }
}

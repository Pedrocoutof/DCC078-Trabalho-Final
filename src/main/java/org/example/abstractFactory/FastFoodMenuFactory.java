package org.example.abstractFactory;

public class FastFoodMenuFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new FastFoodMenu();
    }
}
package org.example;

class FastFoodMenuFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new FastFoodMenu();
    }
}
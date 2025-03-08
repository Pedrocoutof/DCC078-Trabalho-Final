package org.example;

public class BuffetMenuFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new BuffetMenu();
    }
}

package org.example.abstractFactory;

public class BuffetMenuFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new BuffetMenu();
    }
}

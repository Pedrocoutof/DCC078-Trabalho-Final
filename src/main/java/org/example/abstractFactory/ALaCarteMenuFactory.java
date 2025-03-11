package org.example.abstractFactory;

public class ALaCarteMenuFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new ALaCarteMenu();
    }
}

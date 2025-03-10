package org.example;

public class ALaCarteMenuFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new ALaCarteMenu();
    }
}

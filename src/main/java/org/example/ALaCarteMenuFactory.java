package org.example;

class ALaCarteMenuFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new ALaCarteMenu();
    }
}

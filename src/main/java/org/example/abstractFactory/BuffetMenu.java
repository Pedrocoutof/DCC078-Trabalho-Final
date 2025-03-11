package org.example.abstractFactory;

class BuffetMenu implements Menu {
    @Override
    public String showMenu() {
        return "Buffet Menu: Salada, Massa, Sobremesa";
    }
}

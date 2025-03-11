package org.example.abstractFactory;

class FastFoodMenu implements Menu {
    @Override
    public String showMenu() {
        return "Fast Food Menu: Burger, Fries, Soda";
    }
}

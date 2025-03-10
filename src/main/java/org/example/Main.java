package org.example;


// ✅️Singleton - Configuração global
// ✅️️Observer - Cliente para receber notificações
// ✅️Decorator - Adição
// ✅️Strategy: Aplicação de descontos
// ✅️Factory Method - Criação de pedido
// ✅️State: Alteração de estado do pedido
// ✅️Abstract Factory: Criação de menu (Fast Food)
// ✅️Template Method: Fluxo de preparo de um prato
// ☑️Prototype: Para clonagem do pedido

// Customer

/* ===============================
   Demonstração do sistema
   =============================== */
public class Main {
    public static void main(String[] args) {
        // Singleton: Configuração global
//        GlobalConfig config = GlobalConfig.getInstance();
//        System.out.println("Horário de funcionamento: " + config.getOpeningHours());
//        System.out.println("Taxa de serviço: " + config.getServiceTax());
//        System.out.println("------------------------------");

          // Observer: Cliente para receber notificações
//        Customer customer = new Customer("João");

          // Factory Method: Criação de pedido (delivery)
//        Order order = OrderFactory.createOrder("delivery", "001", 50.0);
//        order.addObserver(customer);
//        order.setState(new ReadyState());
          // Strategy: Aplicar estratégia VIP para cálculo de preço
//        order.setPriceStrategy(new VIPDiscountStrategy());
//        System.out.println("Preço calculado: " + order.calculatePrice());
//        order.processOrder();

          // State: Alteração de estado do pedido
//        order.getState().next(order); // Recebido -> Em preparação
//        order.getState().next(order); // Em preparação -> Pronto
//        order.getState().next(order); // Pronto -> Entregue
//        System.out.println("------------------------------");

          // Abstract Factory: Criação de menu (Fast Food)
//        MenuFactory menuFactory = new FastFoodMenuFactory();
//        Menu menu = menuFactory.createMenu();
//        menu.showMenu();
//        System.out.println("------------------------------");

          // Decorator: Personalização de um prato (Pizza)
//        Dish pizza = new Pizza();
//        System.out.println("Pizza: " + pizza.getDescription() + " - R$" + pizza.getCost());
//        pizza = new ExtraCheese(pizza);
//        System.out.println("Pizza com extra cheese: " + pizza.getDescription() + " - R$" + pizza.getCost());
//        pizza = new ExtraPepperoni(pizza);
//        System.out.println("Pizza com extra cheese e pepperoni: " + pizza.getDescription() + " - R$" + pizza.getCost());
//        System.out.println("------------------------------");

          // Template Method: Fluxo de preparo de um prato (Pizza)
//        DishPreparation pizzaPrep = new PizzaPreparation();
//        pizzaPrep.prepareDish();
    }
}

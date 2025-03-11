package org.example.order.factoryMethod;

import org.example.order.Order;

import java.lang.reflect.Constructor;

public class OrderFactory {
    public static Order createOrder(String type, String orderId, double amount) {

        Class<?> classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("org.example.order.factoryMethod." + type + "Order");
            Constructor<?> constructor = classe.getDeclaredConstructor(String.class, double.class);
            objeto = constructor.newInstance(orderId, amount);

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            throw new IllegalArgumentException ("Tipo de pedido desconhecido");
        }
        catch (InstantiationException | IllegalAccessException | NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        return (Order) objeto;
    }
}

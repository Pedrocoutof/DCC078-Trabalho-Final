package org.example.order.factoryMethod;

import org.example.order.Order;

public class OrderFactory {
    public static Order createOrder(String type, String orderId, double amount) {
        if(type.equalsIgnoreCase("delivery")) {
            return new DeliveryOrder(orderId, amount);
        } else if(type.equalsIgnoreCase("pickup")) {
            return new PickupOrder(orderId, amount);
        } else if(type.equalsIgnoreCase("onsite")) {
            return new OnSiteOrder(orderId, amount);
        }
        throw new IllegalArgumentException("Tipo de pedido desconhecido");
    }
}
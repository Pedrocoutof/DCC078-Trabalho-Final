package org.example;

/* ===============================
   State – Controle do status do pedido
   =============================== */
public interface OrderState {
    void next(Order order);
    String getStateName();
}
package org.example;

/* ===============================
   State – Controle do status do pedido
   =============================== */
interface OrderState {
    void next(Order order);
    String getStateName();
}
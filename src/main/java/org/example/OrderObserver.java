package org.example;

/* ===============================
   Observer – Notificação em tempo real para o cliente
   =============================== */
interface OrderObserver {
    void update(String status);
}

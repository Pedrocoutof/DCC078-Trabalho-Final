package org.example;

/* ===============================
   Observer – Notificação em tempo real para o cliente
   =============================== */
interface OrderObserver {
    String update(String status);
}

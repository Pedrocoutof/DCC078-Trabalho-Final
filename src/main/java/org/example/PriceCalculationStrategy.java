package org.example;

/* ===============================
   Strategy – Cálculo de preço com diferentes estratégias
   =============================== */
interface PriceCalculationStrategy {
    double calculate(double basePrice);
}
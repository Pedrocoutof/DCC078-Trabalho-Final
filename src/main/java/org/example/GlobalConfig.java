package org.example;

/* ===============================
   Singleton – Gerenciador de Configuração Global
   =============================== */
public class GlobalConfig {
    private static GlobalConfig instance;
    private double serviceTax;
    private String openingHours;

    private GlobalConfig() {
        serviceTax = 0.1; // 10%
        openingHours = "08:00 - 22:00";
    }

    public static GlobalConfig getInstance() {
        if(instance == null) {
            instance = new GlobalConfig();
        }
        return instance;
    }

    public double getServiceTax() { return serviceTax; }
    public void setServiceTax(double serviceTax) { this.serviceTax = serviceTax; }

    public String getOpeningHours() { return openingHours; }
    public void setOpeningHours(String openingHours) { this.openingHours = openingHours; }
}

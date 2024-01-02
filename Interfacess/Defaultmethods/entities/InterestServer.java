package Interfacess.Defaultmethods.entities;

public interface InterestServer {
    double getInterestRate();

    default double pament(double amount, int mes) {
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, mes);
    }
}

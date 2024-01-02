package Interfacess.Defaultmethods.entities;

public class BrazilInterestTax  implements InterestServer{
    private double interestRate;

    public BrazilInterestTax(){}

    public BrazilInterestTax(double interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
       return interestRate;
    }
}

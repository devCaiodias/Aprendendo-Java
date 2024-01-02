package Interfacess.Defaultmethods.entities;

public class UsInterestTax implements InterestServer {
     private double interestRate;

     public UsInterestTax(){}

     public UsInterestTax(double interestRate){
        this.interestRate = interestRate;
     }

     @Override
     public double getInterestRate(){
        return interestRate;
     }

}

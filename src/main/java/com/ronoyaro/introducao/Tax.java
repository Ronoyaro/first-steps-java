package com.ronoyaro.introducao;

public class Tax {
    double tenPercent = 9.70 / 100 ;
    double thirdEightPercent = 37.35 / 100;
    double fifteenPercent = 49.50 / 100;
    double salaryMin = 34712;
    double salaryMedium = 68507;

    public void taxCalc(double value){
        if(value <= salaryMin){
            double paymentTax = value * tenPercent;
            System.out.println("You will pay: " + paymentTax);
        } else if((value >= salaryMin ) && (value <= salaryMedium)){
            double paymentTax = value * thirdEightPercent;
            System.out.println("You will pay: " + paymentTax);
        } else {
            double paymentTax = value * fifteenPercent;
            System.out.println("You will pay:" + paymentTax);
        }
    }

    public static void main(String[] args) {
        Tax taxa = new Tax();
        taxa.taxCalc(35710);
    }
}

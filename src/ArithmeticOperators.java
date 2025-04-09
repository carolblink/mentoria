public class ArithmeticOperators {


    public static void main(String[] args) {
        double bread = 10.50;
        double cheese = 8.00;
        double sugar = 4.00;
        double promotion = 10.00;
        int daysMonth = 30;

        double totalValue = bread + cheese + sugar;
        double totalValueWithPromotion = totalValue - promotion;
        double totalValueSharedNo = totalValue / 2;
        double totalValueSharedWith = totalValueWithPromotion / 2;
        double totalValueMontly = totalValue * 2;
        double totalValueMonthlyPromotion = totalValueWithPromotion * daysMonth;

        System.out.println("Total value: $ "+ totalValue);
        System.out.println("The total value in the promotion: $ "+ totalValueWithPromotion);
        System.out.println("The total value in a month is: $ " + totalValueMontly);
        System.out.println("The total value in a month with promotion is: $ "+ totalValueMonthlyPromotion);
        System.out.println("The total value shared without promotion is: $"+ totalValueSharedNo);
        System.out.println("The total value shared with promotion is: $"+ totalValueSharedWith);



    }


}

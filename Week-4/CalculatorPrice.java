import java.util.Scanner;
class CalculatorPrice{
    public static void main(String[] args){
        Scanner y= new Scanner(System.in);
        System.out.println("Enter the MarkedPrice");
        double MP=y.nextDouble();
        System.out.println("Enter the Category (A/B/C/D)");
        String Category=y.next();
        double discountpercent=0;
        switch(Category){
        case "A": discountpercent=60; break;
        case "B": discountpercent=40; break;
        case "C": discountpercent=20; break;
        case "D": discountpercent=40; break;
        default :System.out.println("Please Enter Valid Category");
        }
        double discountamount= (discountpercent/100) * MP;
        double sp= MP-discountamount;
        System.out.println("Your total discount is " +discountamount);
        System.out.println("Your total amount is " +sp);
    }
}
import java.util.Scanner;
class CinemaTicket{
    public static void main(String[] args){
        Scanner y= new Scanner(System.in);
        System.out.println("Enter the Age Group");
        String agegroup=y.next().toLowerCase();
        double BasePrice=0;
        switch (agegroup){
            case "child": BasePrice=150; break;
            case "adult": BasePrice=250; break;
            case "senior": BasePrice=200; break;
            default: System.out.println("Enter a valid age group");
        }
        System.out.println("Enter the Movie language");
        String language=y.next().toLowerCase();
        double priceafterlanguage=0;
        switch(language){
            case"Hindi" : priceafterlanguage=BasePrice+50; break;
            case"English" : priceafterlanguage=BasePrice+100; break;
        }
        System.out.println("Are you an Student?");
        String Student=y.next().toLowerCase();
        double discountamount1=0;
        if(Student=="Yes"){
             discountamount1= priceafterlanguage * 0.2;
        }
        System.out.println("Is there a Festival?");
        String Festival=y.next().toLowerCase();
        double discountamount2=0;
        if(Festival=="Yes"){
             discountamount2= priceafterlanguage * 0.15;
        }
        double Finalprice = priceafterlanguage + discountamount1 + discountamount2;
        System.out.println("Final Price :" +Finalprice);
    }
}
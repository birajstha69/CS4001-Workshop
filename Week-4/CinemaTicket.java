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
        switch(language){
            case"hindi" : BasePrice=BasePrice+50; break;
            case"english" : BasePrice=BasePrice+100; break;
            default: System.out.println("Enter a Language(Hindi/English)");
        }
        System.out.println("Are you an Student?");
        String Student=y.next().toLowerCase();
        double discountamount1=0;
        if(Student.equals("yes")){
             discountamount1= BasePrice * 0.2;
        }
        System.out.println("Is there a Festival?");
        String Festival=y.next().toLowerCase();
        double discountamount2=0;
        if(Festival.equals("yes")){
             discountamount2= BasePrice * 0.15;
        }
        double Finalprice = BasePrice - discountamount1 - discountamount2;
        System.out.println("Final Price :" +Finalprice);
    }
}
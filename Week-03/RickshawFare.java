import java.util.Scanner;
class RickshawFare{
    public static void main(String[] siuuu){
        Scanner pt= new Scanner(System.in);
        System.out.println("Enter Total Distance");
        double dst=pt.nextDouble();
        System.out.println("Enter The Time");
        double Time=pt.nextDouble();
        System.out.println("Is the customer local ? (yes/No)");
        String islocal=pt.next();
        System.out.println("Is the customer Travel for night ? (Yes/No)");
        String isnight=pt.next();
        double basefare=20;
        double perkm=10*dst;
        double perMin=2*Time;
        double fare=basefare+perkm+perMin;
        System.out.println(fare);
        if (islocal.equals("Yes") && dst >10)    //Applying the discount to local
        {  
            basefare -=basefare * 0.2;
        }
        if (isnight.equals("Yes") && dst >10)    //Applying extra charges when it is night
        {
            basefare +=basefare * 0.75;
        }
        System.out.println("Final fare :" +fare); //Final Fare
    }
}
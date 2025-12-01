import java.util.Scanner;
class ClassRoutine{
    public static void main(String[] args){
        Scanner y= new Scanner(System.in);
        System.out.println("Enter the Day");
        String day = y.nextLine().toLowerCase();
        switch(day){
            case "sunday": System.out.println("Lecutre- Hardware and software & Programming") ;break;
            case "monday": System.out.println("Lecutre- Information system & Logic") ;break;
            case "tuesday": System.out.println("Tutorial- Information system & Logic") ;break;
            case "wednesday": System.out.println("Tutorial- Hardware and software & Programming") ;break;
            case "thursday": System.out.println("Workshop- Information system & Logic") ;break;
            case "friday": System.out.println("Workshop- Hardware and software & Programming") ;break;
            case "saturday":System.out.println("Holiday"); break;
            default:System.out.println("Please Enter the Day in the week"); break;
        }
    }
}
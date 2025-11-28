import java.util.Scanner;
class GradeConversion{
    public static void main(String[] args){
        Scanner y=new Scanner (System.in);
        System.out.println("Enter your GPA");
        double gpa= y.nextDouble();
        if (gpa < 0.00 || gpa > 4.00){
            System.out.println("Please enter the valid GPA");
        }else if(gpa >3.6){
            System.out.println("A+");
            System.out.println("Excellent Good Boy");
        }else if(gpa>3.2 && gpa<=3.6){
            System.out.println("A");
            System.out.println("Good Boy but you deserved moreee!!!!!");
        }else if(gpa>2.8 && gpa<=3.2){
            System.out.println("B+");
            System.out.println("Padhne gar vaiiii sakxas unlock your full potential");
        }else if(gpa>2.4 && gpa<=2.8){
            System.out.println("B");
            System.out.println("dimak ta xa ta sanga padeko vaye sakthes");
        }else if(gpa>2.0 && gpa<=2.4){
            System.out.println("C+");
            System.out.println("Work hard in silence");
        }else if(gpa>1.6 && gpa<=2.0){
            System.out.println("C");
            System.out.println("Padh vai padh navaye katta handinxu");
            }else if(gpa>1.2 && gpa<=1.6){
            System.out.println("C");
            System.out.println("Padh vai padh navaye katta handinxu");
        }else {
            System.out.println("Fail");
            System.out.println("na padh aaija dai sanga top bechna aaija");
        }
    }
}
import java.util.Scanner;
class GradeEvaluator{
    public static void main(String[] args){
        Scanner up=new Scanner(System.in); //creating the object of the scanner class
        System.out.println("Enter your Grade");
        float grade= up.nextFloat();
        String Boka=(grade>=40) ? "pass":"Fail";
        System.out.println(Boka);
    
    }
    
}
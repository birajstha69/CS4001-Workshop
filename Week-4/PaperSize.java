import java.util.Scanner;
class PaperSize{
    public static void main (String[] args){
        Scanner y= new Scanner(System.in);
        System.out.println("Enter the paper Type(A0/A1/A2/A4/A5)");
        String paper= y.nextLine();
        switch(paper){
        case "A0" : System.out.println("841 x 1189 mm (33.1 x 46.8 inches)"); break;
        case "A1" : System.out.println("594 x 841 mm (23.4 x 33.1 inches)"); break;
        case "A2" : System.out.println("420 x 594 mm (16.5 x 23.4 inches)"); break;
        case "A3" : System.out.println("297 x 420 mm (11.7 x 16.5 inches)"); break;
        case "A4" : System.out.println("210 x 297 mm (8.3 x 11.7 inches)"); break;
        case "A5" : System.out.println("148 x 210 mm (5.8 x 8.3 inches)"); break;
        default : System.out.println("Invalid paper size Please enter from A0 to A5");
        }   
        
    }
}
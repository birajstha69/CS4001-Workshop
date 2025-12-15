import java.util.Scanner;
public class Districts{
    public static void main(String[] args){
        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
        for(int i = 0; i < districts.length; i++){
            System.out.println(i+1 + ". " + districts[i]);
        }
        Scanner y= new Scanner(System.in);
        System.out.print("Enter a distict to update the array: ");
        String district = y.next();
        districts[0] = district;
        for(int i = 0; i < districts.length; i++){
            System.out.println(i+1 + ". " + districts[i]);
        }
    }
}
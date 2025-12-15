import java.util.Scanner;
class StudentArray{
    public static void main(String[] args){
        String[] names={"Yodin","Divyamani","Ashish","Suraj","Biraj"};
        for(int i=0; i<names.length;i++){
                 System.out.println(names[i]);
        }
        System.out.println("------------");
        System.out.println(names[2]);
        System.out.println("------------");
        names[4]=("BirajStha");
        for(int i=0; i<names.length;i++){
                 System.out.println(names[i]);
        }
        System.out.println("------------");
        Scanner y= new Scanner(System.in);
        System.out.println("Enter the new Name");
        String name=y.next();
        names[0]=name;
        System.out.println("------------");
        for(int i=0; i<names.length;i++){
                 System.out.println(names[i]);
        }
    }
}
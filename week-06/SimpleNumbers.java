import java.util.Scanner;
class SimpleNumbers{
    public static void main(String[] args){
        int[] scores={10,20,30,40,50};
        for (int score :scores){
            System.out.println(score);
        }
        int sum=0;
        for (int i=0;i<scores.length;i++){
            sum += scores[i];
        }
        System.out.println("The Total Sum of the Marks: " +sum);
        int avg= sum/scores.length;
        System.out.println("The Total average of the Marks: " +avg);
        int highest=scores[0];
        for (int i=0;i<scores.length;i++){
            if(scores[i] > highest){
                highest =scores[i];
            }
        }
        System.out.println("The highest number is "+highest);
        int lowest=scores[0];
        for (int i=0;i<scores.length;i++){
            if(scores[i] < lowest){
                highest =scores[i];
            }
        }
        System.out.println("The lowest number is "+lowest);
        
    }
}
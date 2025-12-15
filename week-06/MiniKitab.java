class MiniKitab{
    public static void main(String[] args){
        String[] categories = {"Fiction", "Nepali"};
        String[][] titles = {{"One Piece"},{"Asahamati"}};
        double[][] prices = {{750.201},{600.321}};
        
        double total = 0;
        for(int i = 0; i < categories.length; i++){
            System.out.println("Categories: " + categories[i]);
            
            if (titles[i][0] != null) {
                System.out.println("Title: " + titles[i][0]);
            }
            System.out.printf("Price: %.2f\n" , prices[i][0]);
            
            total += prices[i][0];
        }
        System.out.println("The total value of the books is: " + total);
    }
}
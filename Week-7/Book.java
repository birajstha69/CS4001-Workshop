class Book{
    String title;
    String author;
    String ISBN;
    int publicationyear;
    String genre;
    boolean availabilityStatus;
    public Book(String title,String author,String ISBN,int publicationyear,String genre,boolean availabilityStatus){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.publicationyear=publicationyear;
        this.genre=genre;
        this.availabilityStatus=availabilityStatus;
    }
    void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Publication Year: " + publicationyear);
        System.out.println("Genre: " + genre);
        System.out.println("Available: " + availabilityStatus);
        System.out.println("-------------------------");
    }
    public static void main(String[] args){
        Book b1=new Book("One piece","Eiichiro Oda","978-1-9747-5590-5",1997,"Adventure",true);
        Book b2=new Book("Berserk","Kentaro Miura","658-3-9977-6767-8",1990,"World-Building",true);
        Book b3=new Book("Naruto","Masashi Kishimoto","548-5-6967-5510-4",1999,"Adventure",false);
        System.out.println(b1.title+" | " + b1.author + " | "+ b1.ISBN+ " | "+ b1.publicationyear+ " | "+ b1.genre);
        System.out.println("--------------------------------------------------------------------");
        System.out.println(b2.title+" | " + b2.author + " | "+ b2.ISBN+ " | "+ b2.publicationyear+ " | "+ b2.genre);
        System.out.println("--------------------------------------------------------------------");
        System.out.println(b3.title+" | " + b3.author + " | "+ b3.ISBN+ " | "+ b3.publicationyear+ " | "+ b3.genre);
        System.out.println("--------------------------------------------------------------------");
        Book[] Book={b1,b2,b3};
        {
            System.out.println("Available Books: ");
            for (Book b : Book) {
            if (b.availabilityStatus) {
                b.displayInfo();
                }
            }
            System.out.println("Unvailable Books: ");
        for (Book b : Book) {
            if (!b.availabilityStatus) {
                b.displayInfo();
                }
            }
        }
    }
}
class student{
    String name;
    String studentID;
    int age;
    String course;
    public student(String name,String studentID,int age,String course){
        this.name=name;
        this.course=course;
        this.studentID=studentID;
        this.age=age;
    }
    public static void main(String[] args){
        student s1=new student("Biraj Shrestha","BLS040",17,"Logic");
        student s2=new student("Yodin Raya","YDR040",19,"Programming");
        student s3=new student("Divyamani khawas","DKR040",19,"IS");
        System.out.println(s1.name+" | " + s1.studentID + " | "+ s1.age+ " | "+ s1.course);
        System.out.println("---------------------------------------------");
        System.out.println(s2.name+" | " + s2.studentID + " | "+ s2.age+ " | "+ s2.course);
        System.out.println("---------------------------------------------");
        System.out.println(s3.name+" | " + s3.studentID + " | "+ s3.age+ " | "+ s3.course);
    }
}
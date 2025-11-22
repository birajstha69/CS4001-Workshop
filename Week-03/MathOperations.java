class MathOperations{
    public static void main(String[] siuuuuu){
        // Arithmetic
        int a = 40;
        int b = 30;
        int sum=a+b;
        int subtraction=a-b;
        int multiplication=a*b;
        int Division=a/b;
        int modulus=a%b;
        System.out.println("The sum of the given number is:" +sum);
        System.out.println("The subtraction of the given number is:" +subtraction);
        System.out.println("The multiplication of the given number is:" +multiplication);
        System.out.println("The Division of the given number is:" +Division);
        System.out.println("The modulus of the given number is:" +modulus);
        // Relational
        System.out.println("a == b: " + (a == b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));

        // Logical
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment
        int c = 20;
        c += 5;
        System.out.println("c += 5: " + c);

        // Ternary
        int num = 7;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is: " + result);
    }
}
class product_fact {
    public static void main(String[] args) {
        int i;
        int product = 1;
        int number = 5; // It is the number to calculate factorial
        for (i = 1; i <= number; i++) {
            product = product * i;
        }
        System.out.println("Factorial of " + number + " is: " + product);
    }
    
}

class GreatestAmongThree{
    public static void main(String[] args) {
        int a = 25;
        int b = 50;
        int c = 75;
        int greatest;
  if (a >= b && a >= c) {
            greatest = a;
        } else if (b >= a && b >= c) {
            greatest = b;
        } else {
            greatest = c;
        }
   System.out.println("The greatest number is: " + greatest);
    }
}
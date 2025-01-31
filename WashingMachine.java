import java.util.Scanner;
 class WashingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        char waterLevel = sc.next().charAt(0);
        sc.close();
        if (weight < 0) {
            System.out.println("INVALID INPUT");
        } else if (weight == 0) {
            System.out.println("Time Estimated: 0 minutes");
        } else if (weight > 7000) {
            System.out.println("OVERLOADED");
        } else {
            int time = 0;
            switch (waterLevel) {
                case 'L':
                    if (weight > 0 && weight <= 2000) {
                        time = 25;
                    }
                    break;
                case 'M':
                    if (weight > 2000 && weight <= 4000) {
                        time = 35;
                    }
                    break;
                case 'H':
                    if (weight > 4000 && weight <= 7000) {
                        time = 45;
                    }
                    break;
                default:
                    System.out.println("INVALID INPUT");
                    return;
            }
            
            if (time > 0) {
                System.out.println("Time Estimated: " + time + " minutes");
            } else {
                System.out.println("INVALID INPUT");
            }
        }
    }
}

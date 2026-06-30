public class PairSumBruteForce {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
 
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers, one at a time:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }
 
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
 
        boolean found = false;
 
        for (int i = 0; i < size && !found; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("\n--- Match Found! ---");
                    System.out.println("Index " + i + " -> Value " + numbers[i]);
                    System.out.println("Index " + j + " -> Value " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + target);
                    found = true;
                    break;
                }
            }
        }
 
        if (!found) {
            System.out.println("\nNo two numbers in the array add up to " + target + ". Sorry, no match this time!");
        }
 
        scanner.close();
    }
}
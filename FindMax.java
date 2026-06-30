public class FindMaxValue {
 
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
 
        int maxValue = numbers[0];
        int maxIndex = 0;
 
        for (int i = 1; i < size; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }
 
        System.out.println("\n--- Results ---");
        System.out.println("Array contents: " + arrayToString(numbers));
        System.out.println("Maximum value : " + maxValue);
        System.out.println("Found at index: " + maxIndex);
 
        scanner.close();
    }
 
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
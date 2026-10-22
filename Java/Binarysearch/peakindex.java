public class peakindex {
    public static void main(String[] args) {

        int n[] = {5, 10, 15, 20, 25, 30, 28, 24, 18, 12, 6};

        int low = 0, high = n.length - 1;
        int mid = -1;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (mid > 0 && mid < n.length - 1 &&
                n[mid] > n[mid - 1] && n[mid] > n[mid + 1]) {
                break;
            }
            else if (mid > 0 && n[mid] < n[mid - 1]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        System.out.println("Peak index = " + mid);
        System.out.println("Peak value = " + n[mid]);
    }
}
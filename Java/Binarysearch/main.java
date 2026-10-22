public class main {
    public static void main(String[] args) {

        int n[] = {1,1,2,2,2,2,2,3,3,3,3,4,4,4,5,5,5,6,6,6,6,7,7,7,7,8,8,8,9,9,9,10,10,10,10,11,12};

        int low = 0, high = n.length - 1, ind = -1;
        int tar = 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (n[mid] > tar)
                high = mid - 1;
            else if (n[mid] < tar)
                low = mid + 1;
            else {
                ind = mid;
                break;
                // low=mid+1; for last occurence
            }
        }

        System.out.println("The index of the target value is " + ind);
    }
}
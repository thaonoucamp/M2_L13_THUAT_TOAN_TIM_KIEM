public class BinaryLoop {
    static int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

    public static int binaryLoop(int[] list, int number) {
        int left = 0;
        int high = list.length - 1;
        while (high >= left) {
            int mid = (left + high) / 2;
            if (list[mid] == number) {
                return mid;
            }else if (list[mid] > number) {
                high = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int find = binaryLoop(numbers, 1);
        System.out.println(find);
    }
}

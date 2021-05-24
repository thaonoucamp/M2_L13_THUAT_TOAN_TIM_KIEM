public class BinaryRecursive {
    static int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15, 17};

    public static int findRecursive(int[] list, int left, int right, int number) {
//        left = 0;
//        right = list.length - 1;
        int mid = (left + right) / 2;
        if (list[mid] == number) {
            return mid;
        }else if (left == right) {
            return -1;
        }  else if (list[mid] > number) {
            return findRecursive(list, left, mid - 1, number);
        } else{
            return findRecursive(list, mid + 1, right, number);
        }
    }

    public static void main(String[] args) {
        int result = findRecursive(numbers, 0, numbers.length - 1, 1117);
        System.out.println(result);
    }
}

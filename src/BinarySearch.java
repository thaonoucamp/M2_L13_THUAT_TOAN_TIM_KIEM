public class BinarySearch {
    // tim kiem gia tri trong mang theo thu tu tang dan;
    static int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    // cai dat phuong thuc;
    static int binarySearch(int[] list, int key) {

        int low = 0;
        int hight = list.length - 1;

        while (hight >= low) {
            int mid = (low + hight) / 2;
            if (key < list[mid]) {
                hight = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else low = mid + 1;
        }
        return -1;
    }

    public static int binaryRecursive(int[] list, int low, int high, int key) {
        if (low >= high) {
            int mid = low + (high - low) / 2;
            if (list[mid] == key)
                return mid;
            if (list[mid] > key)
                return binaryRecursive(list, low, high - 1, key);
            return binaryRecursive(list, low, high + 1, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binaryRecursive(list, list.length - 1, 0, 5));
//        System.out.println(binarySearch(list, 5));
//        System.out.println(binarySearch(list, 11));
//        System.out.println(binarySearch(list, 79));
//        System.out.println(binarySearch(list, 1));
//        System.out.println(binarySearch(list, 5));
//        System.out.println(binarySearch(list, 80));

    }
}
// tim kiem phan tu cu the;
// 1- so sanh tai phan tu giua nhat;
// 2- neu item can tim lon hon thi nam ben phai;
// 3- neu nho hon thi nam ben trai;
// 4- ko tim thay return -1;

package zuoShen.zuoShen01;

public class class00_twoDepart {

    public static int two_Depart_Recurision(int[] arr, int target, int min, int max) {
        int mid = (max - min) / 2 + min;
        if (arr[mid] == target) {
            System.out.println("Finded!  " + arr[mid]);
            return arr[mid];
        }
        if (min >= max) {
            return -1;
        } else if (target > arr[mid]) {
            return two_Depart_Recurision(arr, target, mid - 1, max);
        } else if (target < arr[mid]) {
            return two_Depart_Recurision(arr, target, min,  mid - 1);
        }
        return -1;
    }

    public static int two_Depart_noRecurision(int[] arr, int target) {
        int mid;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                System.out.println("oh, Finded!  " + arr[mid]);
                return arr[mid];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {11, 13, 25, 36, 71, 94, 131};
        int target = 131;


        //two_Depart_Recurision(arr, target, 0, arr.length - 1);
        two_Depart_noRecurision(arr, target);
    }
}

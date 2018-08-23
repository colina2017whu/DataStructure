package zuoShen.zuoShen01;


/**
 *
 * 递归方式判断一个数组中的最大
 */
public class class04_recursion {

    public static void main(String[] args) {

        int[] arr = {9, 18, 100,13};
        System.out.println(getMax(arr, 0, arr.length - 1));
    }

    public static int getMax(int[] arr, int L, int R) {
        if(L == R) {
            return arr[L];
        }

        int mid = (L + R) / 2;
        int maxLeft = getMax(arr, L , mid);
        int maxRight = getMax(arr, mid + 1, R);

        return Math.max(maxLeft,maxRight);
    }


}

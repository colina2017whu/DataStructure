package SwordToOffer;

/**
 * 
 * 把一个数组最开始的若干个元素搬到数组的末尾，
 * 我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，
 * 输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，
 * 该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @author Mr.X
 * 
 * 
 * 思路：从头到尾两两相邻元素进行比较进行，如果前面一个元素大于后面一个元素，
 * 
 * 则返回后面一个元素。如果从头到尾都没有满足条件的元素，则返回第一个元素。
 *
 */

public class colina006 {
	public int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }
        for(int i=0;i<array.length-1;i++){
            if(array[i] > array[i+1]){
                return array[i+1];
            }
        }
        return array[0];
    }



}

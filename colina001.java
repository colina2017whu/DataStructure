package SwordToOffer;
/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 
 * @author Mr.X
 *
 */


public class colina001 {

	public static boolean Find(int target, int [][] array) {
        boolean Find = false;
        for(int i = 0; i < array.length; i++ ) {
            for(int j = 0; j < array[i].length; j++) {
                if(array[i][j] == target){
                    Find = true;
                    break;
                }
            }
        }
        
        return Find;
    }
	
	public static void main(String args[]) {
		int a = 5;
		int [][] array = {{1,2,3},{2,3,4},{3,4,5}
		};
		
		System.out.println(Find(a, array));
	}
}

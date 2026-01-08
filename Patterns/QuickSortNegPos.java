package Patterns;

public class QuickSortNegPos {
    public static void SortNegPos(int[] arr){

        int left =0, right = arr.length-1;

        while(left <= right){
            if(arr[left] <0){
                left++;
            } else if (arr[right] >=0) {
                right--;
            }else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {-1,-2,4,5,-6,4,-8};
        SortNegPos(arr);
        for( int num : arr){
            System.out.print(num + " ,");
        }
    }
}

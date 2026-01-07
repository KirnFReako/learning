package ArrayProblems;

public class RevereArray {
  static void reverse(int[] arr){
      int left = 0, right = arr.length-1;

      while(left <right){
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;

          left++;
          ;right--;
      }
  }

    public static void main(String[] args) {
        int[] arr = {1,5,3,7,4,8,2};
        reverse(arr);

        for( int i =0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

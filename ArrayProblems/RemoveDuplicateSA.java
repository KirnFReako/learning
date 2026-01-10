package ArrayProblems;
// no of unique number
public class RemoveDuplicateSA {
    public static int removeDup(int[] arr){
        int j =1;
        int n = arr.length;

        for( int  i=0;i<n;i++){
            if(arr[i] != arr[j]){
                arr[j] =arr[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3};

        System.out.println(removeDup(arr));
    }
}

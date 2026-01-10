package ArrayProblems;
// use Slow and fast pointer
public class FindDuplicaNumber {
    public static int DuplNumber(int[] arr){

        int slow = arr[0];
        int fast = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while (slow != fast);

       arr[slow] = arr[0];

       if(slow != fast){
           slow = arr[slow];
           fast = arr[fast];
       }
       return fast;

    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};

        System.out.println(DuplNumber(arr));
    }
}

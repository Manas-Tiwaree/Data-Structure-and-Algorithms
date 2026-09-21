public class BinarySearchs{
   
    
    public static int search( int[] arr, int target, int high, int low){
        if(high < low){
            return -1;}

            int mid = low + ((high -low)/2);
            if(arr[mid] == target){
                return mid;
            }
            if( mid < high){
                return search(arr, target, high, mid - 1);
            }else{
                return search(arr, target, low, mid + 1);
            }
        }
     
        
    }

//Minimum and Maximum elements Using Recursion
import java.util.Arrays;


public class MaxNum {
    
 public static void main(String[] args){
  int[] arr ={1,2,4,78,69,3};
  returnMax(arr);
 }  
 public static void returnMax(int[] arr){
    if(arr == null || arr.length == 0){
        return;
    }

     int max = arr[0];
    for(int i = 1; i< arr.length;i++){
        if(arr[i] > max ){
         max = arr[i] ;
        
    }
  }
    System.out.println("Maximum number is " + max);
  
}
}


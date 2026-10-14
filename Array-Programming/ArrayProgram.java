import java.util.*;
public class ArrayProgram {
    public static void main(String[] args) {
        // for user 
        Scanner sc = new Scanner(System.in); 
        // for array size
        System.out.println("Enter the array Size ");
        // store 
        int n = sc.nextInt(); 
        // array declaration 
        int arr[] = new int[n]; 
        //array element by user
        System.out.println("Enter the array element");
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
System.out.println("Original Array ");
for(int i = 0 ; i < arr.length ; i++){
    System.out.println(arr[i]);
    
}
    }
}

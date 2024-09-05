import java.util.*;
class LinearSearch{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array - ");
        int length = scn.nextInt();
        int[] arr = new int[length];

        for(int i=0;i<length;i++){
            System.out.println("Enter element "+ (i+1));
            arr[i]=scn.nextInt();
        }

        System.out.println("Enter the key - ");
        int key = scn.nextInt();

        int keyIndex = -1;
        for(int i=0;i<length;i++){
            if(arr[i]==key){
                keyIndex=i;
                break;
            }
        }

        if(keyIndex==-1){
            System.out.println("Key not found in the array.");
        }
        else{
            System.out.println("Key found at position "+(keyIndex+1));
        }
    }
}
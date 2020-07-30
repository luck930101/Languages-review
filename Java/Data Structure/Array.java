import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declares an array of integers
        int[] intArray1;

        // allocates memory for 10 integers
        intArray1 = new int[10];
           
        // initialize first element
        intArray1[0] = 100;
        // initialize second element
        intArray1[1] = 200;
        // and so forth
        intArray1[2] = 300;
        intArray1[3] = 400;


        System.out.println("Element at index 0: "
                           + intArray1[0]);
        System.out.println("Element at index 1: "
                           + intArray1[1]);
        System.out.println("Element at index 2: "
                           + intArray1[2]);
        System.out.println("Element at index 3: "
                           + intArray1[3]);
        
        System.out.println("******************************");
        int[] intArray2 = {11,12,13,14,15};
        System.out.println("Address of intArray2: " + intArray2);
        
        System.out.println("Size of intArray2: " + intArray2.length);
        System.out.println("Way 1 to Print intArray2: " + Arrays.toString(intArray2));
        //import java.util.Arrays;
        System.out.print("Way 2 to Print intArray2: ");
        for (int i =0; i<intArray2.length;i++){
        	System.out.print(" "+i);
        }
        
        
        
        

	}

}

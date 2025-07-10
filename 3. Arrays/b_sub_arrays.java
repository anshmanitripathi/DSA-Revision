public class b_sub_arrays {

    // Sub Arrays of the arrays
    public static void SubArrays(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length ; j++){
                System.out.print("(");
                for(int k=i; k<=j; k++){
                    System.out.print(" " + arr[k] +  " ");
                }
                System.out.println(")");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10,11};
        SubArrays(arr);
    }
}

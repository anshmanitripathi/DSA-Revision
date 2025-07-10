public class a_binary_search {

    public static int BinarySearch(int[] arr, int item){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid] == item){
                return mid;
            }else if(item > arr[mid]){
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        int key = 7;
        if(BinarySearch(arr, key) == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found at index " + BinarySearch(arr, key));
        }
    }
}
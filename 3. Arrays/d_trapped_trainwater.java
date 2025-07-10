public class d_trapped_trainwater {
    public static int trappedrainwater(int[] heights){

        int n = heights.length;

        // Leftmax heights
        int[] leftmax = new int[n];
        leftmax[0] = heights[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(heights[i], leftmax[i-1]);
        }

        // Rightmax heights
        int[] rightmax = new int[n];
        rightmax[n-1] = heights[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(heights[i], rightmax[i+1]);
        }

        // calculating water
        int water = 0;
        for(int i=0; i<n;i++){
            int h = Math.min(leftmax[i], rightmax[i]);
            water = water + (h - heights[i]);
        }

        return water;
        
    }
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        System.out.println(trappedrainwater(height));
    }
}

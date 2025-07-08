public class TrappingRainWater {
    public static void main(String[] args) {
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(heights));
    }
    public static int trap(int[] heights) {
        if(heights.length == 0) {
            return 0;
        }
        int left=0;
        int right=heights.length-1;
        int leftMax=heights[left];
        int rightMax=heights[right];
        int water =0;

        while(left<right) {
            if(leftMax < rightMax) {
                left++;
                leftMax= Math.max(leftMax, heights[left]);
                water+=leftMax-heights[left];
            }
            else {
                right--;
                rightMax= Math.max(rightMax, heights[right]);
                water+=rightMax-heights[right];
            }
        }

        return water;
    }
}

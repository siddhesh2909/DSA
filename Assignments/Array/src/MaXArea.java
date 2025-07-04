public class MaXArea {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int s=0;
        int e=height.length-1;
        int max=0;
        while(s<e)
        {
            int curr=0;
            if(height[s]<height[e])
            {
                curr=height[s]* (e-s);
                s++;
            }
            else {
                    curr=height[e]* (e-s);
                    e--;
            }
            if(curr>max)
            {
                max=curr;
            }
        }
        System.out.println(max);
    }
}

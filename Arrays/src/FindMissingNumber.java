public class FindMissingNumber {
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4,5,6,8};

        int xor1=0;
        int xor2=0;

        for(int i=0; i<nums.length;i++)
        {
            xor1^=nums[i];
        }

        for (int i = 1; i <= nums.length+1 ; i++) {
                xor2^=i;
        }

        System.out.println(xor1^xor2);
    }
}

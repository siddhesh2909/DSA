public class FindNumberWithEvenOnOFDigits1295 {
    public static void main(String[] args) {
        int[] nums= {12,345,2,6,7896};
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(isEven(nums[i]))
            {
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean isEven(int num)
    {

        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count%2==0;
    }
}

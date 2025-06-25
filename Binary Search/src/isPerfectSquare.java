public class isPerfectSquare {
    public static void main(String[] args) {
        int num = 4;
        int start=1;
        int end=num/2;

        while(start<=end){
            int mid=start+(end-start)/2;

            long sqaure = mid*mid;
            System.out.println(sqaure+"= "+num);
            if(num==sqaure)
            {
                System.out.println(mid+"="+sqaure);
                System.out.println(true);
                return;
            } else if (num<sqaure) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        System.out.println(false);
    }
}

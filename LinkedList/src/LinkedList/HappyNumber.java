package LinkedList;

public class HappyNumber {
    public static int findSquare(int num)
    {
        int ans=0;
        while(num > 0)
        {
           int rem = num %10;
           ans+=rem*rem;
           num=num/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=19;

        int slow=n;
        int fast=n;
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(fast!=slow);

        if(slow== 1)
        {
            System.out.println(true);

        }
        System.out.println(false);

    }
}

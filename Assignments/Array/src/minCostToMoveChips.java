public class minCostToMoveChips {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        int even=0;
        int odd=0;
        for(int i : position){
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(Math.min(even,odd));
    }
}

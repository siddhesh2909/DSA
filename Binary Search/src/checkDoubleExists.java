public class checkDoubleExists {
    public static void main(String[] args) {
        int[] arr={0,-2,2};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==2 * arr[j]){
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);

    }
}

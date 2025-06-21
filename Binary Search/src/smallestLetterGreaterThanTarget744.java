public class smallestLetterGreaterThanTarget744 {
    public static void main(String[] args) {
        char[] letters = {'x','x','y','y'};
        int start = 0;
        int end=letters.length-1;
        int target='z';
        while(start<=end){
            int mid = (start+end)/2;
            if(letters[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println(letters[start % letters.length]);
    }
}

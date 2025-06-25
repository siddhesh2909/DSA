public class nextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'x','x','y','y'};
        char target = 'z';
        int start=0;
        int end=letters.length-1;
        while (start<=end){
            int mid =start+ (end-start)/2;
            if(letters[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        System.out.println(letters[start%letters.length]);

    }
}

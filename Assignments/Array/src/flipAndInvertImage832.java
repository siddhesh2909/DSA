import java.util.Arrays;

public class flipAndInvertImage832 {
    public static void main(String[] args) {
        int[][] image ={{1,1,0},{1,0,1},{0,0,0}};
        int[][] flip = flip(image);
        int[][] res = reverse(flip);
        for(int i=0;i<flip.length;i++){
            System.out.println(Arrays.toString(res[i]));
        }

    }

    public static int[][] flip(int[][] img) {
        int[][] result = new int[img.length][img[0].length];

        for (int i = 0; i < img.length; i++) {
            int index = 0;
            for (int j = img[i].length - 1; j >= 0; j--) {
                result[i][index] = img[i][j];
                index++;
            }
        }
        return result;
    }
    public static int[][] reverse(int[][] img) {
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                if(img[i][j]==0){
                    img[i][j]= 1;
                }
                else {
                    img[i][j] = 0;
                }
            }
        }
        return  img;
    }
}

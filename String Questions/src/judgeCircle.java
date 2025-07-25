public class judgeCircle {
    public static void main(String[] args) {
        String moves="LDRRLRUULR";
        int x=0;
        int y=0;
        for(char move : moves.toCharArray()){
            switch (move){
                case 'U':
                    x++;
                    break;
                case 'D':
                    x--;
                    break;
                case 'R':
                    y++;
                    break;
                case 'L':
                    y--;
                    break;
            }
        }
        System.out.println(x == 0 && y == 0);
    }
}

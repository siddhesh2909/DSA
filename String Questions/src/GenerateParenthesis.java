import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n=3;
        List<String> list=new ArrayList<>();
        parethesis(0,0,"",n,list);
        System.out.println(list);
    }
    public static void parethesis(int open,int close,String p,int n,List<String> list){
        if(open==close && open + close == 2*n){
                list.add(p);
                return;
        }
        if(open<n)
        {
            parethesis(open+1,close,p+'(',n,list);
        }
        if(close< open)
            {
            parethesis(open,close+1,p+')',n,list);
            }

    }
}

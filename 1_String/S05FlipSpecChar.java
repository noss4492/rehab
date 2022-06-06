import java.util.ArrayList;
import java.util.Scanner;

public class S05FlipSpecChar {
    // my, wrong answer
    // i misunderstood problem def
    public String solutionX(String s){
        String answer = new String();
        char[] tmpChArr = s.toCharArray();
        int lt = 0;
        int rt = tmpChArr.length-1;

        while(lt < rt){
            if(Character.isAlphabetic(tmpChArr[lt]) && Character.isAlphabetic(tmpChArr[rt])){
                char a = tmpChArr[lt];
                tmpChArr[lt]=tmpChArr[rt];
                tmpChArr[rt]=a;
            }
            lt++;
            rt--;
        }
        answer = String.valueOf(tmpChArr);

        return answer;
    }

    // my2, correct answer
    // Ignore the special characters and just flip the alphabet column
    public String solution(String s){
        String answer = new String();
        char[] chArr = s.toCharArray();
        int lt = 0;
        int rt = chArr.length-1;

        while (lt < rt) {
            if (!Character.isAlphabetic(chArr[lt]))
                lt++;
            else if (!Character.isAlphabetic(chArr[rt]))
                rt--;
            else{
                char tmp = chArr[lt];
                chArr[lt] = chArr[rt];
                chArr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(chArr);
        return answer;
    }

    public static void main(String[] args) {
        S05FlipSpecChar T = new S05FlipSpecChar();
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.print(T.solution(str));
    }
}

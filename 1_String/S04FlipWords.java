import java.util.ArrayList;
import java.util.Scanner;

public class S04FlipWords {
    // my solution 1
    public ArrayList<StringBuilder> solution(int n, String[] words) {
        
        ArrayList<StringBuilder> answer = new ArrayList<StringBuilder>();
        answer.clear();

        for(int i = 0 ; i < n ; i ++){
            answer.add(i, new StringBuilder().append(words[i]).reverse());
        }

        return answer;
    }

    // other style 1 (use reverse method)
    public ArrayList<String> solution2(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);    
        }
        return answer;
    }

    // my solution 2, other style 2 (make reverse function)
    public ArrayList<String> solution3(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            char[] tmpCharArr = x.toCharArray();
            int left = 0; 
            int right = tmpCharArr.length-1;

            // reverse function
            while(left < right){
                char tmpChar = tmpCharArr[left];
                tmpCharArr[left] = tmpCharArr[right];
                tmpCharArr[right] = tmpChar;
                left++; 
                right--;
            }
            String tmp = String.valueOf(tmpCharArr);
            System.out.println("tmp : "+tmp);
            answer.add(tmp);
        }
        return answer;
    }
    
    public static void main(String[] args) { 
        S04FlipWords T = new S04FlipWords();
        Scanner sc = new Scanner(System.in);
        int linesNum = sc.nextInt();    // 3 ~ 20    
        String[] words = new String[linesNum];

        for(int i = 0; i < linesNum; i++){
            words[i]=sc.next();
        }

        // for(StringBuilder x : T.solution(linesNum, words)){
        //     System.out.println(x);
        // }
        for(String x : T.solution3(linesNum, words)){
            System.out.println(x);
        }
    }
}

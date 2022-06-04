import java.util.Scanner;

public class S03FindLongestInSentence {
    // my style
    public String mySolution(String str) {
        String word[] = str.split(" ");
        int max = 0;
        String longestword = new String();
        
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > max) {
                max = word[i].length();
                longestword = word[i];
            }
        }
        return longestword;
    }


    public String solution1(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s){
            int len = x.length();
            if(len>m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }

    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' ')) != -1){ //띄어쓰기 위치 확인
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
        }
        if(str.length()>m) answer=str;
        return answer;
    }

    public static void main(String[] args) {
        S03FindLongestInSentence T = new S03FindLongestInSentence();
        // 입력은 CSLF없이 한줄로 들어온다고 가정하고 하는 듯, 영어로만 구성됨
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.print(T.solution(sentence));
    }
}

import java.util.Scanner;

public class S02CaseConversion {
    // by noss
    public String Mysolution(String str){
        StringBuilder sb = new StringBuilder();
        for(char x : str.toCharArray()){
            x = (x > 'Z') ? (char)((byte)x&0x5f) : (char)((byte)x|0x20);
            sb.append(x);
        }
        return sb.toString();
    }

    // 강사님st, ok 근데 이러면 gc에 부담가지 않나?
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        S02CaseConversion T = new S02CaseConversion();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();     
        System.out.print(T.solution(str));
    }
}

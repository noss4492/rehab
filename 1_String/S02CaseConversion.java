import java.util.Scanner;

public class S02CaseConversion {
    public String solution(String str){
        StringBuilder sb = new StringBuilder();
        for(char x : str.toCharArray()){
            x = (x > 'Z') ? (char)((byte)x&0x5f) : (char)((byte)x|0x20);
            sb.append(x);
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        S02CaseConversion T = new S02CaseConversion();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();     
        System.out.print(T.solution(str));
    }
}

import java.io.IOException;
import java.util.Scanner;


public class _01_FindText{

    // by noss
    public int solution(String str, char ch) {
        int cnt = 0;
        
        for(char x : str.toCharArray()){
            System.out.println("x = "+x);
            if(ch==x){
                cnt++;
            }
            System.out.println("cnt = "+cnt);
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        _01_FindText T = new _01_FindText();

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next().toLowerCase();
        char ch1 = (char)System.in.read();
        // 영문자 입력
        // char ch1 = sc.next().charAt(0);
        // ch1 = Character.toUpperCase(ch1);
        // 대문자-소문자 비트연산으로 변환,  toUpper: &0x5f, toLower: |0x20
        // ch1 = ch1 < 'a' ? (char)((byte)ch1+('a'-'A')) : ch1 ; 
        // ch1 = (ch1 > 'Z') ? ch1 : (char)((byte)ch1|0x20); 

        ch1 = ch1 > 'Z' ? ch1 : (char)(ch1+32);
        
        System.out.println("str1 : "+str1);
        System.out.println("ch1 : "+ch1);
        

        int ans = T.solution(str1, ch1);
        System.out.println("ans : "+ans); 

        sc.close();
    }
}
import java.io.CharArrayReader;
import java.io.IOException;
import java.util.Scanner;


public class _01_FindText{
    // by noss
    public int mySolution(String str, char ch) {
        int cnt = 0;
        for(char x : str.toCharArray()){
            if(ch==x){
                cnt++;
            }
        }
        return cnt;
    }


    // modified
    public int solution(String str, char ch){
        int cnt = 0;
        str = str.toUpperCase();
        ch = Character.toUpperCase(ch);

        for(char x : str.toCharArray()){
            if(x==ch) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        _01_FindText T = new _01_FindText();
        /*
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next().toLowerCase();
        char ch1 = (char)System.in.read();
        ch1 = (ch1 > 'Z') ? ch1 : (char)((byte)ch1|0x20);
        System.out.print(T.solution(str1, ch1));
        */
        // 영문자 입력
        // char ch1 = sc.next().charAt(0);
        // ch1 = Character.toUpperCase(ch1);
        // 대문자-소문자 비트연산으로 변환,  toUpper: &0x5f, toLower: |0x20
        // ch1 = ch1 < 'a' ? (char)((byte)ch1+('a'-'A')) : ch1 ; 
        // ch1 = (ch1 > 'Z') ? ch1 : (char)((byte)ch1|0x20); 

        
        // 강사분이 제공하는 방향으로 수정
        Scanner sc = new Scanner(System.in);
        String str2 = sc.next();
        char ch2 = sc.next().charAt(0);

        System.out.print(T.solution(str2, ch2));
        //sc.close();
    }
}
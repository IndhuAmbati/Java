import java.util.*;
import java.lang.*;
class Pangram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int alphabets[] = new int[26];
        for(int i=0;i<26;i++){
            alphabets[i]=0;
        }
        String s2=s1.toLowerCase().replace(" ","");int count=0;
        for(int i=0;i<s2.length();i++){
            int a = s2.charAt(i);
            if((a<97)&&(a>(97+26))){
                count++;
            }
            alphabets[a-97]=alphabets[a-97]+1;
        }
        for(int i=0;i<26;i++){
            if(alphabets[i]==0){
                System.out.println("Not a pangram");
                System.exit(0);
            }
        }
        System.out.println("It is a pangram");
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String text;
        int temp=0;
        char[] charArray;
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            text=sc.nextLine();
            charArray=text.toCharArray();
            for (char c : charArray) {
                if (c == '0' && temp == 1) {
                    System.out.println(text);
                    break;
                }
                else if (c >= '\u0031' && c <= '\u0039') {
                    temp++;
                    if(temp==2){
                        System.out.println(text);
                        break;
                    }
                }
                else temp=0;
            }
            temp=0;
        }
    }
}
//プログラミング演習Ⅱ　2017/11/14　BP16090 村松大輝

/**
 *@author BP16090 村松大輝
 */
import java.util.Scanner;
import java.io.*;

/**
 *キーボードからディレクトリ名とファイル名を入力して　Filelistクラスに渡す
 *
 */
public class Main{
    
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
        System.out.println("スタックマシンの命令列を読み取ります。");
        System.out.println("1: csvファイルから読み取り");
        System.out.println("2: キーボードから読み取り");
        System.out.println("上の二つから選んでください→ (1 or 2)");
        
        int select = scanner.nextInt();
        if(select == 1){
        System.out.println("csvファイルを指定してください(拡張子はcsvで指定済)→");
        String fileName = scanner.next();
        fileName = fileName + ".csv";
        
          
        File file = new File(fileName);
        Reader fileRead = new Reader(file);
        fileRead.readFile();
        
        }
        
        else if(select == 2){
            System.out.println("後置記法の式を入力してください");
            try{
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String postfixNotation = br.readLine();
            Reader formulaRead = new Reader(postfixNotation);
            formulaRead.readPostfixNotation();
            }
            catch(IOException e){
                System.out.println(e);
            }
            System.out.println("停止します");
        }
}
}

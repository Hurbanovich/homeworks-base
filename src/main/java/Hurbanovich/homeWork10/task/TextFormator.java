package homeWork10.task;

import java.util.ArrayList;
import java.util.List;


public class TextFormator {
    public static int theWordCounter(String string){
        return string.replace('-',' '). replace('"',' ').split(" +").length;
    }
    public static boolean checkPolendromInString(String string){
        boolean check = false;
        int a = 0;
        String delimeter = " +";
        String[] singleWords;
        singleWords = string.split(delimeter);
        for (String singleWord : singleWords) {
            String string_1 = singleWord.toUpperCase();
            StringBuilder string_2 = new StringBuilder(string_1).reverse();
            if (a == 0) {
                for (int j = 0; j < string_2.length(); j++) {
                if (string_2.length()>2 && string_1.charAt(j) == string_2.charAt(j)) {
                    a++;
                }else {
                    a=0;
                    break;
                } }
            }else {
                check=true;
                break;
            }
        }
        return check;
    }
    public static boolean checkPolendrom(String word) {
        boolean check = true;
        String string_1 = word.toUpperCase();
        StringBuilder string_2 = new StringBuilder(string_1).reverse();
        for (int i = 0; i < string_2.length(); i++) {
            if (string_1.charAt(i) != string_2.charAt(i)) {
                check=false;
                break;}
        }return check;
    }
    public static String Censorship(String sourceText,String listBlack){
        List<String> violation = new ArrayList<>();
        String resul =" ";
        String result;
        String[] allocatedText=sourceText.split("[.!?]");
        String[] blackList=listBlack.split(",");
        for (String s : allocatedText) {
            for (String value : blackList) {
                if (s.contains(value)) {
                    violation.add(s);
                    break;
                }

            }

        }if (violation.size()==0){
           return "Tекст прошол проверку на цунзуру";
        }
        for (String s : violation) {
            String d = String.join(" ", s);
            resul = resul.concat(d+".\n");
        }
        result="Врезультати проверки отмечено "+violation.size()+" нарушения цензуры, в следующих предложениях:\n";
        result=result.concat(resul);

        return result;
    }

}

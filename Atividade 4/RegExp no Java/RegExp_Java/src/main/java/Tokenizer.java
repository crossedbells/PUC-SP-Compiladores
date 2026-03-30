import java.util.*;
import java.util.regex.*;

public class Tokenizer {
    public static List<String[]> tokenize(String codigo, String regexp){
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(codigo);

        List<String[]> listaTokens = new ArrayList<>();

        while(matcher.find()){
            if(matcher.group("ID") != null){
                listaTokens.add(new String[]{"ID", matcher.group("ID")});
            }else if(matcher.group("NUM") != null){
                listaTokens.add(new String[]{"NUM", matcher.group("NUM")});
            }else if(matcher.group("OP") != null){
                listaTokens.add(new String[]{"OP", matcher.group("OP")});
            }
        }
        return listaTokens;
    }
}

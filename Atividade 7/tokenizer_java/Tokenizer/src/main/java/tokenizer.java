import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tokenizer {
    //definição do metodo tokenize
    //faz a tokenização da String
    public List<String> tokenize(String texto){

        List<String> tokens = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\p{L}+|\\d+|[.,!?;:]");
        Matcher matcher = pattern.matcher(texto);

        while(matcher.find()){
            tokens.add(matcher.group());
        }

        return tokens;
    }
    //Metodo formataTokens
    //este metodo formata a string de tokens para que ela apareça corretamente para o usuário
    public String formataTokens(List<String> tokenArray){
        String tokens = tokenArray.stream()
                .map(t -> "\"" + t + "\"")
                .reduce((a, b) -> a + ", " + b)
                .orElse("");
        System.out.println("[" + tokens + "]");

        return tokens;
    }
}

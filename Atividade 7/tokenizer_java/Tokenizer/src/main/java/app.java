import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
public class app {

    public static void main(String[] args){
        //teste para descobrir se o arquivo foi recebido
        if(args.length == 0){
            System.out.println("Forneça o arquivo .txt");
            return;
        }
        String texto = convertFileToString(args[0]); //conversão do arquivo .txt para String
        tokenizer tokenizer = new tokenizer();
        List<String> vetorTokens = tokenizer.tokenize(texto); //tokenização do texto

        String TokensF = tokenizer.formataTokens(vetorTokens); //formatação da String de Tokens para a saída


        System.out.println(TokensF); //Print da String de Tokens
    }

    //definição do metodo covertFileToString
    //o metodo covertFileToString converte o arquivo .txt recebido para uma String
    public static String convertFileToString(String filePath){

        StringBuilder sb = new StringBuilder();
        //leitura do arquivo
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(" ");
            }
        } catch (IOException e) {
            //mensagem de erro caso o programa não consiga ler o arquivo
            System.out.println("Não foi possível ler o arquivo" + filePath);
        }
        return sb.toString();
    }
}
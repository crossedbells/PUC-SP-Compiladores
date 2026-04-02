# Entrega Final do - Compiladores (PUC-SP)

- **Faculdade:** PUC-SP
- **Curso:** Ciência da Computação
- **Disciplina:** Compiladores
- **Equipe:** Gabriel Mechi Lima e Nícolas Okamoto Celestrino
---

## Atividades Realizadas

### Atividade 1
![Screenshot 1](./Atividade%201/Screenshot_20260328_153956.png)
![Screenshot 2](./Atividade%201/Screenshot_20260328_154127.png)
![Screenshot 3](./Atividade%201/Screenshot_20260328_154139.png)
![Screenshot 4](./Atividade%201/Screenshot_20260328_154145.png)

---

### Atividade 2 - Expressões Regulares
![CEP - Regex](./Atividade%202/cep.png)
![CPF - Regex](./Atividade%202/cpf.png)
![Email - Regex](./Atividade%202/email.png)
![Exemplo Livro](./Atividade%202/exemploLivro.png)
![Global](./Atividade%202/global.png)
![RG - Regex](./Atividade%202/rg.png)

### Atividade 3 - Processamento de Dados
**Arquivos:** 
- `exemplo.c` - Código C de exemplo
- `relatorio_dados_abertos_oferta_12021_18102021.csv` - Base de dados
- `relatorio_dados_abertos_oferta_12021_18102021.tsv` - Base de dados em TSV

**Subdiretórios:**
- `remover comentarios/`
- `substituir =/`
- `transformar em tsv/`

### Atividade 4 - Expressões Regulares em Python e Java
![Python_Collab](./Atividade%204/Printscreen%20Python%20Colab/Saída_Desafio_Final.png)
![Python_Collab_Saida](./Atividade%204/Printscreen%20Python%20Colab/Saída_Tokenize.png)
![RegExp_Java](./Atividade%204/RegExp%20no%20Java/Teste%20JUnit.png)

- Arquivo: `RegExp Python Colabs.MD`

---

### Atividade 5 - JFLAP (Autômatos Finitos)
![DFA Identificadores](./Atividade%205/DFA%20Identificadores.png)
![DFA Números Inteiros](./Atividade%205/DFA%20Números%20Inteiros.png)
![DFA Operadores](./Atividade%205/DFA%20operadores.png)
![NFA Operadores](./Atividade%205/NFA%20operadores.png)
![DFA Teste Final](./Atividade%205/DFA%20TESTE%20FINAL.png)

**Arquivos JFLAP:**
- `DFA Identificadores.jff` - Identificadores
- `DFA Números Inteiros.jff` - Números Inteiros
- `DFA operadores.jff` - Operadores
- `DFA simulação.jff` - Simulação
- `NFA operadores.jff` - NFA Operadores

---

### Atividade 6 - Análise com OpenAI
![OpenAI Resposta 1](./Atividade%206/openai1.png)
![OpenAI Resposta 2](./Atividade%206/openai2.png)
![OpenAI Resposta 3](./Atividade%206/openai3.png)
![OpenAI Resposta 4](./Atividade%206/openai4.png)
![OpenAI Resposta 5](./Atividade%206/openai5.png)
![OpenAI Resposta 6](./Atividade%206/openai6.png)
![Token Nosso](./Atividade%206/token_nosso.png)

**Arquivo de Respostas:** `Respostas.md`

---

### Atividade 7 - Scanner e Análise Léxica

### Python
```python
import re

#carrega o livro escolhido
with open('Memorias Posthumas de Bras Cubas.txt', 'r', encoding='utf-8') as f:  #carrega o livro escolhido
    texto_livro = f.read()

regexp = r'[a-zA-Z_][a-zA-Z0-9_]*|\d+|[=+\-*]' #define o automato finito para tokenização

def tokenize(texto):
   
    return re.findall(regexp, texto)     #retorna as strings que casam com a gramática definida

tokens = tokenize(texto_livro) #gera os tokens do livro

print(tokens[:200])  #imprime os tokens gerados (apenas os primeiros 200 para não poluir o terminal)
```

### Java
```java
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
```

---

## Parágrado de cada aluno

- **Gabriel:** Pessoalmente achei interessante como esses três elementos formam um todo. O analisador léxico funciona como um filtro que organiza o texto bruto utilizando as regras da definidas pela gramática regular, enquanto o autômato finito é trabalhar para os caracteres entrados. É uma estrutura muito bem pensada e fascinante de se aprendeer tanto em teoria como em prática.

- **Nícolas:** É interessante como cada um dos três assuntos se complementam. Com a analisador léxico sendo um autômato finito que reconhece cadeias de caracteres, números e operadores e a gramática regular sendo uma descrição do autômato. É muito interessante que, com a gramática regular, conseguimos criar um autômato finito que se tornará o scanner.

---


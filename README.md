# Entrega Final do - Compiladores (PUC-SP)

- **Faculdade:** PUC-SP
- **Curso:** [Ciência da Computação]
- **Disciplina:** Compiladores
- **Equipe:** [Gabriel Mechi Lima] e [Nícolas Okamoto Celestrino]
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
**Estrutura:**
- Printscreen Python Colab
- RegExp no Java
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
// coisa de java aqui
}
```

---

## Parágrado de cada aluno


---

```

---


---

**Nota:** Este é um projeto acadêmico para a disciplina de Compiladores da PUC-SP.

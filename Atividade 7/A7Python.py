import re

#carrega o livro escolhido
with open('Memorias Posthumas de Bras Cubas.txt', 'r', encoding='utf-8') as f:  #carrega o livro escolhido
    texto_livro = f.read()

regexp = r'[a-zA-Z_][a-zA-Z0-9_]*|\d+|[=+\-*]' #define o automato finito para tokenização

def tokenize(texto):
   
    return re.findall(regexp, texto)     #retorna as strings que casam com a gramática definida

tokens = tokenize(texto_livro) #gera os tokens do livro

print(tokens[:200])  #imprime os tokens gerados (apenas os primeiros 200 para não poluir o terminal)
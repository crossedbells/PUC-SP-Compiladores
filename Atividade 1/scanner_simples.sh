#!/bin/bash
#cat exemplo.c | ./scanner_simples_stdin.sh

while IFS= read -r linha; do
  linha=$(printf '%s' "$linha" | tr -d ' \t\r')
  printf "[SCANNER] Linha recebida: '%s'\n" "$linha"
done


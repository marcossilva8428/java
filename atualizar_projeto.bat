@echo off
REM Configura o diretório como seguro para o Git
git config --global --add safe.directory C:/Users/marcos.da.silva.j/eclipse-workspace/java

REM Navega até o diretório do projeto
cd C:/Users/marcos.da.silva.j/eclipse-workspace/java

REM Copia os arquivos do diretório javaEssentials
xcopy C:/Users/marcos.da.silva.j/eclipse-workspace/javaEssentials/* javaEssentials/ /E /I

REM Adiciona os arquivos ao Git
git add .

REM Confirma as mudanças com uma mensagem de commit
git commit -m "Atualizando projeto javaEssentials com as ultimas mudancas"

REM Envia as mudanças para o repositório remoto
git push origin main

pause

@echo off
git config --global --add safe.directory C:/Users/marcos.da.silva.j/eclipse-workspace/java
cd C:/Users/marcos.da.silva.j/eclipse-workspace/java
xcopy C:/Users/marcos.da.silva.j/eclipse-workspace/javaEssentials/* javaEssentials/ /E /I
git add .
git commit -m "Atualizando projeto javaEssentials com as últimas mudanças"
git push origin main
pause
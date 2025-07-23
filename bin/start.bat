@echo off
echo Starting Java application...
:: 启动新的 java 应用，后台运行，并获取新进程PID
start "" java -jar .\target\jenkins-test-0.0.1-SNAPSHOT.jar

:: 这里我们没有直接方法获取新进程PID，需用一点技巧
:: 下面示例通过找端口占用的 PID，假设你用 8080 端口

timeout /t 20 /nobreak >nul
set PID_FILE=app.pid
for /f "tokens=5" %%a in ('netstat -ano ^| find ":9000" ^| find "LISTENING"') do (
    echo %%a > %PID_FILE%
    echo Saved new PID %%a to %PID_FILE%
)
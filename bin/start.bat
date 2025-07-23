@echo off
echo Starting Java application...

start "" java -jar .\target\jenkins-test-0.0.1-SNAPSHOT.jar

timeout /t 20 /nobreak >nul
set PID_FILE=app.pid
for /f "tokens=5" %%a in ('netstat -ano ^| find ":9000" ^| find "LISTENING"') do (
    echo %%a > %PID_FILE%
    echo Saved new PID %%a to %PID_FILE%
)
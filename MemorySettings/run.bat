@echo off

set "JAVA_OPTS=-Xms128m -Xmx256m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=heapdumps"

if not exist out mkdir out
if not exist heapdumps mkdir heapdumps

javac -d out src\com\memory\heapsize\Employee.java src\com\memory\heapsize\HeapMonitoringApp.java

if errorlevel 1 (
	echo Compilation failed
	exit /b 1
)

java %JAVA_OPTS% -cp out com.memory.heapsize.HeapMonitoringApp

pause
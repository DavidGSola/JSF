cd C:\Program Files (x86)\Apache-Tomcat\apache-tomcat-7.0.56\bin\
call shutdown.bat
ping 1.1.1.1 -n 1 -w 3000 > nul
copy /Y "C:\Users\DavidGSola\Documents\Facultad\Eclipse\workspace\holamundo\target\holamundo.war" "C:\Program Files (x86)\Apache-Tomcat\apache-tomcat-7.0.56\webapps\"
cd C:\Program Files (x86)\Apache-Tomcat\apache-tomcat-7.0.56\webapps\
rmdir /S /Q holamundo
cd C:\Program Files (x86)\Apache-Tomcat\apache-tomcat-7.0.56\bin\
call startup.bat
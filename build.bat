DEL package.jar
javac *.java
jar cfM package.jar *.class
DEL *.class
java -Dfile.encoding=MS950 -cp .;* Main
PAUSE
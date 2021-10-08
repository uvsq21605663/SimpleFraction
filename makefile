all : clean compile
	java Main

compile : 
	javac Main.java
	javac Fraction.java

clean :
	rm -f *.class

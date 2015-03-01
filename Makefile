build:
	@javac *.java
	
run:
	@java ExpressionReader < sampleInput.txt
	
clean:
	@rm *.class

zip:
	@zip -r RegularExpressionValidator *
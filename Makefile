default: WithoutSAM.class WithSAM.class

%.class: %.scala
	scalac -Xprint:all $*.scala > scalac-output-$*.txt

run-without: WithoutSAM.class
	scala WithoutSAM

run-with: WithSAM.class
	scala WithSAM

clean:
	rm -f *.class *.txt

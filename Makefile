default: WithoutSAM.class WithSAM.class

%.class: %.scala
	scalac -Xprint:all $*.scala > scalac-output-$*.txt

clean:
	rm -f *.class *.txt

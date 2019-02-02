default: WithoutSAM.class WithSAM.class

%.class: %.scala
	scalac -Xprint:all $*.scala

clean:
	rm -f *.class

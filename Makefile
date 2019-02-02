default: example/WithoutSAM.class

%.class: %.scala
	scalac -Xprint:all $*.scala

clean:
	rm -f example/*.class

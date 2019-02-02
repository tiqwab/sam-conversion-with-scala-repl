default: example/WithoutSAM.class example/WithSAM.class

%.class: %.scala
	scalac -Xprint:all $*.scala

clean:
	rm -f example/*.class

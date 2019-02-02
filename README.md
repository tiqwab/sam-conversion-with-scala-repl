The investigation of a behavior around SAM conversion in REPL.

```
scala> val s = Executors.newFixedThreadPool(5)
s: java.util.concurrent.ExecutorService = java.util.concurrent.ThreadPoolExecutor@f2b88d1[Running, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]

scala> s.submit(new Callable[Int]() {
     |   def call(): Int = {
     |     s.submit(new Callable[Int]() {
     |       def call(): Int = 1
     |     }).get
     |   }
     | }).get
res10: Int = 1

scala> s.submit(() => s.submit(() => 1).get).get
// not returned
```

This seems to be the problem with REPL not compiler?
The compiled codes work as expected.

```
$ make clean
$ make run-with
$ make run-without
$ cat scalac-output-WithSAM.txt    # scalac output
$ cat scalac-output-WithoutSAM.txt # scalac output
```

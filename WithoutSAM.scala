object WithoutSAM {

  def main(args: Array[String]): Unit = {
    val s: java.util.concurrent.ExecutorService = java.util.concurrent.Executors.newFixedThreadPool(5)
    val x = s.submit(new java.util.concurrent.Callable[Int]() {
      def call(): Int = {
        s.submit(new java.util.concurrent.Callable[Int]() {
          def call(): Int = 1
        }).get
      }
    })
    println(x.get)
    s.shutdown()
  }

}

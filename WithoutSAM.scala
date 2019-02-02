object WithoutSAM {

  def main(args: Array[String]): Unit = {
    val s: java.util.concurrent.ExecutorService = java.util.concurrent.Executors.newFixedThreadPool(5)
    s.submit(new java.util.concurrent.Callable[Int]() {
      def call(): Int = {
        s.submit(new java.util.concurrent.Callable[Int]() {
          def call(): Int = 1
        }).get
      }
    }).get
  }

}

object WithSAM {

  def main(args: Array[String]): Unit = {
    val s: java.util.concurrent.ExecutorService = java.util.concurrent.Executors.newFixedThreadPool(5)
    val x = s.submit(() => s.submit(() => 1).get).get
    println(x)
    s.shutdown()
  }

}

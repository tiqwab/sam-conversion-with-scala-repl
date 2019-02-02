package example

object WithSAM {

  def main(args: Array[String]): Unit = {
    val s: java.util.concurrent.ExecutorService = java.util.concurrent.Executors.newFixedThreadPool(5)
    s.submit(() => 1).get
  }

}

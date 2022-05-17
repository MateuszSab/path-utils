import java.io.File

object PathUtils {
  def getPathEnv: String = sys.env("PATH")

  def findFile(file: String): Seq[String] = {
    def isExists(dir: String) = {
      new File(dir + File.separatorChar + file).exists()
    }

    getPathEnv.split(File.pathSeparatorChar).filter(isExists)
  }
}

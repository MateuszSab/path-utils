import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class PathUtilsSpec extends AnyFlatSpec with should.Matchers {
  "FindFile" should " " in {
    import PathUtils._

    findFile("kubectl") shouldBe Seq("/usr/local/bin")

  }

}

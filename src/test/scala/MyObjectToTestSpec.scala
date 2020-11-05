import org.scalatest.{MustMatchers, WordSpec}

class MyObjectToTestSpec extends WordSpec with MustMatchers {

  "addOne" must {
    "return 2 " when {
      "passed 1" in {
        MyObjectToTest.addOne(1) mustEqual 2
      }
    }
  }

}

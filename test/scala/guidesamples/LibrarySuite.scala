/*
 * This Scala Testsuite was generated by the Gradle 'init' task.
 */
package guidesamples

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
final class LibrarySuite extends AnyFunSuite {
  test("someLibraryMethod is always true") {
    val library = new Library()
    assert(library.someLibraryMethod())
  }
}

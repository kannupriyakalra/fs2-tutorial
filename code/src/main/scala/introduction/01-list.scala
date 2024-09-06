package introduction

import fs2.*

// These exercises are all about the similarities between List and Stream.
// You're asked to create a Stream that produces certain values. There are tests
// check that the Stream you create is equivalent to a particular List. Run the
// tests to check your work, or look at the tests if you don't understand what a
// task is asking you to do.
object StreamAsList {
  // Construction. We focus on creating Streams

  // The empty stream produces no values
  val empty: Stream[Pure, Int] = ???

  // This Stream should produce 1, 2, and 3, in that order
  val naturals: Stream[Pure, Int] = ???

  // This method accepts a single value and returns the Stream that produces
  // that single value
  def one[A](value: A): Stream[Pure, A] = ???

  // This method accepts a list of values and returns the Stream that produces
  // exactly those values in the order given.
  def list[A](values: List[A]): Stream[Pure, A] = ???

  // Transformation. We focus on transforming existing Streams
}
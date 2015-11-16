package gol

import org.specs2.mutable.Specification

class NeighboursCounterSpec extends Specification {

  val aliveCells = Set((0,0))

  "should count neighbours all around" >> {
    NeighboursCounter.count(aliveCells, (1, 1)) shouldEqual 1
  }

}

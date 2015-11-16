package gol


object NeighboursCounter {

  def count(aliveCells: Set[(Int, Int)], coordinates: (Int, Int)) = {

    val neighbours = List(
      (-1,-1),  (0,-1 ), (1,-1),
      (0, -1),           (0, 1),
      (1, -1),  (1, 0 ), (1, 1))

      neighbours.count(
        vector =>
          aliveCells.contains(coordinates._1 + vector._1, coordinates._2 + vector._2)
      )
  }

}

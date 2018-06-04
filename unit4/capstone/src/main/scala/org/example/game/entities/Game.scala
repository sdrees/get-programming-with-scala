package org.example.game.entities

final case class Game(moveA: Move, moveB: Move) {

  val play: Winner = {
    if (moveA.symbol == moveB.symbol) Winner(None)
    else if (moveA.symbol wins moveB.symbol) Winner(Some(moveA))
    else Winner(Some(moveB))
  }
}

final case class Move(player: String, symbol: Symbol)

final case class Winner(winner: Option[Move])

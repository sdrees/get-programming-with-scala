package org.example.game

import cats.effect.IO
import org.example.game.entities.Game
import org.http4s.HttpService
import org.http4s.dsl.Http4sDsl
import io.circe.syntax._
import io.circe.generic.auto._

import org.http4s.circe._

class GameService extends Http4sDsl[IO] {

  implicit val decoder = jsonOf[IO, Game]

  val service = HttpService[IO] {
    case req @ POST -> Root / "play" =>
      for {
        game <- req.as[Game]
        winner <- Ok(game.play.asJson)
      } yield winner
  }

  // TODO - fix decoding for symbol

}

import Player.Player

object Run {

  def main(args: Array[String]) {

    val game = new Game()
    game.startNewGame(6,6,4)

    var inputColumn = 0
    var currentPlayer = Player.Player1

    println(game)
    while ({inputColumn = scala.io.StdIn.readInt(); inputColumn !=  -1 && !game.isGameOver()}) {

      game.sinkChecker(inputColumn, currentPlayer)

      currentPlayer = otherPlayer(currentPlayer)

      println(game)

      if(game.isGameOver())
        print("Game over: " + game.gameState)
    }
  }

  // Notice how we do not need to define a return type if the return type is clear from the implementation.
  def otherPlayer(currentPlayer: Player) = {
    if(currentPlayer == Player.Player1)
      Player.Player2
    else
      Player.Player1
  }
}

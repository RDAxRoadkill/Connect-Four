import Player.Player

class Game() {

  // We define the gameState and nInRowToWin variables with 'var' so we can change their value
  // In contrast, 'val' defines a constant.
  // Class variables are public by default
  var gameState = GameState.Uninitialized
  var nInRowToWin: Int = 0
  private var board: Board = null

  // Start a new game with the given parameters
  def startNewGame(rows: Int, columns: Int, nInRowToWin: Int): Unit ={
    board = new Board(rows, columns)
    gameState = GameState.Player1Turn
    this.nInRowToWin = nInRowToWin
  }


  // In Java and C# you used void. Scala uses Unit.
  def sinkChecker(column: Int, player: Player): Unit ={
    // TODO: Check if it is indeed this player's turn, otherwise throw IllegalArgumentException
    // TODO: tell the board to sink the checker
    // TODO: Change the game state to the appropriate GameState.

  }

  def isGameOver(): Boolean ={
    return gameState == GameState.Player1Won || gameState == GameState.Player2Won
  }

  override def toString(): String = {
    return board.toString()
  }
}

package Module;

import java.util.List;

public class Bot  extends  Player{
   private  BotDifficulityLevel botDifficulityLevel;

 public Bot(String name, Symbol symbol,PlayerType playerType, BotDifficulityLevel botDifficulityLevel) {
    super(name, symbol,playerType);
          this.botDifficulityLevel = botDifficulityLevel;
     }

    @Override
    public Move makeMove(Board board) {
        for(List<Cell> row : board.getBoard()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(this, cell);
                }
            }
        }
        return null;
    }
}

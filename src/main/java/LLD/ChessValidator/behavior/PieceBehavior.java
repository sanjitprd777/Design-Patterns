package LLD.ChessValidator.behavior;

import LLD.ChessValidator.entities.Cell;

public interface PieceBehavior {
    void validateMove(Integer[] startCell, Integer[] endCell) throws Exception;
}

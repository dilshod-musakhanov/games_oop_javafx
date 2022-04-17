package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.QueenBlack;

public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void whenFigureNotFoundException()
            throws OccupiedCellException, FigureNotFoundException {
    Logic logic = new Logic();
    logic.add((new BishopBlack(Cell.C8)));
    logic.move(Cell.A6, Cell.C8);
    }

    @Test(expected = OccupiedCellException.class)
    public void whenOccupiedCellException()
            throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.H3));
        logic.add(new BishopBlack(Cell.F5));
        logic.move(Cell.H3, Cell.F5);
    }
}
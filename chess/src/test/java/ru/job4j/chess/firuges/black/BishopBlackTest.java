package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell cell = bishopBlack.position();
        assertThat(cell, is(Cell.C8));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenMoveException() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell dest = Cell.D6;
        bishopBlack.way(dest);
    }

    @Test
    public void whenCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell dest = Cell.A6;
        Figure cell = bishopBlack.copy(dest);
        assertEquals(dest, cell.position());
    }
}

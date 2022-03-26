package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void whenBishopBlackC1() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Assert.assertEquals(bishopBlack.position(),Cell.C1);
    }

    @Test
    public void whenBishopBlackC1toA1() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack = bishopBlack.copy(Cell.A1);
        Assert.assertEquals(bishopBlack.position(),Cell.A1);
    }

    @Test
    public void whenBishopBlackC1toG5() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] bishop = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.C1, Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(bishop, expected);
    }

    @Test
    public void whenBishopBlackG5toC1() {
        Figure bishopBlack = new BishopBlack(Cell.G5);
        Cell[] bishop = bishopBlack.way(Cell.C1);
        Cell[] expected = {Cell.G5, Cell.F4, Cell.E3, Cell.D2, Cell.C1};
        Assert.assertArrayEquals(bishop, expected);
    }

    @Test
    public void whenBishopBlackG1toB6() {
        Figure bishopBlack = new BishopBlack(Cell.G1);
        Cell[] bishop = bishopBlack.way(Cell.B6);
        Cell[] expected = {Cell.G1, Cell.F2, Cell.E3, Cell.D4, Cell.C5, Cell.B6};
        Assert.assertArrayEquals(bishop, expected);
    }

    @Test
    public void whenBishopBlackB6toC1() {
        Figure bishopBlack = new BishopBlack(Cell.B6);
        Cell[] bishop = bishopBlack.way(Cell.G1);
        Cell[] expected = {Cell.B6, Cell.C5, Cell.D4, Cell.E3, Cell.F2, Cell.G1};
        Assert.assertArrayEquals(bishop, expected);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenBishopBlackC1toG6() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] bishop = bishopBlack.way(Cell.G6);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenBishopBlackC1toH5() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] bishop = bishopBlack.way(Cell.H5);
    }
}
package me.raddari.minesweeper.client;

import me.raddari.minesweeper.client.view.MinesweeperView;
import me.raddari.minesweeper.controller.GameController;
import me.raddari.minesweeper.controller.StandardGame;

import javax.swing.SwingUtilities;

public final class Minesweeper implements Runnable {

    private MinesweeperView view;
    private GameController controller;

    Minesweeper() {
    }

    @Override
    public void run() {
        controller = new StandardGame(16, 16, 50);
        view = new MinesweeperView(controller, 1920, 1080);
        controller.generateBombs(5, 5);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Minesweeper());
    }

}

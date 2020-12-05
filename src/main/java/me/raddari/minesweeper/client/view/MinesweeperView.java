package me.raddari.minesweeper.client.view;

import me.raddari.minesweeper.controller.GameController;
import org.jetbrains.annotations.NotNull;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Dimension;

public final class MinesweeperView {

    private final GameController controller;
    private final JFrame frame;
    private MinefieldPanel minefieldPanel;

    public MinesweeperView(@NotNull GameController controller, int width, int height) {
        this.controller = controller;

        frame = new JFrame("Minesweeper");
        frame.setPreferredSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();

        var rows = controller.fieldRows();
        var cols = controller.fieldColumns();
        minefieldPanel = new MinefieldPanel(controller);
        frame.add(minefieldPanel);

        frame.setVisible(true);
    }

}

package com.lindsey;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.util.Random;

/**
 * @author Lindsey.Cheung
 * @since 2021.06.20 SUN
 */
public class Game2048 extends JPanel {

    // 游戏状态枚举
    enum StateEnum {
        START, WON, RUNNING, OVER
    }

    //颜色表
    final Color[] colorTable = {
            new Color(0x701710), new Color(0xFFE423), new Color(0xfff4d3),
            new Color(0xffdac3), new Color(0xe7b08e), new Color(0xe7bf8e),
            new Color(0xffc4c3), new Color(0xe7948e), new Color(0xbe7e56),
            new Color(0xbe5e56), new Color(0x9c3931), new Color(0x701710)
    };

    final static int target = 2048;
    static int highest;
    static int score;
    private final Color gridColor = new Color(0xbbada0);
    private final Color emptyColor = new Color(0xcdc1b4);
    private final Color startColor = new Color(0xffebcd);
    private final Random random = new Random();
    private final int side = 4;
    private StateEnum gameState = StateEnum.START;
    private boolean checkingAvailableMoves;

    public Game2048() {
        setPreferredSize(new Dimension(900, 700));
        setBackground(new Color(0xfaf8EF));
        setFont(new Font("SansSerif", Font.BOLD, 48));
        setFocusable(true);
    }
}

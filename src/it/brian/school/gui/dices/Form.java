package it.brian.school.gui.dices;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.WindowEvent;

public class Form extends JFrame {

    private static final String[] numbersList = {"due", "tre", "quattro", "cinque", "sei", "sette", "otto", "nove", "dieci", "undici", "dodici"};
    private final Match match = new Match();


    private JPanel contentPane;

    private JPanel northPanel;
    private JPanel playersRadioButtonsPanel;
    private ButtonGroup playersButtonGroup;
    private JRadioButton rBCarla;
    private JRadioButton rBMaria;
    private JRadioButton rBPina;
    private JRadioButton rBAndrea;
    private JRadioButton rBValerio;
    private JRadioButton rBAnna;
    private JLabel northImage;
    private JPanel northCenterPanel;
    private JLabel lblTotalPoints;
    private JTextField txTotalPoints;
    private JButton btQuit;
    private JTextArea outputTxArea;
    private JScrollPane outputTxAreaScrollPane;

    private JPanel southPanel;
    private JComboBox<String> cBNumbers;
    private JButton btRoll;
    private JTextField txOutcome;

    private JPanel eastPanel;
    private JLabel lblStatistics;
    private JLabel lblRollsCounter;
    private JTextField txRollsCounter;
    private JLabel lblDiceOne;
    private JTextField txDiceOne;
    private JLabel lblDiceTwo;
    private JTextField txDiceTwo;
    private JLabel lblDiceThree;
    private JTextField txDiceThree;
    private JLabel lblDiceFour;
    private JTextField txDiceFour;
    private JLabel lblDiceFive;
    private JTextField txDiceFive;
    private JLabel lblDiceSix;
    private JTextField txDiceSix;
    private JLabel lblWon;
    private JTextField txWon;
    private JLabel lblLost;
    private JTextField txLost;

    private JPanel westPanel;
    private JLabel lblEuro;
    private ButtonGroup euroButtonGroup;
    private JRadioButton rBTen;
    private JRadioButton rBTwenty;
    private JRadioButton rBFifty;
    private JRadioButton rBOneHundred;
    private JLabel lblCent;
    private JCheckBox checkTen;
    private JCheckBox checkTwenty;
    private JCheckBox checkThirty;
    private JCheckBox checkForty;

    private JPanel centerPanel;
    private JLabel centerLeftImage;
    private JLabel centerRightImage;


    public Form() throws HeadlessException {
        init();
        setup();
        pack();
    }

    private void setup() {
        setVisible(true);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocation(60, 60);
        setContentPane(contentPane);
        getRootPane().setDefaultButton(btRoll);
        setTitle("Player: " + match.player.getName());

        playersButtonGroup.add(rBCarla);
        playersButtonGroup.add(rBMaria);
        playersButtonGroup.add(rBPina);
        playersButtonGroup.add(rBAndrea);
        playersButtonGroup.add(rBValerio);
        playersButtonGroup.add(rBAnna);

        playersRadioButtonsPanel.add(rBCarla);
        playersRadioButtonsPanel.add(rBMaria);
        playersRadioButtonsPanel.add(rBPina);
        playersRadioButtonsPanel.add(rBAndrea);
        playersRadioButtonsPanel.add(rBValerio);
        playersRadioButtonsPanel.add(rBAnna);

        northPanel.add(playersRadioButtonsPanel);

        northImage.setIcon(new ImageIcon("./resources/dices/Carla.jpg"));
        northImage.setHorizontalAlignment(JLabel.CENTER);

        northPanel.add(northImage);

        txTotalPoints.setBackground(Color.YELLOW);
        txTotalPoints.setEditable(false);
        btQuit.setBackground(Color.RED);

        northCenterPanel.add(lblTotalPoints);
        northCenterPanel.add(txTotalPoints);
        northCenterPanel.add(btQuit);

        northPanel.add(northCenterPanel);

        outputTxArea.setEditable(false);
        outputTxArea.setBackground(Color.YELLOW);

        northPanel.add(outputTxAreaScrollPane);


        cBNumbers.setSelectedIndex(match.betOutcome - 2);
        txOutcome.setEditable(false);

        southPanel.add(cBNumbers);
        southPanel.add(btRoll);
        southPanel.add(txOutcome);

        lblStatistics.setForeground(Color.RED);
        txRollsCounter.setEditable(false);
        txRollsCounter.setBackground(Color.YELLOW);
        txDiceOne.setEditable(false);
        txDiceOne.setBackground(Color.YELLOW);
        txDiceTwo.setEditable(false);
        txDiceTwo.setBackground(Color.YELLOW);
        txDiceThree.setEditable(false);
        txDiceThree.setBackground(Color.YELLOW);
        txDiceFour.setEditable(false);
        txDiceFour.setBackground(Color.YELLOW);
        txDiceFive.setEditable(false);
        txDiceFive.setBackground(Color.YELLOW);
        txDiceSix.setEditable(false);
        txDiceSix.setBackground(Color.YELLOW);
        txWon.setBackground(Color.GREEN);
        txWon.setEditable(false);
        txLost.setBackground(Color.RED);
        txLost.setEditable(false);


        eastPanel.add(lblStatistics);
        eastPanel.add(new JLabel(""));
        eastPanel.add(lblRollsCounter);
        eastPanel.add(txRollsCounter);
        eastPanel.add(lblDiceOne);
        eastPanel.add(txDiceOne);
        eastPanel.add(lblDiceTwo);
        eastPanel.add(txDiceTwo);
        eastPanel.add(lblDiceThree);
        eastPanel.add(txDiceThree);
        eastPanel.add(lblDiceFour);
        eastPanel.add(txDiceFour);
        eastPanel.add(lblDiceFive);
        eastPanel.add(txDiceFive);
        eastPanel.add(lblDiceSix);
        eastPanel.add(txDiceSix);
        eastPanel.add(lblWon);
        eastPanel.add(txWon);
        eastPanel.add(lblLost);
        eastPanel.add(txLost);

        euroButtonGroup.add(rBTen);
        euroButtonGroup.add(rBTwenty);
        euroButtonGroup.add(rBFifty);
        euroButtonGroup.add(rBOneHundred);

        westPanel.add(lblEuro);
        westPanel.add(lblCent);
        westPanel.add(rBTen);
        westPanel.add(checkTen);
        westPanel.add(rBTwenty);
        westPanel.add(checkTwenty);
        westPanel.add(rBFifty);
        westPanel.add(checkThirty);
        westPanel.add(rBOneHundred);
        westPanel.add(checkForty);

        centerLeftImage.setIcon(match.diceOne.getTopFace().getImage());
        centerLeftImage.setHorizontalAlignment(JLabel.CENTER);
        centerRightImage.setIcon(match.diceOne.getTopFace().getImage());
        centerRightImage.setHorizontalAlignment(JLabel.CENTER);

        centerPanel.setBackground(Color.WHITE);
        centerPanel.add(centerLeftImage);
        centerPanel.add(centerRightImage);


        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(northPanel, BorderLayout.NORTH);
        contentPane.add(southPanel, BorderLayout.SOUTH);
        contentPane.add(eastPanel, BorderLayout.EAST);
        contentPane.add(westPanel, BorderLayout.WEST);
        contentPane.add(centerPanel, BorderLayout.CENTER);

        match.setMatchLogger(text -> outputTxArea.append(text + "\n"));

        match.setRollListener((match, outcome) -> {
            centerLeftImage.setIcon(match.diceOne.getTopFace().getImage());
            centerRightImage.setIcon(match.diceTwo.getTopFace().getImage());
            txRollsCounter.setText(String.valueOf(match.STATISTICS.getCountOfRolls()));
            txDiceOne.setText(String.valueOf(match.STATISTICS.getCountOfDiceWith(1)));
            txDiceTwo.setText(String.valueOf(match.STATISTICS.getCountOfDiceWith(2)));
            txDiceThree.setText(String.valueOf(match.STATISTICS.getCountOfDiceWith(3)));
            txDiceFour.setText(String.valueOf(match.STATISTICS.getCountOfDiceWith(4)));
            txDiceFive.setText(String.valueOf(match.STATISTICS.getCountOfDiceWith(5)));
            txDiceSix.setText(String.valueOf(match.STATISTICS.getCountOfDiceWith(6)));
            txWon.setText(String.valueOf(match.STATISTICS.getWon()));
            txLost.setText(String.valueOf(match.STATISTICS.getLost()));

            txTotalPoints.setText(String.valueOf(match.totalPoints));

            if (outcome) {
                txOutcome.setText("HAI VINTO");
                txOutcome.setBackground(Color.GREEN);
            } else {
                txOutcome.setText("HAI PERSO");
                txOutcome.setBackground(Color.RED);
            }
        });

        /*
        * Events
        */

        rBCarla.addActionListener(new PlayersSelectionHandler(this, northImage, Player.CARLA, match));
        rBMaria.addActionListener(new PlayersSelectionHandler(this, northImage, Player.MARIA, match));
        rBPina.addActionListener(new PlayersSelectionHandler(this, northImage, Player.PINA, match));
        rBAndrea.addActionListener(new PlayersSelectionHandler(this, northImage, Player.ANDREA, match));
        rBValerio.addActionListener(new PlayersSelectionHandler(this, northImage, Player.VALERIO, match));
        rBAnna.addActionListener(new PlayersSelectionHandler(this, northImage, Player.ANNA, match));

        btRoll.addActionListener(e -> {
            match.rollDices();
            match.betOutcome = cBNumbers.getSelectedIndex() + 2;
            match.wager = new Money(
                    rBTen.isSelected(),
                    rBTwenty.isSelected(),
                    rBFifty.isSelected(),
                    rBOneHundred.isSelected(),
                    checkTen.isSelected(),
                    checkTwenty.isSelected(),
                    checkThirty.isSelected(),
                    checkForty.isSelected()
            );
        });

        btQuit.addActionListener(e -> processWindowEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING)));

        addWindowListener(new WindowClosingHandler(this));

    }

    private void init() {
        contentPane = new JPanel(new BorderLayout());

        northPanel = new JPanel(new GridLayout(1, 4, 8, 0));
        playersRadioButtonsPanel = new JPanel(new GridLayout(6, 1));
        playersButtonGroup = new ButtonGroup();
        rBCarla = new JRadioButton("Carla", true);
        rBMaria = new JRadioButton("Maria");
        rBPina = new JRadioButton("Pina");
        rBAndrea = new JRadioButton("Andrea");
        rBValerio = new JRadioButton("Valerio");
        rBAnna = new JRadioButton("Anna");
        northImage = new JLabel();
        northCenterPanel = new JPanel(new GridLayout(3, 1));
        lblTotalPoints = new JLabel("Tot. punti");
        txTotalPoints = new JTextField("0.0");
        btQuit = new JButton("Uscita");
        outputTxArea = new JTextArea("Resoconto vinte/perse\n\n", 10, 15);
        outputTxAreaScrollPane = new JScrollPane(outputTxArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        southPanel = new JPanel(new GridLayout(1, 3, 8, 0));
        cBNumbers = new JComboBox<>(numbersList);
        btRoll = new JButton("Lancia");
        txOutcome = new JTextField();

        eastPanel = new JPanel(new GridLayout(10, 2));
        lblStatistics = new JLabel("STATISTICHE");
        lblRollsCounter = new JLabel("num. lanci");
        txRollsCounter = new JTextField("0");
        lblDiceOne = new JLabel("dado uno");
        txDiceOne = new JTextField("0");
        lblDiceTwo = new JLabel("dado due");
        txDiceTwo = new JTextField("0");
        lblDiceThree = new JLabel("dado tre");
        txDiceThree = new JTextField("0");
        lblDiceFour = new JLabel("dado quattro");
        txDiceFour = new JTextField("0");
        lblDiceFive = new JLabel("dado cinque");
        txDiceFive = new JTextField("0");
        lblDiceSix = new JLabel("dado sei");
        txDiceSix = new JTextField("0");
        lblWon = new JLabel("vinte");
        txWon = new JTextField("0");
        lblLost = new JLabel("perse");
        txLost = new JTextField("0");

        westPanel = new JPanel(new GridLayout(5, 2));
        lblEuro = new JLabel("euro");
        euroButtonGroup = new ButtonGroup();
        rBTen = new JRadioButton("10", true);
        rBTwenty = new JRadioButton("20");
        rBFifty = new JRadioButton("50");
        rBOneHundred = new JRadioButton("100");
        lblCent = new JLabel("cent");
        checkTen = new JCheckBox("10");
        checkTwenty = new JCheckBox("20");
        checkThirty = new JCheckBox("30");
        checkForty = new JCheckBox("40");

        centerPanel = new JPanel(new GridLayout(1, 2));
        centerLeftImage = new JLabel();
        centerRightImage = new JLabel();
    }
}

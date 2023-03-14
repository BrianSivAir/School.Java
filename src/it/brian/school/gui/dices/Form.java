package it.brian.school.gui.dices;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Form extends JFrame {

    private static final String[] numbersList = {"due", "tre", "quattro", "cinque", "sei", "sette", "otto", "nove", "dieci", "undici", "dodici"};
    private final Match match = new Match();
    private final Dice diceOne = new Dice();
    private final Dice diceTwo = new Dice();


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

    private JPanel southPanel;
    private JComboBox<String> cBNumbers;
    private JButton btThrow;
    private JTextField txResult;

    private JPanel eastPanel;
    private JLabel lblStatistics;
    private JLabel lblThrowsCounter;
    private JTextField txThrowsCounter;
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
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(60, 60);
        setContentPane(contentPane);
        getRootPane().setDefaultButton(btThrow);
        setTitle("-----player1-----");

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
        btQuit.setBackground(Color.RED);

        northCenterPanel.add(lblTotalPoints);
        northCenterPanel.add(txTotalPoints);
        northCenterPanel.add(btQuit);

        northPanel.add(northCenterPanel);

        outputTxArea.setEditable(false);
        outputTxArea.setBackground(Color.YELLOW);

        northPanel.add(outputTxArea);


        txResult.setEditable(false);
        txResult.setBackground(Color.GREEN);

        southPanel.add(cBNumbers);
        southPanel.add(btThrow);
        southPanel.add(txResult);

        lblStatistics.setForeground(Color.RED);
        txThrowsCounter.setEditable(false);
        txThrowsCounter.setBackground(Color.YELLOW);
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
        eastPanel.add(lblThrowsCounter);
        eastPanel.add(txThrowsCounter);
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

        centerLeftImage.setIcon(diceOne.getTopFace().getImage());
        centerLeftImage.setHorizontalAlignment(JLabel.CENTER);
        centerRightImage.setIcon(diceTwo.getTopFace().getImage());
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

        /*
        * Events
        */

        rBCarla.addActionListener(new PlayersSelectionHandler(northImage, PlayersSelectionHandler.CARLA));
        rBMaria.addActionListener(new PlayersSelectionHandler(northImage, PlayersSelectionHandler.MARIA));
        rBPina.addActionListener(new PlayersSelectionHandler(northImage, PlayersSelectionHandler.PINA));
        rBAndrea.addActionListener(new PlayersSelectionHandler(northImage, PlayersSelectionHandler.ANDREA));
        rBValerio.addActionListener(new PlayersSelectionHandler(northImage, PlayersSelectionHandler.VALERIO));
        rBAnna.addActionListener(new PlayersSelectionHandler(northImage, PlayersSelectionHandler.ANNA));

        btThrow.addActionListener(e -> {
            centerLeftImage.setIcon(diceOne.throwDice().getImage());
            centerRightImage.setIcon(diceTwo.throwDice().getImage());
        });

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
        txTotalPoints = new JTextField();
        btQuit = new JButton("Uscita");
        outputTxArea = new JTextArea("Resoconto vinte/perse\n\nHAI VINTO Carla");

        southPanel = new JPanel(new GridLayout(1, 3, 8, 0));
        cBNumbers = new JComboBox<>(numbersList);
        btThrow = new JButton("Lancia");
        txResult = new JTextField("HAI VINTO");

        eastPanel = new JPanel(new GridLayout(10, 2));
        lblStatistics = new JLabel("STATISTICHE");
        lblThrowsCounter = new JLabel("num. lanci");
        txThrowsCounter = new JTextField("0");
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

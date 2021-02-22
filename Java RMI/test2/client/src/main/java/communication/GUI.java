package communication;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private JLabel CarLbl;
    private JLabel yearLbl;
    private JTextField yearField;
    private JLabel engineLbl;
    private JTextField engineField;
    private JLabel priceLbl;
    private JTextField priceField;
    private JButton submitBtn;
    private JTextArea resultsArea;
    private JPanel panel;

    public GUI() throws HeadlessException {
        this.add(panel);
        this.setSize(400, 300);
    }

    public JTextField getYearField() {
        return yearField;
    }

    public void setYearField(JTextField yearField) {
        this.yearField = yearField;
    }

    public JTextField getEngineField() {
        return engineField;
    }

    public void setEngineField(JTextField engineField) {
        this.engineField = engineField;
    }

    public JTextField getPriceField() {
        return priceField;
    }

    public void setPriceField(JTextField priceField) {
        this.priceField = priceField;
    }

    public JButton getSubmitBtn() {
        return submitBtn;
    }

    public void setSubmitBtn(JButton submitBtn) {
        this.submitBtn = submitBtn;
    }

    public JTextArea getResultsArea() {
        return resultsArea;
    }

    public void setResultsArea(JTextArea resultsArea) {
        this.resultsArea = resultsArea;
    }
}

package koochaiyaphum.nitisak.lab10.lab6;
/*
This program java GUI name PersonFormV1 
Author by :Nitisak Koochaiyaphum
date : 23/01/2020
ID : 613040502-9
sec: 2
*/
import java.awt.BorderLayout;
import java.awt.GridLayout;
 
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
 
public class PersonFormV2 extends PersonFormV1 {
    /**
     * 
     */
    private static final long serialVersionUID = 3694909354550437224L;
 
    protected JTextArea reviewTxtArea;
    protected JScrollPane reviewScrollPane;
    protected JPanel reviewPanel, contentPanel, typePanel;
    protected JLabel reviewLabel, typeLabel;
    protected JComboBox<String> typeBox;
    protected String[] typesValues = {"Running", "Swimming", "Tennis"};
     
    public final static int NUM_TXTAREA_ROWS = 2;
    public final static int NUM_TXTAREA_COLS = 35;
     
    public PersonFormV2(String title) {
        super(title);
    }
     
    protected void initComponents() {
        super.initComponents();
        reviewTxtArea = new JTextArea(NUM_TXTAREA_ROWS, NUM_TXTAREA_COLS);
        reviewTxtArea.setLineWrap(true);
        reviewTxtArea.setWrapStyleWord(true);
        reviewTxtArea.setText("21st Century skills include");
        reviewTxtArea.append("Critical thinking, Creativity, Collaboration, ");
        reviewTxtArea.append("Communication, etc.");
        reviewScrollPane = new JScrollPane(reviewTxtArea);
        reviewPanel = new JPanel(new BorderLayout());
        contentPanel = new JPanel(new BorderLayout());
        typePanel = new JPanel(new GridLayout(1,2));
        reviewLabel = new JLabel("Note:");
        typeLabel = new JLabel("Sports:");
        typeBox = new JComboBox<String>(typesValues);
    }
     
    protected void addComponents() {
        super.addComponents();
        reviewPanel.add(reviewLabel, BorderLayout.NORTH);
        reviewPanel.add(reviewScrollPane, BorderLayout.SOUTH);
        typePanel.add(typeLabel);
        typePanel.add(typeBox);
        contentPanel.add(textsPanel, BorderLayout.NORTH);
        contentPanel.add(typePanel, BorderLayout.CENTER);
        contentPanel.add(reviewPanel, BorderLayout.SOUTH);
        overallPanel.add(contentPanel, BorderLayout.NORTH);
    }
    public static void createAndShowGUI(){
        PersonFormV2 personForm2 = 
                new PersonFormV2("Person Form V2");
        personForm2.addComponents();
        personForm2.setFrameFeatures();
    }
     
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
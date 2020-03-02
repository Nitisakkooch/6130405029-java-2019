package koochaiyaphum.nitisak.lab6;
/*
This program java GUI name PersonFormV1 
Author by :Nitisak Koochaiyaphum
date : 23/01/2020
ID : 613040502-9
sec: 2
*/
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class PersonFromV5  extends PersonFromV4{

    protected JPanel panelImagePhone;
    private static final long serialVersionUID = 1L;
    protected Font serifFont = new Font("Serif", Font.PLAIN, 14);
    protected Font serifBoldFont = new Font("Serif", Font.BOLD, 14);

    protected PersonFromV5(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }
    
    protected void addComponents(){
        super.addComponents();
        initComponents();
    }

    private void setFont() {
		name.setFont(serifFont);
		height.setFont(serifFont);
		weight.setFont(serifFont);
		date.setFont(serifFont);
        type.setFont(serifFont);
		sportsLabel.setFont(serifFont);
		reviewLabel.setFont(serifFont);
		featuresList.setFont(serifFont);
        typeCombo.setFont(serifFont);

        Student.setFont(serifFont);
		Teacher.setFont(serifFont);
		nameText.setFont(serifBoldFont);
		heightText.setFont(serifBoldFont);
		weightText.setFont(serifBoldFont);
		dateText.setFont(serifBoldFont);
		reviewArea.setFont(serifBoldFont);
    }
    private void setColor() {
		buttoncancel.setFont(serifFont);
        buttonOk.setFont(serifFont);
        buttoncancel.setForeground(Color.RED);
        buttonOk.setForeground(Color.BLUE);
        }
        
    protected void setValues(){
        nameText.setText("Manee");
		heightText.setText("160");
		weightText.setText("55");
		dateText.setText("02-02-2000");
    }
    
    protected void initComponents() {
        super.initComponents();
        setFont();
        setColor();
        setValues();

    }

    public static void createAndShowGUI() {
		PersonFromV5 PersonFromV5 = new PersonFromV5("PersonFromV5");
		PersonFromV5.addComponents();
		PersonFromV5.addMenus();
		PersonFromV5.setFrameFeatures();
	}

	protected void setFrameFeatures() {
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}

		});
	}

    
}
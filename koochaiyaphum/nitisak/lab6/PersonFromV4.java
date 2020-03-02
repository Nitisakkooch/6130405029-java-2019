package koochaiyaphum.nitisak.lab6;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;


/*
 * Author:Nitisak Koochaiyaphum
 * Id: 613040502-9	
 * Sec: 1
 * Date: March 29,2019
 */
;

public class PersonFromV4 extends PersonFromV3{
	protected PersonFromV4(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    private static final long serialVersionUID = 1L;
	
    protected JMenuItem size16, size20, size24 ,red ,green , blue;
	
	protected void addComponents() {
		super.addComponents();
	}
	
	
	protected  void addSubMenus() {
		configMenu.remove(sizemenu);
		configMenu.remove(colormenu);
		JMenu colorMenu = new JMenu("Color");
		JMenu sizeMenu = new JMenu("Size");

		JMenuItem item1 = new JMenuItem("16");
		JMenuItem item2 = new JMenuItem("20");
		JMenuItem item3 = new JMenuItem("24");
		
		colorMenu.add(new JMenuItem("Red"));
		colorMenu.add(new JMenuItem("Green"));
		colorMenu.add(new JMenuItem("Blue"));
		sizeMenu.add(item1);
		sizeMenu.add(item2);
		sizeMenu.add(item3);
		configMenu.add(colorMenu);
		configMenu.add(sizeMenu);
	}
	protected  void updateManuIcon() {
		newitem.setIcon(new ImageIcon(getClass().getResource("image/new.jpg")));
		
	}
	protected void setFrameFeature() {
		super.setFrameFeatures();
    }

    public void addMenus() {
		super.addMenus();
		updateManuIcon();
		addSubMenus();
    }
    
	public static void createAndShowGUI() {
		PersonFromV4 PersonFromV4 = new PersonFromV4("PersonFromV 4");
		PersonFromV4.addComponents();
		PersonFromV4.addMenus();
		PersonFromV4.setFrameFeature();
    }
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}


	protected void initComponents() {
	}
	
}
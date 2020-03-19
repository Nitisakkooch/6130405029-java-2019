package koochaiyaphum.nitisak.lab6;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;


/*
 * Author:Nitisak Koochaiyaphum
 * Id: 613040502-9	
 * Sec: 2
 * Date: March 7,2010
 */


public class PersonFormV4 extends PersonFormV3{
	protected PersonFormV4(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    private static final long serialVersionUID = 1L;
		protected JMenu colorMenu, sizeMenu;
    protected JMenuItem size16, size20, size24 ,red ,green , blue;
	
	protected void initComponents() {
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
		PersonFormV4 PersonFormV4 = new PersonFormV4("PersonFormV 4");
		PersonFormV4.addComponents();
		PersonFormV4.addMenus();
		PersonFormV4.setFrameFeature();
    }
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}


}
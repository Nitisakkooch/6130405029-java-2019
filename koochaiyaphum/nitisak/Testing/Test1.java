package koochaiyaphum.nitisak.Testing;

/**
 * Test1
 */
public class Test1 {
    
    public Test1(){
        System.out.println("Get A java");
    }

    if (source.equals("Open")) {  //open file chooser after click on Open menu.
        final JFileChooser openChooser = new JFileChooser();
        openChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = openChooser.showOpenDialog(PersonFormV11.this);
        if (result == JFileChooser.APPROVE_OPTION) { //if user select a file.
            File selectedFile = openChooser.getSelectedFile();
            JOptionPane.showMessageDialog(openChooser,
                    "Opening file " + selectedFile.getName());
        }
        else { //if user do nothing.
            JOptionPane.showMessageDialog(openChooser,
                    "Open command cancelled by user.");
        }
    }
    if (source.equals("Save")) {  //open save file chooser after click on Save menu.
        final JFileChooser saveChooser = new JFileChooser();
        saveChooser.setDialogTitle("Save");
        int result = saveChooser.showSaveDialog(PersonFormV11.this);
        if (result == JFileChooser.APPROVE_OPTION) {  //if user select file to save.
            File selectedFile = saveChooser.getSelectedFile();
            JOptionPane.showMessageDialog(saveChooser,
                    "Saving file " + selectedFile.getName());
        }
        else {  //if user do not select.
            JOptionPane.showMessageDialog(saveChooser, "Save command cancelled by user.");
        }
    }
    //select Exit.
    if (source.equals("Exit")) {
        System.exit(0); //exit program.
    }
}
package team.indecision.View;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class GUI extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public JFrame frame;
	private JMenuBar menuBar;
	
	public GUI() {
		
		frame = new JFrame("guiUML");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1280, 720));
		menuBar = new JMenuBar();
		

		////////////////////////////JMenueBar Classes//////////////////////////////////////

		JMenu classMenu = new JMenu("Class");
		menuBar.add(classMenu);
		
		JMenuItem addClassItem = new JMenuItem("Add Class");
		classMenu.add(addClassItem);

		JMenuItem deleteClassItem = new JMenuItem("Delete Class");
		classMenu.add(deleteClassItem);
/*
		addClassItem = new JMenuItem("Rename Class");
		addClassItem.addActionListener(controller.renameClassListener());
		classMenu.add(addClassItem);
		
		////////////////////////////JMenueBar Fields//////////////////////////////////////
		JMenu fieldMenu = new JMenu("Field");
		menuBar.add(fieldMenu);
		
		addClassItem = new JMenuItem("Add Feild");
		addClassItem.addActionListener(controller.addFieldListener());
		fieldMenu.add(addClassItem);

		addClassItem = new JMenuItem("Delete Feild");
		addClassItem.addActionListener(controller.deleteFieldListener());
		fieldMenu.add(addClassItem);

		addClassItem = new JMenuItem("Rename Feild");
		addClassItem.addActionListener(controller.renameFieldListener());
		fieldMenu.add(addClassItem);

		////////////////////////////JMenueBar Methods//////////////////////////////////////
		JMenu methodMenu = new JMenu("Method");
		menuBar.add(methodMenu);
		
		addClassItem = new JMenuItem("Add Method");
		addClassItem.addActionListener(controller.addMethodListener());
		methodMenu.add(addClassItem);

		addClassItem = new JMenuItem("Delete Method");
		addClassItem.addActionListener(controller.deleteMethodListener());
		methodMenu.add(addClassItem);

		addClassItem = new JMenuItem("Edit Method Name");
		addClassItem.addActionListener(controller.editMethodNameListener());
		methodMenu.add(addClassItem);

		addClassItem = new JMenuItem("Edit Method Parameters");
		addClassItem.addActionListener(controller.editMethodParametersListener());
		methodMenu.add(addClassItem);
		
		////////////////////////////JMenueBar Relationships//////////////////////////////////////
		JMenu relationshipMenu = new JMenu("Relationship");
		menuBar.add(relationshipMenu);
		
		addClassItem = new JMenuItem("Add Relationship");
		addClassItem.addActionListener(controller.addRelationshipListener());
		relationshipMenu.add(addClassItem);
		
		addClassItem = new JMenuItem("Delete Relationship");
		addClassItem.addActionListener(controller.deleteRelationshipListener());
		relationshipMenu.add(addClassItem);
		
		addClassItem = new JMenuItem("Edit Relationship Destination");
		addClassItem.addActionListener(controller.editRelationshipDestination());
		relationshipMenu.add(addClassItem);
		
		addClassItem = new JMenuItem("Edit Relationship Type");
		addClassItem.addActionListener(controller.editRelationshipType());
		relationshipMenu.add(addClassItem);


		////////////////////////////JMenueBar Save and Load//////////////////////////////////////
		JMenu saveAndLoadMenu = new JMenu("Save and Load");
		menuBar.add(saveAndLoadMenu);
				
		addClassItem = new JMenuItem("Save");
		addClassItem.addActionListener(controller.saveActionListener());
		saveAndLoadMenu.add(addClassItem);
				
		addClassItem = new JMenuItem("Load");
		addClassItem.addActionListener(controller.loadActionListener());
		saveAndLoadMenu.add(addClassItem);
		
		*/
		frame.setJMenuBar(menuBar);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void addActionListener (ActionListener listener, int menuPosition, int menuItemPosition) {
		
		menuBar.getMenu(menuPosition).getItem(menuItemPosition).addActionListener(listener);
	}

}

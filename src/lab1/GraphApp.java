package lab1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class GraphApp extends Canvas {

	int x,y;
	int ax,by;
	JComboBox comboBox, comboBox2;
	String[] graphs = {"select..","11 / 1-1","22 / 2-2","33 / 3-3","44 / 4-4"};
	String[] graphsPaint = {"No pouring","pouring"};
	
	JFrame appWindow = new JFrame("Paint Window"); 
    Graphics graphics;
	private Choice choice = new Choice();
	
	public GraphApp() {
		super();
		
		appWindow.setTitle("Graph App");
		appWindow.setSize(1600,900);
	
		appWindow.setVisible(true);
	
	
		appWindow.setVisible(true);
		appWindow.setLayout(new GridLayout());
		
		
	
		
		appWindow.add(this);
		appWindow.setVisible(true);
		Color clr = Color.WHITE;
		setBackground(clr);
		
		comboBox = new JComboBox(graphs);
		comboBox2 = new JComboBox(graphsPaint);
		
		
		comboBox.setBounds(700, 100, 120, 25);
		comboBox2.setBounds(600, 50, 120, 25);
		comboBox.setEditable(true);
		comboBox2.setEditable(true);
		appWindow.add(comboBox);
		appWindow.add(comboBox2);
		
		
		setVisible(true);
		appWindow.	setResizable(false);
		appWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		graphics = getGraphics();
		
		comboBox.addItemListener(choice);
		x = 30; //x=200;
		y = 300;
		
	}
	
	public void paint (Graphics g) {
		
	//	ItemEvent event = null;
		
		g.drawLine(300, 30, 300, 600); // y axis
		g.drawLine(30, 300, 600, 300);
		g.fillOval(x, y, 3, 3);
		g.setColor(Color.red);
		
		g.drawString("Y", 310, 65);
		g.drawString("4", 310, 95);
		g.drawString("3", 310, 155);
		g.drawString("2", 310, 215);
		g.drawString("1", 310, 275);
		
		g.drawString("-1", 310, 335);
		g.drawString("-2", 310, 395);
		g.drawString("-3", 310, 455);
		g.drawString("-4", 310, 515);
		g.drawString("Y'", 310, 600);
		/////////////////////////////////////////
		g.drawString("X", 30, 314);
		g.drawString("4", 90, 314);
		g.drawString("3", 150, 314);
		g.drawString("2", 210, 314);
		g.drawString("1", 270, 314);
		
		g.drawString("-1", 320, 314);
		g.drawString("-2", 380, 314);
		g.drawString("-3", 440, 314);
		g.drawString("-4", 500, 314);
		g.drawString("X'", 600, 314);
	
	}
			
private class Choice implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent event) {
		if(event.getSource() == comboBox) {
			if(comboBox.getSelectedItem().equals("44 / 4-4")&& comboBox2.getSelectedItem().equals("No pouring")) {
			graphics.drawRect(95, 90, 410, 421);
			graphics.drawOval(3, 3, 593, 593);
			//graphics.clearRect(95, 90, 410, 421);
			}else if(comboBox.getSelectedItem().equals("44 / 4-4") && comboBox2.getSelectedItem().equals("pouring")) {
				graphics.fillRect(95, 90, 410, 421);			       
				graphics.fillOval(3, 3, 593, 593);
			}else if(comboBox.getSelectedItem().equals("33 / 3-3")&& comboBox2.getSelectedItem().equals("No pouring")){
			graphics.drawRect(155, 150, 290, 301);
			graphics.drawOval(90, 90, 420, 420);
			}else if(comboBox.getSelectedItem().equals("33 / 3-3") && comboBox2.getSelectedItem().equals("pouring")) {
				graphics.fillRect(155, 150, 290, 301);			       
				graphics.fillOval(90, 90, 420, 420);
			}else	if(comboBox.getSelectedItem().equals("22 / 2-2")&& comboBox2.getSelectedItem().equals("No pouring")){
        	graphics.drawRect(215, 210, 170, 181);
	        graphics.drawOval(175, 175, 250, 250);
			}else	if(comboBox.getSelectedItem().equals("22 / 2-2")&& comboBox2.getSelectedItem().equals("pouring")) {
	        	graphics.fillRect(215, 210, 170, 181);
		        graphics.fillOval(175, 175, 250, 250);
			}else if(comboBox.getSelectedItem().equals("11 / 1-1")&& comboBox2.getSelectedItem().equals("No pouring")){
        	graphics.drawRect(275, 270, 50, 61);
	        graphics.drawOval(260, 260, 80, 80);
			}else if(comboBox.getSelectedItem().equals("11 / 1-1")&& comboBox2.getSelectedItem().equals("pouring")) {
	        	graphics.fillRect(275, 270, 50, 61);
		        graphics.fillOval(260, 260, 80, 80);
			}
		}else {
			System.out.println("Choice");
		}
	}

}}




 

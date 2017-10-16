package mypackage;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ZeitDiffGui {
	
	private static final String FRAME_TITLE = "ZeitDiff";
	
	public static String getFrameTitle() {
		return FRAME_TITLE;
	}

	public static void main(String[] args) {
		startApp();
	}
	
	private static String calcDiff(String start, String end) {
		return "" + ZeitDiff.calculateDiff(start, end);
	}
	
	private static void startApp() {
		JPanel panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createEmptyBorder(16, 16, 4, 16));
		panel1.setLayout(new GridLayout(1, 1));
		panel1.add(new JLabel("bitte start-und endzeit eingeben und button betätigen"));
		
		JTextField start = new JTextField();
		JTextField end = new JTextField();
		JTextField ausgabe = new JTextField();
		JButton butt = new JButton("differenz berechnen");
		
		butt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ausgabe.setText(calcDiff(start.getText(), end.getText()));
			}
		});
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(4, 16, 16, 16));
		panel2.setLayout(new GridLayout(3, 2, 16, 16));
		panel2.add(new JLabel("startzeit hh:mm:ss"));
		panel2.add(start);
		panel2.add(new JLabel("endzeit hh:mm:ss"));
		panel2.add(end);
		panel2.add(butt);
		panel2.add(ausgabe);
		
		JFrame frame = new JFrame(FRAME_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocation(100, 100);
		frame.setLayout(new BorderLayout(16, 16));
		
		frame.add(panel1, BorderLayout.PAGE_START);
		frame.add(panel2, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}

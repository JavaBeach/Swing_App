package testpackage;

import org.netbeans.jemmy.ClassReference;
import org.netbeans.jemmy.operators.JButtonOperator;
import org.netbeans.jemmy.operators.JFrameOperator;
import org.netbeans.jemmy.operators.JTextFieldOperator;

import mypackage.ZeitDiffGui;

public class ZeitDiffGuiJemmyTest {
	
	JFrameOperator frame;
	JTextFieldOperator start;
	JTextFieldOperator end;
	JButtonOperator butt;
	JTextFieldOperator ausgabe;
	
	public ZeitDiffGuiJemmyTest() {
		try {
			new ClassReference("mypackage.ZeitDiffGui").startApplication();
			frame = new JFrameOperator(ZeitDiffGui.getFrameTitle());
			start = new JTextFieldOperator(frame, 0);
			end = new JTextFieldOperator(frame, 1);
			butt = new JButtonOperator(frame);
			ausgabe = new JTextFieldOperator(frame, 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setStartZeit(String s) {
		start.setText(s);
	}
	
	public void setEndZeit(String s) {
		end.setText(s);
	}
	
	public void pushButton() {
		butt.push();
	}
	
	public String getAusgabe() {
		return ausgabe.getText();
	}

	public String execute(String input1, String input2) {
		try {
			setStartZeit(input1);
			setEndZeit(input2);
			pushButton();
			return getAusgabe();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

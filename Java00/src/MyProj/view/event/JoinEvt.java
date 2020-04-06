package MyProj.view.event;

import java.awt.event.*;
import javax.swing.JOptionPane;
import MyProj.view.*;
import MyProj.VO.*;
import MyProj.DAO.*;

public class JoinEvt implements ActionListener{
	JoinMember main;
	MemberDAO mDAO;
	
	public JoinEvt() {}
	
	public JoinEvt(JoinMember main) {
		this.main = main;
		mDAO = new MemberDAO();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int cnt = 0;
		if(getData()) {
			cnt
		}
		
	}
}

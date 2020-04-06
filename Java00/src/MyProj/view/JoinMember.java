package MyProj.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

import MyProj.VO.*;
import MyProj.view.event.*;

public class JoinMember extends JPanel {
	public MembInfo main;
	public JLabel nameL, idL, pwL, repwL, telL, mailL, genL, avtL;
	public JTextField id, name, tel1, tel2, mail;
	public JPasswordField pw, repw;
	public JRadioButton[] gen, avt;
	public JComboBox<String> tel0;
	public JPanel nameP, idP, pwP, repwP, telP, mailP, genP, avtP, avtContMP, avtSubP, avtContFP, blankP;
	public Image[] img;
	public JButton sBtn;
	public ButtonGroup genG, avtG;
	public MemberVO mVO;

	// 생성자 함수
	public JoinMember(MembInfo main) {
		this.main = main;
		mVO = new MemberVO();
		loadImg(6);
		labelInit();
	}

	public void labelInit() {

		JPanel mainP = new JPanel(new BorderLayout());
		JPanel subP = new JPanel();
		subP.setPreferredSize(new Dimension(500, 410));

		nameL = new JLabel("Name ");
		nameL.setPreferredSize(new Dimension(120, 30));
		idL = new JLabel("Member ID ");
		idL.setPreferredSize(new Dimension(120, 30));
		pwL = new JLabel("Password ");
		pwL.setPreferredSize(new Dimension(120, 30));
		repwL = new JLabel("Password Check ");
		repwL.setPreferredSize(new Dimension(120, 30));
		telL = new JLabel("Telephone ");
		telL.setPreferredSize(new Dimension(120, 30));
		mailL = new JLabel("E-Mail ");
		mailL.setPreferredSize(new Dimension(120, 30));
		genL = new JLabel("Gender ");
		genL.setPreferredSize(new Dimension(120, 30));
		avtL = new JLabel("Avatar ");
		avtL.setPreferredSize(new Dimension(120, 30));
		JPanel avtLP = new JPanel();
		avtLP.setPreferredSize(new Dimension(120, 30));
		avtLP.add(avtL);

		nameL.setHorizontalTextPosition(SwingConstants.RIGHT);
		nameL.setVerticalTextPosition(SwingConstants.CENTER);
		nameL.setBackground(Color.green);
		// panel
		nameP = new JPanel(new BorderLayout());
		nameP.setPreferredSize(new Dimension(450, 30));
		idP = new JPanel(new BorderLayout());
		idP.setPreferredSize(new Dimension(450, 30));
		pwP = new JPanel(new BorderLayout());
		pwP.setPreferredSize(new Dimension(450, 30));
		repwP = new JPanel(new BorderLayout());
		repwP.setPreferredSize(new Dimension(450, 30));
		telP = new JPanel(new BorderLayout());
		telP.setPreferredSize(new Dimension(450, 30));
		mailP = new JPanel(new BorderLayout());
		mailP.setPreferredSize(new Dimension(450, 30));
		genP = new JPanel(new BorderLayout());
		genP.setPreferredSize(new Dimension(450, 30));
		avtP = new JPanel(new BorderLayout());
		avtP.setPreferredSize(new Dimension(450, 30));
//		avtL.setBackground(Color.blue); >?

		nameP.add(nameL, BorderLayout.WEST);
		idP.add(idP, BorderLayout.WEST);
		pwP.add(pwP, BorderLayout.WEST);
		repwP.add(repwP, BorderLayout.WEST);
		telP.add(telP, BorderLayout.WEST);
		mailP.add(mailP, BorderLayout.WEST);
		genP.add(genP, BorderLayout.WEST);
		avtP.add(avtP, BorderLayout.WEST);

		name = new JTextField();
		id = new JTextField();
		pw = new JPasswordField();
		repw = new JPasswordField();

		//
		String[] localNo = { "02", "010", "011", "031", "032", "041", "042", "051", "061" };
		tel0 = new JComboBox<String>(localNo);
		tel0.setPreferredSize(new Dimension(80, 30));
		tel1 = new JTextField();
		tel1.setPreferredSize(new Dimension(120, 30));
		tel2 = new JTextField();
		tel2.setPreferredSize(new Dimension(120, 30));
		JPanel telContP = new JPanel(new BorderLayout());
		telContP.add(tel0, BorderLayout.WEST);
		telContP.add(tel1, BorderLayout.CENTER);
		telContP.add(tel2, BorderLayout.EAST);

		//
		mail = new JTextField();

		// avatar
		avtContMP = new JPanel(new GridLayout(1, 3));
		avtContFP = new JPanel(new GridLayout(1, 3));
		avtContMP.setPreferredSize(new Dimension(300, 100));
		avtContFP.setPreferredSize(new Dimension(300, 100));
		JPanel[] aP = new JPanel[6];
		
		JPanel[] imgP = new JPanel[6];
		
		
		avt = new JRadioButton[6];
		avtG = new ButtonGroup();
		blankP = new JPanel();
		blankP.setPreferredSize(new Dimension(300, 100));
		for(int i = 0 ; i < 6 ; i ++) {
			Image tmp = img[i];
			imgP[i] = new JPanel() {
				@Override
				public void paint(Graphics g){
					g.drawImage(tmp, 0 , 0, null);
				}
			};
			imgP[i].setPreferredSize(new Dimension(80, 80));
			aP[i] = new JPanel(new BorderLayout());
			aP[i].setPreferredSize(new Dimension(80, 100));
			aP[i].add(imgP[i], BorderLayout.CENTER);
			avt[i] = new JRadioButton("avatar" + (i+1));
			avt[i].addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					mVO.setAvatar("img_" + e.getActionCommand()+".png");
					
				}
			
			});
			avt[i].setPreferredSize(new Dimension(80, 20));
			avtG.add(avt[i]);
			aP[i].add(avt[i], BorderLayout.SOUTH);
			if(i < 3) {
				avtContMP.add(aP[i]);
			} else {
				avtContFP.add(aP[i]);
			}
					
		}
			
		// black JPanel.

	}

	public void loadImg(int cnt) {
		img = new Image[cnt];
		for (int i = 0; i < cnt; i++) {
			img[i] = new ImageIcon(new ImageIcon("src/MyProj/view/img/imgavatar" + (i + 1) + ".png").getImage()
					.getScaledInstance(100, 100, Image.SCALE_SMOOTH)).getImage();
		}
	}

	public class GBtnEvt implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			mVO.setGen(e.getActionCommand().contentEquals("Male") ? "M" : "F");
			avtG.clearSelection();
			if (e.getActionCommand().equals("Male")) {
				blankP.setVisible(false);
				avtContFP.setVisible(false);
				avtContMP.setVisible(true);
				avtSubP.remove(blankP);
				avtSubP.remove(avtContMP);
				avtSubP.remove(avtContFP);
				avtSubP.add(avtContMP, BorderLayout.CENTER);
			} else {
				blankP.setVisible(false);
				avtContFP.setVisible(false);
				avtContMP.setVisible(true);
				avtSubP.remove(blankP);
				avtSubP.remove(avtContMP);
				avtSubP.remove(avtContFP);
				avtSubP.add(avtContMP, BorderLayout.CENTER);
			}
		}
	}
}

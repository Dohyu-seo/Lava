package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/*
 	¹®Á¦ 1]
 		ÀÌ¸ŞÀÏÀ» ÀÔ·Â¹Ş¾Æ¼­
 		ÀÔ·Â¹ŞÀº ¹®ÀÚ¿­ÀÌ ÀÌ¸ŞÀÏÇü½Ä¿¡ ¸Â´ÂÁö ¾Æ´ÑÁö °Ë»çÇÏ¼¼¿ä.
 		
 		ÀÌ¸ŞÀÏ Çü½ÄÀº
 		 	¾ËÆÄºª°ú ¼ıÀÚ·Î 8±ÛÀÚÀÌ»óÀ¸·Î ÇÏ°í @ µµ¸ŞÀÎÁÖ¼Ò (co.krº¸ÀÌ´Â°Å ´Ù)
 		·Î Ã³¸®ÇÏ¼¼¿ä.
 		Âü°í ]
 			ÇÑ±Û Ã³¸® : [°¡-ÆR] - ÇÑ±ÛÀº ¾ÆÀÌµğ¿¡ ¾²Áö¸¶¼¼¿ä.
 			
 */
public class Ex01 {
	
	public Ex01() {
		// ÀÌ¸ŞÀÏ ÀÔ·Â¹ŞÀ» º¯¼ö ¸¸µé±â~
		String val = JOptionPane.showInputDialog("ÀÌ¸ŞÀÏÀ» ÀÔ·ÂÇÏ¼¼¿ä. ex)8±ÛÀÚ ÀÌ»ó@µµ¸ŞÀÎ ÁÖ¼Ò");
		
		// ÀÌ¸ŞÀÏ Çü½Ä¿¡ ¸Â°Ô ›§´ÂÁö °Ë»çÇÏ±â~
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,}+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]{2,3}\\.*[a-zA-Z]{2}+$");//
		
		Matcher match = pattern.matcher(val);
		//ÀÌÁ¦ °Ë»ç°á°ú´Â ;;
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "¿Ã¹Ù¸¥ ÀÌ¸ŞÀÏ ÀÔ´Ï´Ù.");
		}else {
			JOptionPane.showMessageDialog(null, "Àß¸øµÈ ÀÌ¸ŞÀÏ ÀÔ´Ï´Ù.");
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}
}

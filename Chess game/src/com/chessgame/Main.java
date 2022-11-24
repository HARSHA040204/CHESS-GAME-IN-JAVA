package com.chessgame;

import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

import com.chessgame.Frame.Frame;
//public String getTxt;
public class Main {
//	public String getTxt;
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Frame();
			}
		});
	}

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}

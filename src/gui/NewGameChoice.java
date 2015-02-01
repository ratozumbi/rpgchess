package gui;

import javax.swing.*;

public class NewGameChoice {

	ChessBoard chessBoard;
	JOptionPane optionPane;
	JDialog dialog;

	public NewGameChoice(ChessBoard chessBoard) {
		this.chessBoard = chessBoard;
	}

	public void show() {
        int n = JOptionPane.showConfirmDialog(
        		chessBoard, "Really start a new game?",
                "New game",
                JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
        	chessBoard.reset();
        }
	}
//		optionPane = new JOptionPane(
//				"Really start a new game?",
//				JOptionPane.QUESTION_MESSAGE,
//				JOptionPane.YES_NO_OPTION);
//
//		dialog = new JDialog(chessBoard,
//				"New game",
//				true);
//		dialog.setContentPane(optionPane);
//		dialog.setDefaultCloseOperation(
//				JDialog.DO_NOTHING_ON_CLOSE);
//		optionPane.addPropertyChangeListener(
//				new PropertyChangeListener() {
//					public void propertyChange(PropertyChangeEvent e) {
//						String prop = e.getPropertyName();
//
//						if (dialog.isVisible()
//								&& (e.getSource() == optionPane)
//								&& (!Integer.valueOf(-1).equals((Integer)optionPane.getValue()))
//								&& (JOptionPane.VALUE_PROPERTY.equals(prop))) {
//							//If you were going to check something
//							//before closing the window, you'd do
//							//it here.
//							dialog.setVisible(false);
//						}
//					}
//				});
//		dialog.pack();
//		dialog.setLocationRelativeTo(chessBoard);
//		dialog.setVisible(true);
//
//		int value = ((Integer)optionPane.getValue()).intValue();
//		if (value == JOptionPane.YES_OPTION) {
//			chessBoard.reset();
//		}

}

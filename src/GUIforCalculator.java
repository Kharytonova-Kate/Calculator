import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIforCalculator extends JFrame {
	private final int WIND_WIDHT = 250;
	private final int WIND_HEIGHT = 350;
	private final int ROWS_OF_BUTTONS = 5;
	private final int COLS_OF_BUTTONS = 4;
	static JTextField textField = new JTextField();

	public GUIforCalculator() {
		super();
		this.setSize(WIND_WIDHT, WIND_HEIGHT);
		this.setTitle("My calculator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container mainContainer = new Container();
		textField.setEditable(false);

		Container buttonContainer = new Container();
		doButtons(buttonContainer, textField);

		mainContainer.setLayout(new GridLayout(2, 1));

		mainContainer.add(textField);

		mainContainer.add(buttonContainer);
		this.add(mainContainer);

	}

	private Container doButtons(Container buttonContainer,
			final JTextField textField) {

		buttonContainer.setLayout(new GridLayout(ROWS_OF_BUTTONS,
				COLS_OF_BUTTONS, 10, 10));
		JButton one = new JButton("1");
		buttonSettings(one);
		JButton two = new JButton("2");
		buttonSettings(two);
		JButton three = new JButton("3");
		buttonSettings(three);
		JButton four = new JButton("4");
		buttonSettings(four);
		JButton five = new JButton("5");
		buttonSettings(five);
		JButton six = new JButton("6");
		buttonSettings(six);
		JButton seven = new JButton("7");
		buttonSettings(seven);
		JButton eight = new JButton("8");
		buttonSettings(eight);
		JButton nine = new JButton("9");
		buttonSettings(nine);
		JButton zero = new JButton("0");
		buttonSettings(zero);
		JButton point = new JButton(".");
		buttonPointSettings(point);
		JButton plus = new JButton("+");
		buttonMathActionsSettings(plus);
		JButton min = new JButton("-");
		buttonMathActionsSettings(min);
		JButton div = new JButton("/");
		buttonMathActionsSettings(div);
		JButton mul = new JButton("*");
		buttonMathActionsSettings(mul);
		JButton equally = new JButton("=");
		equally.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				String text = textField.getText();
				List<String> textForCalculate = new<String> ArrayList();
				textForCalculate.add(text);
				textField.setText(Calculator.calculate(textForCalculate));
			}
		});

		JButton clearOne = new JButton("C");
		clearOne.setBackground(Color.GREEN);
		clearOne.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				String text = textField.getText();
				text = text.substring(0, text.length() - 1);
				textField.setText(text);
			}
		});

		JButton clearAll = new JButton("CE");
		clearAll.setBackground(Color.RED);
		clearAll.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});

		buttonContainer.add(seven);
		buttonContainer.add(eight);
		buttonContainer.add(nine);
		buttonContainer.add(mul);
		buttonContainer.add(four);
		buttonContainer.add(five);
		buttonContainer.add(six);
		buttonContainer.add(div);
		buttonContainer.add(one);
		buttonContainer.add(two);
		buttonContainer.add(three);
		buttonContainer.add(plus);
		buttonContainer.add(zero);
		buttonContainer.add(point);
		buttonContainer.add(equally);
		buttonContainer.add(min);
		buttonContainer.add(clearOne);
		buttonContainer.add(clearAll);

		return buttonContainer;
	}

	private static void buttonSettings(final JButton button) {
		button.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				String text = textField.getText();
				text = text + button.getText();
				textField.setText(text);
			}
		});

	}

	private static void buttonMathActionsSettings(final JButton button) {
		button.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				String text = textField.getText();
				if (text.contains("+") || text.contains("-")
						|| text.contains("*") || text.contains("/")) {
					List<String> textForCalculate = new<String> ArrayList();
					textForCalculate.add(text);
					textField.setText(Calculator.calculate(textForCalculate)
							+ button.getText());
					return;
				}

				text = text + button.getText();
				textField.setText(text);
			}
		});

	}

	private static void buttonPointSettings(final JButton button) {
		button.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				String text = textField.getText();
				if (text.contains(".")) {
					if (text.contains("+")) {
						String subText = text.substring(text.indexOf("+") + 1,
								text.length());
						if (!subText.contains(".")) {
							text = text + button.getText();
							textField.setText(text);
						}

					} else if (text.contains("-")) {
						String subText = text.substring(text.indexOf("-") + 1,
								text.length());
						if (!subText.contains(".")) {
							text = text + button.getText();
							textField.setText(text);
						}
					} else if (text.contains("*")) {
						String subText = text.substring(text.indexOf("*") + 1,
								text.length());
						if (!subText.contains(".")) {
							text = text + button.getText();
							textField.setText(text);
						}
					} else if (text.contains("/")) {
						String subText = text.substring(text.indexOf("/") + 1,
								text.length());
						if (!subText.contains(".")) {
							text = text + button.getText();
							textField.setText(text);
						}
					}
				} else {
					text = text + button.getText();
					textField.setText(text);
				}
			}

		});

	}

}

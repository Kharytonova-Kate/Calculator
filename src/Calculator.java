import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
	static List<Variables> allVariables; // ������, ���������� � ���� ���
											// ������������������ �������������
											// ��������

	public Calculator(String name) throws FileNotFoundException {// � ��������
																	// ���������
																	// name
																	// �����������
																	// ���
																	// �����,
																	// �������
																	// ����������
																	// ������� �
																	// ���������
		FileReader file = new FileReader(name);
		Scanner text = new Scanner(file);
		List<String> scannedText = new ArrayList();// ������ �����, �������� ��
													// ��������� �����.����
													// ������� ������ - ����
													// ������ �����
		while (text.hasNext()) {
			String a = text.nextLine();

			scannedText.add(a);
		}
		allVariables = new ArrayList();

		calculate(scannedText);
		
	}

	public static String calculate(List<String> scannedText) {// � ��������
															// ���������
															// scannedText
															// ���������� ������
															// �����, ���������
															// �� ���������
															// �����
		String rez = "";

		for (int i = 0; i < scannedText.size(); i++) {// ���� ���������� ���
														// �������� ������ �
														// ���������, ����������
														// �� � ������� �������
														// ��� ��������������
														// ���������� � ��������
														// ���������������
														// �������� ����� ������
														// mathActions

			if ((scannedText.get(i)).contains("=")) {
				mathActions.initialization(scannedText.get(i));
			} else {
				if ((scannedText.get(i)).contains("+")) {
					rez = mathActions.addition(scannedText.get(i));
				} else {
					if ((scannedText.get(i)).contains("-")) {
						rez = mathActions.subtraction(scannedText.get(i));
					} else {
						if ((scannedText.get(i)).contains("/")) {
							rez = mathActions.division(scannedText.get(i));
						} else {
							if ((scannedText.get(i)).contains("*")) {
								rez = mathActions.multiplication(scannedText.get(i));
							} else {
								System.out.println("���������� ����������");
							}
						}
					}
				}
			}
		}
		return rez;
	}
	public static void main(String[] args)  {

		GUIforCalculator my = new GUIforCalculator();
		my.setVisible(true);

	}
}

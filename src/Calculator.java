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

	public static void calculate(List<String> scannedText) {// � ��������
															// ���������
															// scannedText
															// ���������� ������
															// �����, ���������
															// �� ���������
															// �����

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
				if ((scannedText.get(i)).contains("/")) {
					mathActions.addition(scannedText.get(i));
				} else {
					if ((scannedText.get(i)).contains("*")) {
						mathActions.subtraction(scannedText.get(i));
					} else {
						if ((scannedText.get(i)).contains("-")) {
							mathActions.division(scannedText.get(i));
						} else {
							if ((scannedText.get(i)).contains("+")) {
								mathActions.multiplication(scannedText.get(i));
							} else {
								System.out.println("���������� ����������");
							}
						}
					}
				}
			}
		}
	}

}

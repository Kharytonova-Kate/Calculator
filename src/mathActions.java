public class mathActions {
	public static boolean canCalculate; // ���������� ��� ����������� ����������
										// � ��� ������, ���� ���������
										// ���������� �� ���� ����������������

	public static void initialization(String a) { // ����� ���������� ���
													// ������������� ����������
		System.out.print("�������������: ");
		String name = a.substring(0, a.indexOf("="));// �������� �� ��������
														// ������ ��������� �
														// ������� ������� ��
														// �������"="
		System.out.print("��� ����������: " + name);
		String value = a.substring((a.indexOf("=") + 1));// �������� �� ��������
															// ������ ���������
															// ������� �
															// �������,
															// ���������� �����
															// "=" � �� �����

		double valueDouble = Double.parseDouble(value);
		System.out.println(" �������� ����������: " + valueDouble);
		Variables variables = new Variables(name, valueDouble);// ������� ������
																// ������
																// Variables �
																// �����������
																// ����������
		Calculator.allVariables.add(variables);// ��������� ��������� ������ �
												// ������ allVariables
	}

	public static void addition(String a) {
		System.out.print("��������: ");
		String key1 = a.substring(0, a.indexOf("+"));// �������� �� ��������
														// ������ ��������� �
														// ������� ������� ��
														// �������"+"
		double value1 = Parser.getValueByKey(key1); // �������� ��������,
													// ��������������� ���������
													// ����������
		if (canCalculate) { // �������� �� ����������� ������������ ���������� �
							// ��������� ����������
		} else {
			return;// ����� �� ������ � ������, ���� ��������� �������������
					// ������� �� ����� ���� ������������ ��� ����������
		}

		String key2 = a.substring((a.indexOf("+") + 1));// �������� �� ��������
														// ������ ���������
														// ������� � �������,
														// ���������� ����� "+"
														// � �� �����

		double value2 = Parser.getValueByKey(key2); // ���������� ������
													// ��������� ������
		if (canCalculate) {
		} else {
			return;
		}

		System.out.print(key1 + "+" + key2 + "=");
		System.out.println(value1 + value2); // ����� ���������� � �������
	}

	public static void subtraction(String a) {// ���������� ��������
		System.out.print("���������: ");
		String key1 = a.substring(0, a.indexOf("-"));
		double value1 = Parser.getValueByKey(key1);
		if (canCalculate) {
		} else {
			return;
		}

		String key2 = a.substring((a.indexOf("-") + 1));
		double value2 = Parser.getValueByKey(key2);
		if (canCalculate) {
		} else {
			return;
		}

		System.out.print(key1 + "-" + key2 + "=");
		System.out.println(value1 - value2);
	}

	public static void multiplication(String a) {// ���������� ��������
		System.out.print("���������: ");
		String key1 = a.substring(0, a.indexOf("*"));
		double value1 = Parser.getValueByKey(key1);
		if (canCalculate) {
		} else {
			return;
		}

		String key2 = a.substring((a.indexOf("*") + 1));
		double value2 = Parser.getValueByKey(key2);
		if (canCalculate) {
		} else {
			return;
		}

		System.out.print(key1 + "*" + key2 + "=");
		System.out.println(value1 * value2);
	}

	public static void division(String a) {// ���������� ��������
		System.out.print("�������: ");
		String key1 = a.substring(0, a.indexOf("/"));
		double value1 = Parser.getValueByKey(key1);
		if (canCalculate) {
		} else {
			return;
		}

		String key2 = a.substring((a.indexOf("/") + 1));
		double value2 = Parser.getValueByKey(key2);
		if (canCalculate) {
		} else {
			return;
		}

		System.out.print(key1 + "/" + key2 + "=");
		System.out.println(value1 / value2);
	}
}

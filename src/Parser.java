public class Parser {
	public static double getValueByKey(String key) {
		double valueByKey = 0;
		try {
			valueByKey = Double.parseDouble(key); // ���������, �� �������� ��
													// ������ �������� key
			mathActions.canCalculate = true;
			return valueByKey;
		} catch (java.lang.NumberFormatException e) {
			for (int i = 0; i < Calculator.allVariables.size(); i++) {

				if (((Calculator.allVariables.get(i)).getName()).equals(key)) {// ���������,
																				// ������
																				// ��������
																				// �������������
																				// ���������
																				// ���
																				// ����������
					valueByKey = (Calculator.allVariables.get(i)).getValue();
					mathActions.canCalculate = true;
					return valueByKey;
				} else {
					if (i == Calculator.allVariables.size() - 1) {// ���
																	// ���������
																	// ���������
																	// ��������
																	// �����
																	// �������
																	// ���������
																	// ������������
																	// �� ������
						System.out.println("���������� " + key
								+ " �� ����������������");
						mathActions.canCalculate = false; // ��� ������ ��
															// �������
															// ���������� ������
															// mathActions

					}
				}

			}
		}
		return valueByKey;
	}

}

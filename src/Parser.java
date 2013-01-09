public class Parser {
	public static double getValueByKey(String key) {
		double valueByKey = 0;
		try {
			valueByKey = Double.parseDouble(key); // проверяет, не является ли
													// числом аргумент key
			mathActions.canCalculate = true;
			return valueByKey;
		} catch (java.lang.NumberFormatException e) {
			for (int i = 0; i < Calculator.allVariables.size(); i++) {

				if (((Calculator.allVariables.get(i)).getName()).equals(key)) {// проверяет,
																				// какому
																				// значению
																				// соответствует
																				// введенное
																				// имя
																				// переменной
					valueByKey = (Calculator.allVariables.get(i)).getValue();
					mathActions.canCalculate = true;
					return valueByKey;
				} else {
					if (i == Calculator.allVariables.size() - 1) {// при
																	// окончании
																	// последней
																	// итерации
																	// цикла
																	// выводит
																	// сообщение
																	// пользователю
																	// об ошибке
						System.out.println("переменная " + key
								+ " не инициализирована");
						mathActions.canCalculate = false; // для выхода из
															// методов
															// вычислений класса
															// mathActions

					}
				}

			}
		}
		return valueByKey;
	}

}

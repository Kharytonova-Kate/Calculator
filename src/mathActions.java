public class mathActions {
	public static boolean canCalculate; // переменная для прекращения вычислений
										// в том случае, если введенная
										// переменная не была инициализирована

	public static void initialization(String a) { // метод вызывается для
													// инициализации переменной
		System.out.print("инициализация: ");
		String name = a.substring(0, a.indexOf("="));// выделяет из исходной
														// строки субстроку с
														// первого символа да
														// символа"="
		System.out.print("имя переменной: " + name);
		String value = a.substring((a.indexOf("=") + 1));// выделяет из исходной
															// строки субстроку
															// начиная с
															// символа,
															// следующего после
															// "=" и до конца

		double valueDouble = Double.parseDouble(value);
		System.out.println(" значение переменной: " + valueDouble);
		Variables variables = new Variables(name, valueDouble);// создает объект
																// класса
																// Variables с
																// полученными
																// значениями
		Calculator.allVariables.add(variables);// добавляет созданный объект в
												// список allVariables
	}

	public static void addition(String a) {
		System.out.print("сложение: ");
		String key1 = a.substring(0, a.indexOf("+"));// выделяет из исходной
														// строки субстроку с
														// первого символа да
														// символа"+"
		double value1 = Parser.getValueByKey(key1); // получает значение,
													// соответствующее введенной
													// переменной
		if (canCalculate) { // проверка на возможность произведения вычислений с
							// введенной переменной
		} else {
			return;// выход из метода в случае, если введенные пользователем
					// символы не могут быть использованы для вычислений
		}

		String key2 = a.substring((a.indexOf("+") + 1));// выделяет из исходной
														// строки субстроку
														// начиная с символа,
														// следующего после "+"
														// и до конца

		double value2 = Parser.getValueByKey(key2); // аналогично первой
													// субстроке метода
		if (canCalculate) {
		} else {
			return;
		}

		System.out.print(key1 + "+" + key2 + "=");
		System.out.println(value1 + value2); // вывод результата в консоль
	}

	public static void subtraction(String a) {// аналогично сложению
		System.out.print("вычитание: ");
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

	public static void multiplication(String a) {// аналогично сложению
		System.out.print("умножение: ");
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

	public static void division(String a) {// аналогично сложению
		System.out.print("деление: ");
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

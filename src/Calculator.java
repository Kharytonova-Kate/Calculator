import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
	static List<Variables> allVariables; // список, содержащий в себе все
											// инициализированные пользователем
											// элементы

	public Calculator(String name) throws FileNotFoundException {// в качестве
																	// аргумента
																	// name
																	// указываетс€
																	// им€
																	// файла,
																	// который
																	// необходимо
																	// считать и
																	// вычислить
		FileReader file = new FileReader(name);
		Scanner text = new Scanner(file);
		List<String> scannedText = new ArrayList();// список строк, считаных из
													// исходного файла.один
													// элемент списка - одна
													// строка файла
		while (text.hasNext()) {
			String a = text.nextLine();

			scannedText.add(a);
		}
		allVariables = new ArrayList();

		calculate(scannedText);
		
	}

	public static void calculate(List<String> scannedText) {// в качестве
															// аргумента
															// scannedText
															// передаетс€ список
															// строк, считанных
															// из исходного
															// файла

		for (int i = 0; i < scannedText.size(); i++) {// цикл перебирает все
														// элементы списка и
														// провер€ет, содержатс€
														// ли в строках символы
														// дл€ математических
														// вычислений и вызывает
														// соответствующий
														// символам метод класса
														// mathActions

			if ((scannedText.get(i)).contains("=")) {
				mathActions.initialization(scannedText.get(i));
			} else {
				if ((scannedText.get(i)).contains("+")) {
					mathActions.addition(scannedText.get(i));
				} else {
					if ((scannedText.get(i)).contains("-")) {
						mathActions.subtraction(scannedText.get(i));
					} else {
						if ((scannedText.get(i)).contains("/")) {
							mathActions.division(scannedText.get(i));
						} else {
							if ((scannedText.get(i)).contains("*")) {
								mathActions.multiplication(scannedText.get(i));
							} else {
								System.out.println("объ€вление переменной");
							}
						}
					}
				}
			}
		}
	}

}

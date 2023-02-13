package service.impl;

import java.io.FilterInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import service.ScanService;

public class ScanServiceImp implements ScanService {

	private Scanner scanner;

	public ScanServiceImp() {
		scanner = new Scanner(new FilterInputStream(System.in) {
			public void close() {
			}
		});
	}

	public int pedirNumeroEntreRango(String msg, String errorMsg, int limiteInferiorInclusivo,
			int limiteSuperiorInclusivo) {
		int num = -1;
		boolean valid = false;

		do {
			num = pedirInt(msg, errorMsg);
			if (num >= limiteInferiorInclusivo && num <= limiteSuperiorInclusivo) {
				valid = true;
			} else {
				System.out.println(errorMsg);
			}
		} while (!valid);

		return num;
	}

	public int pedirInt(String msg, String errorMsg) {
		int num = -1;
		boolean valid = false;

		do {
			try {
				System.out.println(msg);
				String value = scanner.nextLine();
				num = Integer.parseInt(value);
				valid = true;
			} catch (NumberFormatException | InputMismatchException e) {
				System.out.println(errorMsg);
			}
		} while (!valid);

		return num;
	}

}

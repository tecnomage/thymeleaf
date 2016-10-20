package br.com.Daniel.Apt;


public class Daniel {

	public static void main(String[] args) {

		double soma;
		double totalPago;
		double restaPagar;

		totalPago = 3000 + 500 + 100 + 400;

		// 1600 + 400 + 764.5 + 954.5 + 954.5 + 261 + 1400 + 199;

		double mesa = 1800;
		double sofaCama = 1600;
		double hackTv = 400;
		double TvLG = 764;
		double lavadeira = 954.5;
		double geladeira = 954.5;
		double airfryer = 261;
		double camaqueen = 1400;
		double microondas = 199.5;

		soma = mesa + sofaCama + hackTv + TvLG + lavadeira + geladeira + airfryer + camaqueen + microondas;

		restaPagar = soma - totalPago;
		
		System.out.println(totalPago);
		System.out.println(soma);
		System.out.println("resta pagar  " + restaPagar);

	}

}

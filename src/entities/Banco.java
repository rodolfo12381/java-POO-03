package entities;

public class Banco {

		final private int idConta;
		private String nomeTitular;
		private double saldoInicial;
		
		public Banco (int idConta) {
			this.idConta = idConta;
		}
		public Banco (int idConta, String nomeTitular) {
			this.idConta = idConta;
			this.nomeTitular = nomeTitular;
			this.saldoInicial = 0.00;
		}
		public Banco (int idConta, String nomeTitular, double saldoInicial) {
			this.idConta = idConta;
			this.nomeTitular = nomeTitular;
			this.saldoInicial = saldoInicial;
		}
		public int getIdConta () {
			return this.idConta;
		}
		public String getNomeTitular() {
			return nomeTitular;
		}
		public void setNomeTitular(String nomeTitular) {
			this.nomeTitular = nomeTitular;
		}
		public double getSaldoInicial () {
			return this.saldoInicial;
		}
		public void realizaSaque (double saque) {
			this.saldoInicial -= ( saque + 5.00);
		}
		public void realizaDeposito (double deposito) {
			this.saldoInicial += deposito;
		}
		
}

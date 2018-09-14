package Classes;

public class Carro extends Veiculo {
	
	private boolean ligado;
	private Motor motor = new Motor();
	private MotorTurbo motorTurbo = new MotorTurbo();
	
	public boolean ligar()
	{
		if(this.ligado)
		{
			this.ligado = false;
			System.out.println("Painel desligado");
			this.motor.ligarMotor();
			System.out.println("Motor desligado");
		}
		else
		{
			this.ligado = true;
			System.out.println("Painel ligado");
			this.motor.ligarMotor(); 
			System.out.println("Motor ligado");
		}
		return this.ligado;
	}
	public boolean ligarTurbo()
	{
		if(this.ligado)
		{
			this.ligado = false;
			System.out.println("Painel desligado");
			this.motorTurbo.ligarTurbo();
			System.out.println("Motor turbo desligado");
		}
		else
		{
			this.ligado = true;
			System.out.println("Painel ligado");
			this.motorTurbo.ligarTurbo();
			System.out.println("Motor turbo ligado");
		}
		return this.ligado;
	}

	public boolean isLigado() {
		return this.ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

}

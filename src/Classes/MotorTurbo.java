package Classes;

public class MotorTurbo {
	
	private int id;
	private int forca;
	private boolean motorLigado;
	private boolean turboLigado;
	
	public boolean ligarMotor()
	{
		if(this.motorLigado)
		{
			this.motorLigado = false;
		}
		else
		{
			this.motorLigado = true;
		}
		return this.motorLigado;
	}
	
	public boolean ligarTurbo()
	{
		if(this.turboLigado)
		{
			this.turboLigado = false;
		}
		else
		{
			this.turboLigado = true;
		}
		return this.turboLigado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}

	public boolean isLigarTurbo() {
		return turboLigado;
	}

	public void setLigarTurbo(boolean turboLigado) {
		this.turboLigado = turboLigado;
	}

}

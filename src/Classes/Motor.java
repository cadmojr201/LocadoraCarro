package Classes;

public class Motor {
	
	private int id;
	private int forca;
	private boolean motorLigado;
	
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

	public boolean isLigado() {
		return motorLigado;
	}

	public void setmotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}

}

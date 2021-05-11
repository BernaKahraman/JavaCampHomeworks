package day4homework3;

public class Game{

	private int id;
	private String gameName;
	private double gameSale;
	
	public Game() {
		
	}

	public Game(int id, String gameName, double gameSale) {
		this.id = id;
		this.gameName = gameName;
		this.gameSale = gameSale;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGameSale() {
		return gameSale;
	}

	public void setGameSale(double gameSale) {
		this.gameSale = gameSale;
	}

}

package day4homework3;

public class Campaign {

	private int id;
	private String campaignName;
	private double campaignRate;
	
	public Campaign() {
		
	}

	public Campaign(int id, String campaignName, double campaignRate) {
		this.id = id;
		this.campaignName = campaignName;
		this.campaignRate = campaignRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getCampaignRate(Game game) {
		
		return game.getGameSale()- this.campaignRate();
	}

	private double campaignRate() {
		return 90;
	}

	public void setCampaignRate(double campaignRate) {
		this.campaignRate = campaignRate;
	}
	
	
	
}

package day4homework3;

public class Main {

	public static void main(String[] args) {
	
		User user= new User();
		user.setId(1);
		user.setFirstName("Berna");
		user.setLastName("Kahraman");
		user.setDateOfBirth(1997);
		user.setNationalityId("11111111111");
		
		
		Campaign campaign= new Campaign();
		campaign.setId(222);
		campaign.setCampaignName("Bayram Kampanyasý");
		campaign.setCampaignRate(90);
		
		
		Game game= new Game();
		game.setId(111);
		game.setGameName("Valorant");
		game.setGameSale(300);
		
	
		UserManager userManager= new UserManager(new UserValidationManager());
		userManager.Add(user);
		
		System.out.println("----------------------");
		
		CampaignManager campaignManager= new CampaignManager();
		campaignManager.useToCampaign(campaign);

		System.out.println("----------------------");
		
		GameSellManager gameSellManager= new GameSellManager(new CampaignManager());
		gameSellManager.shell(game, user, campaign);
	}

}

package day4homework3;

import day4homework3.IGameSellService;

public class GameSellManager implements IGameSellService {

	private CampaignService campaignService;
	
	public GameSellManager(CampaignService campaignService) {
		this.campaignService = campaignService;
		
	}
	
	@Override
	public void shell(Game game, User user, Campaign campaign) {
		campaignService.useToCampaign(campaign); 
		System.out.println( game.getGameName() + " oyunu : " + user.getFirstName() + " isimli kullanýcýya "
		+ campaign.getCampaignName() + " kullanýlarak " + campaign.getCampaignRate(game)+ " TL ye satýldý.");
		
	}
	
	@Override
	public void Update(Game game, User user, Campaign campaign) {
		System.out.println("Oyun güncellendi.");
		
	}

	@Override
	public void Delete(Game game, User user, Campaign campaign) {
		System.out.println("Oyun silindi.");
		
	}
	
	
}

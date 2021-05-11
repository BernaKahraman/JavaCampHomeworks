package day4homework3;

public class CampaignManager implements CampaignService {

	
	@Override
	public void Add(Campaign campaign) {
		System.out.println("Kampanya eklendi : " + campaign.getCampaignName());
		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println("Kampanya güncellendi : " + campaign.getCampaignName());
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getCampaignName());
		
	}

	@Override
	public void useToCampaign(Campaign campaign) {
		
		System.out.println( campaign.getCampaignName() + " :  isimli kampanya kullanýldý. ");
		
	}

	
}

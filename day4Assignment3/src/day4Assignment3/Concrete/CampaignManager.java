package day4Assignment3.Concrete;

import day4Assignment3.Abstract.CampaignService;
import day4Assignment3.Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getTitle() + " has been added.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getTitle() + " has been deleted.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getTitle() + " has been updated.");
	}

}

package edu.iis.mto.staticmock;

public class IncomingInfo {
	
	private String content;
	private SubsciptionType subscriptionType;

	public boolean requiresSubsciption() {
		return subscriptionType != SubsciptionType.NONE;
	}

	public String getContent() {
		return content;
	}

	public SubsciptionType getSubscriptionType() {		
		return subscriptionType;
	}

}

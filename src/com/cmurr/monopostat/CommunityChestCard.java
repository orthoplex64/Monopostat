package com.cmurr.monopostat;

public enum CommunityChestCard {
	
	JAIL("GO TO JAIL. GO DIRECTLY TO JAIL, DO NOT PASS GO, DO NOT COLLECT $200."),
	ANTIJAIL("GET OUT OF JAIL FREE. This card may be kept until needed or traded."),
	ADV_GO("ADVANCE TO GO. (COLLECT $200)"),
	REC_LIFE("LIFE INSURANCE MATURES. COLLECT $100."),
	REC_BEAUTY("YOU HAVE WON SECOND PRIZE IN A BEAUTY CONTEST. COLLECT $10."),
	REC_STOCK_SALE("FROM SALE OF STOCK YOU GET $50."),
	REC_TAX_REFUND("INCOME TAX REFUND. COLLECT $20."),
	REC_BIRTH("IT IS YOUR BIRTHDAY. COLLECT $10 FROM EVERY PLAYER."),
	REC_BANK_ERR("BANK ERROR IN YOUR FAVOR. COLLECT $200."),
	REC_HOLIDAY_FUND("HOLIDAY FUND MATURES. RECEIVE $100."),
	REC_INHERIT("YOU INHERIT $100."),
	REC_CONSULT("RECEIVE $25 CONSULTANCY FEE."),
	PAY_HOSPITAL("HOSPITAL FEES. PAY $100."),
	PAY_DOCTOR("DOCTOR'S FEES. PAY $50."),
	PAY_SCHOOL("SCHOOL FEES. PAY $50."),
	PAY_STREET("YOU ARE ASSESSED FOR STREET REPAIRS: PAY $40 PER HOUSE AND $115 PER HOTEL YOU OWN.");
	
	public final String text;
	
	private CommunityChestCard(String text) {
		this.text = text;
	}
}

package dataAbstraction;

public class LocalGovernment implements StateGovernment,CentralGovernment {
	public String rulingYears(String role) {
		if(role.equals("MLA")) {
			return "5Years";
		}
		else {
			return "6Years";
			
		}
	}
	public String headOfTheSystem(String government) {
		if(government.equals("State Government")) {
		return "Chief Minister is head of the State";
		}
		else {
			return "Prime Minister is the Head of the System";
		}
		
	}
	public String rulerName(String rulingParty) {
		if(rulingParty.equals("DMK")) {
			return "M.K.Stalin is the ChiefMinister";
		}
		else if (rulingParty.equals("ADMK")) {
			return "EPS is the ChiefMinister";
		}
		else {
			return "Others";
		}
	}
	

}

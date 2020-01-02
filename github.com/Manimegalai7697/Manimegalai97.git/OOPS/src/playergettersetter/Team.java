package playergettersetter;

public class Team {

	private String teamName;
	private String cityRepresented;


	public Team(String teamName, String cityRepresented) {
		super();
		this.teamName = teamName;
		this.cityRepresented = cityRepresented;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getCityRepresented() {
		return cityRepresented;
	}


	public void setCityRepresented(String cityRepresented) {
		this.cityRepresented = cityRepresented;
	}


}

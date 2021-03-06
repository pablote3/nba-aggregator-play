package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.joda.time.DateTime;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import util.DateTimeUtil;
import util.Enumerations.Conference;
import util.Enumerations.Division;
import util.Enumerations.Location;
import util.Enumerations.Result;
import util.Enumerations.SeasonType;
import util.Enumerations.TeamAbbr;

@Entity
public class OfficialBoxScore extends Model {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="table_gen", table="seq_table", pkColumnName="seq_name", valueColumnName="seq_count", pkColumnValue="officialboxscore_seq", initialValue=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="table_gen")
	private Long id;
	public Long getId() {
		return id;
	}
	
	@Required
	@Column(name="gameDate", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private DateTime gameDate;
	public DateTime getGameDate() {
		return gameDate;
	}
	public void setGameDate(DateTime gameDate) {
		this.gameDate = gameDate;
	}
	public String getTimeDisplay() {
		return DateTimeUtil.getDisplayTime(gameDate);
	}
	
	@Required
	@Column(name="officialLastName", length=25, nullable=false)
	private String officialLastName;
	public String getOfficialLastName() {
		return officialLastName;
	}
	public void setOfficialLastName(String officialLastName) {
		this.officialLastName = officialLastName;
	}
	
	@Required
	@Column(name="officialFirstName", length=25, nullable=false)
	private String officialFirstName;
	public String getOfficialFirstName() {
		return officialFirstName;
	}
	public void setOfficialFirstName(String officialFirstName) {
		this.officialFirstName = officialFirstName;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="seasonType", length=7, nullable=false)
	private SeasonType seasonType;
	public SeasonType getSeasonType() {
		return seasonType;
	}
	public void setSeasonType(SeasonType seasonType) {
		this.seasonType = seasonType;
	}
	
	@Column(name="minutes", nullable=false)
	private Short minutes;
	public Short getMinutes() {
		return minutes;
	}
	public void setMinutes(Short minutes) {
		this.minutes = minutes;
	}
	
	@Column(name="possessions", nullable=false)
	private Float possessions;
	public Float getPossessions() {
		return possessions;
	}
	public void setPossessions(Float possessions) {
		this.possessions = possessions;
	}
	
	@Column(name="pace", nullable=false)
	private Float pace;
	public Float getPace() {
		return pace;
	}
	public void setPace(Float pace) {
		this.pace = pace;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="teamAbbr", length=3, nullable=false)
	private TeamAbbr teamAbbr;
	public TeamAbbr getTeamAbbr() {
		return teamAbbr;
	}
	public void setTeamAbbr(TeamAbbr teamAbbr) {
		this.teamAbbr = teamAbbr;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="teamConference", length=4, nullable=false)
	private Conference teamConference;
	public Conference getTeamConference() {
		return teamConference;
	}
	public void setTeamConference(Conference teamConference) {
		this.teamConference = teamConference;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="teamDivision", length=9, nullable=false)
	private Division teamDivision;
	public Division getTeamDivision() {
		return teamDivision;
	}
	public void setTeamDivision(Division teamDivision) {
		this.teamDivision = teamDivision;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="teamLocation", length=4, nullable=false)
	private Location teamLocation;
	public Location getTeamLocation() {
		return teamLocation;
	}
	public void setTeamLocation(Location teamLocation) {
		this.teamLocation = teamLocation;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="teamResult", length=4, nullable=false)
	private Result teamResult;
	public Result getTeamResult() {
		return teamResult;
	}
	public void setTeamResult(Result teamResult) {
		this.teamResult = teamResult;
	}
	
	@Column(name="teamDaysOff", nullable=false)
	private Short teamDaysOff;
	public Short getTeamDaysOff() {
		return teamDaysOff;
	}
	public void setTeamDaysOff(Short teamDaysOff) {
		this.teamDaysOff = teamDaysOff;
	}

	@Column(name="teamPoints", nullable=false)
	private Short teamPoints;
	public Short getTeamPoints() {
		return teamPoints;
	}
	public void setTeamPoints(Short teamPoints) {
		this.teamPoints = teamPoints;
	}
	
	@Column(name="teamAssists", nullable=false)
	private Short teamAssists;
	public Short getTeamAssists() {
		return teamAssists;
	}
	public void setTeamAssists(Short teamAssists) {
		this.teamAssists = teamAssists;
	}
	
	@Column(name="teamTurnovers", nullable=false)
	private Short teamTurnovers;
	public Short getTeamTurnovers() {
		return teamTurnovers;
	}
	public void setTeamTurnovers(Short teamTurnovers) {
		this.teamTurnovers = teamTurnovers;
	}
	
	@Column(name="teamSteals", nullable=false)
	private Short teamSteals;
	public Short getTeamSteals() {
		return teamSteals;
	}
	public void setTeamSteals(Short teamSteals) {
		this.teamSteals = teamSteals;
	}
	
	@Column(name="teamBlocks", nullable=false)
	private Short teamBlocks;
	public Short getTeamBlocks() {
		return teamBlocks;
	}
	public void setTeamBlocks(Short teamBlocks) {
		this.teamBlocks = teamBlocks;
	}
	
	@Column(name="teamPersonalFouls", nullable=false)
	private Short teamPersonalFouls;
	public Short getTeamPersonalFouls() {
		return teamPersonalFouls;
	}
	public void setTeamPersonalFouls(Short teamPersonalFouls) {
		this.teamPersonalFouls = teamPersonalFouls;
	}
	
	@Column(name="teamFieldGoalAttempts", nullable=false)
	private Short teamFieldGoalAttempts;
	public Short getTeamFieldGoalAttempts() {
		return teamFieldGoalAttempts;
	}
	public void setTeamFieldGoalAttempts(Short teamFieldGoalAttempts) {
		this.teamFieldGoalAttempts = teamFieldGoalAttempts;
	}	
	
	@Column(name="teamFieldGoalMade", nullable=false)
	private Short teamFieldGoalMade;
	public Short getTeamFieldGoalMade() {
		return teamFieldGoalMade;
	}
	public void setTeamFieldGoalMade(Short teamFieldGoalMade) {
		this.teamFieldGoalMade = teamFieldGoalMade;
	}	

	@Column(name="teamThreePointAttempts", nullable=false)
	private Short teamThreePointAttempts;
	public Short getTeamThreePointAttempts() {
		return teamThreePointAttempts;
	}
	public void setTeamThreePointAttempts(Short teamThreePointAttempts) {
		this.teamThreePointAttempts = teamThreePointAttempts;
	}	

	@Column(name="teamThreePointMade", nullable=false)
	private Short teamThreePointMade;
	public Short getTeamThreePointMade() {
		return teamThreePointMade;
	}
	public void setTeamThreePointMade(Short teamThreePointMade) {
		this.teamThreePointMade = teamThreePointMade;
	}
	
	@Column(name="teamFreeThrowAttempts", nullable=false)
	private Short teamFreeThrowAttempts;
	public Short getTeamFreeThrowAttempts() {
		return teamFreeThrowAttempts;
	}
	public void setTeamFreeThrowAttempts(Short teamFreeThrowAttempts) {
		this.teamFreeThrowAttempts = teamFreeThrowAttempts;
	}	

	@Column(name="teamFreeThrowMade", nullable=false)
	private Short teamFreeThrowMade;
	public Short getTeamFreeThrowMade() {
		return teamFreeThrowMade;
	}
	public void setTeamFreeThrowMade(Short teamFreeThrowMade) {
		this.teamFreeThrowMade = teamFreeThrowMade;
	}	
	
	@Column(name="teamReboundsOffense", nullable=false)
	private Short teamReboundsOffense;
	public Short getTeamReboundsOffense() {
		return teamReboundsOffense;
	}
	public void setTeamReboundsOffense(Short teamReboundsOffense) {
		this.teamReboundsOffense = teamReboundsOffense;
	}
	
	@Column(name="teamReboundsDefense", nullable=false)
	private Short teamReboundsDefense;
	public Short getTeamReboundsDefense() {
		return teamReboundsDefense;
	}
	public void setTeamReboundsDefense(Short teamReboundsDefense) {
		this.teamReboundsDefense = teamReboundsDefense;
	}
	
	@Column(name="teamPointsQ1", nullable=false)
	private Short teamPointsQ1;
	public Short getTeamPointsQ1() {
		return teamPointsQ1;
	}
	public void setTeamPointsQ1(Short teamPointsQ1) {
		this.teamPointsQ1 = teamPointsQ1;
	}
	
	@Column(name="teamPointsQ2", nullable=false)
	private Short teamPointsQ2;
	public Short getTeamPointsQ2() {
		return teamPointsQ2;
	}
	public void setTeamPointsQ2(Short teamPointsQ2) {
		this.teamPointsQ2 = teamPointsQ2;
	}
	
	@Column(name="teamPointsQ3", nullable=false)
	private Short teamPointsQ3;
	public Short getTeamPointsQ3() {
		return teamPointsQ3;
	}
	public void setTeamPointsQ3(Short teamPointsQ3) {
		this.teamPointsQ3 = teamPointsQ3;
	}
	
	@Column(name="teamPointsQ4", nullable=false)
	private Short teamPointsQ4;
	public Short getTeamPointsQ4() {
		return teamPointsQ4;
	}
	public void setTeamPointsQ4(Short teamPointsQ4) {
		this.teamPointsQ4 = teamPointsQ4;
	}
	
	@Column(name="teamPointsQ5", nullable=false)
	private Short teamPointsQ5;
	public Short getTeamPointsQ5() {
		return teamPointsQ5;
	}
	public void setTeamPointsQ5(Short teamPointsQ5) {
		this.teamPointsQ5 = teamPointsQ5;
	}
	
	@Column(name="teamPointsQ6", nullable=false)
	private Short teamPointsQ6;
	public Short getTeamPointsQ6() {
		return teamPointsQ6;
	}
	public void setTeamPointsQ6(Short teamPointsQ6) {
		this.teamPointsQ6 = teamPointsQ6;
	}
	
	@Column(name="teamPointsQ7", nullable=false)
	private Short teamPointsQ7;
	public Short getTeamPointsQ7() {
		return teamPointsQ7;
	}
	public void setTeamPointsQ7(Short teamPointsQ7) {
		this.teamPointsQ7 = teamPointsQ7;
	}
	
	@Column(name="teamPointsQ8", nullable=false)
	private Short teamPointsQ8;
	public Short getTeamPointsQ8() {
		return teamPointsQ8;
	}
	public void setTeamPointsQ8(Short teamPointsQ8) {
		this.teamPointsQ8 = teamPointsQ8;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="opptTeamAbbr", length=3, nullable=false)
	private TeamAbbr opptTeamAbbr;
	public TeamAbbr getOpptTeamAbbr() {
		return opptTeamAbbr;
	}
	public void setOpptTeamAbbr(TeamAbbr opptTeamAbbr) {
		this.opptTeamAbbr = opptTeamAbbr;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="opptConference", length=4, nullable=false)
	private Conference opptConference;
	public Conference getOpptConference() {
		return opptConference;
	}
	public void setOpptConference(Conference opptConference) {
		this.opptConference = opptConference;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="opptDivision", length=9, nullable=false)
	private Division opptDivision;
	public Division getOpptDivision() {
		return opptDivision;
	}
	public void setOpptDivision(Division opptDivision) {
		this.opptDivision = opptDivision;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="opptLocation", length=4, nullable=false)
	private Location opptLocation;
	public Location getOpptLocation() {
		return opptLocation;
	}
	public void setOpptLocation(Location opptLocation) {
		this.opptLocation = opptLocation;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="opptResult", length=4, nullable=false)
	private Result opptResult;
	public Result getOpptResult() {
		return opptResult;
	}
	public void setOpptResult(Result opptResult) {
		this.opptResult = opptResult;
	}
	
	@Column(name="opptDaysOff", nullable=false)
	private Short opptDaysOff;
	public Short getOpptDaysOff() {
		return opptDaysOff;
	}
	public void setOpptDaysOff(Short opptDaysOff) {
		this.opptDaysOff = opptDaysOff;
	}
	
	@Column(name="opptPoints", nullable=false)
	private Short opptPoints;
	public Short getOpptPoints() {
		return opptPoints;
	}
	public void setOpptPoints(Short opptPoints) {
		this.opptPoints = opptPoints;
	}
	
	@Column(name="opptAssists", nullable=false)
	private Short opptAssists;
	public Short getOpptAssists() {
		return opptAssists;
	}
	public void setOpptAssists(Short opptAssists) {
		this.opptAssists = opptAssists;
	}
	
	@Column(name="opptTurnovers", nullable=false)
	private Short opptTurnovers;
	public Short getOpptTurnovers() {
		return opptTurnovers;
	}
	public void setOpptTurnovers(Short opptTurnovers) {
		this.opptTurnovers = opptTurnovers;
	}
	
	@Column(name="opptSteals", nullable=false)
	private Short opptSteals;
	public Short getOpptSteals() {
		return opptSteals;
	}
	public void setOpptSteals(Short opptSteals) {
		this.opptSteals = opptSteals;
	}
	
	@Column(name="opptBlocks", nullable=false)
	private Short opptBlocks;
	public Short getOpptBlocks() {
		return opptBlocks;
	}
	public void setOpptBlocks(Short opptBlocks) {
		this.opptBlocks = opptBlocks;
	}
	
	@Column(name="opptPersonalFouls", nullable=false)
	private Short opptPersonalFouls;
	public Short getOpptPersonalFouls() {
		return opptPersonalFouls;
	}
	public void setOpptPersonalFouls(Short opptPersonalFouls) {
		this.opptPersonalFouls = opptPersonalFouls;
	}
	
	@Column(name="opptFieldGoalAttempts", nullable=false)
	private Short opptFieldGoalAttempts;
	public Short getOpptFieldGoalAttempts() {
		return opptFieldGoalAttempts;
	}
	public void setOpptFieldGoalAttempts(Short opptFieldGoalAttempts) {
		this.opptFieldGoalAttempts = opptFieldGoalAttempts;
	}	
	
	@Column(name="opptFieldGoalMade", nullable=false)
	private Short opptFieldGoalMade;
	public Short getOpptFieldGoalMade() {
		return opptFieldGoalMade;
	}
	public void setOpptFieldGoalMade(Short opptFieldGoalMade) {
		this.opptFieldGoalMade = opptFieldGoalMade;
	}	

	@Column(name="opptThreePointAttempts", nullable=false)
	private Short opptThreePointAttempts;
	public Short getOpptThreePointAttempts() {
		return opptThreePointAttempts;
	}
	public void setOpptThreePointAttempts(Short opptThreePointAttempts) {
		this.opptThreePointAttempts = opptThreePointAttempts;
	}	

	@Column(name="opptThreePointMade", nullable=false)
	private Short opptThreePointMade;
	public Short getOpptThreePointMade() {
		return opptThreePointMade;
	}
	public void setOpptThreePointMade(Short opptThreePointMade) {
		this.opptThreePointMade = opptThreePointMade;
	}
	
	@Column(name="opptFreeThrowAttempts", nullable=false)
	private Short opptFreeThrowAttempts;
	public Short getOpptFreeThrowAttempts() {
		return opptFreeThrowAttempts;
	}
	public void setOpptFreeThrowAttempts(Short opptFreeThrowAttempts) {
		this.opptFreeThrowAttempts = opptFreeThrowAttempts;
	}	

	@Column(name="opptFreeThrowMade", nullable=false)
	private Short opptFreeThrowMade;
	public Short getOpptFreeThrowMade() {
		return opptFreeThrowMade;
	}
	public void setOpptFreeThrowMade(Short opptFreeThrowMade) {
		this.opptFreeThrowMade = opptFreeThrowMade;
	}	
	
	@Column(name="opptReboundsOffense", nullable=false)
	private Short opptReboundsOffense;
	public Short getOpptReboundsOffense() {
		return opptReboundsOffense;
	}
	public void setOpptReboundsOffense(Short opptReboundsOffense) {
		this.opptReboundsOffense = opptReboundsOffense;
	}
	
	@Column(name="opptReboundsDefense", nullable=false)
	private Short opptReboundsDefense;
	public Short getOpptReboundsDefense() {
		return opptReboundsDefense;
	}
	public void setOpptReboundsDefense(Short opptReboundsDefense) {
		this.opptReboundsDefense = opptReboundsDefense;
	}
	
	@Column(name="opptPointsQ1", nullable=false)
	private Short opptPointsQ1;
	public Short getOpptPointsQ1() {
		return opptPointsQ1;
	}
	public void setOpptPointsQ1(Short opptPointsQ1) {
		this.opptPointsQ1 = opptPointsQ1;
	}
	
	@Column(name="opptPointsQ2", nullable=false)
	private Short opptPointsQ2;
	public Short getOpptPointsQ2() {
		return opptPointsQ2;
	}
	public void setOpptPointsQ2(Short opptPointsQ2) {
		this.opptPointsQ2 = opptPointsQ2;
	}
	
	@Column(name="opptPointsQ3", nullable=false)
	private Short opptPointsQ3;
	public Short getOpptPointsQ3() {
		return opptPointsQ3;
	}
	public void setOpptPointsQ3(Short opptPointsQ3) {
		this.opptPointsQ3 = opptPointsQ3;
	}
	
	@Column(name="opptPointsQ4", nullable=false)
	private Short opptPointsQ4;
	public Short getOpptPointsQ4() {
		return opptPointsQ4;
	}
	public void setOpptPointsQ4(Short opptPointsQ4) {
		this.opptPointsQ4 = opptPointsQ4;
	}
	
	@Column(name="opptPointsQ5", nullable=false)
	private Short opptPointsQ5;
	public Short getOpptPointsQ5() {
		return opptPointsQ5;
	}
	public void setOpptPointsQ5(Short opptPointsQ5) {
		this.opptPointsQ5 = opptPointsQ5;
	}
	
	@Column(name="opptPointsQ6", nullable=false)
	private Short opptPointsQ6;
	public Short getOpptPointsQ6() {
		return opptPointsQ6;
	}
	public void setOpptPointsQ6(Short opptPointsQ6) {
		this.opptPointsQ6 = opptPointsQ6;
	}
	
	@Column(name="opptPointsQ7", nullable=false)
	private Short opptPointsQ7;
	public Short getOpptPointsQ7() {
		return opptPointsQ7;
	}
	public void setOpptPointsQ7(Short opptPointsQ7) {
		this.opptPointsQ7 = opptPointsQ7;
	}
	
	@Column(name="opptPointsQ8", nullable=false)
	private Short opptPointsQ8;
	public Short getOpptPointsQ8() {
		return opptPointsQ8;
	}
	public void setOpptPointsQ8(Short opptPointsQ8) {
		this.opptPointsQ8 = opptPointsQ8;
	}
	
	public String toString() {
		return new StringBuffer()
			.append("  id: " + this.id)
			.append("  teamResult:    " + this.teamResult + "  opptResult:    " + this.opptResult)
			.append("  teamPoints:    " + this.teamPoints + "  opptPoints:    " + this.opptPoints)
			.append("  teamAssists:   " + this.teamAssists + "  opptAssists:   " + this.opptAssists)
			.append("  teamTurnovers: " + this.teamTurnovers + "  opptTurnovers: " + this.opptTurnovers)
			.append("  teamSteals:    " + this.teamSteals + "  opptSteals:    " + this.opptSteals)
			.append("  teamBlocks:    " + this.teamBlocks + "  opptBlocks:    " + this.opptBlocks)
			.toString();
	}
}
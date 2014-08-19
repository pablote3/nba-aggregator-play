package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.avaje.ebean.annotation.Sql;

import play.db.ebean.Model;
import util.Enumerations.TeamAbbr;

@Entity
@Sql
public class TeamSummary extends Model {
	private static final long serialVersionUID = 1L;
	
	@Enumerated(EnumType.STRING)
	private TeamAbbr teamAbbr;
	public TeamAbbr getTeamAbbr() {
		return teamAbbr;
	}
	public void setTeamAbbr(TeamAbbr teamAbbr) {
		this.teamAbbr = teamAbbr;
	}
	
	private Short teamGamesPlayed;
	public Short getTeamGamesPlayed() {
		return teamGamesPlayed;
	}
	public void setGamesPlayed(Short teamGamesPlayed) {
		this.teamGamesPlayed = teamGamesPlayed;
	}

	private Short teamSumPoints;
	public Short getTeamSumPoints() {
		return teamSumPoints;
	}
	public void setTeamSumPoints(Short teamSumPoints) {
		this.teamSumPoints = teamSumPoints;
	}
	
	private Short teamSumAssists;
	public Short getTeamSumAssists() {
		return teamSumAssists;
	}
	public void setTeamSumAssists(Short teamSumAssists) {
		this.teamSumAssists = teamSumAssists;
	}
	
	private Short teamSumTurnovers;
	public Short getTeamSumTurnovers() {
		return teamSumTurnovers;
	}
	public void setTeamSumTurnovers(Short teamSumTurnovers) {
		this.teamSumTurnovers = teamSumTurnovers;
	}
	
	private Short teamSumSteals;
	public Short getTeamSumSteals() {
		return teamSumSteals;
	}
	public void setTeamSumSteals(Short teamSumSteals) {
		this.teamSumSteals = teamSumSteals;
	}
	
	private Short teamSumBlocks;
	public Short getTeamSumBlocks() {
		return teamSumBlocks;
	}
	public void setTeamSumBlocks(Short teamSumBlocks) {
		this.teamSumBlocks = teamSumBlocks;
	}
	
	private Short teamSumPersonalFouls;
	public Short getTeamSumPersonalFouls() {
		return teamSumPersonalFouls;
	}
	public void setTeamSumPersonalFouls(Short teamSumPersonalFouls) {
		this.teamSumPersonalFouls = teamSumPersonalFouls;
	}
	
	private Short teamSumFieldGoalAttempts;
	public Short getTeamSumFieldGoalAttempts() {
		return teamSumFieldGoalAttempts;
	}
	public void setTeamSumFieldGoalAttempts(Short teamSumFieldGoalAttempts) {
		this.teamSumFieldGoalAttempts = teamSumFieldGoalAttempts;
	}	
	
	private Short teamSumFieldGoalMade;
	public Short getTeamSumFieldGoalMade() {
		return teamSumFieldGoalMade;
	}
	public void setTeamSumFieldGoalMade(Short teamSumFieldGoalMade) {
		this.teamSumFieldGoalMade = teamSumFieldGoalMade;
	}	

	private Short teamSumThreePointAttempts;
	public Short getTeamSumThreePointAttempts() {
		return teamSumThreePointAttempts;
	}
	public void setTeamSumThreePointAttempts(Short teamSumThreePointAttempts) {
		this.teamSumThreePointAttempts = teamSumThreePointAttempts;
	}	

	private Short teamSumThreePointMade;
	public Short getTeamSumThreePointMade() {
		return teamSumThreePointMade;
	}
	public void setTeamSumThreePointMade(Short teamSumThreePointMade) {
		this.teamSumThreePointMade = teamSumThreePointMade;
	}
	
	private Short teamSumFreeThrowAttempts;
	public Short getTeamSumFreeThrowAttempts() {
		return teamSumFreeThrowAttempts;
	}
	public void setTeamSumFreeThrowAttempts(Short teamSumFreeThrowAttempts) {
		this.teamSumFreeThrowAttempts = teamSumFreeThrowAttempts;
	}	

	private Short teamSumFreeThrowMade;
	public Short getTeamSumFreeThrowMade() {
		return teamSumFreeThrowMade;
	}
	public void setTeamSumFreeThrowMade(Short teamSumFreeThrowMade) {
		this.teamSumFreeThrowMade = teamSumFreeThrowMade;
	}	
	
	private Short teamSumReboundsOffense;
	public Short getTeamSumReboundsOffense() {
		return teamSumReboundsOffense;
	}
	public void setTeamSumReboundsOffense(Short teamSumReboundsOffense) {
		this.teamSumReboundsOffense = teamSumReboundsOffense;
	}
	
	private Short teamSumReboundsDefense;
	public Short getTeamSumReboundsDefense() {
		return teamSumReboundsDefense;
	}
	public void setTeamSumReboundsDefense(Short teamSumReboundsDefense) {
		this.teamSumReboundsDefense = teamSumReboundsDefense;
	}
	
	private Short teamSumPointsQ1;
	public Short getTeamSumPointsQ1() {
		return teamSumPointsQ1;
	}
	public void setTeamSumPointsQ1(Short teamSumPointsQ1) {
		this.teamSumPointsQ1 = teamSumPointsQ1;
	}
	
	private Short teamSumPointsQ2;
	public Short getTeamSumPointsQ2() {
		return teamSumPointsQ2;
	}
	public void setTeamSumPointsQ2(Short teamSumPointsQ2) {
		this.teamSumPointsQ2 = teamSumPointsQ2;
	}
	
	private Short teamSumPointsQ3;
	public Short getTeamSumPointsQ3() {
		return teamSumPointsQ3;
	}
	public void setTeamSumPointsQ3(Short teamSumPointsQ3) {
		this.teamSumPointsQ3 = teamSumPointsQ3;
	}
	
	private Short teamSumPointsQ4;
	public Short getTeamSumPointsQ4() {
		return teamSumPointsQ4;
	}
	public void setTeamSumPointsQ4(Short teamSumPointsQ4) {
		this.teamSumPointsQ4 = teamSumPointsQ4;
	}
	
	private Short opptSumPoints;
	public Short getOpptSumPoints() {
		return opptSumPoints;
	}
	public void setOpptSumPoints(Short opptSumPoints) {
		this.opptSumPoints = opptSumPoints;
	}
	
	private Short opptSumAssists;
	public Short getOpptSumAssists() {
		return opptSumAssists;
	}
	public void setOpptSumAssists(Short opptSumAssists) {
		this.opptSumAssists = opptSumAssists;
	}
	
	private Short opptSumTurnovers;
	public Short getOpptSumTurnovers() {
		return opptSumTurnovers;
	}
	public void setOpptSumTurnovers(Short opptSumTurnovers) {
		this.opptSumTurnovers = opptSumTurnovers;
	}
	
	private Short opptSumSteals;
	public Short getOpptSumSteals() {
		return opptSumSteals;
	}
	public void setOpptSumSteals(Short opptSumSteals) {
		this.opptSumSteals = opptSumSteals;
	}
	
	private Short opptSumBlocks;
	public Short getOpptSumBlocks() {
		return opptSumBlocks;
	}
	public void setOpptSumBlocks(Short opptSumBlocks) {
		this.opptSumBlocks = opptSumBlocks;
	}
	
	private Short opptSumPersonalFouls;
	public Short getOpptSumPersonalFouls() {
		return opptSumPersonalFouls;
	}
	public void setOpptSumPersonalFouls(Short opptSumPersonalFouls) {
		this.opptSumPersonalFouls = opptSumPersonalFouls;
	}
	
	private Short opptSumFieldGoalAttempts;
	public Short getOpptSumFieldGoalAttempts() {
		return opptSumFieldGoalAttempts;
	}
	public void setOpptSumFieldGoalAttempts(Short opptSumFieldGoalAttempts) {
		this.opptSumFieldGoalAttempts = opptSumFieldGoalAttempts;
	}	
	
	private Short opptSumFieldGoalMade;
	public Short getOpptSumFieldGoalMade() {
		return opptSumFieldGoalMade;
	}
	public void setOpptSumFieldGoalMade(Short opptSumFieldGoalMade) {
		this.opptSumFieldGoalMade = opptSumFieldGoalMade;
	}	

	private Short opptSumThreePointAttempts;
	public Short getOpptSumThreePointAttempts() {
		return opptSumThreePointAttempts;
	}
	public void setOpptSumThreePointAttempts(Short opptSumThreePointAttempts) {
		this.opptSumThreePointAttempts = opptSumThreePointAttempts;
	}	

	private Short opptSumThreePointMade;
	public Short getOpptSumThreePointMade() {
		return opptSumThreePointMade;
	}
	public void setOpptSumThreePointMade(Short opptSumThreePointMade) {
		this.opptSumThreePointMade = opptSumThreePointMade;
	}
	
	private Short opptSumFreeThrowAttempts;
	public Short getOpptSumFreeThrowAttempts() {
		return opptSumFreeThrowAttempts;
	}
	public void setOpptSumFreeThrowAttempts(Short opptSumFreeThrowAttempts) {
		this.opptSumFreeThrowAttempts = opptSumFreeThrowAttempts;
	}	

	private Short opptSumFreeThrowMade;
	public Short getOpptSumFreeThrowMade() {
		return opptSumFreeThrowMade;
	}
	public void setOpptSumFreeThrowMade(Short opptSumFreeThrowMade) {
		this.opptSumFreeThrowMade = opptSumFreeThrowMade;
	}	
	
	private Short opptSumReboundsOffense;
	public Short getOpptSumReboundsOffense() {
		return opptSumReboundsOffense;
	}
	public void setOpptSumReboundsOffense(Short opptSumReboundsOffense) {
		this.opptSumReboundsOffense = opptSumReboundsOffense;
	}
	
	private Short opptSumReboundsDefense;
	public Short getOpptSumReboundsDefense() {
		return opptSumReboundsDefense;
	}
	public void setOpptSumReboundsDefense(Short opptSumReboundsDefense) {
		this.opptSumReboundsDefense = opptSumReboundsDefense;
	}
	
	private Short opptSumPointsQ1;
	public Short getOpptSumPointsQ1() {
		return opptSumPointsQ1;
	}
	public void setOpptSumPointsQ1(Short opptSumPointsQ1) {
		this.opptSumPointsQ1 = opptSumPointsQ1;
	}
	
	private Short opptSumPointsQ2;
	public Short getOpptSumPointsQ2() {
		return opptSumPointsQ2;
	}
	public void setOpptSumPointsQ2(Short opptSumPointsQ2) {
		this.opptSumPointsQ2 = opptSumPointsQ2;
	}
	
	private Short opptSumPointsQ3;
	public Short getOpptSumPointsQ3() {
		return opptSumPointsQ3;
	}
	public void setOpptSumPointsQ3(Short opptSumPointsQ3) {
		this.opptSumPointsQ3 = opptSumPointsQ3;
	}
	
	private Short opptSumPointsQ4;
	public Short getOpptSumPointsQ4() {
		return opptSumPointsQ4;
	}
	public void setOpptSumPointsQ4(Short opptSumPointsQ4) {
		this.opptSumPointsQ4 = opptSumPointsQ4;
	}

	public Float getTeamAvgPoints() {
		return (float)teamSumPoints/teamGamesPlayed;
	}

	public Float getTeamAvgAssists() {
		return (float)teamSumAssists/teamGamesPlayed;
	}
	
	public Float getTeamAvgTurnovers() {
		return (float)teamSumTurnovers/teamGamesPlayed;
	}
	
	public Float getTeamAvgSteals() {
		return (float)teamSumSteals/teamGamesPlayed;
	}
	
	public Float getTeamAvgBlocks() {
		return (float)teamSumBlocks/teamGamesPlayed;
	}
	
	public Float getTeamAvgPersonalFouls() {
		return (float)teamSumPersonalFouls/teamGamesPlayed;
	}
	
	public Float getTeamAvgFieldGoalAttempts() {
		return (float)teamSumFieldGoalAttempts/teamGamesPlayed;
	}
	
	public Float getTeamAvgFieldGoalMade() {
		return (float)teamSumFieldGoalMade/teamGamesPlayed;
	}
	  
	public Float getTeamAvgFieldGoalPct() {
		return (float)teamSumFieldGoalMade/teamSumFieldGoalAttempts;
	} 

	public Float getTeamAvgThreePointAttempts() {
		return (float)teamSumThreePointAttempts/teamGamesPlayed;
	}

	public Float getTeamAvgThreePointMade() {
		return (float)teamSumThreePointMade/teamGamesPlayed;
	}
	
	public Float getTeamAvgThreePointPct() {
		return (float)teamSumThreePointMade/teamSumThreePointAttempts;
	} 
	
	public Float getTeamAvgFreeThrowAttempts() {
		return (float)teamSumFreeThrowAttempts/teamGamesPlayed;
	}

	public Float getTeamAvgFreeThrowMade() {
		return (float)teamSumFreeThrowMade/teamGamesPlayed;
	}
	
	public Float getTeamAvgFreeThrowPct() {
		return (float)teamSumFreeThrowMade/teamSumFreeThrowAttempts;
	} 
	
	public Float getTeamAvgReboundsOffense() {
		return (float)teamSumReboundsOffense/teamGamesPlayed;
	}
	
	public Float getTeamAvgReboundsDefense() {
		return (float)teamSumReboundsDefense/teamGamesPlayed;
	}
	
	public Float getTeamAvgPointsQ1() {
		return (float)teamSumPointsQ1/teamGamesPlayed;
	}
	
	public Float getTeamAvgPointsQ2() {
		return (float)teamSumPointsQ2/teamGamesPlayed;
	}
	
	public Float getTeamAvgPointsQ3() {
		return (float)teamSumPointsQ3/teamGamesPlayed;
	}
	
	public Float getTeamAvgPointsQ4() {
		return (float)teamSumPointsQ4/teamGamesPlayed;
	}
	
	public Float getOpptAvgPoints() {
		return (float)opptSumPoints/teamGamesPlayed;
	}
	
	public Float getOpptAvgAssists() {
		return (float)opptSumAssists/teamGamesPlayed;
	}

	public Float getOpptAvgTurnovers() {
		return (float)opptSumTurnovers/teamGamesPlayed;
	}
	
	public Float getOpptAvgSteals() {
		return (float)opptSumSteals/teamGamesPlayed;
	}
	
	public Float getOpptAvgBlocks() {
		return (float)opptSumBlocks/teamGamesPlayed;
	}
	
	public Float getOpptAvgPersonalFouls() {
		return (float)opptSumPersonalFouls/teamGamesPlayed;
	}
	
	public Float getOpptAvgFieldGoalAttempts() {
		return (float)opptSumFieldGoalAttempts/teamGamesPlayed;
	}
	
	public Float getOpptAvgFieldGoalMade() {
		return (float)opptSumFieldGoalMade/teamGamesPlayed;
	}

	public Float getOpptAvgThreePointAttempts() {
		return (float)opptSumThreePointAttempts/teamGamesPlayed;
	}

	public Float getOpptAvgThreePointMade() {
		return (float)opptSumThreePointMade/teamGamesPlayed;
	}
	
	public Float getOpptAvgFreeThrowAttempts() {
		return (float)opptSumFreeThrowAttempts/teamGamesPlayed;
	}

	public Float getOpptAvgFreeThrowMade() {
		return (float)opptSumFreeThrowMade/teamGamesPlayed;
	}
	
	public Float getOpptAvgReboundsOffense() {
		return (float)opptSumReboundsOffense/teamGamesPlayed;
	}
	
	public Float getOpptAvgReboundsDefense() {
		return (float)opptSumReboundsDefense/teamGamesPlayed;
	}

	public Float getOpptAvgPointsQ1() {
		return (float)opptSumPointsQ1/teamGamesPlayed;
	}
	
	public Float getOpptAvgPointsQ2() {
		return (float)opptSumPointsQ2/teamGamesPlayed;
	}
	
	public Float getOpptAvgPointsQ3() {
		return (float)opptSumPointsQ3/teamGamesPlayed;
	}
	
	public Float getOpptAvgPointsQ4() {
		return (float)opptSumPointsQ4/teamGamesPlayed;
	}
}
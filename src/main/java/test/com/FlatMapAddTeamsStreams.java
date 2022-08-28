package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapAddTeamsStreams {

	public static void main(String[] args) {
		List<String> teamA = Arrays.asList("raj","mike","jason");
		List<String> teamB = Arrays.asList("luke","james","lisa");
		List<String> teamC = Arrays.asList("pen","jack","norm");

		List<List<String>> allPlayers = Arrays.asList(teamA,teamB,teamC);
		
		for(List<String> players :allPlayers ) {
			for(String player : players ) {
				System.out.println(player);
			}
		}
		
		System.out.println("**********");
		
		//using flatmap:
		List<String> team = allPlayers.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
		System.out.println(team);
	

	}

}

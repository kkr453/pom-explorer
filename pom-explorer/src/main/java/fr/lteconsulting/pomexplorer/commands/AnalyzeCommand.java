package fr.lteconsulting.pomexplorer.commands;

import fr.lteconsulting.pomexplorer.Client;
import fr.lteconsulting.pomexplorer.ILogger;
import fr.lteconsulting.pomexplorer.PomAnalyzer;
import fr.lteconsulting.pomexplorer.WorkingSession;

public class AnalyzeCommand
{
	@Help( "analyse all the pom files in a directory, recursively" )
	public void directory( Client client, WorkingSession session, ILogger log, String directory )
	{
		client.send( "Analyzing directoy '" + directory + "'...<br/>" );

		PomAnalyzer analyzer = new PomAnalyzer();
		analyzer.analyze( directory, session, client );

		log.html( "Analyzis completed for '" + directory + "'.<br/>" );
	}
}

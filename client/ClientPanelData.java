package client;

//package clientServer.ProjectTwo_Team06;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

import server.ServerConstants;


/**
 * Lab 2, Team 6
 * 
 * @author SER 516, Gary Morris (#78)
 */
public class ClientPanelData extends JPanel {

	public ClientPanelData() {
		createAndShowGUI();
	}

	private void createAndShowGUI() {
		Border line = BorderFactory.createLineBorder(ServerConstants.LIGHT_BLUE, 5);
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		setBorder(BorderFactory.createCompoundBorder(line, loweredbevel));
		setBackground(ServerConstants.SLATE_GREY);
		ClientPanelGraph graph = new ClientPanelGraph();
		ClientPanelInfo info = new ClientPanelInfo();
		ClientDataManager.getInstance().setInfo(info);
		add(graph);
		add(info);
	}
}

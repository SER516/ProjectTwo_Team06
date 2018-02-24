package server;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * The ServerPanelConsole class
 * 
 * @author Team 06
 * @version 1.0
 */
public class ServerPanelMain extends JPanel {
	ServerPanelTop panelTop;
	ServerPanelData panelData;
	ServerPanelConsole panelConsole;

	public ServerPanelMain() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		createAndShowGUI();
	}

	private void createAndShowGUI() {
		panelConsole = new ServerPanelConsole();
		MessageHandler.getInstance().setServerPanelConsole(panelConsole);
		panelData = new ServerPanelData();
		panelTop = new ServerPanelTop();
		add(panelTop);
		add(panelData);
		add(panelConsole);
	}
}

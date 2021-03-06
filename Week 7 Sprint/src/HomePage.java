import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Color;

public class HomePage {

	private JFrame Homepage;
	private JTextField tfPlayer;
	private JTextField tfWinsT;
	private JTextField tfMatchesT;
	private JTextField tfPlayerT;
	private JTextField tfPlayerG;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage windowH = new HomePage();
					windowH.Homepage.setVisible(true);

					HomePage windowS = new HomePage();
					windowS.Homepage.setVisible(false);

					HomePage windowAc = new HomePage();
					windowAc.Homepage.setVisible(false);

					HomePage windowAd = new HomePage();
					windowAd.Homepage.setVisible(false);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomePage() {
		Hompage();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void Hompage() {
		Homepage = new JFrame();
		Homepage.getContentPane().setForeground(Color.WHITE);
		Homepage.setForeground(Color.WHITE);
		Homepage.setBounds(450, 100, 550, 500);
		Homepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Homepage.getContentPane().setLayout(null);

		JLabel lblTitle = new JLabel("HOMEPAGE");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblTitle.setBounds(176, 11, 177, 49);
		Homepage.getContentPane().add(lblTitle);

		JComboBox cmbSport = new JComboBox();
		cmbSport.setModel(new DefaultComboBoxModel(
				new String[] { "Select A Sport", "Futsal", "Basketball", "Rugby", "Athletics", "Hockey" }));
		cmbSport.setSelectedIndex(0);
		cmbSport.setToolTipText("");
		cmbSport.setBounds(48, 163, 177, 22);
		Homepage.getContentPane().add(cmbSport);
		cmbSport.setVisible(false);

		JButton btnSport = new JButton("SUBMIT");
		btnSport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int option = cmbSport.getSelectedIndex();

				if (option == 1) {

					String search = "Futsal";
					// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week7Sprint;integratedSecurity=true;";

					// Declare the JDBC Objects.
					Connection con = null;

					try {
						// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

						// Create and execute an SQL statement that returns some data
						String SQLSearch = "SELECT * FROM [dbo].[Sports] WHERE Sport = '" + search + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							// insert Data into Text fields
							String sWinsT = rs.getString("Team Wins");
							tfWinsT.setText(sWinsT);

							String sMatchesT = rs.getString("Team Matches");
							tfMatchesT.setText(sMatchesT);

						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}

				if (option == 2) {

					String search = "Basketball";
					// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week7Sprint;integratedSecurity=true;";

					// Declare the JDBC Objects.
					Connection con = null;

					try {
						// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

						// Create and execute an SQL statement that returns some data
						String SQLSearch = "SELECT * FROM [dbo].[Sports] WHERE Sport = '" + search + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							// insert Data into Text fields
							String sWinsT = rs.getString("Team Wins");
							tfWinsT.setText(sWinsT);

							String sMatchesT = rs.getString("Team Matches");
							tfMatchesT.setText(sMatchesT);

						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}

				if (option == 3) {

					String search = "Rugby";
					// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week7Sprint;integratedSecurity=true;";

					// Declare the JDBC Objects.
					Connection con = null;

					try {
						// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

						// Create and execute an SQL statement that returns some data
						String SQLSearch = "SELECT * FROM [dbo].[Sports] WHERE Sport = '" + search + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							// insert Data into Text fields
							String sWinsT = rs.getString("Team Wins");
							tfWinsT.setText(sWinsT);

							String sMatchesT = rs.getString("Team Matches");
							tfMatchesT.setText(sMatchesT);

						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}

				if (option == 4) {

					String search = "Athletics";
					// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week7Sprint;integratedSecurity=true;";

					// Declare the JDBC Objects.
					Connection con = null;

					try {
						// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

						// Create and execute an SQL statement that returns some data
						String SQLSearch = "SELECT * FROM [dbo].[Sports] WHERE Sport = '" + search + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							// insert Data into Text fields
							String sWinsT = rs.getString("Team Wins");
							tfWinsT.setText(sWinsT);

							String sMatchesT = rs.getString("Team Matches");
							tfMatchesT.setText(sMatchesT);

						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}

				if (option == 5) {

					String search = "Hockey";
					// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week7Sprint;integratedSecurity=true;";

					// Declare the JDBC Objects.
					Connection con = null;

					try {
						// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

						// Create and execute an SQL statement that returns some data
						String SQLSearch = "SELECT * FROM [dbo].[Sports] WHERE Sport = '" + search + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							// insert Data into Text fields
							String sWinsT = rs.getString("Team Wins");
							tfWinsT.setText(sWinsT);

							String sMatchesT = rs.getString("Team Matches");
							tfMatchesT.setText(sMatchesT);

						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}

			}
		});
		btnSport.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnSport.setBounds(48, 196, 177, 23);
		Homepage.getContentPane().add(btnSport);
		btnSport.setVisible(false);

		JLabel lblWinsT = new JLabel("Team Wins:");
		lblWinsT.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinsT.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblWinsT.setBounds(235, 162, 145, 22);
		Homepage.getContentPane().add(lblWinsT);
		lblWinsT.setVisible(false);

		JLabel lblMatchesT = new JLabel("Team Matches:");
		lblMatchesT.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatchesT.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblMatchesT.setBounds(235, 195, 145, 22);
		Homepage.getContentPane().add(lblMatchesT);
		lblMatchesT.setVisible(false);

		JButton btnSearchP = new JButton("SUBMIT");
		btnSearchP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String search = tfPlayer.getText();

				// Create a variable for the connection string.
				String connectionUrl = "jdbc:sqlserver://localhost:1433;"
						+ "databaseName= Week7Sprint;integratedSecurity=true;";

				// Declare the JDBC Objects.
				Connection con = null;

				try {
					// Establish the connection.
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con = DriverManager.getConnection(connectionUrl);

					// Create and execute an SQL statement that returns some data
					String SQLSearch = "SELECT * FROM [dbo].[Player] WHERE PlayerName = '" + search + "'";

					ResultSet rs = con.createStatement().executeQuery(SQLSearch);
					while (rs.next()) {

						// insert Data into Text fields
						String sPlayerT = rs.getString("PlayerTeam");
						tfPlayerT.setText(sPlayerT);

						String sPlayerG = rs.getString("PlayerGoals");
						tfPlayerG.setText(sPlayerG);

					}

				}

				catch (Exception e1) {

					JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
				}

			}
		});
		btnSearchP.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnSearchP.setBounds(48, 362, 177, 23);
		Homepage.getContentPane().add(btnSearchP);
		btnSearchP.setVisible(false);

		tfPlayer = new JTextField();
		tfPlayer.setBounds(48, 331, 177, 20);
		Homepage.getContentPane().add(tfPlayer);
		tfPlayer.setColumns(10);
		tfPlayer.setVisible(false);

		tfWinsT = new JTextField();
		tfWinsT.setBounds(390, 162, 80, 20);
		Homepage.getContentPane().add(tfWinsT);
		tfWinsT.setColumns(10);
		tfWinsT.setVisible(false);

		tfMatchesT = new JTextField();
		tfMatchesT.setBounds(390, 196, 80, 20);
		Homepage.getContentPane().add(tfMatchesT);
		tfMatchesT.setColumns(10);
		tfMatchesT.setVisible(false);

		tfPlayerT = new JTextField();
		tfPlayerT.setBounds(390, 331, 80, 20);
		Homepage.getContentPane().add(tfPlayerT);
		tfPlayerT.setColumns(10);
		tfPlayerT.setVisible(false);

		tfPlayerG = new JTextField();
		tfPlayerG.setBounds(390, 365, 80, 20);
		Homepage.getContentPane().add(tfPlayerG);
		tfPlayerG.setColumns(10);
		tfPlayerG.setVisible(false);

		JLabel lblPlayerG = new JLabel("No. Goals:");
		lblPlayerG.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerG.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblPlayerG.setBounds(235, 362, 145, 23);
		Homepage.getContentPane().add(lblPlayerG);
		lblPlayerG.setVisible(false);

		JLabel lblPlayerT = new JLabel("Team:");
		lblPlayerT.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerT.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblPlayerT.setBounds(235, 331, 145, 20);
		Homepage.getContentPane().add(lblPlayerT);
		lblPlayerT.setVisible(false);

		JButton btnAdmin = new JButton("New button");

		JButton btnEdit = new JButton("Add/Delete Player");
		JButton btnUpdate = new JButton("Update Team Stats");
		btnEdit.setVisible(false);
		btnUpdate.setVisible(false);

		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf1.setVisible(false);
		tf2.setVisible(false);
		tf3.setVisible(false);
		
		JButton btnAddy = new JButton("Submit");
		btnAddy.setVisible(false);
		
		JButton btnDeletey = new JButton("Submit");
		btnDeletey.setVisible(false);
		
		
		JButton btnUpP = new JButton("Submit");
		btnUpP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String newPT = tf2.getText();
				String newPG = tf3.getText();
				
				String name = tf1.getText();
				
				// Create a variable for the connection string.
				String connectionUrl = "jdbc:sqlserver://localhost:1433;"
						+ "databaseName= Week7Sprint;integratedSecurity=true;";

				// Declare the JDBC Objects.
				Connection con = null;
				Statement stmt = null;

				try {
					// Establish the connection.
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con = DriverManager.getConnection(connectionUrl);

					// Create and execute an SQL statement that returns some data

					String SQLUpdate = "UPDATE [dbo].[Player] SET PlayerTeam = '"+ newPT +"', PlayerGoals = '"+ newPG +"' WHERE PlayerName = '" + name + "' ";

					stmt = con.createStatement();
					stmt.execute(SQLUpdate);

					System.out.println("Record Was Successfully Updated");

				}

				catch (Exception e1) {

					e1.printStackTrace();
				}
				
			}
		});
		btnUpP.setVisible(false);
		
		JButton btnUpT = new JButton("Submit");
		btnUpT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String newW = tf2.getText();
				String newM = tf3.getText();
				
				String sport = tf1.getText();
				
				// Create a variable for the connection string.
				String connectionUrl = "jdbc:sqlserver://localhost:1433;"
						+ "databaseName= Week7Sprint;integratedSecurity=true;";

				// Declare the JDBC Objects.
				Connection con = null;
				Statement stmt = null;

				try {
					// Establish the connection.
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con = DriverManager.getConnection(connectionUrl);

					// Create and execute an SQL statement that returns some data

					String SQLUpdate = "UPDATE [dbo].[Sports] SET TeamWins = '"+ newW +"', TeamMatches = '"+ newM +"'WHERE Sport = '" + sport + "'";

					stmt = con.createStatement();
					stmt.execute(SQLUpdate);

					System.out.println("Record Was Successfully Updated");

				}

				catch (Exception e1) {

					e1.printStackTrace();
				}
				
			}
		});
		btnUpT.setVisible(false);
		
		JComboBox cmbSubject = new JComboBox();
		cmbSubject.setVisible(false);
		JButton btnSubject = new JButton("SUBMIT");
		btnSubject.setVisible(false);
		JButton btnStudent = new JButton("SUBMIT");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String search = tfPlayer.getText();

				// Create a variable for the connection string.
				String connectionUrl = "jdbc:sqlserver://localhost:1433;"
						+ "databaseName= Week7Sprint;integratedSecurity=true;";

				// Declare the JDBC Objects.
				Connection con = null;

				try {
					// Establish the connection.
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con = DriverManager.getConnection(connectionUrl);

					// Create and execute an SQL statement that returns some data
					String SQLSearch = "SELECT * FROM [dbo].[Student] WHERE StudentName = '" + search + "'";

					ResultSet rs = con.createStatement().executeQuery(SQLSearch);
					while (rs.next()) {

						// insert Data into Text fields
						String sPlayerT = rs.getString("SubjectWritten");
						tfPlayerT.setText(sPlayerT);

						String sPlayerG = rs.getString("Mark");
						tfPlayerG.setText(sPlayerG);

					}

				}

				catch (Exception e1) {

					JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
				}

				
			}
		});
		btnStudent.setVisible(false);
		

		//////////////////////////////////////////////// Import ImageIcon
		JLabel lblBackground = new JLabel("");
		lblBackground.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackground.setBounds(0, 0, 534, 458);
		Homepage.getContentPane().add(lblBackground);
		ImageIcon iconBackground = new ImageIcon("Images/Home.jpg");
		lblBackground.setIcon(iconBackground);

		JButton btnSports = new JButton("Sports Tab");
		JButton btnAcademics = new JButton("Academics Tab");
		btnSports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ImageIcon iconBackground = new ImageIcon("Images/Sports.jpg");
				lblBackground.setIcon(iconBackground);
				lblTitle.setText("Sports");

				btnSports.setVisible(false);
				btnAcademics.setVisible(false);
				btnAdmin.setVisible(false);

				lblPlayerT.setVisible(true);
				lblPlayerG.setVisible(true);
				tfPlayerG.setVisible(true);
				tfPlayerT.setVisible(true);

				tfMatchesT.setVisible(true);
				tfWinsT.setVisible(true);
				tfPlayer.setVisible(true);
				btnSearchP.setVisible(true);

				lblMatchesT.setVisible(true);
				lblWinsT.setVisible(true);
				btnSport.setVisible(true);
				cmbSport.setVisible(true);

			}
		});
		btnSports.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnSports.setBounds(48, 102, 177, 49);
		Homepage.getContentPane().add(btnSports);

		btnAcademics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ImageIcon iconBackground = new ImageIcon("Images/Academics.jpg");
				lblBackground.setIcon(iconBackground);
				lblTitle.setText("Academics");

				btnSports.setVisible(false);
				btnAcademics.setVisible(false);
				btnAdmin.setVisible(false);
				

				lblPlayerT.setVisible(true);
				lblPlayerT.setText("Subject Written:");
				lblPlayerT.setForeground(Color.WHITE);
				lblPlayerG.setVisible(true);
				lblPlayerG.setText("Student Mark:");
				lblPlayerG.setForeground(Color.WHITE);
				tfPlayerG.setVisible(true);
				tfPlayerT.setVisible(true);

				tfMatchesT.setVisible(true);
				tfWinsT.setVisible(true);
				tfPlayer.setVisible(true);
				btnStudent.setVisible(true);

				lblMatchesT.setVisible(true);
				lblMatchesT.setText("Number of tests issued");
				lblMatchesT.setForeground(Color.WHITE);
				lblWinsT.setVisible(true);
				lblWinsT.setText("Number of pass marks:");
				lblWinsT.setForeground(Color.WHITE);
				btnSubject.setVisible(true);
				cmbSubject.setVisible(true);

			}
		});
		btnAcademics.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnAcademics.setBounds(293, 102, 177, 49);
		Homepage.getContentPane().add(btnAcademics);

//////////////////////////////

		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int Attempts = 0;

				int userAttempt = Integer.parseInt(JOptionPane.showInputDialog("Enter Our Favorite Number (1-10)"));

				if (userAttempt == 11) {

					btnAdmin.setVisible(false);
					btnSports.setVisible(false);
					btnAcademics.setVisible(false);

					btnEdit.setVisible(true);
					btnUpdate.setVisible(true);

					ImageIcon iconBackground = new ImageIcon("Images/Admin.jpg");
					lblBackground.setIcon(iconBackground);
					
					lblTitle.setText("Admin Area");
					lblTitle.setForeground(Color.white);
					

				} else {

					JOptionPane.showMessageDialog(null, "Incorrect Password!!");
					Attempts++;
					if (Attempts == 1) {

						btnAdmin.setVisible(false);
					}

				}

			}
		});
		btnAdmin.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnAdmin.setBounds(463, 11, 44, 37);
		Homepage.getContentPane().add(btnAdmin);

		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int AoD = Integer.parseInt(JOptionPane.showInputDialog("Would you like to ADD[1] or DELETE[2] a player? "));

				if (AoD == 1) {

					tf1.setVisible(true);
					tf2.setVisible(true);
					tf3.setVisible(true);
					btnAddy.setVisible(true);
					btnEdit.setVisible(false);
					btnUpdate.setVisible(false);

					tf1.setText("Enter Player Name");
					tf2.setText("Enter Player Team");
					tf3.setText("Enter Player Goals");

				}

				if (AoD == 2) {

					tf1.setVisible(true);
					btnDeletey.setVisible(true);
					btnEdit.setVisible(false);
					btnUpdate.setVisible(false);

					tf1.setText("Enter Name Of Player To Delete");

					

				}

			}
		});
		btnEdit.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnEdit.setBounds(48, 244, 177, 67);
		Homepage.getContentPane().add(btnEdit);

		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(true);
				btnEdit.setVisible(false);
				btnUpdate.setVisible(false);
				

			int ToP = Integer.parseInt(JOptionPane.showInputDialog("Would you like to update a PLAYER[1] or TEAM[2]?"));
			
			if (ToP == 1) {
				
				tf1.setText("Enter Name Of Player ");
				tf2.setText("Enter Player's Updated Team");
				tf3.setText("Enter Player's Updated Goals");
				
				btnUpP.setVisible(true);
				
				}
			
			if (ToP == 2) {
				
				tf1.setText("Enter Sport () ");
				tf2.setText("Enter Team's Updated Wins");
				tf3.setText("Enter Team's Updated Matches");
				
				btnUpT.setVisible(true);
				
			}
				
				
			}
		});
		btnUpdate.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnUpdate.setBounds(293, 244, 177, 67);
		Homepage.getContentPane().add(btnUpdate);

		tf1.setBounds(176, 163, 177, 20);
		Homepage.getContentPane().add(tf1);
		tf1.setColumns(10);

		tf2.setBounds(176, 197, 177, 20);
		Homepage.getContentPane().add(tf2);
		tf2.setColumns(10);

		tf3.setBounds(176, 228, 177, 20);
		Homepage.getContentPane().add(tf3);
		tf3.setColumns(10);
		

		btnAddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Create a variable for the connection string.
				String connectionUrl = "jdbc:sqlserver://localhost:1433;"
						+ "databaseName= Week7Sprint;integratedSecurity=true;";

				// Declare the JDBC Objects.
				Connection con = null;
				Statement stmt = null;

				try {
					// Establish the connection.
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con = DriverManager.getConnection(connectionUrl);

					String PlayerN = tf1.getText();
					String PlayerT = tf2.getText();
					int PlayerG = Integer.parseInt(tf3.getText());

					// Create and execute an SQL statement that returns some data
					String SQLstd = "INSERT INTO [dbo].[Player] ([PlayerName],[PlayerTeam],[PlayerGoals]) VALUES ('"
							+ PlayerN + "','" + PlayerT + "','" + PlayerG + "')";

					stmt = con.createStatement();
					stmt.execute(SQLstd);

					System.out.println("Your Info Has Successfully Been Added");

				}

				catch (Exception e1) {

					e1.printStackTrace();
				}
				
			}
		});
		btnAddy.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnAddy.setBounds(176, 262, 177, 31);
		Homepage.getContentPane().add(btnAddy);
		
		
		btnDeletey.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnDeletey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String del = tf1.getText();

				// Create a variable for the connection string.
				String connectionUrl = "jdbc:sqlserver://localhost:1433;"
						+ "databaseName= Week7Sprint;integratedSecurity=true;";

				// Declare the JDBC Objects.
				Connection con = null;
				Statement stmt = null;

				try {
					// Establish the connection.
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con = DriverManager.getConnection(connectionUrl);

					// Create and execute an SQL statement that returns some data

					String SQLdelete = "DELETE FROM [dbo].[Player] WHERE PlayerName = '" + del + "' ";

					stmt = con.createStatement();
					stmt.execute(SQLdelete);

					System.out.println("Record Was Successfully Deleted");

				}

				catch (Exception e1) {

					e1.printStackTrace();
				}
				
			}
		});
		btnDeletey.setBounds(176, 304, 177, 32);
		Homepage.getContentPane().add(btnDeletey);
	
		
		btnUpP.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnUpP.setBounds(176, 347, 177, 38);
		Homepage.getContentPane().add(btnUpP);
		
		
		btnUpT.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnUpT.setBounds(176, 396, 177, 38);
		Homepage.getContentPane().add(btnUpT);
		
		
		cmbSubject.setModel(new DefaultComboBoxModel(new String[] {"Select A Subject", "English", "Afrikaans", "Math(Pure)", "Math(Literacy)", "Physics"}));
		cmbSubject.setSelectedIndex(0);
		cmbSubject.setBounds(48, 163, 177, 22);
		Homepage.getContentPane().add(cmbSubject);
		
		btnSubject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int option = cmbSubject.getSelectedIndex();

				if (option == 1) {

					String search = "English";
					// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week7Sprint;integratedSecurity=true;";

					// Declare the JDBC Objects.
					Connection con = null;

					try {
						// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

						// Create and execute an SQL statement that returns some data
						String SQLSearch = "SELECT * FROM [dbo].[Subjects] WHERE Subject = '" + search + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							// insert Data into Text fields
							String sWinsT = rs.getString("PassedMarks");
							tfWinsT.setText(sWinsT);

							String sMatchesT = rs.getString("TestsIssued");
							tfMatchesT.setText(sMatchesT);

						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}

				if (option == 2) {

					String search = "Afrikaans";
					// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week7Sprint;integratedSecurity=true;";

					// Declare the JDBC Objects.
					Connection con = null;

					try {
						// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

						// Create and execute an SQL statement that returns some data
						String SQLSearch = "SELECT * FROM [dbo].[Subjects] WHERE Subject = '" + search + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							// insert Data into Text fields
							String sWinsT = rs.getString("PassedMarks");
							tfWinsT.setText(sWinsT);

							String sMatchesT = rs.getString("TestsIssued");
							tfMatchesT.setText(sMatchesT);

						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				if (option == 3) {

					String search = "Math(Pure)";
					// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week7Sprint;integratedSecurity=true;";

					// Declare the JDBC Objects.
					Connection con = null;

					try {
						// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

						// Create and execute an SQL statement that returns some data
						String SQLSearch = "SELECT * FROM [dbo].[Subjects] WHERE Subject = '" + search + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							// insert Data into Text fields
							String sWinsT = rs.getString("PassedMarks");
							tfWinsT.setText(sWinsT);

							String sMatchesT = rs.getString("TestsIssued");
							tfMatchesT.setText(sMatchesT);

						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				if (option == 4) {

					String search = "Math(Literacy)";
					// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week7Sprint;integratedSecurity=true;";

					// Declare the JDBC Objects.
					Connection con = null;

					try {
						// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

						// Create and execute an SQL statement that returns some data
						String SQLSearch = "SELECT * FROM [dbo].[Subjects] WHERE Subject = '" + search + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							// insert Data into Text fields
							String sWinsT = rs.getString("PassedMarks");
							tfWinsT.setText(sWinsT);

							String sMatchesT = rs.getString("TestsIssued");
							tfMatchesT.setText(sMatchesT);

						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				if (option == 5) {

					String search = "Physics";
					// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week7Sprint;integratedSecurity=true;";

					// Declare the JDBC Objects.
					Connection con = null;

					try {
						// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

						// Create and execute an SQL statement that returns some data
						String SQLSearch = "SELECT * FROM [dbo].[Subjects] WHERE Subject = '" + search + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							// insert Data into Text fields
							String sWinsT = rs.getString("PassedMarks");
							tfWinsT.setText(sWinsT);

							String sMatchesT = rs.getString("TestsIssued");
							tfMatchesT.setText(sMatchesT);

						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				
			}
		});
		btnSubject.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnSubject.setBounds(48, 196, 177, 23);
		Homepage.getContentPane().add(btnSubject);
		
		btnStudent.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnStudent.setBounds(48, 363, 177, 23);
		Homepage.getContentPane().add(btnStudent);

	}
}

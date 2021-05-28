package guess_who;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author Lars - larsmeeuwsen@gmail.com
 * @version 1
 */
public class GuessWho {
	/**
	 * our main method
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		// You may ignore the three lines of code below this one:
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			////////////////// YOUR CODE - START ///////////////////////
			String a;
			while (true) {
				System.out.println("Typ \"start\" om het spel te starten.");
				a = br.readLine();
				if (a.equals("start")) {
					System.out.println("Mooi! Tijd om te beginnen.");
					System.out.println("");
					break;
				}
			}

			// (1 Geslacht) 1 = Man; 2 = Vrouw #100000
			// (2 Haarkleur) 1 = Blond; 2 = Zwart; 3 = Wit; 4 = Bruin; 5 = Rood #10000
			// (3 Huidskleur) 1 = Wit; 2 = Bruin #1000
			// (4 Baard, MAN) 1 = Ja; 2 = Nee #100
			// (4 Bloost, VROUW) 1 = Ja; 2 = Nee #100
			// (5 Snor, MAR) 1 = Ja; 2 = Nee #10
			// (6 Hoed) 1 = Ja; 2 = Nee #1
			// Mannen
			int jac = 111220;
			int tupp = 122220;
			int art = 131000;
			int bob = 122100;
			int nick = 111100;
			int jake = 141221;
			int josh = 151100;
			int sam = 122210;
			int chris = 151211;
			int mark = 132000;
			int will = 111210;
			int joe = 142000;
			int harry = 121000;
			int kevin = 151212;
			int larry = 141222;
			// Vrouwen
			int cherie = 241100;
			int amber = 222001;
			int tina = 221000;
			int jenni = 241200;
			int cindy = 250000;
			int edna = 231000;
			int sally = 222002;
			int julie = 211000;
			int grace = 232000;

			boolean again = true;
			while (again) {
				int answer =  0;
				String geslacht;
				// Antwoord check
				question: while (answer != jac && answer != tupp && answer != art && answer != bob && answer != nick
						&& answer != jake && answer != josh && answer != sam && answer != chris && answer != mark
						&& answer != will && answer != joe && answer != harry && answer != kevin && answer != larry
						&& answer != cherie && answer != amber && answer != tina && answer != jenni && answer != cindy
						&& answer != edna && answer != sally && answer != julie && answer != grace) {

					answer = 0;
					// Vraag 1 GESLACHT
					while (true) {
						System.out.println("Is het een man?");
						a = br.readLine();
						if (a.equals("ja")) {
							answer = answer + 100000;
							geslacht = "hij";
							break;
						} else if (a.equals("nee")) {
							answer = answer + 200000;
							geslacht = "zij";
							break;
						}
					}

					// Vraag 2 (MUlTIPLE) HAARKLEUR
					vraag2: while (true) {
						// Vraag 2 Blond
						while (true) {
							System.out.println("Heeft " + geslacht + " blond haar?");
							a = br.readLine();
							if (a.equals("ja")) {
								answer = answer + 10000;
								break vraag2;
							} else if (a.equals("nee")) {

								// Vraag 2 Zwart
								while (true) {
									System.out.println("Heeft " + geslacht + " zwart haar?");
									a = br.readLine();
									if (a.equals("ja")) {
										answer = answer + 20000;
										break vraag2;
									} else if (a.equals("nee")) {

										// Vraag 2 Wit
										while (true) {
											System.out.println("Heeft " + geslacht + " wit haar?");
											a = br.readLine();
											if (a.equals("ja")) {
												answer = answer + 30000;
												break vraag2;
											} else if (a.equals("nee")) {

												// Vraag 2 Bruin
												while (true) {
													System.out.println("Heeft " + geslacht + " bruin haar?");
													a = br.readLine();
													if (a.equals("ja")) {
														answer = answer + 40000;
														break vraag2;
													} else if (a.equals("nee")) {
														// Vraag Automatisch 2 Rood
														answer = answer + 50000;
														break vraag2;
													}
												}
											}
										}
									}
								}
							}
						}
					}

					if (answer == jac || answer == tupp || answer == art || answer == bob || answer == nick
							|| answer == jake || answer == josh || answer == sam || answer == chris || answer == mark
							|| answer == will || answer == joe || answer == harry || answer == kevin || answer == larry
							|| answer == cherie || answer == amber || answer == tina || answer == jenni
							|| answer == cindy || answer == edna || answer == sally || answer == julie
							|| answer == grace) {
						break question;
					}

					// Vraag 3 Huidskleur
					while (true) {				
						if (answer == 250000 || answer == 210000 || answer == 150000 || answer == 110000 || answer == 240000) {
							answer = answer + 1000;
							break;
						}
						System.out.println("Heeft " + geslacht + " een witte huidskleur?");
						a = br.readLine();
						if (a.equals("ja")) {
							answer = answer + 1000;
							break;
						} else if (a.equals("nee")) {
							answer = answer + 2000;
							break;
						}
					}

					if (answer == jac || answer == tupp || answer == art || answer == bob || answer == nick
							|| answer == jake || answer == josh || answer == sam || answer == chris || answer == mark
							|| answer == will || answer == joe || answer == harry || answer == kevin || answer == larry
							|| answer == cherie || answer == amber || answer == tina || answer == jenni
							|| answer == cindy || answer == edna || answer == sally || answer == julie
							|| answer == grace) {
						break question;
					}
					// Vraag 4 (Man) Baard
					while (answer < 200000) {
						System.out.println("Heeft " + geslacht + " een baard?");
						a = br.readLine();
						if (a.equals("ja")) {
							answer = answer + 100;
							break;
						} else if (a.equals("nee")) {
							answer = answer + 200;
							break;
						}
					}
					// Vraag 4 (Vrouw) Bloost
					while (answer > 200000) {
						System.out.println("Bloost ze?");
						a = br.readLine();
						if (a.equals("ja")) {
							answer = answer + 100;
							break;
						} else if (a.equals("nee")) {
							answer = answer + 200;
							break;
						}
					}

					if (answer == jac || answer == tupp || answer == art || answer == bob || answer == nick
							|| answer == jake || answer == josh || answer == sam || answer == chris || answer == mark
							|| answer == will || answer == joe || answer == harry || answer == kevin || answer == larry
							|| answer == cherie || answer == amber || answer == tina || answer == jenni
							|| answer == cindy || answer == edna || answer == sally || answer == julie
							|| answer == grace) {
						break question;
					}

					// Vraag 5 (Man) Snor
					while (answer < 200000) {
						System.out.println("Heeft " + geslacht + " een snor?");
						a = br.readLine();
						if (a.equals("ja")) {
							answer = answer + 10;
							break;
						} else if (a.equals("nee")) {
							answer = answer + 20;
							break;
						}
					}

					if (answer == jac || answer == tupp || answer == art || answer == bob || answer == nick
							|| answer == jake || answer == josh || answer == sam || answer == chris || answer == mark
							|| answer == will || answer == joe || answer == harry || answer == kevin || answer == larry
							|| answer == cherie || answer == amber || answer == tina || answer == jenni
							|| answer == cindy || answer == edna || answer == sally || answer == julie
							|| answer == grace) {
						break question;
					}

					// Vraag 6 Hoed
					while (true) {
						System.out.println("Heeft " + geslacht + " een hoed?");
						a = br.readLine();
						if (a.equals("ja")) {
							answer = answer + 1;
							break;
						} else if (a.equals("nee")) {
							answer = answer + 2;
							break;
						}
					}
					if (answer == jac || answer == tupp || answer == art || answer == bob || answer == nick
							|| answer == jake || answer == josh || answer == sam || answer == chris || answer == mark
							|| answer == will || answer == joe || answer == harry || answer == kevin || answer == larry
							|| answer == cherie || answer == amber || answer == tina || answer == jenni
							|| answer == cindy || answer == edna || answer == sally || answer == julie
							|| answer == grace) {
						break question;
					} else {
						System.out.println("Deze persoon bestaat niet!");
						System.out.println("Begin opnieuw");
						System.out.println("End code... " + answer);
					}
				}

				// Antwoord
				if (answer == jac) {
					System.out.println("Ik denk dat jij aan Jac dacht.");
				}
				if (answer == tupp) {
					System.out.println("Ik denk dat jij aan Tupp dacht.");
				}
				if (answer == art) {
					System.out.println("Ik denk dat jij aan art dacht.");
				}
				if (answer == bob) {
					System.out.println("Ik denk dat jij aan Bob dacht.");
				}
				if (answer == nick) {
					System.out.println("Ik denk dat jij aan Nick dacht.");
				}
				if (answer == jake) {
					System.out.println("Ik denk dat jij aan Jake dacht.");
				}
				if (answer == josh) {
					System.out.println("Ik denk dat jij aan Josh dacht.");
				}
				if (answer == sam) {
					System.out.println("Ik denk dat jij aan Sam dacht.");
				}
				if (answer == chris) {
					System.out.println("Ik denk dat jij aan Chris dacht.");
				}
				if (answer == mark) {
					System.out.println("Ik denk dat jij aan Mark dacht.");
				}
				if (answer == will) {
					System.out.println("Ik denk dat jij aan Will dacht.");
				}
				if (answer == joe) {
					System.out.println("Ik denk dat jij aan Joe dacht.");
				}
				if (answer == harry) {
					System.out.println("Ik denk dat jij aan Harry dacht.");
				}
				if (answer == kevin) {
					System.out.println("Ik denk dat jij aan Kevin dacht.");
				}
				if (answer == larry) {
					System.out.println("Ik denk dat jij aan Larry dacht.");
				}
				if (answer == cherie) {
					System.out.println("Ik denk dat jij aan Cherie dacht.");
				}
				if (answer == amber) {
					System.out.println("Ik denk dat jij aan Amber dacht.");
				}
				if (answer == tina) {
					System.out.println("Ik denk dat jij aan Tina dacht.");
				}
				if (answer == jenni) {
					System.out.println("Ik denk dat jij aan Jenni dacht.");
				}
				if (answer == cindy) {
					System.out.println("Ik denk dat jij aan Cindy dacht.");
				}
				if (answer == edna) {
					System.out.println("Ik denk dat jij aan Edna dacht.");
				}
				if (answer == sally) {
					System.out.println("Ik denk dat jij aan Sally dacht.");
				}
				if (answer == julie) {
					System.out.println("Ik denk dat jij aan Julie dacht.");
				}
				if (answer == grace) {
					System.out.println("Ik denk dat jij aan Grace dacht.");
				}

				// Antwoord Check
				while (true) {
					System.out.println("Heb ik het goed?");
					a = br.readLine();
					if (a.equals("ja")) {
						System.out.println("JOEPIE!");
						System.out.println("");
						break;
					} else if (a.equals("nee")) {
						System.out.println("O nee...");
						System.out.println("End code... " + answer);
						break;
					}
				}
				// AGAIN //
				System.out.println("Wil je nog een keertje?");
				System.out.println("Antwoord \"ja\" of \"nee\".");
				Again: while (true) {
					while (true) {
						a = br.readLine();
						if (a.equals("ja")) {
							System.out.println("Goede keuze!");
							break Again;
						} else if (a.equals("nee")) {
							System.out.println("Tot ziens!");
							again = false;
							break Again;
						}
						System.out.println("Error:You typed \"" + a + "\".");
					}
				}
			}
			/////////////////// YOUR CODE - END ////////////////////////

			// You may ignore everything below this line
		} catch (Exception e) {
			System.out.println("AII - Something went wrong: " + e.getMessage());
		}

	}
}

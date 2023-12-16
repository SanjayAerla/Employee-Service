package com.codewithsanju.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TelegramSendMessage {
	
	public static void main(String[] args) throws InterruptedException {
		
		List<String> userNames = new LinkedList<>();
		userNames.add("suffu_luck");
		userNames.add("groundwe");
		userNames.add("YoushiMEXC");
		userNames.add("Lucifer666Kingofhell");
		userNames.add("SyebAhmedSiyam");
		userNames.add("Themukeshp");
		userNames.add("sabhi11");
		userNames.add("niraaj1432");
		userNames.add("poonit_vs");
		userNames.add("software1100");
		userNames.add("Randomusername777");
		userNames.add("E995934119");
		userNames.add("Its_me_mahira");
		userNames.add("Gangwarthesidhu");
		userNames.add("Sakshi_singh12");
		userNames.add("portrait_oli");
		userNames.add("Shawon1010");
		userNames.add("Joker3718");
		userNames.add("ravinderboadlia");
		userNames.add("theantideather");
		userNames.add("khushnoorsadique");
		userNames.add("kings_jacob");
		userNames.add("ELSAIKOBATY");
		userNames.add("su2000sk");
		userNames.add("Niteshy276");
		userNames.add("Gyanstudylover");
		userNames.add("adhnan_salih");
		userNames.add("Amankanskar");
		userNames.add("katoch999");
		userNames.add("jindal001");
		userNames.add("Ankit_0827");
		userNames.add("Anjaliwushu");
		userNames.add("M23599");
		userNames.add("Saurabh7484");
		userNames.add("Anshujaishwal");
		userNames.add("The_lion_0");
		userNames.add("ron_das");
		userNames.add("ahmmedadhil");
		userNames.add("FootballCoinXFC");
		userNames.add("BeingRamesh_2712");
		userNames.add("Operative_69");
		userNames.add("Glossy_Girll");
		userNames.add("Sudeep_arya");
		userNames.add("yadavji2244");
		userNames.add("Rah19982");
		userNames.add("Chalegye3000rs");
		userNames.add("iplwinhelp");
		userNames.add("arutosh");
		userNames.add("hyalino");
		userNames.add("ritz_211");
		userNames.add("Jkrex");
		userNames.add("Chottan21");
		userNames.add("Raj_yadav3636");
		userNames.add("hello9758");
		userNames.add("Knightman");
		userNames.add("Allinonesongs1");
		userNames.add("snlnye");
		userNames.add("TheMobileSergeon");
		userNames.add("JD_Khn");
		userNames.add("spy0master");
		userNames.add("Insane_devil_007");
		userNames.add("Vshaivam");
		userNames.add("ansaljailani");
		userNames.add("Naman_Sharma15");
		userNames.add("shahh1616");
		userNames.add("AdaBalan");
		userNames.add("harsh_17_02");
		userNames.add("Achu19l");
		userNames.add("Rkd_58");
		userNames.add("Shynadh");
		userNames.add("G_U_Y_F");
		userNames.add("navolne12");
		userNames.add("your_amit");
		userNames.add("Dr_Ashutosh_Gupta");
		userNames.add("LenKA1w");
		userNames.add("jain_akshita");
		userNames.add("Samratthakur1");
		userNames.add("AAAAA7777070");
		userNames.add("arpitsinha98");
		userNames.add("Ah_med52");
		userNames.add("Aashif3000");
		userNames.add("avanisharma");
		userNames.add("Itz_your_kittu");
		userNames.add("call_me_senpai789");
		userNames.add("akash_chdry");
		userNames.add("aswin_pb");
		userNames.add("Ck_0075");
		userNames.add("DiwakarV");
		userNames.add("NOOBMASTERSIXTYNINO");
		userNames.add("UP_52");
		userNames.add("Taxil_Malaviya");
		userNames.add("Jhon1475");
		userNames.add("agerkrish");
		userNames.add("Yogioulyblx");
		userNames.add("eooqqo");
		userNames.add("rajnishkhadse");
		userNames.add("HazeLord");
		userNames.add("tigergamingYT004");
		userNames.add("mainmaksy");
		userNames.add("Predator1008");
		userNames.add("TARGET_UPSC_SK");
		userNames.add("virendrakumawat70899");
		userNames.add("uniquethekamal");
		userNames.add("Badnam_Amitsingh");
		userNames.add("SRGAMINGOWNER");
		userNames.add("omer_crypto");
		userNames.add("Kavadevishal2p");
		userNames.add("OpJaat1777");
		userNames.add("jatinsingh112");
		userNames.add("Devesh_gangwar");
		userNames.add("Seller_man_07");
		userNames.add("Jjtzjziz");
		userNames.add("Leeleon9");
		userNames.add("farshy");
		userNames.add("Farjana_gouri");
		userNames.add("For_exBoss");
		userNames.add("easymoonToTheSun");
		userNames.add("Tester0009");
		userNames.add("CARAMELCAFELATTE");
		userNames.add("akhi333yy");
		userNames.add("Yash_Mangal14");
		userNames.add("Yash3009");
		userNames.add("Gopi0078");
		userNames.add("Maestro_MZ");
		userNames.add("Yash_Pitale");
		userNames.add("Unknownyar");
		userNames.add("Sadrahuliya");
		userNames.add("parmanandsoni");
		userNames.add("prince1412p");
		userNames.add("Shaikshoiab");
		userNames.add("Arunappu9999");
		userNames.add("mynameisuwuu");
		userNames.add("Pappuo");
		userNames.add("LLEEGGEENNDDEERR");
		userNames.add("lovesuccess143");
		userNames.add("iamboy_9");
		userNames.add("Sadiquebhaiking");
		userNames.add("sscGD2002");
		userNames.add("isaiteja");
		userNames.add("AddyGh");
		userNames.add("Sunflowergupta7552");
		userNames.add("Bidyut818");
		userNames.add("MaxxeyD");
		userNames.add("Officialfan7896");
		userNames.add("Mama_op");
		userNames.add("Amit0988");
		userNames.add("Diamondc01");
		userNames.add("ITSVINLOGU");
		userNames.add("jp014");
		userNames.add("imranasrehazir");
		userNames.add("Dharmedrasingh");
		userNames.add("Almightystars");
		userNames.add("Aman_1711");
		userNames.add("Jo_ck_r3");
		userNames.add("D_H_R_U_V_D_A_H_I_Y_A");
		userNames.add("XPAINSTORE");
		userNames.add("faizxvv");
		userNames.add("xterminate11");
		userNames.add("Srkcyclo");
		userNames.add("Jiosher345");
		userNames.add("xivoyo");
		userNames.add("tiwarishivam737");
		userNames.add("earnfromhome21");
		userNames.add("theyashrajmadhav");
		userNames.add("komaln");
		userNames.add("super_57");
		userNames.add("shivamgupta41");
		userNames.add("salu_111");
		userNames.add("martinsanchezestrella");
		userNames.add("nath5854");
		userNames.add("kindai313");
		userNames.add("Aj_110125");
		userNames.add("intelligentHoney");
		userNames.add("Irshadluck027432");
		userNames.add("Thestockerzrock");
		userNames.add("Ipsita_das");
		userNames.add("gkkk012");
		userNames.add("rocky7412");
		userNames.add("Anubhavsince2004");
		userNames.add("ckeashav691");
		userNames.add("mmmm162");
		userNames.add("Kawal0181");
		userNames.add("haye778");
		userNames.add("SR0408");
		userNames.add("Iamjokkkker");
		userNames.add("kopi972");
		userNames.add("deity289");
		userNames.add("girdhari_kakar");
		userNames.add("Hanahizamaan");
		userNames.add("vipearning000");
		userNames.add("Boxer_088");
		userNames.add("Achu203");
		userNames.add("Adheera_it_world");
		userNames.add("Snehil14");
		userNames.add("JSCKHs");
		userNames.add("Prakash7764");
		userNames.add("Parassindhwani");
		userNames.add("sachinsharma5591");
		userNames.add("Rachi1234");
		userNames.add("Rehin7");
		userNames.add("Jesua1");
		userNames.add("Midhungopalakrishnan");
		userNames.add("Katalystnitrus");
		userNames.add("hacknocard");
		userNames.add("Googoggghf");
		userNames.add("GADDENAGOUD");
		userNames.add("DipakSD5660");
		userNames.add("shiningpapun");
		userNames.add("Rajanbhai20");
		userNames.add("bharatkumar0001");
		userNames.add("Barlin12345");
		userNames.add("Mitras06");
		userNames.add("psrkr6");
		userNames.add("Bahanc");
		userNames.add("Karthickk786");
		userNames.add("sam_321456");
		userNames.add("apnadekh161");
		userNames.add("Shushanthshiva");
		userNames.add("MohamedTrade");
		userNames.add("Numero1881");
		userNames.add("rini_chaudhary");
		userNames.add("Mmmyadav");
		userNames.add("Amit6004");
		userNames.add("whzgud10");
		userNames.add("HSGuruji");
		userNames.add("Google00000000");
		userNames.add("jyoti_baisa28");
		userNames.add("Omg1246");
		userNames.add("Name_is_umeshchandu");
		userNames.add("Itz_goldi");
		userNames.add("mafiya0047");
		userNames.add("EvilKing007");
		userNames.add("Mishra_jiiiiiiiii");
		userNames.add("JKMaurya2020");
		userNames.add("Voronoc");
		userNames.add("Kirtiaz0");
		userNames.add("Rambalijee");
		userNames.add("Kanha3442");
		userNames.add("itz_kk_06");
		userNames.add("som563");
		userNames.add("Robadi");
		userNames.add("Prediction_03");
		userNames.add("Pradneshborse3803");
		userNames.add("happyeee4u");
		userNames.add("akshay6t");
		userNames.add("sarankl");
		userNames.add("kheriwalji");
		userNames.add("DEVIL098765431");
		userNames.add("DEVmaharaj");
		userNames.add("Apur1g");
		userNames.add("thakur1402");
		userNames.add("amllllllllllllll");
		userNames.add("joshjehi");
		userNames.add("Vc2996");
		userNames.add("myvita999");
		userNames.add("Aru6303");
		userNames.add("shubhamy777");
		userNames.add("rahmaniarzahraqueen");
		userNames.add("Malad9");
		userNames.add("white_hearted_person");
		userNames.add("Padam_torr");
		userNames.add("Ramansekhon");
		userNames.add("chetendra5789");
		userNames.add("ll_picachu_ll");
		userNames.add("PRAFULLMANDLOI");
		userNames.add("QwesiAhli");
		userNames.add("CrAzYPrAsH2");
		userNames.add("Naira_Nayra");
		userNames.add("nikhil_nikki03");
		userNames.add("nanu7721");
		userNames.add("nickz007nick");
		userNames.add("ProfessorCharles_Xavier");
		userNames.add("prabhakarnikam");
		userNames.add("Lavelesh22");
		userNames.add("Joygamer");
		userNames.add("ludoadmin01");
		userNames.add("Redlikes2");
		userNames.add("ipl_matchs");
		userNames.add("Amitch1");
		userNames.add("Immaahit");
		userNames.add("II_KREK_X");
		userNames.add("challak_manager");
		userNames.add("malik_god");
		userNames.add("EsGodwin");
		userNames.add("anu52000");
		userNames.add("Deven1283");
		userNames.add("Shakti_MaN_c");
		userNames.add("asifchotu1015");
		userNames.add("Puneet_tiwari_910");
		userNames.add("Yashhhhhuuu");
		userNames.add("Vivekrana_918");
		userNames.add("aagrawal20");
		userNames.add("SANDOS_1");
		userNames.add("stormmy777");
		userNames.add("suraj334477");
		userNames.add("xunuo_3");
		userNames.add("Mohit49");
		userNames.add("DEVARAMJAT");
		userNames.add("khanafzal17");
		userNames.add("Innovatorrohit");
		userNames.add("dinusingh579");
		userNames.add("syan_hazra");
		userNames.add("Shubham_Bharti_05");
		userNames.add("Khubmachao");
		userNames.add("shweta3084");
		userNames.add("AkhilcrU");
		userNames.add("SdSayan");
		userNames.add("DIEHARD2300");
		userNames.add("rkb_20");
		userNames.add("Praa_30");
		userNames.add("DaniCP0");
		userNames.add("Shivjakhar0099");
		userNames.add("getmeajmal");
		userNames.add("Obito_uchih_a");
		userNames.add("Sanjukz");
		userNames.add("Tomjerry067");
		userNames.add("Mgamegha");
		userNames.add("its_me125");
		userNames.add("CKsatapathy");
		
		
		
		List<String> messageList = Arrays.asList(
				"Discover Irresistible Amazon Offers & Savings! "
				+ "Join our channel to access exclusive deals, discounts, and unbeatable shopping offers. "
				+ "Uncover the Finest Deals curated just for you."
				+ " https://t.me/+NZ7ICeOSW5E2YzRl",

				"****** EXCLUSIVE AMAZON SAVINGS ******. "
				+ "Become a member of this channel to unlock unique Amazon deals, discounts, and irresistible shopping offers! "
				+ "Let us source the Optimal Deals for you."
				+ " https://t.me/+NZ7ICeOSW5E2YzRl",

				"****** AMAZON SPECIALS & SAVINGS ******. "
				+ "Enlist in this channel for limited-time Amazon deals, discounts, and unbeatable shopping offers! "
				+ "We're dedicated to discovering the Prime Deals for you."
				+ " https://t.me/+NZ7ICeOSW5E2YzRl",

				"Unlock Exclusive Amazon Deals & Discounts! "
				+ "Connect with our channel for access to unique deals, discounts, and unbeatable shopping offers. "
				+ "We're committed to finding the Top Deals for you."
				+ " https://t.me/+NZ7ICeOSW5E2YzRl",

				"****** AMAZON EXCLUSIVES & OFFERS ******. "
				+ "Enroll in this channel to gain exclusive access to Amazon deals, discounts, and unbeatable shopping offers! "
				+ "Trust us to unearth the Ultimate Deals for you."
				+ " https://t.me/+NZ7ICeOSW5E2YzRl",

				"Explore Exclusive Amazon Deals & Discounts! "
				+ "Join our channel for insider access to unique deals, discounts, and unbeatable shopping offers. "
				+ "Let us track down the Premier Deals for you."
				+ " https://t.me/+NZ7ICeOSW5E2YzRl",

				"****** AMAZON EXCLUSIVES & SAVINGS ******. "
				+ "Subscribe to this channel for exclusive Amazon deals, discounts, and unbeatable shopping offers! "
				+ "Count on us to unveil the Premium Deals for you."
				+ " https://t.me/+NZ7ICeOSW5E2YzRl",

				"Discover Unbeatable Amazon Deals & Discounts! "
				+ "Connect with our channel for exclusive access to deals, discounts, and unbeatable shopping offers. "
				+ "We're dedicated to sourcing the Elite Deals for you."
				+ " https://t.me/+NZ7ICeOSW5E2YzRl",

				"****** AMAZON SPECIALS & DISCOUNTS ******. "
				+ "Enlist in this channel for exclusive Amazon deals, discounts, and unbeatable shopping offers! "
				+ "We're committed to bringing you the Ultimate Deals."
				+ " https://t.me/+NZ7ICeOSW5E2YzRl",

				"Unlock Premium Amazon Deals & Discounts! "
				+ "Join our channel for insider access to exclusive deals, discounts, and unbeatable shopping offers. "
				+ "Let us uncover the Prime Deals for you."
				+ " https://t.me/+NZ7ICeOSW5E2YzRl");

		
		Random random = new Random();
		System.setProperty("webdriver.chrome.driver", "E:\\Myfiles\\Companies\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
		WebDriver driver1 = new ChromeDriver(options);
		System.out.println(driver1.getTitle());
		
		
		for(String userName : userNames) {
			
			try {
				driver1.navigate().to("https://web.telegram.org/a/");
				WebElement findingContact =  driver1.findElement(By.id("telegram-search-input"));
				findingContact.clear();
				findingContact.sendKeys(userName);
				Thread.sleep(2000);
				findingContact.sendKeys(Keys.RETURN);
				System.out.println("Clicked Search and sent username "+userName);
//				Thread.sleep(3000);
				
				WebElement inputText =  driver1.findElement(By.id("editable-message-text"));
//				inputText.click();
				inputText.sendKeys(messageList.get(random.nextInt(10)));
				inputText.sendKeys(Keys.RETURN);
				System.out.println("Clicked Search and sent message to  " + userName);
				Thread.sleep(15000);
//				inputText.sendKeys("Hi");
			}catch(Exception ex) {
				ex.printStackTrace();
				System.out.println("Unable to send to user " + userName);
				continue;
			}
			
		}
		
	}
	
	static boolean checkMenuEnable(WebDriver driver) {
		
		if(driver.findElement(By.xpath("//*[@id=\"LeftMainHeader\"]/div[1]/button/div[2]")).isDisplayed())
			return true;
		else
			return false;
		
	}
}

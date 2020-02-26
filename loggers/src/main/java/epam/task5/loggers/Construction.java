package epam.task5.loggers;
import java.util.Scanner;
import java.util.logging.*;

public class Construction {
		public void dimensions(){
			int standard = 1200;
			int abvstandard = 1500;
			int highstandard = 1800;
			int fullyautomated = 2500;
			float area ;
			Logger log = Logger.getLogger(Construction.class.getName());
			try (Scanner sc = new Scanner(System.in)) {
				log.info("Enter the area of the home to be constructed : ");
				area = sc.nextFloat();
				float total_cost;
				Boolean flag = true;
				while(flag) {
					log.info("\nWhich type of home do you want to construct : \n1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High Standard and Automated Home\n");
					int ch = sc.nextInt();
					switch(ch) {
						case 1 : 
							log.info("-------Standard Material Home---------\n");
							total_cost = area*standard;
							log.info("\nThe total construction of the house using Standard Material is :"+total_cost);
							log.info("\n\nDo you want to perform more operations?(y/n)");
	        				ch=sc.next().charAt(0);
	        				if(ch == 'y'||ch=='Y')
	        					flag = true;
	        				else {
	        					flag = false;
	        					log.info("Exit");
	        				}
	        				break;
						case 2 : 
							log.info("-------Above Standard Material Home---------\n");
							total_cost = area*abvstandard;
							log.info("\nThe total construction of the house using Above Standard Material is :"+total_cost);
							log.info("\n\nDo you want to perform more operations?(y/n)");
	        				ch=sc.next().charAt(0);
	        				if(ch == 'y'||ch=='Y')
	        					flag = true;
	        				else {
	        					flag = false;
	        					log.info("Exit");
	        				}
	        				break;
						case 3 : 
							log.info("-------High Standard Material Home---------\n");
							total_cost = area*highstandard;
							log.info("\nThe total construction of the house using High Standard Material is :"+total_cost);
							log.info("\n\nDo you want to perform more operations?(y/n)");
	        				ch=sc.next().charAt(0);
	        				if(ch == 'y'||ch=='Y')
	        					flag = true;
	        				else {
	        					flag = false;
	        					log.info("Exit");
	        				}
	        				break;
						case 4 : 
							log.info("-------High Standard Material with Automated Home---------\n");
							total_cost = area*fullyautomated;
							log.info("\nThe total construction of the house using High Standard Material with Automated Home :"+total_cost);
							log.info("\n\nDo you want to perform more operations?(y/n)");
	        				ch=sc.next().charAt(0);
	        				if(ch == 'y'||ch=='Y')
	        					flag = true;
	        				else {
	        					flag = false;
	        					log.info("Exit");
	        				}
	        				break;
					}
				}
			}
			catch(Exception e) {
				log.info("Given area is wrong");
			}
		}

	}



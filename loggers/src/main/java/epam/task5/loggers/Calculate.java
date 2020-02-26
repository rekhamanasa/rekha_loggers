package epam.task5.loggers;
import java.util.Scanner;
import java.util.logging.*;

public class Calculate {
		Logger log = Logger.getLogger(Construction.class.getName());
		public void simple(float p, float t, float r) {
			float amt = (p*t*r)/100;
			log.info(""+amt);
		}
		public void compound(float p, float t, float r) {
			double amt = Math.pow(1+(r/t), t);
			double cin = amt-p;
			log.info(""+ cin);
		}
		public void details() {
			try (Scanner sc = new Scanner(System.in)) {
				Boolean flag = true;
				Calculate s = new Calculate();
				while(flag) {
					log.info("\n1.Simple Interest\n2.Compound Interest\n");
					log.info("Select which operation to performed : \n");
					int ch = sc.nextInt();
					log.info("Enter the principle amout given : ");
					float p = sc.nextFloat();
					log.info("Enter the number of years : ");
					float t = sc.nextFloat();
					log.info("Enter the rate of interest : ");
					float r = sc.nextFloat();
					switch(ch) {
						case 1 :
							log.info("-----SIMPLE INTEREST-----\n");
							log.info("The SIMPLE INTEREST for the given amount is : ");
							s.simple(p, t, r);
							log.info("\n");
							log.info("\nDo you want to perform more operations?(y/n)");
	        				ch=sc.next().charAt(0);
	        				if(ch == 'y'||ch=='Y')
	        					flag = true;
	        				else {
	        					flag = false;
	        					log.info("Exit");
	        				}
	        				break;
						case 2:
							log.info("-----COMPOUND INTEREST-----\n");
							log.info("The COMPOUND INTEREST for the given amount is : ");
							s.compound(p, t, r);
							log.info("\n");
							log.info("\nDo you want to perform more operations?(y/n)");
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
				System.out.format("%s", "Input exception");
			}
				
	}
			
		
}


import java.util.ArrayList; 
import java.util.Scanner;

public class ClimateChange {


    public static void main (String [] args){

        ArrayList<SustainableDevelopment> listOfSDGs = new ArrayList<SustainableDevelopment>();
        ArrayList<EnvironmentalPolicy> listOfEnvironmentalPolicies = new ArrayList<EnvironmentalPolicy>();
        ArrayList<RenewableEnergy> listOfRenewableEnergies = new ArrayList<RenewableEnergy>();        


        RenewableEnergy solar = new RenewableEnergy("String benefits", "String limitations",60,"solar",50,200);
        RenewableEnergy wind = new RenewableEnergy("String benefits", "String limitations",60,"wind",50,200);
        listOfRenewableEnergies.add(solar);
        listOfRenewableEnergies.add(wind);

        SustainableDevelopment sdg1 = new SustainableDevelopment("Encourages innovation and investment in cleaner technologies \nCreates financial incentive for businesses to reduce carbon emissions", "Leads to higher energy costs for consumers\n Implementation can be challenging due to political opposition", 10, "Carbon Pricing", "Reduce carbon emissions", "Reduce green house gases and reduce company carbon footprints", 2008);
        SustainableDevelopment sdg3 = new SustainableDevelopment("Complements other policies like the carbon pricing \nCreates jons and spurs economic growth in the clean sector", "Can be expensive to implement\n May be ineffective if subsidiarie", 10, "Technology Subsidies", "Reduce carbon emissions", "Reduce green house gases and reduce company carbon footprints", 2008);
        listOfSDGs.add(sdg3);
        listOfSDGs.add(sdg1);

        EnvironmentalPolicy carbonPricing = new EnvironmentalPolicy();
        EnvironmentalPolicy technologySubsidies = new EnvironmentalPolicy( null, null, 0, null, null, null);

        listOfEnvironmentalPolicies.add(carbonPricing);
        listOfEnvironmentalPolicies.add(technologySubsidies);

        System.out.println("Hello! This is Climate Change Educator!");

        String userInput2;
        String userInput3;
        int userInput1;
        System.out.println("------------------------------------------------------------------------");

        System.out.println("------------------------------------------------------------------------");
        do{
        System.out.println("What solution do you want to learn about today?\n1- Sustainable Development\n2- Renewable Energy\n3- Environmental Policy");

        Scanner input= new Scanner(System.in);
         userInput1= Integer.parseInt(input.nextLine());

        int index=0;


        if (userInput1==1)
        {
            do
            {
            listOfSDGs.get(index).displayInfo();
            index++;

            System.out.println("Do you want to know more? Yes/No?");
             userInput2= input.nextLine();

            } while(index<listOfSDGs.size() && userInput2.equalsIgnoreCase("Yes"));

        }
        else if (userInput1==2)
        {
            do
            {
            listOfRenewableEnergies.get(index).displayInfo();
            index++;

            System.out.println("Do you want to know more? Yes/No?");
             userInput2= input.nextLine();

            } while(index<listOfRenewableEnergies.size() && userInput2=="Yes");

        }
        else if (userInput1==3)
        {
            for (int i=0; i<listOfEnvironmentalPolicies.size();i++)
            {
                listOfEnvironmentalPolicies.get(i).displayInfo();
            }

        }
        else
        {
            System.out.println("Enter a valid option:");
        }
        
        System.out.println("Do you want to continue learning? Yes/No?");
        userInput3=input.nextLine();

        }while(userInput3.equalsIgnoreCase("Yes"));


        // SustainableDevelopment sustain = new SustainableDevelopment();
        // sustain.setGoals("Healing the environment");
        // sustain.setIndicators("Reducing the rate of climate change");

        // givesInformation giving = new givesInformation();
        // giving.setDescription("This program provides solutions for Climate Change");
        // giving.setYear(2023);
        // giving.setImpact("high");
        // giving.setSolutions("renewable energy, environmental policy, sustainable development,adaptation strategies");




        // renew.displayInfo();
        // renew2.displayInfo();

        // Adapt.displayInfo();
        // environ.displayInfo();
        // sustain.displayInfo();
        // giving.displayInfo();

    }

    
}

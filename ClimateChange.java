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

        SustainableDevelopment sdg1 = new SustainableDevelopment( null, null, 0, null, null, 0);
        SustainableDevelopment sdg3 = new SustainableDevelopment( null, null, 0, null, null, 0);
        listOfSDGs.add(sdg3);
        listOfSDGs.add(sdg1);

        EnvironmentalPolicy carbonPricing = new EnvironmentalPolicy( null, null, 0, null, "", null);
        EnvironmentalPolicy technologySubsidies = new EnvironmentalPolicy( null, null, 0, null, null, null);

        listOfEnvironmentalPolicies.add(carbonPricing);
        listOfEnvironmentalPolicies.add(technologySubsidies);

        System.out.println("Hello! This is Climate Change Educator!");
        System.out.println("What solution do you want to learn about today?\n1- Sustainable Development\n2- Renewable Energy\n3- Environmental Policy");

        Scanner input= new Scanner(System.in);
        int userInput1= Integer.parseInt(input.nextLine());

        if (userInput1==3)
        {
            for (int i=0; i<listOfEnvironmentalPolicies.size();i++)
            {
                System.out.println(listOfEnvironmentalPolicies.get(i).displayInfo());
            }

        }
        else if (userInput1==3)
        {
            for (int i=0; i<listOfEnvironmentalPolicies.size();i++)
            {
                System.out.println(listOfEnvironmentalPolicies.get(i).displayInfo());
            }

        }
        else if (userInput1==3)
        {
            for (int i=0; i<listOfEnvironmentalPolicies.size();i++)
            {
                System.out.println(listOfEnvironmentalPolicies.get(i).displayInfo());
            }

        }
        else
        {
            System.out.println("Enter a valid option:");
        }
        



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

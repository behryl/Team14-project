/**

The RenewableEnergy class is a subclass of the AdaptationStrategies class

and represents the use of renewable energy sources.
*/
public class RenewableEnergy extends AdaptationStrategies {
    private String energyType;
    private double capacity;
    private double cost; 

    /**
    Constructs a RenewableEnergy object.
    @param benefits the benefits of using renewable energy
    @param limitations the limitations of using renewable energy
    @param successRate the success rate of the adaptation strategy
    @param energyType the type of renewable energy
    @param capacity the capacity of the renewable energy source
    @param cost the cost of the renewable energy source
    */
    public RenewableEnergy(String benefits, String limitations,double successRate,String energyType,double capacity,double cost){
        super("Using Renewable Energy Sources", benefits, limitations, successRate);
        this.energyType=energyType;
        this.capacity=capacity;
        this.cost=cost;
    }

    /**
    Sets the energy type of the renewable energy source.
    @param energyType the energy type to set
    */
    public void setEnergyType(String energyType) {
        this.energyType = energyType;
    }

    /**
    Returns the energy type of the renewable energy source.
    @return the energy type
    */    
    public String getEnergyType() {
        return energyType;
    }

    /**

    Sets the capacity of the renewable energy source.
    @param capacity the capacity to set
    */
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    /**
    Returns the capacity of the renewable energy source.
    @return the capacity
    */
    public double getCapacity() {
        return capacity;
    }

    /**
    Sets the cost of the renewable energy source.
    @param cost the cost to set
    */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
    Returns the cost of the renewable energy source.
    @return the cost
    */
    public double getCost() {
        return cost;
    }

    /**

    Predicts the future energy production of the renewable energy source based on its type.
    @return the predicted future energy production
    */
    public double predictFutureEnergyProduction()
    {
        if (this.energyType.equalsIgnoreCase("solar")){
            return 28;
        }
        else if (this.energyType.equalsIgnoreCase("wind")){
            return 23;
        }
        else if (this.energyType.equalsIgnoreCase("hydro")){
            return 60;
        }
        else if (this.energyType.equalsIgnoreCase("biomass")){
            return 30;
        }
        else if (this.energyType.equalsIgnoreCase("geothermal")){
            return 50;
        }
        else if (this.energyType.equalsIgnoreCase("ocean")){
            return 10;
        }
        else{
            return -1;
        }
    }

    /**
    Displays information about the renewable energy source.
    */
    public void displayInfo(){
        System.out.println("Type of Renewable Energy:" + getEnergyType());
        System.out.println("Benefits of "+getEnergyType()+" energy\n: " + getBenefits());
        System.out.println("Limitations of "+getEnergyType()+" energy\n: " + getLimitations());
    }
}

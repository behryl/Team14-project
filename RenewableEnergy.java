public class RenewableEnergy extends AdaptationStrategies {
    private String energyType;
    private double capacity;
    private double cost; 


    public RenewableEnergy(String strategyName,String benefits, String limitations,double successRate,String energyType,double capacity,double cost){
        super("Using Renewable Energy Sources", benefits, limitations, successRate);
        this.energyType=energyType;
        this.capacity=capacity;
        this.cost=cost;
    }

    public void setEnergyType(String energyType) {
        this.energyType = energyType;
    }
    public String getEnergyType() {
        return energyType;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

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

    public void displayInfo(){
        System.out.println("Type of Renewable Energy: " + getEnergyType());
        System.out.println("Benefits of "+getEnergyType()+" energy: " + getBenefits());
        System.out.println("Limitations of "+getEnergyType()+" energy: " + getLimitations());
    }
}

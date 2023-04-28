public class RenewableEnergy extends AdaptationStrategies {
    private String type;
    private String storageType;

    public RenewableEnergy(String strategyName,String benefits, String limitations, double successRate,String type,String storageType){
    super(strategyName, benefits, limitations, successRate);
    this.type=type;
    this.storageType=storageType;
    }

    public String getType(){
        return this.type;
    }
    
    public void setType(String type){
        this.type = type;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }
    

    // public void displayInfo(){
    //     System.out.println("Type of Renewable Energy: " + getType());
    //     System.out.println("Limitation Renewable Energy: " + getLimitations());
    //     System.out.println("Benefit of Renewable Energy: " + getBenefits());

    }
}

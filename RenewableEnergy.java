public class RenewableEnergy {
    private String type;
    private String benefits;
    private String limitations;

    public RenewableEnergy(){
    type=null;
     benefits=null;
      limitations=null;
    }

    public String getType(){
        return this.type;
    }

    public String getBenefits(){
        return this.benefits;
    }

    public String getLimitations(){
        return this.limitations;
    }
    
    public void setType(String type){
        this.type = type;
    }

    public void setBenefits(String benefits){
        this.benefits = benefits;
    }

    public void setLimitations(String limitations){
        this.limitations= limitations;
    }

    public void displayInfo(){
        System.out.println("Type of Renewable Energy: " + getType());
        System.out.println("Limitation Renewable Energy: " + getLimitations());
        System.out.println("Benefit of Renewable Energy: " + getBenefits());

    }
}

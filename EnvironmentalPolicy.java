public class EnvironmentalPolicy extends AdaptationStrategies{

    private String policyName;
    private String policyDescription;
    private String policyType;

    public EnvironmentalPolicy(String strategyName,String benefits, String limitations, double successRate,String policyName,String policyDescription,String policyType){
    super(strategyName, benefits, limitations, successRate);
    this.policyName=policyName;
    this.policyDescription=policyDescription;
    this.policyType=policyType;

    }
//HIlllo
    public String getPolicyName(){
        return this.policyName;
    }

    public String getpolicyDescription(){
        return this.policyDescription;
    }

    public String getPolicyType(){
        return this.policyType;
    }
    
    public void setPolicyName(String policyName){
        this.policyName = policyName;
    }

    public void setPolicyDescription(String policyDescription){
        this.policyDescription = policyDescription;
    }

    public void setPolicyType(String policyType){
        this.policyType= policyType;
    }

    // public EnvironnmentalPolicy suggestAlternativePolicy()
    // {
        
    // }

    public void displayInfo(){
        System.out.println("Policy Name: " + getPolicyName());
        System.out.println("Policy Description: " + getpolicyDescription());
        System.out.println("Policy Type: " + getPolicyType());

    }
    
}

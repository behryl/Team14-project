public class EnvironmentalPolicy {

    private String policyName;
    private String policyDescription;
    private String policyType;

    public EnvironmentalPolicy( String policyName,String policyDescription,String policyType){

    }
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

    public void displayInfo(){
        System.out.println("Policy Name: " + getPolicyName());
        System.out.println("Policy Description: " + getpolicyDescription());
        System.out.println("Policy Type: " + getPolicyType());

    }
    
}

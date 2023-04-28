import java.util.ArrayList; 

/**

The EnvironmentalPolicy class represents a strategy to implement Environmental Policies.
It inherits from the AdaptationStrategies class and adds specific properties like policy name,
policy description, and policy type.
*/

public class EnvironmentalPolicy extends AdaptationStrategies{

    private String policyName;
    private String policyDescription;
    private String policyType;
    
    /**
     * Constructs an EnvironmentalPolicy object with benefits, limitations, success rate, policy name, 
     * policy description, and policy type.
     * @param benefits the benefits of the policy
     * @param limitations the limitations of the policy
     * @param successRate the success rate of the policy
     * @param policyName the name of the policy
     * @param policyDescription the description of the policy
     * @param policyType the type of the policy
     */
    public EnvironmentalPolicy(String benefits, String limitations, double successRate,String policyName,String policyDescription,String policyType){
    super("Implementing Environmental Policies", benefits, limitations, successRate);
    this.policyName=policyName;
    this.policyDescription=policyDescription;
    this.policyType=policyType;

    }
    /**
     * Returns the name of the policy.
     * @return the name of the policy
     */

    public String getPolicyName(){
        return this.policyName;
    }

    /**
     * Returns the description of the policy.
     * @return the description of the policy
     */
    public String getpolicyDescription(){
        return this.policyDescription;
    }

    /**
     * Returns the type of the policy.
     * @return the type of the policy
     */
    public String getPolicyType(){
        return this.policyType;
    }
    
    /**
     * Sets the name of the policy.
     * @param policyName the name of the policy
     */
    public void setPolicyName(String policyName){
        this.policyName = policyName;
    }

    /**
     * Sets the description of the policy.
     * @param policyDescription the description of the policy
     */
    public void setPolicyDescription(String policyDescription){
        this.policyDescription = policyDescription;
    }

    
    /**
     * Sets the type of the policy.
     * @param policyType the type of the policy
     */
    public void setPolicyType(String policyType){
        this.policyType= policyType;
    }

    /**
     * Suggests an alternative policy from a list of environmental policies based on the policy type.
     * @param listOfEnvironmentalPolicies the list of environmental policies to choose from
     * @return the alternative policy or null if there is no alternative policy
     */
    public EnvironmentalPolicy suggestAlternativePolicy(ArrayList<EnvironmentalPolicy> listOfEnvironmentalPolicies)
    {
        for (int i=0; i<listOfEnvironmentalPolicies.size();i++)
        {
            if (this.getPolicyType().equalsIgnoreCase(listOfEnvironmentalPolicies.get(i).getPolicyType()))
            {
                return listOfEnvironmentalPolicies.get(i);
            }
        }
        return null;
    }

    /**
     * Displays the information of the environmental policy.
     */
    public void displayInfo(){
        System.out.println("Policy Name: " + getPolicyName());
        System.out.println("Policy Type: " + getPolicyType());
        System.out.println("Policy Description:\n " + getpolicyDescription());
     }
    
}

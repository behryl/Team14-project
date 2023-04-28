public class AdaptationStrategies {

    private String strategies;
    private String risks;


    public AdaptationStrategies(String strategies, String risks){
        setStrategies(strategies);
        setRisks(risks);
    }

    public String getStrategies(){
        return this.strategies;
    }

    public String getRisks(){
        return this.risks;
    }

    public void setStrategies(String strategies){
        this.strategies = strategies;
    }

    public void setRisks(String risks){
        this.risks = risks;
    }

    public void displayInfo(){
        System.out.println("Strategies: " + getStrategies());
        System.out.println("Risk: " + getRisks());

    }
    
}

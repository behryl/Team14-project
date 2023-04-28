public class AdaptationStrategies {

    protected String strategyName;
    protected String benefits;
    protected String limitations;
    protected double successRate;

    public AdaptationStrategies(String strategyName,String benefits,String limitations,double successRate){
        setLimitations(limitations);
        setBenefits(benefits);
        setStrategyName(strategyName);
        setSuccessRate(successRate);
    }

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    public String getBenefits() {
        return benefits;
    }
    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getLimitations() {
        return limitations;
    }
    public void setLimitations(String limitations) {
        this.limitations = limitations;
    }

    public double getSuccessRate() {
        return successRate;
    }
    public void setSuccessRate(double successRate) {
        this.successRate = successRate;
    }

    public void displayInfo(){
        System.out.println("Risk: " + setBenefits());
        System.out.println("Strategies: " + setSuccessRate());
        System.out.println("Strategies: " + setLimitations());

    }

}

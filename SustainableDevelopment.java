public class SustainableDevelopment extends AdaptationStrategies {
    private String goals;
    private String indicators;

    public SustainableDevelopment(String strategyName,String benefits, String limitations, double successRate,String indicators,String goals){
        super(strategyName, benefits, limitations, successRate);
        this.goals=goals;
        this.indicators=indicators;
    }


    public String getGoals(){
        return this.goals;
    }

    public String getIndicators(){
        return this.indicators;
    }

    public void setGoals(String goals){
        this.goals = goals;
    }

    public void setIndicators(String indicators){
        this.indicators = indicators;
    }

    public void displayInfo(){
        System.out.println("Goals: " + getGoals());
        System.out.println("Indicators: " + getIndicators());

    }
    
    
}

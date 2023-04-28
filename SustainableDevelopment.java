public class SustainableDevelopment extends AdaptationStrategies {
    private String goals;
    private String goalName;
    private String indicators;
    private int yearOfImplementation;
    private static final int CURRENT_YEAR=2023;

    public SustainableDevelopment(String benefits, String limitations, double successRate,String goalName,String indicators,String goals,int yearOfImplementation){
        super("Using SDGs", benefits, limitations, successRate);
        this.goals=goals;
        this.indicators=indicators;
        this.goalName=goalName;
        setYearOfImplementation(yearOfImplementation);
    }

    public void setYearOfImplementation(int yearOfImplementation) {
        this.yearOfImplementation = yearOfImplementation;
    }
    public int getYearOfImplementation() {
        return yearOfImplementation;
    }
    public String getGoals(){
        return this.goals;
    }

    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }
    public String getGoalName() {
        return goalName;
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

    public String evaluateImpact(){
        if ((CURRENT_YEAR- yearOfImplementation)> 5 && successRate >= 70){
            return "High Impact";
        }
        else if (((CURRENT_YEAR- yearOfImplementation) >= 2 && CURRENT_YEAR- yearOfImplementation <= 4) && (successRate < 70 && successRate > 50)){
            return "Medium Impact";
        }
        else{
            return "Low Impact";
        }

    }
    

    public void displayInfo(){
        System.out.println("The SDG is: " + getGoalName());
        System.out.println("Goals: " + getGoals());
        System.out.println("Indicators: " + getIndicators());
        System.out.println("This Sustainable Development Goal has a: " + getIndicators());
    }
    
}

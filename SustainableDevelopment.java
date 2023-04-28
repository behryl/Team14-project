public class SustainableDevelopment {
    private String goals;
    private String indicators;

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

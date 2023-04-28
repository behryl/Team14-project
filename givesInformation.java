public class givesInformation{
    private String name;
    private String description;
    private int year;
    private String impact;
    private String solutions;

    /**
     * @param 
     * @return void
     */
    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public int getYear(){
        return this.year;
    }

    public String getImpact(){
        return this.impact;
    }

    public String getSolutions(){
        return this.solutions;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setImpact(String impact){
        this.impact = impact;
    }

    public void setSolutions(String solutions){
        this.solutions = solutions;
    }



    public void displayInfo(){
        System.out.println("Year: " + getYear());
        System.out.println("Impact: " + getImpact());
        System.out.println("Solution: " + getSolutions());
        System.out.println("Describe: " + getDescription());

    }

}
    

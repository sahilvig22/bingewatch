package bingewatch;

/**
 *
 * @author Sahil
 */
public class MovieBean {
    private int id;
    private String name;
    private String notes;
    private String date;
    
    public MovieBean(int id, String name, String notes, String date){
        this.id = id;
        this.name = name;  
        this.notes = notes;
        this.date = date;
        
    }

    public int getId(){
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

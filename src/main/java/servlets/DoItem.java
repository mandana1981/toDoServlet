package servlets;

public class DoItem {
    private String description;
    private String date;

    public DoItem() {
    }

    public DoItem( String description, String date) {

        this.description = description;
        this.date = date;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

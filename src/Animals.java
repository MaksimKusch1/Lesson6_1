public abstract class Animals implements Cloneable{
    private String Name;
    private String NameLat;
    private String YearOfFound;
    private String color;
    private String Description;
    private Integer count;

    Animals(String[] arr){
        this.Name = arr[0];
        this.NameLat = arr[1];
        this.color = arr[2];
        this.YearOfFound = arr[3];
        this.Description = arr[4];
        //count++;
    }

    public String getColor() {
        return color;
    }
    public String getName() {
        return Name;
    }
    public String getYearOfFound() {
        return YearOfFound;
    }

    public void Print(){
        System.out.println("Колір тварини "+Name+ " зараз став: " + getColor());
    }

    public final void Print(String all){
        System.out.println("Назва: "+Name);
        System.out.println("Назва латиною: "+NameLat);
        System.out.println("Рік відкриття: "+YearOfFound);
        System.out.println("Колір: "+color);
        System.out.println("Опис: "+Description);

    }

    public void ChangeColor(String newColor){
        if (newColor.length()>0)
            this.color=newColor;
        // Print("All");
    }

    public abstract String getVoice();

    public Animals clone() {
        Animals animal1 = null;
        try {
            animal1 = (Animals) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return animal1;
    }
}
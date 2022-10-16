import java.util.Comparator;

public abstract class Animals implements Cloneable, Comparator, Comparable {
    private String Name;
    private String NameLat;
    private int YearOfFound;
    private String color;
    private String Description;
    private Integer count;

    Animals(String[] arr){
        this.Name = arr[0];
        this.NameLat = arr[1];
        this.color = arr[2];
        this.YearOfFound = Integer.parseInt(arr[3]);
        this.Description = arr[4];
        //count++;
    }

    public String getColor() {
        return color;
    }
    public String getName() {return Name;}
    public Integer getYearOfFound() {return YearOfFound;}

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

    @Override
    public int compareTo(Animals a){
        if(this.Name.compareTo(a.Name) !=0)
            return this.Name.compareTo(a.Name);
        else
            return  Integer.compare(this.YearOfFound, a.YearOfFound);
   }

    @Override
    public int compare(Animals a1, Animals a2){
        if(a1.getYearOfFound() != a2.getYearOfFound())
           return Integer.compare(a1.getYearOfFound(),a2.getYearOfFound());
     else
         return  a1.getYearOfFound().compareTo(a2.getYearOfFound());
    }


}
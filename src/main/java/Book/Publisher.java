package Book;

//сведения об издательстве с атрибутами "Название издательства" и "Город"

public class Publisher {

    private String namePublisher;
    private String cityName;



    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
        if(namePublisher == null) throw new IllegalArgumentException();
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
        if(cityName == null) throw new IllegalArgumentException();
    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public String getCityName() {
        return cityName;
    }

    public Publisher(String namePublisher, String cityName) {
        this.namePublisher = namePublisher;
        this.cityName = cityName;
    }
}

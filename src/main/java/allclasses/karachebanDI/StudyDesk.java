package allclasses.karachebanDI;

// Пример класса. Можно без интерфейса, никаких проблем.
// Кому интересно как пишутся классы в Java - смотрите ./Furniture

public class StudyDesk implements Furniture {

    //region Поля
    private String Type = "desk";
    private long SerialNumber = 0;

    private double Length = 0;
    private double Width = 0;
    private double Height = 0;

    private double Price = 0;
    //endregion

    /// Обычный конструктор с параметрами
    /// Наваливаем всего и побольше
    public StudyDesk(String type,
                     long serialNumber,
                     double price,
                     double length,
                     double width,
                     double height) {

        this.Length = length;
        this.Width = width;
        this.Height = height;
        this.Type = type;
        this.SerialNumber = serialNumber;
        this.Price = price;
    }

    ///  Частичная реализация интерфейса здесь
    //region Методы
    public String ToString(){
        return String
                .format("Тип: %s\nМодель: %s\nСерийный номер: %d\nДлинна: %.1f см\nШирина: %.1f см\nВысота: %.1f см",
                        Type, "Стол для обучения", SerialNumber, Length, Width, Height);
    }

    public double ConvertPrice(String currency){

        double convertedPrice = Price;
        double usdToRubCource = 80;

        switch (currency){
            case "USD": convertedPrice = Price / usdToRubCource;
            case "RUB":;
            default:
                break;
        }

        return convertedPrice;
    }

    @Override
    public void ShowPrice(String currency){
        System.out.println("Цена стола: " + ConvertPrice(currency) + " " + currency);
    }

    public void ContactToBuy(){
        System.out.println("Позвоните по номеру 89812113066");
    }
    //endregion

    /// А остальное - тут
    //region Геттеры и сеттеры
    @Override
    public String getType() {
        return Type;
    }

    @Override
    public long getSerialNumber() {
        return SerialNumber;
    }

    public void setType(String type) {
        Type = type;
    }
    public void setSerialNumber(long serialNumber) {
        SerialNumber = serialNumber;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
    //endregion
}

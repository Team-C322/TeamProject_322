package allclasses.kornilov;

public class Virmash {

    /// Constructor
    public Virmash(String user, String password, String osType, double ramSize, double diskSize) {
        this.user = user;
        this.password = password;
        this.osType = osType;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
    }

    //region Properties
    String user;
    String password;
    String osType;
    double ramSize;
    double diskSize;
    //endregion

    //region Getters & Setters
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public double getRamSize() {
        return ramSize;
    }

    public void setRamSize(double ramSize) {
        this.ramSize = ramSize;
    }

    public double getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(double diskSize) {
        this.diskSize = diskSize;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //endregion

    //region Methods
    public String ToString(){
        return String.format("Класс: виртуальная машина\nЮзер:%s\nПароль:%s\nТип ОС:%s\nРазмер ОЗУ:%.1f байт\nРазмер ПЗУ:%.1f",
                user, password, osType, ramSize, diskSize);
    }

    public void ShowInfo(){
        System.out.println(this.ToString());
    }

    public double ConvertRamSize(String unit){
        switch (unit){
            case "Gb": return ramSize / 1024 / 1024 / 1024;
            case "Mb": return ramSize / 1024 / 1024;
            case "Kb": return ramSize / 1024;
            default:
                System.out.println("Выберите единицу измерения из предложенных (Gb, Mb, Kb)!!!");
                return 0;
        }
    }

    public double ConvertDiskSize(String unit){
        switch (unit){
            case "Gb": return ramSize / 1024 / 1024 / 1024;
            case "Mb": return ramSize / 1024 / 1024;
            case "Kb": return ramSize / 1024;
            default:
                System.out.println("Выберите единицу измерения из предложенных (Gb, Mb, Kb)!!!");
                return 0;
        }
    }
    //endregion
}

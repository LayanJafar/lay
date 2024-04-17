
package b9a2208561ass2;

//Layan Jafar , ID: 2208561 , Section: B9A

public class Software extends Device {
   private String name;
   private double version;

    public Software(String name, double version, String company, String code) {
        super(company, code);
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Software{" + "name=" + name + ", version=" + version + '}';
    }
   
    
}

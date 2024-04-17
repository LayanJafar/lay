
package b9a2208561ass2;

//Layan Jafar , ID: 2208561 , Section: B9A

public class Printer extends Device {
    private String type;
    private boolean isColor;

    public Printer(String type, boolean isColor, String company, String code) {
        super(company, code);
        this.type = type;
        this.isColor = isColor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIsColor() {
        return isColor;
    }

    public void setIsColor(boolean isColor) {
        this.isColor = isColor;
    }

    @Override
    public String toString() {
        return "Printer{" + "type=" + type + ", isColor=" + isColor + '}';
    }
    
   
}

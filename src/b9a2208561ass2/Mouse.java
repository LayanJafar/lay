
package b9a2208561ass2;

//Layan Jafar , ID: 2208561 , Section: B9A

public class Mouse extends Device{
    private String type;

    public Mouse(String type, String company, String code) {
        super(company, code);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Mouse{" + "type=" + type + '}';
    }
    
   
    
}

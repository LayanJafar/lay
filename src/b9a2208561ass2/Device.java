
package b9a2208561ass2;
//Layan Jafar , ID: 2208561 , Section: B9A

public class Device {
    private String company;
    private String device_code;

    public Device() {
    }

    public Device(String company, String code) {
        this.company = company;
        this.device_code = code;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDevice_code() {
        return device_code;
    }

    public void setDevice_code(String device_code) {
        this.device_code = device_code;
    }

    @Override
    public String toString() {
        return "Device{" + "company=" + company + ", device_code=" + device_code + '}';
    }
    
   
    
}

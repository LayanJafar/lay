
package b9a2208561ass2;

//Layan Jafar , ID: 2208561 , Section: B9A

import java.util.ArrayList;


public class Computer extends Device implements Comparable<Computer> {
    private double speed;
    private String modelName;
    private ArrayList<Software>software=new ArrayList<>();
    private Mouse mouse;
    private Printer printer;
    private int totalSoftware;

    public Computer(String company,String code,double speed, String modelName) {
        super(company,code);
        this.speed = speed;
        this.modelName = modelName;
    }

    
    
    
    
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public ArrayList<Software> getSoftware() {
        return software;
    }

    public void setSoftware(Software s) {
       software.add(s);
       totalSoftware++;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public int getTotalSoftware() {
        return totalSoftware;
    }

    public void setTotalSoftware(int totalSoftware) {
        this.totalSoftware = totalSoftware;
    }

    @Override
    public String toString() {
        return "Computer{" + "speed=" + speed + ", modelName=" + modelName + ", software=" + software + ", mouse=" + mouse + ", printer=" + printer + ", totalSoftware=" + totalSoftware + '}';
    }
    
   
    
    public int compareTo(Computer c1){
        if(getSpeed()>c1.getSpeed())
            return 1;
        else if(getSpeed()<c1.getSpeed())
            return -1;
        else 
            return 0;
        
    }
    
    
}

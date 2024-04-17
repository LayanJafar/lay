
package b9a2208561ass2;
//Layan Jafar , ID: 2208561 , Section: B9A

import java.io.*;
import java.util.*;


public class B9A2208561ass2 {

    //method for print the detail of the first command
    public static void printTheFirstComm(PrintWriter firstFile,String companyName,double speed,String model ){
        firstFile.print("\n**************************************************************************************************************");
        firstFile.println("Command: Add_Computer");
        firstFile.println("\n\nComputer Details");
        firstFile.println("Company :"+companyName+"  Model: "+model+"  Speed: "+speed+" GHz ");
        firstFile.println("-- Following Softwares are Installed in the Machine ---"); 
        firstFile.println(" No Software has been installed");  
        firstFile.println("--- Following  Peripheral are  attached in the Machine ---"); 
        firstFile.println(" No Pripheral has been attached");
        firstFile.println("\n has been added to the FCIT Lab. Database.\n");
        
        
    }
    //method for print the detail of the first command
    public static void printTheSecondComm(PrintWriter firstFile,String companyOfPrinter,boolean printrtColor,String printerType ){
       firstFile.println("Command: Add_Printer\n\n");
       firstFile.println("Printer Details\n");
       firstFile.print("Company :"+companyOfPrinter+" Color Type: ");
       //check if the printcolor true or fulse to print the detail
       if(printrtColor)
            firstFile.print("Colored");
       else
            firstFile.print("Black&white");
       
       firstFile.println ("  Printer Type :"+printerType+"\n");
       firstFile.println ("has been added to the FCIT Lab. Database.\n");
       firstFile.println("**************************************************************************************************************");
        
    }
     //method for mouse the detail of the first command
     public static void printTheThirdComm(PrintWriter firstFile,String companyOfMouse,String mouserType ){
         firstFile.println("Command: Add_Mouse\n\n");
         firstFile.println("Mouse Details\n");
         firstFile.println("Company :"+companyOfMouse+" Mouse Type: "+mouserType+"\n");
         firstFile.println(" has been added to the FCIT Lab. Database.\n"); 
         firstFile.println("**************************************************************************************************************");
     }
     //method for software the detail of the first command
   public static void printTheFourthComm(PrintWriter firstFile,String softwareName,double softwareVersion ){
      firstFile.println("Command: Add_Software\n\n");
      firstFile.println("Software Details\n");
      firstFile.println("S/W name: "+softwareName+" S/W version: "+softwareVersion+"\n");  
      firstFile.println(" has been added to the FCIT Lab. Database.\n"); 
      firstFile.println("**************************************************************************************************************"); 
   
   }
    public static void main(String[] args) throws Exception {
        //creat a file 
        File inputFile=new File("fcitinput.txt");
       //check if the file exists or not
       if(!(inputFile.exists())){
           System.out.println("fcitFile file dose not exist ");
           System.exit(0);
       }
       
       //creat the first output file 
       File firstOutPutFile=new File("fcitOutPutLab.txt");
       //creat the printWriter for first output file 
       PrintWriter printFirstFile=new PrintWriter(firstOutPutFile);
       //pritn in the first output file
       printFirstFile.println("Welcome to the FCIT Lab  System.");
       printFirstFile.println("Today Date is "+new Date());
       
       //creat the second output file 
       File secondOutPutFile=new File("fcitReportLab.txt");
       //creat the printWriter for second output file 
       PrintWriter printSecondFile=new PrintWriter(secondOutPutFile);
       
      
       //creat an arraylist
       ArrayList<Device> arrayListOfClasses=new ArrayList<>();
       
       //creat a scanner object to read from the file input
        Scanner input=new Scanner(inputFile);
       //loop to read the detail from the file input
        while(input.hasNext()){
            String command=input.next();
            if(command.equalsIgnoreCase("add_computer")){
                //read the computer detail
                String companyName=input.next();
                double speed=input.nextDouble();
                String model=input.next();
                String computerCode=input.next();
                //creat an object of computer class
                Computer comp=new Computer(companyName, computerCode, speed, model);
                //add this object to the arraylist 
                arrayListOfClasses.add(comp);
               //print the computer detail
                printTheFirstComm(printFirstFile,companyName,speed,model);
                
                
                
                
                
            }
            
            
            else if(command.equalsIgnoreCase("add_printer")){
                //read the printer detail
                String companyOfPrinter=input.next();
                String printerType=input.next();
                boolean printrtColor=input.nextBoolean();
                String printerCode=input.next();
                //creat an object of the printer class
                Printer pri=new Printer(printerType, printrtColor, companyOfPrinter, printerCode);
                //add this object to the arraylist
                arrayListOfClasses.add(pri);
                //print the printer detail using method
                printTheSecondComm(printFirstFile,companyOfPrinter,printrtColor,printerType);
                
                
                
                
            }
            
            
            else if(command.equalsIgnoreCase("add_mouse")){
                //read the mouse detail
                String companyOfMouse=input.next();
                String mouserType=input.next();
                String mouseCode=input.next();
                //creat an object of the mouse class
                Mouse mou=new Mouse(mouserType, companyOfMouse, mouseCode);
                //add this object to the arraylist
                arrayListOfClasses.add(mou);
                //print the mouse detail using method
                printTheThirdComm(printFirstFile,companyOfMouse,mouserType);
                
                
            }
            
            
            else if(command.equalsIgnoreCase("add_software")){
                //read the software detail
                 String softwareName=input.next();
                 double softwareVersion=input.nextDouble();
                 String softwareCode=input.next();
                 //creat an object of the software class
                 Software sof=new Software(softwareName, softwareVersion, softwareName, softwareCode);
                 //add this object to the arraylist
                 arrayListOfClasses.add(sof);
                 //print the software detail using method
                 printTheFourthComm(printFirstFile,softwareName,softwareVersion);
                 
                 
                 
                 
            }
            
            
            else if(command.equalsIgnoreCase("install_sw")){
                //Read the computer code and software code
                 String comCode=input.next();
                 String softCode=input.next();
                //Search the object wich has the same computer code and software code in the Device Array List and save it in new object
               Computer compu=null;
                for(int i=0; i<arrayListOfClasses.size();i++){
                  if(arrayListOfClasses.get(i) instanceof Computer)
                    if(comCode.equals(arrayListOfClasses.get(i).getDevice_code())){
                        compu=((Computer)arrayListOfClasses.get(i));
                    }
                }
                Software soff=null;
                for(int i=0; i<arrayListOfClasses.size();i++){
                  if(arrayListOfClasses.get(i) instanceof Software)
                    if(softCode.equals(arrayListOfClasses.get(i).getDevice_code())){
                        soff=((Software)arrayListOfClasses.get(i));
                    }
                }
                //Make sure that a computer may not have more than FIVE softwares installed in the computer.
                printFirstFile.println("**************************************************************************************************************");
                printFirstFile.println("Command: Install_SW\n");
                if(compu.getTotalSoftware()>=5){
                  printFirstFile.println("The computer  Company : "+compu.getCompany()+"  Model: "+compu.getModelName());
                  printFirstFile.println("has 5 S/W installed.. You can not install any S/W");
                }
                else if(!(compu.getSoftware().contains(soff))){
                    compu.setSoftware(soff);
                    printFirstFile.println("The S/W "+soff.getName()+"  has been installed in the The computer  Company : "+compu.getCompany()+"  Model: "+compu.getModelName());
                        }
                //If the software is already installed, display the message “computer has already the software”.
                else{
                   printFirstFile.println("The computer  Company : "+compu.getCompany()+"  Model: "+compu.getModelName());
                   printFirstFile.println("has already S/W Adobe-Photoshop  installed.."); 
                }
                //end the else
            }
            
            
            else if(command.equalsIgnoreCase("install_printer")){
                //Read the computer code and printer code
                 String comCode=input.next();
                 String printerCode=input.next();
                //Search the computer code and printer code in the Device Array List.
                Computer com=null;
                Printer pri=null;
                for(int i=0;i<arrayListOfClasses.size();i++){
                    if(arrayListOfClasses.get(i) instanceof Computer){
                        if(comCode.equals(arrayListOfClasses.get(i).getDevice_code())){
                            com=((Computer)arrayListOfClasses.get(i));
                        }
                    } 
                }
                for(int i=0;i<arrayListOfClasses.size();i++){
                    if(arrayListOfClasses.get(i) instanceof Printer){
                        if(printerCode.equals(arrayListOfClasses.get(i).getDevice_code())){
                            pri=((Printer)arrayListOfClasses.get(i));
                        }
                    } 
                }
                printFirstFile.println("**************************************************************************************************************");
                printFirstFile.println("Command: Install_printer\n\n");        
                if(com.getPrinter()==null ){
                    com.setPrinter(pri);
                    printFirstFile.println("The Printer HP  Printer Type :"+pri.getType()+"  has been attached to the The computer  Company : "+com.getCompany()+"  Model: "+com.getModelName());
                    
                }
                else{
                 printFirstFile.println("The computer  Company : Dell  Model: Inspiron-14");
                 printFirstFile.println ("has already attached to Printer HP  Printer Type :DeskJet");
                }
                    
                
            }
            
            
            else if(command.equalsIgnoreCase("install_mouse")){
                //Read the computer code and mouse code
                 String comCode=input.next();
                 String mouseCode=input.next();
                 //Search the computer code and mouse code in the Device Array List.
                Computer com=null;
                Mouse mou=null;
                for(int i=0;i<arrayListOfClasses.size();i++){
                  if(arrayListOfClasses.get(i) instanceof Computer){
                      if(comCode.equals(arrayListOfClasses.get(i).getDevice_code())){
                          com=((Computer)arrayListOfClasses.get(i));
                       }
                   }
                }
                for(int i=0;i<arrayListOfClasses.size();i++) {
                   if(arrayListOfClasses.get(i) instanceof Mouse){
                       if(mouseCode.equals(arrayListOfClasses.get(i).getDevice_code())){
                           mou=((Mouse)arrayListOfClasses.get(i));
                       }
                   }
                } 
                printFirstFile.println ("**************************************************************************************************************");
                printFirstFile.println ("Command: Install_mouse\n\n");
                
                if(com.getMouse()==null) {
                    com.setMouse(mou);
                    printFirstFile.println ("The Mouse "+mou.getCompany()+" "+mou.getType()+"  has been attached to the The computer  Company : "+com.getCompany()+"  Model: "+com.getModelName());
                    
                }
                else if(!(com.getMouse().getDevice_code().equals(mou))){
                 com.setMouse(mou);
                 printFirstFile.println ("The Mouse "+mou.getCompany()+" "+mou.getType()+"  has been attached to the The computer  Company : "+com.getCompany()+"  Model: "+com.getModelName());

                }
                else{
                  printFirstFile.println ( "The computer  Company : "+com.getCompany()+"  Model: "+com.getModelName());
                  printFirstFile.println  ("has already attached to Mouse "+com.getMouse().getCompany()+" "+com.getMouse().getType())  ;
                }
                
            }
            
            
            else if(command.equalsIgnoreCase("uninstall_sw")){
                 //Read the computer code and software code
                 String comCode=input.next();
                 String softwareCode=input.next();
                 //Search the computer code and software code in the Device Array List.
                Computer com=null;
                Software softt=null;
                for(int i=0;i<arrayListOfClasses.size();i++){
                    if(arrayListOfClasses.get(i) instanceof Computer){
                        if(comCode.equals(arrayListOfClasses.get(i).getDevice_code()))
                            com=((Computer)arrayListOfClasses.get(i));
                    }
                }
                for(int i=0;i<arrayListOfClasses.size();i++){
                    if(arrayListOfClasses.get(i) instanceof Software){
                        if(softwareCode.equals(arrayListOfClasses.get(i).getDevice_code()))
                         softt=((Software)arrayListOfClasses.get(i)) ;    
                    }
                }
                printFirstFile.println("**************************************************************************************************************") ; 
                printFirstFile.println("Command: UnInstall_SW\n\n") ;         
                
               
               
                if(!(com.getSoftware().contains(softt))){
                   printFirstFile.println("The Software : "+softt.getName()+"  is not installed");
                   printFirstFile.println("in The computer  Company : "+com.getCompany()+"  Model: "+com.getModelName());
                }
                else{
                 com.getSoftware().remove(softt);
                 printFirstFile.println("The S/W "+softt.getName()+"  has been uninstalled from the The computer  Company : "+com.getCompany()+"  Model: "+com.getModelName());
                } 
            }
            
            
            else if(command.equalsIgnoreCase("list_all_computer_configuration")){
                printSecondFile.println("**************************************************************************************************************");
                printSecondFile.println("Command: List_All_Computer_Configuration\n");
                
                
                int numberOfCom=0;
                Computer com=null;
                for(int i=0;i<arrayListOfClasses.size();i++){
                    if(arrayListOfClasses.get(i) instanceof Computer){
                        numberOfCom++;
                        com=((Computer)arrayListOfClasses.get(i));
                        printSecondFile.println("---------Computer No "+numberOfCom+" ---------");
                        printSecondFile.println("\n\nComputer Details");
                        printSecondFile.println("Company :"+com.getCompany()+"  Model: "+com.getModelName()+"  Speed: "+com.getSpeed()+" GHz");
                        printSecondFile.println("-- Following Softwares are Installed in the Machine ---");
                        //check if the computr has software or not
                       if (com.getSoftware().size()==0)
                        printSecondFile.println(" No Software has been installed");
                       else{
                       for(int j=0;j<com.getSoftware().size();j++) {   
                         printSecondFile.println("\nSoftware Details ");
                         printSecondFile.println("\nS/W name: "+com.getSoftware().get(j).getName()+" S/W version: "+com.getSoftware().get(j).getVersion()+"\n");
                   
                        }
                       }
                        printSecondFile.println("--- Following  Peripheral are  attached in the Machine ---");
                       //check if the computr has software or not
                       if(com.getPrinter()==null&&com.getMouse()==null)
                          printSecondFile.println(" No Pripheral has been attached\n\n");  
                       else{
                         if(com.getMouse()!=null){
                            printSecondFile.println("\nMouse Details\n");
                            printSecondFile.println("Company :"+com.getMouse().getCompany()+" Mouse Type: "+com.getMouse().getType()+"\n");
                         }
                         if(com.getPrinter()!=null) {
                            printSecondFile.println("\nPrinter Details\n");
                            printSecondFile.print("Company :"+com.getPrinter().getCompany()+" Color Type: ");
                            
                           if(com.getPrinter().isIsColor())
                            printSecondFile.print("Colored");
                           else
                            printSecondFile.print("Black&white");
                           
                            printSecondFile.println("  Printer Type : "+com.getPrinter().getType()+"\n\n");
                         }  
                       }  
                    } 
                }  
            }
            
            
            else if(command.equalsIgnoreCase("list_computer_with_sw")){
                String softwareName=input.next();
                 int numOfComputer=0;

                printSecondFile.println("**************************************************************************************************************");
                printSecondFile.println("Command: List_Computer_With_Microsoft_Software");
             
                // search to find the computer that has the same software
                 Computer com=null;
                for(int i=0;i<arrayListOfClasses.size();i++){
                    if(arrayListOfClasses.get(i) instanceof Computer){
                       com=((Computer)arrayListOfClasses.get(i));
                       numOfComputer++;
                       for(int f=0; f<com.getSoftware().size();f++){
                        if(com.getSoftware().get(f).getName().equals(softwareName)){
                          printSecondFile.println("\n---------Computer No "+numOfComputer+" ---------\n");
                          printSecondFile.println("The computer  Company : "+com.getCompany()+"  Model: "+com.getModelName());
                        }
                        }
                    }
                } 
            }
            
            
            else if(command.equalsIgnoreCase("list_computer_speed_>")){
               double speed=input.nextDouble();
                 int numOfComputer=0;
                 
               printSecondFile.println ("**************************************************************************************************************");
               printSecondFile.println ("Command: List_Computer_With_Speed_above_5");
               
               //search the computer that his speed greater than 5
               Computer com=null;
               for(int i=0;i<arrayListOfClasses.size();i++){
                    if(arrayListOfClasses.get(i) instanceof Computer){
                       com=((Computer)arrayListOfClasses.get(i));
                       numOfComputer++;
                       if(com.getSpeed()>speed){
                            printSecondFile.println("\n---------Computer No "+numOfComputer+" ---------\n");
                            printSecondFile.println("The computer  Company : "+com.getCompany()+"  Model: "+com.getModelName());
                           
                           
                       }
               }
          }
            }  
            
            else if(command.equalsIgnoreCase("compare_computer_speed")){
                 //Read the first computer code and the second computer code code
                 String comCode1=input.next();
                 String comCode2=input.next();
                
                 
                 Computer com1=null;
                 Computer com2=null;
                 //search to find the computer wich has the same first code
                 for(int i=0;i<arrayListOfClasses.size();i++){
                     if(arrayListOfClasses.get(i) instanceof Computer){
                         if(comCode1.equals(arrayListOfClasses.get(i).getDevice_code())){
                            com1=((Computer)arrayListOfClasses.get(i));  
                         }
                     }
                 }
                 //search to find the computer wich has the same second code
                  for(int i=0;i<arrayListOfClasses.size();i++){
                     if(arrayListOfClasses.get(i) instanceof Computer){
                         if(comCode2.equals(arrayListOfClasses.get(i).getDevice_code())){
                            com2=((Computer)arrayListOfClasses.get(i));  
                         }
                     }
                 }
                  printSecondFile.println ("**************************************************************************************************************");

                 
                  if( com1.compareTo(com2)>0){
                      printSecondFile.println ("Command: Compare_Computer_Speed");
                      printSecondFile.println ("("+com1.getCompany()+" , "+com1.getModelName()+","+com1.getSpeed()+") ****** Faster**** than ("+com2.getCompany()+" , "+com2.getModelName()+","+com2.getSpeed()+")");
                  }
                  else if(com1.compareTo(com2)<0){
                       printSecondFile.println ("Command: Compare_Computer_Speed");
                      printSecondFile.println ("("+com2.getCompany()+" , "+com2.getModelName()+","+com2.getSpeed()+") ****** Faster**** than ("+com1.getCompany()+" , "+com1.getModelName()+","+com1.getSpeed()+")");
                  }
                  else{
                     printSecondFile.println ("Command: Compare_Computer_Speed");
                   printSecondFile.println ("("+com2.getCompany()+" , "+com2.getModelName()+","+com2.getSpeed()+") ****** Faster**** than ("+com1.getCompany()+" , "+com1.getModelName()+","+com1.getSpeed()+")");
                  }
              
               
            
                
                
            }
            
            
            else if(command.equalsIgnoreCase("quit")){
                input.close();
                printSecondFile.close();
                printFirstFile.close();
                System.exit(0);
            }
            

        }//end the loop
        
        
        
        
    }
    
}

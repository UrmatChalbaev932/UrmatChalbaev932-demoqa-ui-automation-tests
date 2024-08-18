package _14_OOP._6_encaupsulation.PPD;

import java.util.Scanner;

public class Inspector {

    public String rank;
    public String fullName;

    public Inspector(String rank, String fullName) {
        this.rank = rank;
        this.fullName = fullName;
    }

    public Inspector() {

    }

    // гай - машину остановили,
    public String stopTheDriver(String carNumber) {
        return "Inspector - Please Stop " + carNumber;
    }

    // гай - проверка на наличие прав и техпаспорта
    public String checkDocuments(DriverCard driverCard, TechPassport techPassport) {
        return "Inspector - Please can I check your " + "\n" + driverCard + " and \n" + techPassport;
    }

    // гай - проверка на соответствие ФИО
    public String checkFullNames(DriverCard driverCard, TechPassport techPassport) {
        if (driverCard.fullName.equals(techPassport.fullName)) {
            return "Inspector -Good Morning mr. " + driverCard.fullName;
        }
        return "Inspector -Maza Faka get out of the car and put your hands on your head";
    }
    public void helloDriver (String driver){
        System.out.println("Inspector - my name is "+ fullName+ " I am "+rank + " mr. "+driver);
        System.out.println("Выберите вариант нарушения: 1. Over speed, 2. I drove through a red light");
        Scanner scan = new Scanner(System.in);
        System.out.println("1,2 ?");
        int i = scan.nextInt();
        switch (i) {
            case 1:
                System.out.println("Over speed");
                break;
            case 2:
                System.out.println("I drove through a red light");
            default:
        }
    }
    public void recordingProtocol() {
        Scanner scan = new Scanner(System.in);
        System.out.print("fullName: ");
        String s = scan.nextLine();
        System.out.print("INN: ");
        int i = scan.nextInt();
        Protocol protocol = new Protocol();
        protocol.fullName=s;
        protocol.INN=i;
        System.out.println("check mister");
    }

    public void fine (){
        System.out.println("Your protocol ser and good day");
    }


    // гай - заполнил протокол + предложил проверить анкетные данные водителя
    // гай - предложил вариант оплаты штрафа - наличный или без наличным способом
    // выбор водителя
    // водитель - проверка на правильность заполнения ФИО и прочих данных протокола и подпись


}

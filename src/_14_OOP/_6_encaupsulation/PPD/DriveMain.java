package _14_OOP._6_encaupsulation.PPD;

public class DriveMain {
    public static void main(String[] args) {
        IDPassport idPassportMaximilian      = new IDPassport   ("Maximilian", 123456789);
        DriverCard driverCardMaximilian      = new DriverCard   ("Maximilian", 'B');
        TechPassport techPassportMaximilian  = new TechPassport ("Maximilian", "Mercedes", "GWGN", "KG0809");
        Driver driverMaximilian = new Driver("Maximilian", idPassportMaximilian, driverCardMaximilian, techPassportMaximilian, 1);
        Inspector inspectorGadget = new Inspector("Inspector", " Gadjet");
        Protocol protocol = new Protocol("Maximilian", 123456789);


        System.out.println(inspectorGadget.stopTheDriver(driverMaximilian.techPassport.carNumber));
        System.out.println(inspectorGadget.checkDocuments(driverCardMaximilian, techPassportMaximilian));
        System.out.println(inspectorGadget.checkFullNames(driverCardMaximilian, techPassportMaximilian));
        driverMaximilian.driverCheckCop();
        inspectorGadget.helloDriver(driverMaximilian.fullName);
        inspectorGadget.recordingProtocol();
        driverMaximilian.checkProtocol();
        inspectorGadget.fine();







}






        // fine payment for driver
        // enter protocol number -> Scanner(protocol number)
        // == (inspector)protocol number -> payment fine,
        // else(Please enter the valid protocol number)


        // гай - машину остановили,
        // гай - проверка на наличие прав и техпаспорта
        // гай - проверка на соответствие ФИО
        // гай - перебор данных тех паспорта с техпаспортами из структуры данных
        // водитель - попросил указать причину остановки,
        // гай - указал на превышение скорости
        // гай - заполнил протокол + предложил проверить анкетные данные водителя
        // гай - предложил вариант оплаты штрафа - наличный или без наличным способом
        // выбор водителя
        // водитель - проверка на правильность заполнения ФИО и прочих данных протокола и подпись


        //
        //


    }


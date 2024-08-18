package _14_OOP._8_This_Super;

public class Contact {
    public String name;
    public String phoneNumber;

//    public Map<String, String> name_PhoneNumber;


    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String checkMobileOperator(String autonumber) {
        Operators operators = new Operators();
        int check = 0;

        for (String[] numbers : operators.operatorsMassiv) {
            check++;
            for (String n : numbers) {
                if (autonumber.substring(0, 4).equals(n)) {
                    if (check == 1) {
                        return "Beeline";
                    } else if (check == 2) {
                        return "O!";
                    } else if (check == 3) {
                        return "MegaCom";
                    }
                    return "No abonent ";
                }
            }
        }
        return autonumber;
    }
}

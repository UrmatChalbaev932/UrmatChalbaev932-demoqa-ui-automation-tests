package _14_OOP._5_encaupsulation;

public class Employee {

        public int id;
        public String name;
        public String prof;
        private Address address;

        public Employee(int id, String name, String prof, Address address) {
            this.id = id;
            this.name = name;
            this.prof = prof;
            this.address = address;
        }

        // getter -> return
        public Address getAddress() {
            return address;
        }
        public String getStreetAddress() {
        return address.street;
    }

        // setter -> void
        public void setAddress(String country, String city, String district, String street, int house) {
            this.address.country = country;
            this.address.city = city;
            this.address.district = district;
            this.address.street = street;
            this.address.house = house;
        }
         public void setStreetAddress(String street) {
         this.address.street = street;
    }


        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", prof='" + prof + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }


}

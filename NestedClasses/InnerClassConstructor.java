package NestedClasses;

class InnerClassConstructor {
    class Address {
        String city;
        String state;

        Address(String city, String state) {
            this.city = city;
            this.state = state;
        }

        public void getAddress() {
            System.out.println("City: " + city);
            System.out.println("State: " + state);
        }
    }


    public static void main(String[] args) {
        InnerClassConstructor innerClassConstructor = new InnerClassConstructor();
        InnerClassConstructor.Address address = innerClassConstructor.new Address("New York", "USA");
        address.getAddress();
    }
}

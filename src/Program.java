public class Program {
    public static void main(String[] args) {
        FullName petr = new FullName("I5or", "Pavlovich", "Gorokhovskii");
        System.out.println(petr);

        Address address = new Address("Ode7sa", "Uspenskaya", -5);
        System.out.println(address);

        Contract contract = new Contract(address, 0,3, petr);
        System.out.println(contract);
    }
}

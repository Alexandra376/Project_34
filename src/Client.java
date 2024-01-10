interface Client {
    void clientsInformation();
}
class PhysicalPerson implements Client {
    private String name;
    private String surname;
    public PhysicalPerson(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    @Override
    public void clientsInformation() {
        System.out.println("Name: " + name);
        System.out.println("Name: " + surname);
    }
}
class LegalPerson implements Client {
    private String name;
    private String address;

    public LegalPerson(String name, String address) {
        this.name = name;
        this.address = address;
    }
    @Override
    public void clientsInformation() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

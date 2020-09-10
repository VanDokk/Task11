public class Contract
{
    private FullName FML;
    private int contractIndex;
    private Address address;
    private String contractSum;
    private String contractDuration;

    public Contract(Address address, int contractSum, int contractDuration, FullName fml)
    {
        this.contractIndex = (int)Math.random() * 10000;
        this.address = address;
        this.contractSum = Dictionaries.contractSum[contractSum];
        this.contractDuration = Dictionaries.contractDuration[contractDuration];
        this.FML = fml;
    }

    @Override
    public String toString() {
        return this.FML + "\n" + this.address + "\n" + "Contract sum: " + this.contractSum + "\n" + "Contract duration: " + this.contractDuration + "\n";
    }
}

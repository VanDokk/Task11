public class Address {
    private String city;

    private String street;
    private int house;
    private char[] flag = {'c', 's'};

    public void setCity(String city) {
        setAddress(city, flag[0]);
    }

    public void setStreet(String street) {
        setAddress(street, flag[1]);
    }

    public void setHouse(int house) {
        if (house > 0)
            this.house = house;
        else
            this.house = -1;
    }

    private boolean isValidSring(String str) {
        str = str.toLowerCase();
        boolean isValidString = false;
        for (int j = 0; j < str.length(); j++) {
            if (j != 0 && !isValidString) {
                break;
            }
            isValidString = false;
            for (int i = 0; i < Dictionaries.letters.length; i++) {
                if (Dictionaries.letters[i] == str.charAt(j)) {
                    isValidString = true;
                    break;
                }
            }
        }
        return isValidString;
    }

    private void setAddress(String str, char flag)
    {
        str = str.toLowerCase().substring(0, 1).toUpperCase() + str.substring(1);
        switch (flag) {
            case 'c':
                if (isValidSring(str)) { this.city = str; }
                else { this.city = "??????"; }
                break;
            case 's':
                if (isValidSring(str)) {this.street = str;}
                else {this.street = "??????";}
                break;
        }
    }

    public Address(String city, String street, int house) {
        setAddress(city, flag[0]);
        setAddress(street, flag[1]);
        setHouse(house);
    }

    @Override
    public String toString() {
        return "City: " + this.city + "\n" + "Street: " + this.street + "\n" + "House: " + this.house + "\n";
    }
}

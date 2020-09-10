public class FullName {
    private String first;
    private String middle;
    private String last;

    private char[] flag = {'f', 'm', 'l'};

    public void setFirst(String first_name)
    {
        setName(first_name, flag[0]);
    }

    public void setMiddle(String middle_name)
    {
        setName(middle_name, flag[1]);
    }

    public void setLast(String last_name)
    {
        setName(last_name, flag[2]);
    }

    public void setFML(String first_name, String middle_name, String last_name)
    {
        setName(first_name, flag[0]);
        setName(middle_name, flag[1]);
        setName(last_name, flag[2]);
    }

    private boolean isValidName(String some_name)
    {
        some_name = some_name.toLowerCase();
        boolean isValidName = false;
        for (int j = 0; j < some_name.length(); j++)
        {
            if (j != 0 && !isValidName) {
                break;
            }
            isValidName = false;
            for (int i = 0; i < Dictionaries.letters.length; i++)
            {
                if (Dictionaries.letters[i] == some_name.charAt(j)) {
                    isValidName = true;
                    break;
                }
            }
        }
        return isValidName;
    }

    private void setName(String some_name, char flag)
    {
        //Присваиваем полю flag значение с учетом проверки isValidName
        some_name = some_name.toLowerCase().substring(0, 1).toUpperCase() + some_name.substring(1);
        switch (flag)
        {
            case 'f':
                if (isValidName(some_name))
                {
                    this.first = some_name;
                }
                else
                {
                    this.first = "??????";
                }
                break;

            case 'm':
                if (isValidName(some_name))
                {
                    this.middle = some_name;
                }
                else
                {
                    this.middle = "??????";
                }
                break;

            case 'l':
                if (isValidName(some_name))
                {
                    this.last = some_name;
                }
                else
                {
                    this.last = "??????";
                }
                break;
        }
    }


    public FullName(String first_name, String middle_name, String last_name)
    {
        setName(first_name, flag[0]);
        setName(middle_name, flag[1]);
        setName(last_name, flag[2]);
    }

    public FullName(String first_name, String last_name) {
        setName(first_name, flag[0]);
        setName(last_name, flag[2]);
        this.middle = "000000";
    }

    @Override
    public String toString() {
        return "Full Name: " + this.first + " " + this.middle + " " + this.last + "\n";
    }

}

package creational.builder;

public class FullName
{
    private final String myLastName; // Mandatory
    private final String myFirstName; // Mandatory
    private final String myMiddleName; // Rest is optional
    private final String mySalutation;
    private final String mySuffix;

    private FullName(Builder builder)
    {
        this.myFirstName = builder.myFirstName;
        this.myLastName = builder.myLastName;
        this.myMiddleName = builder.myMiddleName;
        this.mySalutation = builder.mySalutation;
        this.mySuffix = builder.mySuffix;
    }

    public String getMyFirstName()
    {
        return myFirstName;
    }

    public String getMyLastName()
    {
        return myLastName;
    }

    public String getMyMiddleName()
    {
        return myMiddleName;
    }

    public String getMySalutation()
    {
        return mySalutation;
    }

    public String getMySuffix()
    {
        return mySuffix;
    }

    @Override
    public String toString()
    {
        return this.mySalutation + " " + this.myFirstName + " " + this.myMiddleName + " " + this.myLastName + " " + this.mySuffix;
    }

    public static class Builder
    {
        private String myFirstName;
        private String myLastName;
        private String myMiddleName;
        private String mySalutation;
        private String mySuffix;

        Builder(String firstName, String lastName)
        {
            myFirstName = firstName;
            myLastName = lastName;
        }

        Builder withMiddleName(String middleName)
        {
            myMiddleName = middleName;
            return this;
        }

        Builder withSalutation(String salutation)
        {
            mySalutation = salutation;
            return this;
        }

        Builder withSuffix(String suffix)
        {
            mySuffix = suffix;
            return this;
        }

        FullName build()
        {
            FullName fullName = new FullName(this);
            if (fullName.getMyFirstName().length() > 100)
            {
                throw new IllegalStateException("Name length out of range");
            }
            return fullName;
        }
    }

}

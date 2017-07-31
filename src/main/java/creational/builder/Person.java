package creational.builder;

public class Person
{
    private final FullName myFullName; // Mandatory, other variables are optional
    private final Address myAddress;
    private final boolean myIsFemale;
    private final boolean myIsEmployed;
    private final boolean myIsHomeOwner;


    private Person(Builder builder)
    {
        this.myFullName = builder.myFullName;
        this.myAddress = builder.myAddress;
        this.myIsFemale = builder.myIsFemale;
        this.myIsEmployed = builder.myIsEmployed;
        this.myIsHomeOwner = builder.myIsHomeOwner;
    }

    public FullName getMyFullName()
    {
        return myFullName;
    }

    public Address getMyAddress()
    {
        return myAddress;
    }

    public boolean isMyIsFemale()
    {
        return myIsFemale;
    }

    public boolean isMyIsEmployed()
    {
        return myIsEmployed;
    }

    public boolean isMyIsHomeOwner()
    {
        return myIsHomeOwner;
    }

    @Override
    public String toString()
    {
        return myFullName.toString() + " " + myAddress.toString();
    }

    static class Builder
    {
        private FullName myFullName;
        private Address myAddress;
        private boolean myIsFemale;
        private boolean myIsEmployed;
        private boolean myIsHomeOwner;

        Builder(FullName fullName)
        {
            myFullName = fullName;
        }

        Builder withAddress(Address address)
        {
            myAddress = address;
            return this;
        }

        Builder withIsFemale(boolean isFemale)
        {
            myIsFemale = isFemale;
            return this;
        }

        Builder withIsEmployed(boolean isEmployed)
        {
            myIsEmployed = isEmployed;
            return this;
        }

        Builder withIsHomeOwner(boolean isHomeOwner)
        {
            myIsHomeOwner = isHomeOwner;
            return this;
        }

        Person build()
        {
            return new Person(this);
        }
    }


}


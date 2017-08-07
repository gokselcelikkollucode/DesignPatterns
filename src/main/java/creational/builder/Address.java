package creational.builder;

public class Address
{
    private final String myState;
    private final String myCity;
    private final String myStreetAddress;

    private Address(Builder builder)
    {
        this.myState = builder.myState;
        this.myCity = builder.myCity;
        this.myStreetAddress = builder.myStreetAddress;
    }

    public String getMyState()
    {
        return myState;
    }

    public String getMyCity()
    {
        return myCity;
    }

    public String getMyStreetAddress()
    {
        return myStreetAddress;
    }

    @Override
    public String toString()
    {
        return myState + " " + myCity + " " + myStreetAddress;
    }

    static class Builder
    {
        private String myState;
        private String myCity;
        private String myStreetAddress;

        Builder withState(String state)
        {
            myState = state;
            return this;
        }

        Builder withCity(String city)
        {
            myCity = city;
            return this;
        }

        Builder withStreetAddress(String streetAddress)
        {
            myStreetAddress = streetAddress;
            return this;
        }

        Address build()
        {
            Address address = new Address(this);
            return address;
        }
    }
}

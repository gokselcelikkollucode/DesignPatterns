package creational.builder;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestBuilder
{
    @Rule
    public ExpectedException myExpectedException = ExpectedException.none();

    @Test
    public void testAddressBuilder()
    {
        Address address = new Address.Builder()
                .withState("state")
                .withCity("city")
                .withStreetAddress("street")
                .build();
        assertThat(address.toString()).isEqualTo("state city street");
    }

    @Test
    public void testFullNameBuilder()
    {
        FullName fullName = new FullName.Builder("Goksel", "Celikkollu")
                .withSalutation("Dr")
                .withSuffix("TR")
                .build();
        assertThat(fullName.toString()).isEqualTo("Dr Goksel null Celikkollu TR");

        myExpectedException.expect(IllegalStateException.class);
        myExpectedException.expectMessage("Name length out of range");
        FullName fullNameWithException = new FullName.Builder(
                "GokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGokselGoksel",
                "Celikkollu")
                .withSalutation("Dr")
                .withSuffix("Tr")
                .build();
    }

    @Test
    public void testPersonBuilder()
    {
        Person person = new Person.Builder(new FullName.Builder("Goksel", "Celikkollu")
                .build())
                .withAddress(new Address.Builder().withCity("Bursa")
                        .withState("State")
                        .build())
                .withIsEmployed(true)
                .withIsFemale(false)
                .withIsHomeOwner(false)
                .build();
        assertThat(person.toString()).isEqualTo("null Goksel null Celikkollu null State Bursa null");
    }
}

package creational.prototype;

public abstract class Shape implements Cloneable
{
    private String id;
    protected ShapeType type;

    abstract String draw();

    public String getId()
    {
        return id;
    }

    public ShapeType getType()
    {
        return type;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @Override
    protected Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}

package structural.proxy;

public class RealImage implements Image
{
    private String filename;

    public RealImage(String filename)
    {
        this.filename = filename;
        loadFromDisk(filename);
    }

    @Override
    public String display()
    {
        return "Display " + filename;
    }

    private void loadFromDisk(String filename)
    {
        System.out.println("Load " + filename);
    }
}

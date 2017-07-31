package creational.objectpool;

public class ExportingProcess
{
    private long processNo;

    public ExportingProcess(long processNo)
    {
        //do some expensive calls / tasks here in the future
        this.processNo = processNo;
        System.out.println("Object with process no. " + processNo + " was created");
    }

    public long getProcessNo()
    {
        return processNo;
    }
}

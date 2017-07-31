package creational.objectpool;

import java.util.Random;

public class ExportingTask implements Runnable
{
    private ObjectPool<ExportingProcess> pool;
    private int threadNo;

    public ExportingTask(ObjectPool<ExportingProcess> pool, int threadNo)
    {
        this.pool = pool;
        this.threadNo = threadNo;
    }

    @Override
    public void run()
    {
        //get an object from the pool
        ExportingProcess exportingProcess = pool.borrowObject();
        System.out.println("Thread " + threadNo + ": Object with process no: " + exportingProcess.getProcessNo() + " was borrowed");
        //you can do something here in the future
        //.........
        try
        {
            Thread.sleep(new Random().nextInt(ObjectPoolDemo.MAXIMUM_INTERVAL_HOLDING_OBJECT_MILLISECONDS));
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        //return ExportingProcess instance back to the pool
        pool.returnObject(exportingProcess);
        System.out.println("Thread " + threadNo + ": Object with process no: " + exportingProcess.getProcessNo() + " was returned");
    }
}

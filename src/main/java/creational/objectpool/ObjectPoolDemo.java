package creational.objectpool;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ObjectPoolDemo
{
    private ObjectPool<ExportingProcess> pool;
    private AtomicLong processNo = new AtomicLong(0);

    public static int VALIDATION_INTERVAL_MILLISECONDS = 1000;
    public static int MAXIMUM_INTERVAL_CREATING_NEW_TASK_MILLISECONDS = 500;
    public static int MAXIMUM_INTERVAL_HOLDING_OBJECT_MILLISECONDS = 5000;

    public void setUp()
    {
        //Create a pool of objects of the type ExportingProcess
        /*Parameters:
            1)Minimum number of special ExportingProcess instances residing in the pool = 4
            2)Maximum number of special ExportingProcess instances residing in the pool = 10
            3)Time in seconds for periodical checking of minObjects/maxObjects conditions in a seperate thread = 5
             --> When the number of the ExportingProcess instances is less than minObjects, missing instances will be created
             --> When the number of the ExportingProcess instances is greater than maxObjects, extra instances will be removed
             --> If the validation interval is negative, no periodical checking of minObjects/max objects conditions in a separate thread take place
             These boundaies ae ignored then
         */

        pool = new ObjectPool<ExportingProcess>(4, 10, VALIDATION_INTERVAL_MILLISECONDS)
        {
            @Override
            protected ExportingProcess createObject()
            {
                // create a test object which takes some time for creation
                return new ExportingProcess(processNo.incrementAndGet());
            }
        };
    }

    public void tearDown()
    {
        pool.shutdown();
    }

    public void testObjectPool()
    {
        int separateTaskCount = 50;
        ExecutorService executorService = Executors.newFixedThreadPool(separateTaskCount);

        //execute 8 tasks in separate threads
        for (int i = 1; i <= separateTaskCount; i++)
        {
            executorService.execute(new ExportingTask(pool, i));
            try
            {
                Thread.sleep(new Random().nextInt(MAXIMUM_INTERVAL_CREATING_NEW_TASK_MILLISECONDS));
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }

        executorService.shutdown();

        try
        {
            executorService.awaitTermination(30, TimeUnit.SECONDS);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        ObjectPoolDemo objectPoolDemo = new ObjectPoolDemo();
        objectPoolDemo.setUp();
        //objectPoolDemo.tearDown();
        objectPoolDemo.testObjectPool();
    }
}

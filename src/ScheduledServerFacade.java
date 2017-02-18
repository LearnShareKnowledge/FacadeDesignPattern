/**
 * Created by 310124463 on 11/02/17.
 */
public class ScheduledServerFacade {

    private ScheduledServerStarter starter;

    private ScheduledServerProcessor processor;

    private ScheduledServerStopper stopper ;

    public ScheduledServerFacade()
    {
        this.starter = new ScheduledServerStarter();

        this.processor = new ScheduledServerProcessor();

        this.stopper = new ScheduledServerStopper();
    }

    public void processATask()
    {
        starter.startServer();

        processor.process();

        stopper.stopServer();
    }

}

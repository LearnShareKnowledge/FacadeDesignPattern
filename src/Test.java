/**
 * Created by 310124463 on 11/02/17.
 */
public class Test {

    public static void main(String[] args) {
        // For processing a task
        // 1. start the server
        // 2. process the task
        // 3. stop the server

        /*ScheduledServerStarter starter = new ScheduledServerStarter();

        starter.startServer();

        ScheduledServerProcessor processor = new ScheduledServerProcessor();

        processor.process();

        ScheduledServerStopper stopper = new ScheduledServerStopper();

        stopper.stopServer();*/

        ScheduledServerFacade facade = new ScheduledServerFacade();

        facade.processATask();



    }
}

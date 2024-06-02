package loggerchainofresponsibility;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    @Override
    public void log(int logProcessor, String message) {
        if(logProcessor==this.DEBUG){
            System.out.println(message);
        } else{
            super.log(logProcessor, message);
        }
    }
}

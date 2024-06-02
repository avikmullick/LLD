package loggerchainofresponsibility;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }
    @Override
    public void log(int logProcessor, String message) {
        if(logProcessor==this.ERROR){
            System.out.println(message);
        } else{
            super.log(logProcessor, message);
        }
    }
}

package loggerchainofresponsibility;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    @Override
    public void log(int logProcessor, String message) {
        if(logProcessor==this.INFO){
            System.out.println(message);
        } else{
            super.log(logProcessor, message);
        }
    }


}

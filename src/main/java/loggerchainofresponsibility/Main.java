package loggerchainofresponsibility;

public class Main {

    public static void main(String[] args) {
        LogProcessor logProcessor=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(logProcessor.INFO,"Test");
        logProcessor.log(logProcessor.ERROR,"Test_ERROR");
        logProcessor.log(logProcessor.DEBUG,"Test_ERROR");
    }
}

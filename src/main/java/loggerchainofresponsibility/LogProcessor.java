package loggerchainofresponsibility;

public abstract class LogProcessor {

    public int INFO=1;
    public int DEBUG=2;
    public int ERROR=3;
    private final LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor=nextLogProcessor;
    }

    public  void log(int logProcessor,String message){

        if(nextLogProcessor !=null){
            nextLogProcessor.log(logProcessor,message);
        }
    }

    public int getINFO() {
        return INFO;
    }

    public int getDEBUG() {
        return DEBUG;
    }

    public int getERROR() {
        return ERROR;
    }
}

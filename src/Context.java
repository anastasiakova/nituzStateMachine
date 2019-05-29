public class Context {
    private static int cuurDownloadStatus;
    //currents
    public State currentInternetConnection;
    public State machineCurrnetMode;

    //states
    public State internetOffline;
    public State internetOnline;
    public State machineOn;
    public State machineOff;

    public Context() {
        internetOffline = new InternetOffline(this);
        internetOnline = new InternetOnilne(this);
        machineOn = new On(this);
        machineOff = new Off(this);
        setInternetState(internetOffline);
        setMachineCurrnetModeState(machineOff);
        this.machineCurrnetMode = new Off(this);
    }
    void turnOn() {
        currentInternetConnection.turnOn();
        machineCurrnetMode.turnOn();
    }

    void turnOff() {
        currentInternetConnection.turnOff(); machineCurrnetMode.turnOff();
    }

    void internetOn() {
        currentInternetConnection.internetOn();
        machineCurrnetMode.internetOn();
    }

    void internetOff() {
        currentInternetConnection.internetOff();
        machineCurrnetMode.internetOff();
    }

    void fileRequest() {
        machineCurrnetMode.fileRequest();
    }

    void downloadAborted() {
        machineCurrnetMode.downloadAborted();
    }

    void downloadError() {
        machineCurrnetMode.downloadError();
    }

    void errorFixed() {
        machineCurrnetMode.errorFixed();
    }

    void movieOn() {
        machineCurrnetMode.movieOn();
    }

    void restartMovie() {
        machineCurrnetMode.restartMovie();
    }

    void holdMovie() {
        machineCurrnetMode.holdMovie();
    }

    void movieOff() {
        machineCurrnetMode.movieOff();
    }

    void resume() {
        machineCurrnetMode.resume();
    }

    void downloadFinished() {
        machineCurrnetMode.downloadFinished();
    }


    public void setInternetState(State state){
        if(currentInternetConnection != null)
            System.out.println("exit "+currentInternetConnection.getClass().getName()+" state");
        currentInternetConnection = state;
        System.out.println("enter "+state.getClass().getName()+" state");
    }

    public State getInternetOffline() { return internetOffline; }

    public State getInternetOnline() { return internetOnline; }

    public State getMachineOn() { return machineOn; }

    public State getMachineOff() { return machineOff; }

    public void setMachineCurrnetModeState(State state){
        if(machineCurrnetMode != null)
            System.out.println("exit "+machineCurrnetMode.getClass().getName()+" state");
        machineCurrnetMode = state;
        System.out.println("enter "+state.getClass().getName()+" state");
    }

    public static int getCurrDownloadStatus() {
        return cuurDownloadStatus;
    }
}

//    //off
//    private Off off;
//
//    //on:
//    private On on;
//    //Connection region
//    private Online online;
//    private Offline offline;
//
//    //Download superstate
//    private Download download;
//    private Wait wait;
//    private DownloadProc downloadProc;
//    private Recover recover;
//
//    //download management region
//    private DownloadIdle downloadIdle;
//    private OutOfDisk outOfDisk;
//
//    //download requests management
//    private DownloadRequests downloadRequests;
//
//    //Movie player
//    private IdlePlayer idlePlayer;
//    private Play play;
//    private Pause pause;



//        this.off = new Off(this);
//        this.on = new On(this);
//        this.online = new Online(this);
//        this.offline = new Offline(this);
//        this.download = new Download(this);
//        this.wait = new Wait(this);
//        this.downloadProc = new DownloadProc(this);
//        this.recover = new Recover(this);
//        this.downloadIdle = new DownloadIdle(this);
//        this.outOfDisk = new OutOfDisk(this);
//        this.downloadRequests = new DownloadRequests(this);
//        this.idlePlayer = new IdlePlayer(this);
//        this.play = new Play(this);
//        this.pause = new Pause(this);


//    public Off getOff() {
//        return off;
//    }
//
//    public On getOn() {
//        return on;
//    }
//
//    public Online getOnline() {
//        return online;
//    }
//
//    public Offline getOffline() {
//        return offline;
//    }
//
//    public Download getDownload() {
//        return download;
//    }
//
//    public Wait getWait() {
//        return wait;
//    }
//
//    public DownloadProc getDownloadProc() {
//        return downloadProc;
//    }
//
//    public Recover getRecover() {
//        return recover;
//    }
//
//    public DownloadIdle getDownloadIdle() {
//        return downloadIdle;
//    }
//
//    public OutOfDisk getOutOfDisk() {
//        return outOfDisk;
//    }
//
//    public DownloadRequests getDownloadRequests() {
//        return downloadRequests;
//    }
//
//    public IdlePlayer getIdlePlayer() {
//        return idlePlayer;
//    }
//
//    public Play getPlay() {
//        return play;
//    }
//
//    public Pause getPause() {
//        return pause;
//    }


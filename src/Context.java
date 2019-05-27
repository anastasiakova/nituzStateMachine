public class Context {
    //off
    private Off off;

    //on:
    private On on;
    //Connection region
    private Online online;
    private Offline offline;

    //Download superstate
    private Download download;
    private Wait wait;
    private DownloadProc downloadProc;
    private Recover recover;

    //download management region
    private DownloadIdle downloadIdle;
    private OutOfDisk outOfDisk;

    //download requests management
    private DownloadRequests downloadRequests;

    //Movie player
    private IdlePlayer idlePlayer;
    private Play play;
    private Pause pause;

    public Off getOff() {
        return off;
    }

    public On getOn() {
        return on;
    }

    public Online getOnline() {
        return online;
    }

    public Offline getOffline() {
        return offline;
    }

    public Download getDownload() {
        return download;
    }

    public Wait getWait() {
        return wait;
    }

    public DownloadProc getDownloadProc() {
        return downloadProc;
    }

    public Recover getRecover() {
        return recover;
    }

    public DownloadIdle getDownloadIdle() {
        return downloadIdle;
    }

    public OutOfDisk getOutOfDisk() {
        return outOfDisk;
    }

    public DownloadRequests getDownloadRequests() {
        return downloadRequests;
    }

    public IdlePlayer getIdlePlayer() {
        return idlePlayer;
    }

    public Play getPlay() {
        return play;
    }

    public Pause getPause() {
        return pause;
    }
}

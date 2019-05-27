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

}

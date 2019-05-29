public class On implements State {
    public Context context;
    //currents
    public State currentDownloadRequest;
    public State downloadCurrent;
    public State palyerCurrent;

    //states
    public State downloadRequest;

    public State downloadIdle;
    public State outOfDisk;
    public State downloadProc;

    public State idlePlayer;
    public State pause;
    public State play;

    public static int movieTime;
    public static int queueSize;
    public static int fileSize;

    public On(Context context) {

        this.context = context;
        this.downloadRequest = new DownloadRequests(this);
        this.downloadIdle = new DownloadIdle(this);
        this.outOfDisk = new OutOfDisk(this);
        this.downloadProc = new DownloadProc(this);
        this.idlePlayer = new IdlePlayer(this);
        this.pause = new Pause(this);
        this.play = new Play(this);

        setCurrentDownloadRequest(this.downloadRequest);
        setDownloadCurrent(this.downloadIdle);
        setPalyerCurrent(this.idlePlayer);

        movieTime = 0;
        queueSize = 0;
        fileSize = 0;
    }


    //Set currents
    public void setCurrentDownloadRequest(State currentDownloadRequest) {
        this.currentDownloadRequest = currentDownloadRequest;
        currentDownloadRequest.entry();
    }

    public void setDownloadCurrent(State downloadCurrent) {
        this.downloadCurrent = downloadCurrent;
        downloadCurrent.entry();
    }

    public void setPalyerCurrent(State palyerCurrent) {
        this.palyerCurrent = palyerCurrent;
        palyerCurrent.entry();
    }


    //Get states
    public State getDownloadRequest() {return downloadRequest;}

    public State getDownloadIdle() {return downloadIdle;}

    public State getOutOfDisk() {return outOfDisk;}

    public State getDownloadProc() {return downloadProc;}

    public State getIdlePlayer() {return idlePlayer;}

    public State getPause() {return pause;}

    public State getPlay() {return play;}

    public State getCurrentDownloadRequest() {return currentDownloadRequest;}

    public State getDownloadCurrent() {return downloadCurrent;}

    public State getPalyerCurrent() {return palyerCurrent;}

    public static int getMovieTime() {return movieTime;}

    @java.lang.Override
    public void turnOn() { }

    @java.lang.Override
    public void turnOff() {
        currentDownloadRequest.turnOff();
        palyerCurrent.turnOff();
        downloadCurrent.turnOff();

        context.setMachineCurrnetModeState(context.getMachineOff());
    }

    @java.lang.Override
    public void internetOn() {
        currentDownloadRequest.internetOn();
        downloadCurrent.internetOn();
        palyerCurrent.internetOn();
    }

    @java.lang.Override
    public void internetOff() {
        currentDownloadRequest.internetOff();
        downloadCurrent.internetOff();
        palyerCurrent.internetOff();
    }

    @java.lang.Override
    public void fileRequest() {
        currentDownloadRequest.fileRequest();
        downloadCurrent.fileRequest();
        palyerCurrent.fileRequest();
    }

    @java.lang.Override
    public void downloadAborted() {
        currentDownloadRequest.downloadAborted();
        downloadCurrent.downloadAborted();
        palyerCurrent.downloadAborted();
    }

    @java.lang.Override
    public void downloadError() {
        currentDownloadRequest.downloadError();
        downloadCurrent.downloadError();
        palyerCurrent.downloadError();
    }

    @java.lang.Override
    public void errorFixed() {
        currentDownloadRequest.errorFixed();
        downloadCurrent.errorFixed();
        palyerCurrent.errorFixed();
    }

    @java.lang.Override
    public void movieOn() {
        currentDownloadRequest.movieOn();
        downloadCurrent.movieOn();
        palyerCurrent.movieOn();
    }

    @java.lang.Override
    public void restartMovie() {
        currentDownloadRequest.restartMovie();
        downloadCurrent.restartMovie();
        palyerCurrent.restartMovie();
    }

    @java.lang.Override
    public void holdMovie() {
        currentDownloadRequest.holdMovie();
        downloadCurrent.holdMovie();
        palyerCurrent.holdMovie();
    }

    @java.lang.Override
    public void movieOff() {
        currentDownloadRequest.movieOff();
        downloadCurrent.movieOff();
        palyerCurrent.movieOff();
    }

    @java.lang.Override
    public void resume() {
        currentDownloadRequest.resume();
        downloadCurrent.resume();
        palyerCurrent.resume();
    }

    @java.lang.Override
    public void downloadFinished() {
        currentDownloadRequest.downloadFinished();
        palyerCurrent.downloadFinished();
        //calling currentDownload.downloadFinished() will result in an infinite loop!!!

    }

    @Override
    public void entry() {
        currentDownloadRequest.entry();
        downloadCurrent.entry();
        palyerCurrent.entry();
    }

}

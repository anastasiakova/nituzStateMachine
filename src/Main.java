public class Main{
    public static void  main(String[] args) {
        Main m = new Main();
        //m.simpleNoMovie();
        //m.simpleWithMovie();
        //m.downloadAndInternetOffAndThanOff();
        //m.downloadAndOff();
        //m.downloadAndDownloadAborted();
        //m.downloadAndDownloaderrorAndFixed();
        //m.downloadAndDownloaderrorAndTimeOut();
        //m.downloadAndOutOfDiskTimeOut();
        //m.downloadAndOutOfDiskFixed();
        //m.downloadPlayAndMovieOff();
        //m.downloadPlayAndHoldMovieAndResume();
        //m.downloadPlayAndHoldMovieAndMovieOff();
        //m.testSpeed();
        //m.goToOnAndDoNothing();
    }

    private void simpleNoMovie(){
        /*Context c = new Context();
        System.out.println("----------------DO INTERNET ON-----------");
        c.internetOn();

System.out.println("---------------DO TURN ON-----------");
        c.turnOn();
        System.out.println("---------------DO TURN ON-----------");
        //c.turnOn();
        System.out.println("----------------ADD DOWNLOAD-----------");
        //c.fileRequest();*/

        Context c = new Context();

        System.out.println("----------------DO INTERNET ON-----------");
        c.internetOn();

System.out.println("---------------DO TURN ON-----------");
        c.turnOn();
        System.out.println("---------------DO TURN ON-----------");
        c.turnOn();
        c.turnOff();
        c.turnOn();
        System.out.println("----------------ADD DOWNLOAD-----------");
        c.fileRequest();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("----------------ADD DOWNLOAD-----------");
        c.fileRequest();
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c.turnOff();

        //System.out.println("----------------ADD DOWNLOAD-----------");
    }

    private void simpleWithMovie(){
        Context c = new Context();
        System.out.println("----------------DO INTERNET ON-----------");
        c.internetOn();

System.out.println("---------------DO TURN ON-----------");
        c.turnOn();

        System.out.println("----------------ADD DOWNLOAD-----------");
        c.fileRequest();

        System.out.println("----------------TRY PLAYING MOVIE-----------");
        c.movieOn();

        try {
            Thread.sleep(4010);
            System.out.println("----------------SUCCEED PLAYING MOVIE-----------");
            c.movieOn();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    private void downloadAndInternetOffAndThanOff(){
        Context c = new Context();

        System.out.println("----------------DO INTERNET ON-----------");
        c.internetOn();

        System.out.println("---------------DO TURN ON-----------");
        c.turnOn();

        System.out.println("----------------ADD DOWNLOAD-----------");
        c.fileRequest();



        System.out.println("----------------DO INTERNET OFF-----------");
        c.internetOff();

        try {
            Thread.sleep(2000);
            System.out.println("----------------DO INTERNET ON-----------");
            c.internetOn();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void downloadAndOff(){
        Context c = new Context();
        System.out.println("----------------DO INTERNET ON-----------");
        c.internetOn();

System.out.println("---------------DO TURN ON-----------");
        c.turnOn();

        System.out.println("----------------ADD DOWNLOAD-----------");
        c.fileRequest();

        try {
            Thread.sleep(2000);
            System.out.println("----------------DO OFF-----------");
            c.turnOff();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void downloadAndDownloadAborted(){
        Context c = new Context();
        System.out.println("----------------DO INTERNET ON-----------");
        c.internetOn();

System.out.println("---------------DO TURN ON-----------");
        c.turnOn();

        System.out.println("----------------ADD DOWNLOAD-----------");
        c.fileRequest();

        try {
            Thread.sleep(2000);
            System.out.println("----------------DOWNLOAD ABORTED-----------");
            c.downloadAborted();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void downloadAndDownloaderrorAndFixed(){
        Context c = new Context();
        System.out.println("----------------DO INTERNET ON-----------");
        c.internetOn();

        System.out.println("---------------DO TURN ON-----------");
        c.turnOn();

        System.out.println("----------------ADD DOWNLOAD-----------");
        c.fileRequest();

        try {
            Thread.sleep(2000);
            System.out.println("----------------DOWNLOAD ERROR-----------");
            c.downloadError();
            System.out.println("----------------ERROR FIXED-----------");
            c.errorFixed();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void downloadAndDownloaderrorAndTimeOut(){
        Context c = new Context();
        System.out.println("----------------DO INTERNET ON-----------");
        c.internetOn();

System.out.println("---------------DO TURN ON-----------");
        c.turnOn();

        System.out.println("----------------ADD DOWNLOAD-----------");
        c.fileRequest();

        try {
            Thread.sleep(2000);
            System.out.println("----------------DOWNLOAD ERROR-----------");
            c.downloadError();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void downloadAndOutOfDiskTimeOut(){
        Context c = new Context();

        System.out.println("----------------DO INTERNET ON-----------");
        c.internetOn();

        System.out.println("---------------DO TURN ON-----------");
        c.turnOn();

        System.out.println("---------------SET DISK SIZE = 0-----------");
        c.setDiskSize(0);

        System.out.println("----------------ADD DOWNLOAD-----------");
        c.fileRequest();
    }

    private void downloadAndOutOfDiskFixed(){
        Context c = new Context();
        System.out.println("---------------DO TURN ON-----------");
        c.turnOn();

        System.out.println("---------------SET DISK SIZE = 0-----------");
        c.setDiskSize(0);

        System.out.println("----------------DO INTERNET ON-----------");
        c.internetOn();

        System.out.println("----------------ADD DOWNLOAD-----------");
        c.fileRequest();

        System.out.println("---------------SET DISK SIZE = 100-----------");
        c.setDiskSize(100);
    }


    private void downloadPlayAndMovieOff(){
        Context c = new Context();
        System.out.println("----------------DO INTERNET ON-----------");
        c.internetOn();

System.out.println("---------------DO TURN ON-----------");
        c.turnOn();

        System.out.println("----------------ADD DOWNLOAD-----------");
        c.fileRequest();

        try {
            Thread.sleep(4010);
            System.out.println("----------------SUCCEED PLAYING MOVIE-----------");
            c.movieOn();
            System.out.println("----------------MOVIE OFF-----------");
            c.movieOff();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void downloadPlayAndHoldMovieAndResume(){
        Context c = new Context();
        System.out.println("----------------DO INTERNET ON-----------");
        c.internetOn();

System.out.println("---------------DO TURN ON-----------");
        c.turnOn();

        System.out.println("----------------ADD DOWNLOAD-----------");
        c.fileRequest();

        try {
            Thread.sleep(4010);
            System.out.println("----------------SUCCEED PLAYING MOVIE-----------");
            c.movieOn();
            System.out.println("----------------MOVIE HOLD-----------");
            c.holdMovie();
            System.out.println("----------------PLAY MOVIE-----------");
            c.movieOn();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void downloadPlayAndHoldMovieAndMovieOff(){
        Context c = new Context();
        System.out.println("----------------DO INTERNET ON-----------");
        c.internetOn();

System.out.println("---------------DO TURN ON-----------");
        c.turnOn();

        System.out.println("----------------ADD DOWNLOAD-----------");
        c.fileRequest();

        try {
            Thread.sleep(4010);
            System.out.println("----------------SUCCEED PLAYING MOVIE-----------");
            c.movieOn();
            System.out.println("----------------MOVIE HOLD-----------");
            c.holdMovie();
            System.out.println("----------------MOVIE OFF-----------");
            c.movieOff();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void testSpeed(){
        Context c = new Context();
        System.out.println("----------------DO INTERNET ON-----------");
        c.internetOn();

System.out.println("---------------DO TURN ON-----------");
        c.turnOn();

        System.out.println("----------------ADD DOWNLOAD 1-----------");
        c.fileRequest();
        System.out.println("----------------ADD DOWNLOAD 2-----------");
        c.fileRequest();
        System.out.println("----------------ADD DOWNLOAD 3-----------");
        c.fileRequest();
        System.out.println("----------------ADD DOWNLOAD 4-----------");
        c.fileRequest();
        System.out.println("----------------ADD DOWNLOAD 5-----------");
        c.fileRequest();
        System.out.println("----------------ADD DOWNLOAD 6-----------");
        c.fileRequest();
        System.out.println("----------------ADD DOWNLOAD 7-----------");
        c.fileRequest();
        System.out.println("----------------ADD DOWNLOAD 8-----------");
        c.fileRequest();

    }

    private void goToOnAndDoNothing(){
        Context c = new Context();
        System.out.println("---------------DO TURN ON-----------");
        c.turnOn();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

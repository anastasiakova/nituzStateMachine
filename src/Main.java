import java.text.ParseException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main{
    public static void  main(String[] args) {
        //Main m = new Main();
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
        Context c = new Context();

        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("\n\nPlease insert the number of the event you want to fire.\nIn order to finish execution, insert X\n\n");
                System.out.println("1) turnOn");
                System.out.println("2) turnOff");
                System.out.println("3) internetOn");
                System.out.println("4) internetOff");
                System.out.println("5) fileRequest");
                System.out.println("6) downloadAborted");
                System.out.println("7) downloadError");
                System.out.println("8) errorFixed");
                System.out.println("9) movieOn");
                System.out.println("10) restartMovie");
                System.out.println("11) holdMovie");
                System.out.println("12) movieOff");
                System.out.println("13) resume\n");
                System.out.println("g - get current disk size");
                System.out.println("d - set new disk size");
                System.out.print("Please choose event: ");
                String line = scanner.nextLine();
                int chosenEvent;
                if(isParseable(line)){
                    chosenEvent = Integer.parseInt(line);
                    switch (chosenEvent){
                        case 1:
                            c.turnOn();
                            break;
                        case 2:
                            c.turnOff();
                            break;
                        case 3:
                            c.internetOn();
                            break;
                        case 4:
                            c.internetOff();
                            break;
                        case 5:
                            c.fileRequest();
                            break;
                        case 6:
                            c.downloadAborted();
                            break;
                        case 7:
                            c.downloadError();
                            break;
                        case 8:
                            c.errorFixed();
                            break;
                        case 9:
                            c.movieOn();
                            break;
                        case 10:
                            c.restartMovie();
                            break;
                        case 11:
                            c.holdMovie();
                            break;
                        case 12:
                            c.movieOff();
                            break;
                        case 13:
                            c.resume();
                            break;
                        default:
                            System.out.println("Your entry was not recognized...");
                    }
                }
                else{
                    if(line.equals("x") || line.equals("X")){
                        break;
                    }
                    else if(line.toLowerCase().equals("g")){
                        System.out.println("Current disk size: " + Context.diskSize);
                    }
                    else if(line.toLowerCase().equals("d")){
                        System.out.println("What is the new disk size you would like to set?");
                        line = scanner.nextLine();
                        if(isParseable(line) && Integer.parseInt(line) >= 0){
                            c.setDiskSize(Integer.parseInt(line));
                            System.out.println("New disk size is set to: " + line);
                        }else{
                            System.out.println("Could not parse your answer...");
                        }
                    }
                    else{
                        System.out.println("Your entry was not recognized...");
                    }
                }
            }
        } catch(IllegalStateException | NoSuchElementException e) {
            // System.in has been closed
            System.out.println("System.in was closed; exiting");
        }
    }

    private static boolean isParseable(String s) {
        try{
                Integer.parseInt(s);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

//    void turnOn();
//    void turnOff();
//    void internetOn();
//    void internetOff();
//    void fileRequest();
//    void downloadAborted();
//    void downloadError();
//    void errorFixed();
//    void movieOn();
//    void restartMovie();
//    void holdMovie();
//    void movieOff();
//    void resume();

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
        System.out.println("----------------ADD DOWNLOAD-----------");
        c.fileRequest();
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

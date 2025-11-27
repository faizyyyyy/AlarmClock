import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock1 implements Runnable{

    LocalTime alarmtime;
    String filepath;
    Scanner sc;

    AlarmClock1(LocalTime alarmtime, String filepath, Scanner sc){
        this.alarmtime=alarmtime;
        this.filepath = filepath;
        this.sc = sc;
    }
    @Override
    public void run(){
        while (LocalTime.now().isBefore(alarmtime)){
            try {
                Thread.sleep(1000);

                int hour = LocalTime.now().getHour();
                int minutes = LocalTime.now().getMinute();
                int seconds = LocalTime.now().getSecond();
                System.out.printf("\r%02d:%02d:%02d",hour,minutes,seconds);

            } catch (InterruptedException e) {
                System.out.println("time was interrupted");
            }

        }
        System.out.println("\n*ALARM NOISES*");
        playsound(filepath);
    }

    public void playsound(String filepath){
        File audiofile = new File(filepath);
        try(AudioInputStream audio = AudioSystem.getAudioInputStream(audiofile);) {
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            System.out.println("press *Enter* to stop playing");
            sc.nextLine();
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("audio file not supported, please input .wav file");
        }
        catch (IOException e){
            System.out.println("error handling the audio system");
        }
        catch (LineUnavailableException e) {
            System.out.println("clip unavailable");
        }

    }
}

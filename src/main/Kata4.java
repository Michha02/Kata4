package main;

import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;
import java.util.List;
import java.util.Scanner;

public class Kata4 {
    private String fileName;
    private List<Mail> mailList;
    private Histogram<String> histogram;

    public static void main(String[] args){
        Kata4 kata4 = new Kata4();
        kata4.control();
    }

    private void control() {
        input();
        process();
        output();
    }

    private void input() {
        System.out.println("Introduce el nombre del fichero: ");
        fileName = new Scanner(System.in).nextLine();
        mailList = MailListReader.read(fileName);
    }

    private void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    private void output() {
        new HistogramDisplay(histogram).execute();
    }
}

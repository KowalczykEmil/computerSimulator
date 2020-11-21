package com.emilkowalczyk;

import com.emilkowalczyk.drive.Drive;
import com.emilkowalczyk.drive.HDDDrive;
import com.emilkowalczyk.drive.SSDDrive;
import com.emilkowalczyk.file.File;
import com.emilkowalczyk.file.imagefile.GIFImageFile;
import com.emilkowalczyk.file.imagefile.JPGImageFile;
import com.emilkowalczyk.file.musicfile.MP3MusicFile;

public class Main {

    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);

        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "Szpaku", "Wojna podwórek", 100);

        Drive drive = new HDDDrive();
        drive.addFile(gif1);    // dodanie gif1 do dysku
        drive.addFile(jpg1);    // dodanie jpg1 do dysku
        drive.addFile(mp3file); // dodanie mp3file do dysku

        drive.listFiles();  //Wyświetlanie plików z dysku
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());

    }
}

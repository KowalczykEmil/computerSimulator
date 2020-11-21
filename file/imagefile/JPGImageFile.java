package com.emilkowalczyk.file.imagefile;

import com.emilkowalczyk.file.File;
import com.emilkowalczyk.file.FileType;

public class JPGImageFile implements File {

    String name;
    int size;
    private final FileType fileType;
    int compression;

    public JPGImageFile(String name, int size, FileType fileType, int compression) {
        this.name = name;
        this.size = size;
        this.fileType = fileType;
        this.compression = compression;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public FileType getType() {
        return fileType;
    }

    public int getCompression() {
        return compression;
    }

    public void displayImage(){
        System.out.println("Displaying JPG");
    }
}

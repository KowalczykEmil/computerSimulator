package com.emilkowalczyk.file.imagefile;

import com.emilkowalczyk.file.File;
import com.emilkowalczyk.file.FileType;

public class GIFImageFile implements File {
    String name;
    int size;
    private final FileType fileType;

    public GIFImageFile(String name, int size, FileType fileType){
        this.name = name;
        this.size = size;
        this.fileType = fileType;
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

    public void showAnimation(){
        System.out.println("Showing funny GIF");
    }

}

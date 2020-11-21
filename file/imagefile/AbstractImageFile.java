package com.emilkowalczyk.file.imagefile;

import com.emilkowalczyk.file.AbstractFile;
import com.emilkowalczyk.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}

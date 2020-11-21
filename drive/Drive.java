package com.emilkowalczyk.drive;

import com.emilkowalczyk.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}

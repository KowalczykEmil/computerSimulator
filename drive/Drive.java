package com.emilkowalczyk.drive;

import com.emilkowalczyk.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}

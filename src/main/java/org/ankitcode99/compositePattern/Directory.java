package org.ankitcode99.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }


    @Override
    public void ls() {
        System.out.println("Directory Name = "+this.directoryName);

        for(FileSystem fs: fileSystemList){
            fs.ls();
        }
    }
}

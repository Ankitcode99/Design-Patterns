package org.ankitcode99.compositePattern;

public class File implements FileSystem{
    private final String fileName;

    public File(String fileName){
        this.fileName = fileName;
    }


    @Override
    public void ls(int indent) {
        for(int i=0;i<indent;i++){
            System.out.print("\t\t");
        }
        System.out.println("File Name"+ this.fileName);
    }
}

package org.ankitcode99.compositePattern;

public class CompositeDriver {
    public static void main(String[] args) {
        Directory mainDirectory1 = new Directory("Outer-Folder");

        Directory innerDirectory1 = new Directory("Inner-Folder-1");
        Directory innerDirectory2 = new Directory("Inner-Folder-2");
        Directory innerDirectory3 = new Directory("Inner-Folder-3");

        File file1 = new File("File-1");
        File file2 = new File("File-2");
        File file3 = new File("File-3");
        File file4 = new File("File-4");

        mainDirectory1.add(file1);
        mainDirectory1.add(innerDirectory1);
        mainDirectory1.add(file2);

        innerDirectory1.add(file2);
        innerDirectory1.add(innerDirectory2);
        innerDirectory2.add(file3);
        innerDirectory2.add(innerDirectory3);
        innerDirectory3.add(file4);

        mainDirectory1.ls(0);
    }
}

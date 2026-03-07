package org.example.sumreen;

import java.io.File;

public class SmartFileConverter {

    public static void main(String[] args) {
        String folderPath = "C:\\Users\\sumreen\\OneDrive\\Documents\\Downloads\\images";
        renameFilesWithCount(folderPath, "14th Feb");
    }

    public static void renameFilesWithCount(String folderPath, String baseName) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("Folder is empty or path is invalid.");
            return;
        }

        int count = 1;

        for (int i = 0; i < files.length; i++) {

            // Skip directories
            if (files[i].isDirectory()) {
                continue;
            }

            String oldName = files[i].getName();

            // Skip already renamed files
            if (oldName.startsWith(baseName)) {
                continue;
            }

            // Extract file extension
            int dotIndex = oldName.lastIndexOf('.');
            String extension = (dotIndex != -1) ? oldName.substring(dotIndex) : "";

            // Build new file name using StringBuilder
            StringBuilder newNameBuilder = new StringBuilder();
            newNameBuilder.append(baseName)
                    .append(" ")
                    .append(count)
                    .append(extension);

            String newName = newNameBuilder.toString();

            // Rename file in the same folder
            File newFile = new File(files[i].getParent(), newName);
            boolean renamed = files[i].renameTo(newFile);

            if (renamed) {
                System.out.println("Renamed: " + oldName + " -> " + newName);
                count++;
            } else {
                System.out.println("Failed to rename: " + oldName);
            }
        }
    }
}

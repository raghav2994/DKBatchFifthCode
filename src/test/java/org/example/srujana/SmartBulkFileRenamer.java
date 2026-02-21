package org.example.srujana;

import java.io.File;

public class SmartBulkFileRenamer {
    public static void main(String[] args) {


        // Ask user for parent folder path
        // Validate folder exists
        // Read subfolders
        // For each subfolder:
        //       - Identify feature name
        //       - Filter target files
        //       - Generate new names
        //       - Ensure no duplicates


        /*Challenges I faced -
        1. How will rename file becoz rename it to screenshot 1,2,3...is not ideal - in this case he has to go though each and every screenshot for validation of scenario
                                - So for this I thought of scenarios :
                                1.I will assume while taking screenshot tester would have followed like for login/screenshot1.., payement/screenhots..etc
                                (FOR MVP Going with this scenario)
                                2. If the screenshots are not arranged in above format the manual effort need where user has to categorise the screenshot based on
                                   future name and in logic for name convention - <Featurename>_OO1(number logic)
                                3. If folder contains 1000s of screenshots then we have write logic for grouping based on date time or test case id or
                                 use contains for keyword searching
                                4. If I have duplicate folder name (Login-copy) then curent logic breaking naming convention   -->yet to write code
        */
        String parentFolderPath = "C:\\Users\\Praveen\\Downloads\\SmartBulkRenamer";

        // Create File object representing the parent folder
        File parentFolder = new File(parentFolderPath);

        // ==============================
        // STEP 2: VALIDATE FOLDER EXISTS
        // ==============================
        // If folder doesn't exist OR not a directory → stop program
        if (!parentFolder.exists() || !parentFolder.isDirectory()) {
            System.out.println("Parent folder not found.");
            return;
        }

        // ==============================
        // STEP 3: GET ALL SUBFOLDERS (FEATURE FOLDERS)
        // ==============================
        // Each subfolder represents a feature like Login, Payment, etc.
        File[] featureFolders = parentFolder.listFiles(File::isDirectory);

        // Safety check
        if (featureFolders == null) return;

        // ==============================
        // STEP 4: PROCESS EACH FEATURE FOLDER
        // ==============================
        for (File featureFolder : featureFolders) {

            // Folder name becomes feature name
            String featureName = featureFolder.getName();

            // Counter used for sequential numbering
            int counter = 1;

            // Get all files inside this feature folder
            File[] files = featureFolder.listFiles();

            if (files == null) continue;

            // ==============================
            // STEP 5: PROCESS EACH FILE
            // ==============================
            for (File file : files) {

                // Ignore if not a file (skip subfolders)
                if (!file.isFile()) continue;

                // Extract file extension
                String extension = getExtension(file.getName()).toLowerCase();

                String newBaseName;

                // ==============================
                // STEP 6: APPLY NAMING RULES
                // ==============================

                // For screenshots → FeatureName_01.png
                if (extension.equals("png") || extension.equals("jpg") || extension.equals("jpeg")) {
                    newBaseName = featureName;
                }

                // For videos → EndToEnd_FeatureName_01.mp4
                else if (extension.equals("mp4")) {
                    newBaseName = "EndToEnd_" + featureName;
                }

                // Ignore other file types
                else {
                    continue;
                }

                String newFileName;
                File newFile;

                // ==============================
                // STEP 7: DUPLICATE NAME PROTECTION
                // ==============================
                // If file with same name exists, increase counter
                // until unique filename is found
                while (true) {

                    // Format number with leading zero → 01, 02, 03
                    String number = String.format("%02d", counter);

                    // Create final filename
                    newFileName = newBaseName + "_" + number + "." + extension;

                    // Create file object for new name
                    newFile = new File(featureFolder, newFileName);

                    // If name does NOT exist → safe to use
                    if (!newFile.exists()) break;

                    // Else increment counter and try again
                    counter++;
                }

                // ==============================
                // STEP 8: PRINT RENAME ACTION
                // ==============================
                // This helps user see what is happening
                System.out.println("Renaming: " + file.getName() + " -> " + newFileName);

                // ==============================
                // STEP 9: RENAME FILE
                // ==============================
                file.renameTo(newFile);

                // Increment counter for next file
                counter++;
            }
        }

        // ==============================
        // STEP 10: COMPLETION MESSAGE
        // ==============================
        System.out.println("Renaming completed.");
    }

    // ==============================
    // HELPER METHOD: GET FILE EXTENSION
    // ==============================
    // Example:
    // login.png → png
    // video.mp4 → mp4
    private static String getExtension(String name) {
        int dot = name.lastIndexOf(".");
        if (dot == -1) return "";
        return name.substring(dot + 1);
    }


}







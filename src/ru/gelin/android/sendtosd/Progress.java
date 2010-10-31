package ru.gelin.android.sendtosd;


/**
 *  Interface to handle file copying/moving progress.
 */
public interface Progress {

    /**
     *  Sets the number of files.
     */
    public void setFiles(int files);
    
    /**
     *  Starts processing the next file.
     */
    public void nextFile(File file);
    
    /**
     *  Mark next bytes of the current file as processed.
     */
    public void processBytes(long bytes);
    
}

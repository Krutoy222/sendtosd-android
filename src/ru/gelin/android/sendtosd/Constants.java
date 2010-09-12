package ru.gelin.android.sendtosd;

public interface Constants {
    
    /** Tag for logs */
    public static final String TAG = "ru.gelin.android.sendtosd";
    
    /** Extra name for current path */
    public static final String EXTRA_PATH = "path";
    
    /** "How to use" preference key */
    public static final String PREF_HOW_TO_USE = "how_to_use";
    
    /** "Initial folder" preference key */
    public static final String PREF_INITIAL_FOLDER = "initial_folder";
    /** "SD card root" initial folder */
    public static final String VAL_SD_CARD_ROOT = "sd_card_root";
    /** "Last folder" initial folder */
    public static final String VAL_LAST_FOLDER = "last_folder";
    
    /** Last folder preference key */
    public static final String PREF_LAST_FOLDER = "last_folder";
    /** Last folders preference category key */
    public static final String PREF_LAST_FOLDERS = "last_folders";
    /** Show last folders preference key */
    public static final String PREF_SHOW_LAST_FOLDERS = "show_last_folders";
    /** Last folders number preference key */
    public static final String PREF_LAST_FOLDERS_NUMBER = "last_folders_number";
    /** Default value for last folders number */
    public static final String DEFAULT_LAST_FOLDERS_NUMBER = "5";
    /** Default value for last folders number */
    public static final int DEFAULT_LAST_FOLDERS_NUMBER_INT = 5;

}

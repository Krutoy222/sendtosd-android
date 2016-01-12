

# Common #

## Start with unmounted SD card ##

**Expected**: started from the root (/) folder

## Navigation ##

  1. Go to subfolder
  1. Press Back button
  1. Press Back button till application exit

**Expected**: The folder is changed by clicking on it. The Back button returns to the previous folder. The Back button on the first folder (in the history) exits the application.

## Last folders visibility ##

  1. Start sending
  1. Go to subfolder
  1. Go back to initial folder by pressing Back button
  1. Change Last Folders visibility in the preferences

**Expected**: The list of Last folders should be visible only if it's enabled in the applicaton preferences and only on the first screen (even when returning to it back).

## Folder creation ##

  1. Create a new folder

**Expected**: success message, folders list is updated, the folder is created.

## Removed folder ##

  1. Copy or save to some folder. The folder is saved as last used folder.
  1. Remove the folder.
  1. Start the application again.

**Expected**: started from SD card root `/sdcard`.

## Unwritable folder ##

  1. Navigate to filesystem root

**Expected**: "Copy here", "Move here", "New folder" are disabled, non-readable folders are disabled.

# One file #

## File renaming ##

  1. Go to subfolder
  1. Set new name of the file
  1. Return back to initial folder
  1. Copy or move

**Expected**: When returning back the new filename should be used. New filename in progress dialog, file is created with the new name.

## Copy ##

### Copy one text file ###

  1. Send an URL from the Browser

**Expected**: indeterminate progress dialog, success message, exit, new text file is created.

#### ~~Copy a text from Catch~~ ####

  1. ~~Send a note from Catch~~

~~**Expected**: indeterminate progress dialog, success message, exit, new text file is created.~~

**Actual**: [issue #26](https://code.google.com/p/sendtosd-android/issues/detail?id=#26)

### Copy one image file ###

  1. Send an image from Gallery

**Expected**: determinate progress dialog, success message, exit, image is copied, new image appears in Gallery.

### ~~Copy one video file~~ ###

  1. ~~Send a video from Gallery~~

~~**Expected**: determinate progress dialog, success message, exit, video is copied, new video appears in Gallery.~~

### Copy one file on filesystem ###

  1. Send a file from ASTRO File Manager

**Expected**: determinate progress dialog, success message, exit, file is copied.

## Move ##

### Move one image file ###

  1. Send an image from Gallery

**Expected**: indeterminate progress dialog, large files are moved quickly, success message, exit, image is moved, new image location appears in Gallery.

### ~~Move one video file~~ ###

  1. ~~Send a video from Gallery~~

~~**Expected**: indeterminate progress dialog, large files are moved quickly, success message, exit, video is moved, new video location appears in Gallery.~~

### Move one file on filesystem ###

  1. Send a file from ASTRO File Manager

**Expected**: indeterminate progress dialog, large files are moved quickly, success message, exit, file is moved.

### ~~Move one file not from filesystem~~ ###

~~**???**~~

~~**Expected**: determinate progress dialog, large files are moved slowly, success message, exit, file is moved.~~

# Multiple files #

## Short initialization time ##

  1. Try to send (no need to send actually, just start application) many (hundreds) of images from Gallery

**Expected**: correct number of files in header, initialization doesn't take more than a couple of seconds.

## Copy ##

### Copy multiple image files ###

  1. Send images from Gallery

**Expected**: determinate multiple progress dialog, success message, exit, images are copied, new images appear in Gallery.

### ~~Copy multiple video files~~ ###

  1. ~~Send videos from Gallery~~

~~**Expected**: determinate multiple progress dialog, success message, exit, videos are copied, new videos appear in Gallery.~~

### ~~Copy multiple files on filesystem~~ ###

~~???~~

~~**Expected**: determinate multiple progress dialog, success message, exit, files are copied.~~

## Move ##

### Move multiple image files ###

  1. Send images from Gallery

**Expected**: indeterminate multiple progress dialog, quick move, success message, exit, images are moved, new images appear in Gallery.

### ~~Move multiple video files~~ ###

  1. ~~Send videos from Gallery~~

~~**Expected**: indeterminate multiple progress dialog, quick move, success message, exit, videos are moved, new images appear in Gallery.~~

### ~~Move multiple files on filesystem~~ ###

~~???~~

~~**Expected**: indeterminate multiple progress dialog, large files are moved quickly, success message, exit, files are moved.~~

### ~~Move multiple files not from filesystem~~ ###

~~???~~

~~**Expected**: determinate progress dialog, large files are moved slowly, success message, exit, file are moved.~~
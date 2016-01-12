# Can it send applications to SD card? #

"Send to SD card" cannot send applications to SD card by itself. It
can only save files which are sent by another applications.

Also there are two things which can be called "to send app to SD card":

  1. To backup .apk files of already installed applications to SD card. This can be done at least in two ways:
    * use [EasyShare](https://play.google.com/store/apps/details?id=com.easyshare.android) and "Send to SD card" to send applications .apk files to SD card.
    * use Backup feature of the [ASTRO File Manager](https://play.google.com/store/apps/details?id=com.metago.astro)
  1. To move applications to be run from SD card. This feature is available since Android 2.2. The following applications can help to move all your applications to SD card:
    * [Link2SD](https://play.google.com/store/apps/details?id=com.buak.Link2SD)
    * [App 2 SD](https://play.google.com/store/apps/details?id=com.a0soft.gphone.app2sd)

# I cannot move files to external SD card on Samsung or KitKat devices #

Starting with KitKat (4.4) version of Android, which is already come to many Samsung devices, the rules to access SD cards were changed. Now the app cannot write to any folder on external SD card. You can read about it, for example, here: http://www.ibtimes.com/android-44-kitkat-update-micro-sd-changes-explained-root-access-fix-now-available-1562147

You have to root your device and run this app to allow writes to SD card as it was before: https://play.google.com/store/apps/details?id=nextapp.sdfix

# I moved my files and now I not don't see them #

"Send to SD card" operates with files (photos, videos, etc...) which are send (or shared) from another applications.

Most of other applications operates with different kind of collections (of photos, video, music, etc...). Technically these applications scans filesystem periodically for photo/video/music files and updates the collection database.

When "Send to SD card" moves or copies the file, it notify the system media library (i.e. forces the filesystem scan), which, theoretically, should cause immediate appearance of the moved/copied file in the built-in gallery or other system applications.

However, "Send to SD card" knows nothing about non-standard applications which should scan new files too. This can cause temporary "invisibility" of moved files: it was removed from the old location, but not yet scanned on new location.

To be sure that the files are in place use applications which works with files, such as:
  * [ES File Explorer](https://play.google.com/store/apps/details?id=com.estrongs.android.pop)
  * [Astro File Manager](https://play.google.com/store/apps/details?id=com.metago.astro)

# I moved my files to SD card, but the SD card stays empty #

On old Android phones the SD card was the real card and it was mounted to /sdcard folder.

However, in modern Android devices with gygabytes of built-in memory this internal memory is presented as /sdcard. And "Send to SD card" by default uses this location to copy/move files. So, it moves/copies files to internal memory in this case.

The actual SD card on modern devices is located under /Removable or other folders (depends on the actual device). You should navigate to that folder in "Send to SD card" application to copy/move files there.
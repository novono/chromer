package arun.com.chromer.activities.about.licenses;

import de.psdev.licensesdialog.licenses.ApacheSoftwareLicense20;
import de.psdev.licensesdialog.licenses.BSD2ClauseLicense;
import de.psdev.licensesdialog.licenses.License;
import de.psdev.licensesdialog.licenses.MITLicense;
import de.psdev.licensesdialog.model.Notice;
import de.psdev.licensesdialog.model.Notices;

/**
 * Created by Arun on 20/12/2015.
 */
public class Licenses {
    public static Notices getNotices() {
        Notices notices = new Notices();
        String name = "LicensesDialog";
        String url = "http://psdev.de";
        String copyright = "Copyright 2013 Philip Schiffer <admin@psdev.de>";
        License license = new ApacheSoftwareLicense20();
        Notice notice = new Notice(name, url, copyright, license);
        notices.addNotice(notice);

        name = "Material Dialogs";
        url = "https://github.com/afollestad/material-dialogs";
        copyright = "Copyright (c) 2015 Aidan Michael Follestad";
        license = new MITLicense();
        notice = new Notice(name, url, copyright, license);
        notices.addNotice(notice);

        name = "Android Open Source Project";
        url = "https://source.android.com/";
        copyright = "Copyright (C) 2008 The Android Open Source Project";
        license = new ApacheSoftwareLicense20();
        notice = new Notice(name, url, copyright, license);
        notices.addNotice(notice);

        name = "Material Drawer";
        url = "https://github.com/mikepenz/MaterialDrawer";
        copyright = "Copyright Mike Penz";
        license = new ApacheSoftwareLicense20();
        notice = new Notice(name, url, copyright, license);
        notices.addNotice(notice);

        name = "AppIntro";
        url = "https://github.com/PaoloRotolo/AppIntro";
        copyright = "Copyright 2015 Paolo Rotolo";
        license = new ApacheSoftwareLicense20();
        notice = new Notice(name, url, copyright, license);
        notices.addNotice(notice);

        name = "Timber";
        url = "https://github.com/JakeWharton/timber";
        copyright = "Copyright 2013 Jake Wharton";
        license = new ApacheSoftwareLicense20();
        notice = new Notice(name, url, copyright, license);
        notices.addNotice(notice);

        name = "ButterKnife";
        url = "https://github.com/JakeWharton/butterknife";
        copyright = "Copyright 2013 Jake Wharton";
        license = new ApacheSoftwareLicense20();
        notice = new Notice(name, url, copyright, license);
        notices.addNotice(notice);

        name = "Glide";
        url = "https://github.com/bumptech/glide";
        copyright = "Copyright 2014 Google, Inc";
        license = new ApacheSoftwareLicense20();
        notice = new Notice(name, url, copyright, license);
        notices.addNotice(notice);

        name = "Sugar";
        url = "https://github.com/satyan/sugar";
        copyright = "Copyright (C) 2012 by Satya Narayan";
        license = new ApacheSoftwareLicense20();
        notice = new Notice(name, url, copyright, license);
        notices.addNotice(notice);

        name = "Rebound";
        url = "https://github.com/facebook/rebound";
        copyright = "Copyright (c) 2013, Facebook, Inc.";
        license = new BSD2ClauseLicense();
        notice = new Notice(name, url, copyright, license);
        notices.addNotice(notice);

        name = "Bottomsheet";
        url = "https://github.com/Flipboard/bottomsheet";
        copyright = "Copyright (c) 2015, Flipboard";
        notice = new Notice(name, url, copyright, new BSD2ClauseLicense());
        notices.addNotice(notice);

        name = "Snacktory";
        url = "https://github.com/karussell/snacktory";
        copyright = "Copyright (c) 2015, karussell";
        notice = new Notice(name, url, copyright, new ApacheSoftwareLicense20());
        notices.addNotice(notice);

        return notices;
    }
}

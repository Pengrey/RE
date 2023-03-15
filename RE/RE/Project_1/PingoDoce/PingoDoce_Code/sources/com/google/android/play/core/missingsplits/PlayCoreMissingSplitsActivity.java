package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p031b9.C1844a;
import p031b9.C1856m;

/* loaded from: classes.dex */
public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface.OnClickListener {
    /* renamed from: a */
    private final String m28529a() {
        return getApplicationInfo().loadLabel(getPackageManager()).toString();
    }

    /* renamed from: b */
    private final void m28528b(String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 66);
        sb2.append("market://details?id=");
        sb2.append(str);
        sb2.append("&referrer=utm_source%3Dplay.core.missingsplits");
        try {
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(sb2.toString())).setPackage("com.android.vending"));
        } catch (ActivityNotFoundException e) {
            new C1844a(getClass().getName()).m35279d(e, "Couldn't start missing splits activity for %s", str);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            m28528b(getPackageName());
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton("Close", this);
        if (C1856m.m35252a(this)) {
            String m28529a = m28529a();
            StringBuilder sb2 = new StringBuilder(String.valueOf(m28529a).length() + 91);
            sb2.append("The app ");
            sb2.append(m28529a);
            sb2.append(" is missing required components and must be reinstalled from the Google Play Store.");
            neutralButton.setMessage(sb2.toString()).setPositiveButton("Reinstall", this);
        } else {
            String m28529a2 = m28529a();
            StringBuilder sb3 = new StringBuilder(String.valueOf(m28529a2).length() + 87);
            sb3.append("The app ");
            sb3.append(m28529a2);
            sb3.append(" is missing required components and must be reinstalled from an official store.");
            neutralButton.setMessage(sb3.toString());
        }
        neutralButton.create().show();
    }
}

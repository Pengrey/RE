package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3056a = (IconCompat) versionedParcel.m35594v(remoteActionCompat.f3056a, 1);
        remoteActionCompat.f3057b = versionedParcel.m35600l(remoteActionCompat.f3057b, 2);
        remoteActionCompat.f3058c = versionedParcel.m35600l(remoteActionCompat.f3058c, 3);
        remoteActionCompat.f3059d = (PendingIntent) versionedParcel.m35597r(remoteActionCompat.f3059d, 4);
        remoteActionCompat.f3060e = versionedParcel.m35602h(remoteActionCompat.f3060e, 5);
        remoteActionCompat.f3061f = versionedParcel.m35602h(remoteActionCompat.f3061f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.m35593x(false, false);
        versionedParcel.m35608M(remoteActionCompat.f3056a, 1);
        versionedParcel.m35614D(remoteActionCompat.f3057b, 2);
        versionedParcel.m35614D(remoteActionCompat.f3058c, 3);
        versionedParcel.m35612H(remoteActionCompat.f3059d, 4);
        versionedParcel.m35592z(remoteActionCompat.f3060e, 5);
        versionedParcel.m35592z(remoteActionCompat.f3061f, 6);
    }
}

package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: androidx.core.app.n */
/* loaded from: classes.dex */
public final class C0923n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemoteInput.java */
    /* renamed from: androidx.core.app.n$a */
    /* loaded from: classes.dex */
    public static class C0924a {
        /* renamed from: a */
        static void m39126a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static RemoteInput m39125b(C0923n c0923n) {
            throw null;
        }

        /* renamed from: c */
        static Bundle m39124c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* renamed from: a */
    static RemoteInput m39128a(C0923n c0923n) {
        return C0924a.m39125b(c0923n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static RemoteInput[] m39127b(C0923n[] c0923nArr) {
        if (c0923nArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[c0923nArr.length];
        for (int i = 0; i < c0923nArr.length; i++) {
            remoteInputArr[i] = m39128a(c0923nArr[i]);
        }
        return remoteInputArr;
    }
}

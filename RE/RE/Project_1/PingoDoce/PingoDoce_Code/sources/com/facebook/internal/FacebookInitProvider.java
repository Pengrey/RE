package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.facebook.C2290b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: FacebookInitProvider.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m20207d2 = {"Lcom/facebook/internal/FacebookInitProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "a", "facebook-core_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class FacebookInitProvider extends ContentProvider {

    /* renamed from: w */
    private static final String f6699w;

    /* compiled from: FacebookInitProvider.kt */
    /* renamed from: com.facebook.internal.FacebookInitProvider$a */
    /* loaded from: classes.dex */
    public static final class C2310a {
        private C2310a() {
        }

        public /* synthetic */ C2310a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2310a(null);
        String simpleName = FacebookInitProvider.class.getSimpleName();
        Intrinsics.checkIfNull(simpleName, "FacebookInitProvider::class.java.simpleName");
        f6699w = simpleName;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        Intrinsics.isThisObjectNull(uri, "uri");
        return 0;
    }

    public String getType(Uri uri) {
        Intrinsics.isThisObjectNull(uri, "uri");
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Intrinsics.isThisObjectNull(uri, "uri");
        return null;
    }

    public boolean onCreate() {
        try {
            C2290b.m34089z(getContext());
            return false;
        } catch (Exception e) {
            Log.i(f6699w, "Failed to auto initialize the Facebook SDK", e);
            return false;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Intrinsics.isThisObjectNull(uri, "uri");
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Intrinsics.isThisObjectNull(uri, "uri");
        return 0;
    }
}

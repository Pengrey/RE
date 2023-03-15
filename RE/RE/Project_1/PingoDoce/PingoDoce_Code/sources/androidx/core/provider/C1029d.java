package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.core.content.res.C0946e;
import androidx.core.provider.C1038g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.core.provider.d */
/* loaded from: classes.dex */
class C1029d {

    /* renamed from: a */
    private static final Comparator<byte[]> f3327a = C1028c.f3326w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontProvider.java */
    /* renamed from: androidx.core.provider.d$a */
    /* loaded from: classes.dex */
    public static class C1030a {
        /* renamed from: a */
        static Cursor m38722a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: b */
    private static List<byte[]> m38729b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    private static boolean m38728c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static List<List<byte[]>> m38727d(C1031e c1031e, Resources resources) {
        if (c1031e.m38720b() != null) {
            return c1031e.m38720b();
        }
        return C0946e.m39025c(resources, c1031e.m38719c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C1038g.C1039a m38726e(Context context, C1031e c1031e, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo m38725f = m38725f(context.getPackageManager(), c1031e, context.getResources());
        if (m38725f == null) {
            return C1038g.C1039a.m38703a(1, null);
        }
        return C1038g.C1039a.m38703a(0, m38723h(context, c1031e, m38725f.authority, cancellationSignal));
    }

    /* renamed from: f */
    static ProviderInfo m38725f(PackageManager packageManager, C1031e c1031e, Resources resources) throws PackageManager.NameNotFoundException {
        String m38717e = c1031e.m38717e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m38717e, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(c1031e.m38716f())) {
                List<byte[]> m38729b = m38729b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(m38729b, f3327a);
                List<List<byte[]>> m38727d = m38727d(c1031e, resources);
                for (int i = 0; i < m38727d.size(); i++) {
                    ArrayList arrayList = new ArrayList(m38727d.get(i));
                    Collections.sort(arrayList, f3327a);
                    if (m38728c(m38729b, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + m38717e + ", but package was not " + c1031e.m38716f());
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + m38717e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m38724g(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        if (bArr.length != bArr2.length) {
            i = bArr.length;
            i2 = bArr2.length;
        } else {
            for (int i3 = 0; i3 < bArr.length; i3++) {
                if (bArr[i3] != bArr2[i3]) {
                    i = bArr[i3];
                    i2 = bArr2[i3];
                }
            }
            return 0;
        }
        return i - i2;
    }

    /* renamed from: h */
    static C1038g.C1040b[] m38723h(Context context, C1031e c1031e, String str, CancellationSignal cancellationSignal) {
        int i;
        Uri withAppendedId;
        int i2;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            ContentResolver contentResolver = context.getContentResolver();
            int i3 = 0;
            if (Build.VERSION.SDK_INT > 16) {
                cursor = C1030a.m38722a(contentResolver, build, strArr, "query = ?", new String[]{c1031e.m38715g()}, null, cancellationSignal);
            } else {
                cursor = contentResolver.query(build, strArr, "query = ?", new String[]{c1031e.m38715g()}, null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i4 = columnIndex != -1 ? cursor.getInt(columnIndex) : i3;
                    int i5 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : i3;
                    if (columnIndex3 == -1) {
                        i = i4;
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i = i4;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i6 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i2 = i;
                        z = false;
                    } else {
                        i2 = i;
                        z = true;
                    }
                    arrayList2.add(C1038g.C1040b.m38700a(withAppendedId, i5, i6, z, i2));
                    i3 = 0;
                }
                arrayList = arrayList2;
            }
            return (C1038g.C1040b[]) arrayList.toArray(new C1038g.C1040b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}

package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.b */
/* loaded from: classes.dex */
public class C0935b extends ContentProvider {

    /* renamed from: w */
    private InterfaceC0937b f3193w;

    /* renamed from: x */
    private int f3194x = 0;

    /* renamed from: y */
    private static final String[] f3191y = {"_display_name", "_size"};

    /* renamed from: z */
    private static final File f3192z = new File("/");

    /* renamed from: A */
    private static final HashMap<String, InterfaceC0937b> f3190A = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FileProvider.java */
    /* renamed from: androidx.core.content.b$a */
    /* loaded from: classes.dex */
    public static class C0936a {
        /* renamed from: a */
        static File[] m39082a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FileProvider.java */
    /* renamed from: androidx.core.content.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0937b {
        /* renamed from: a */
        File mo39081a(Uri uri);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FileProvider.java */
    /* renamed from: androidx.core.content.b$c */
    /* loaded from: classes.dex */
    public static class C0938c implements InterfaceC0937b {

        /* renamed from: a */
        private final HashMap<String, File> f3195a = new HashMap<>();

        C0938c(String str) {
        }

        @Override // androidx.core.content.C0935b.InterfaceC0937b
        /* renamed from: a */
        public File mo39081a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f3195a.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            }
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }

        /* renamed from: b */
        void m39080b(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f3195a.put(str, file.getCanonicalFile());
                    return;
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
                }
            }
            throw new IllegalArgumentException("Name must not be empty");
        }
    }

    /* renamed from: a */
    private static File m39089a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: b */
    private static Object[] m39088b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    /* renamed from: c */
    private static String[] m39087c(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    /* renamed from: d */
    static XmlResourceParser m39086d(Context context, String str, ProviderInfo providerInfo, int i) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
    }

    /* renamed from: e */
    private static InterfaceC0937b m39085e(Context context, String str, int i) {
        InterfaceC0937b interfaceC0937b;
        HashMap<String, InterfaceC0937b> hashMap = f3190A;
        synchronized (hashMap) {
            interfaceC0937b = hashMap.get(str);
            if (interfaceC0937b == null) {
                try {
                    try {
                        interfaceC0937b = m39083g(context, str, i);
                        hashMap.put(str, interfaceC0937b);
                    } catch (IOException e) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                    }
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return interfaceC0937b;
    }

    /* renamed from: f */
    private static int m39084f(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: g */
    private static InterfaceC0937b m39083g(Context context, String str, int i) throws IOException, XmlPullParserException {
        C0938c c0938c = new C0938c(str);
        XmlResourceParser m39086d = m39086d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = m39086d.next();
            if (next == 1) {
                return c0938c;
            }
            if (next == 2) {
                String name = m39086d.getName();
                File file = null;
                String attributeValue = m39086d.getAttributeValue(null, "name");
                String attributeValue2 = m39086d.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f3192z;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] m39109h = C0928a.m39109h(context, null);
                    if (m39109h.length > 0) {
                        file = m39109h[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] m39110g = C0928a.m39110g(context);
                    if (m39110g.length > 0) {
                        file = m39110g[0];
                    }
                } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                    File[] m39082a = C0936a.m39082a(context);
                    if (m39082a.length > 0) {
                        file = m39082a[0];
                    }
                }
                if (file != null) {
                    c0938c.m39080b(attributeValue, m39089a(file, attributeValue2));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority.split(";")[0];
                HashMap<String, InterfaceC0937b> hashMap = f3190A;
                synchronized (hashMap) {
                    hashMap.remove(str);
                }
                this.f3193w = m39085e(context, str, this.f3194x);
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f3193w.mo39081a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File mo39081a = this.f3193w.mo39081a(uri);
        int lastIndexOf = mo39081a.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mo39081a.getName().substring(lastIndexOf + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f3193w.mo39081a(uri), m39084f(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File mo39081a = this.f3193w.mo39081a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f3191y;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? mo39081a.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(mo39081a.length());
            }
            i2 = i;
        }
        String[] m39087c = m39087c(strArr3, i2);
        Object[] m39088b = m39088b(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(m39087c, 1);
        matrixCursor.addRow(m39088b);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}

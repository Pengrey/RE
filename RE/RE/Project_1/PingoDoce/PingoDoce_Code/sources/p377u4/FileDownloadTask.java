package p377u4;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;

/* renamed from: u4.f */
/* loaded from: classes.dex */
public final class FileDownloadTask extends AsyncTask {

    /* renamed from: a */
    private final String f28007a;

    /* renamed from: b */
    private final File f28008b;

    /* renamed from: c */
    private final InterfaceC10836a f28009c;

    /* compiled from: FileDownloadTask.kt */
    /* renamed from: u4.f$a */
    /* loaded from: classes.dex */
    public interface InterfaceC10836a {
        /* renamed from: a */
        void m6927a(File file);
    }

    public FileDownloadTask(String str, File file, InterfaceC10836a interfaceC10836a) {
        Intrinsics.isThisObjectNull(str, "uriStr");
        Intrinsics.isThisObjectNull(file, "destFile");
        Intrinsics.isThisObjectNull(interfaceC10836a, "onSuccess");
        this.f28007a = str;
        this.f28008b = file;
        this.f28009c = interfaceC10836a;
    }

    /* renamed from: a */
    public Boolean m6929a(String... strArr) {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(strArr, "args");
            try {
                URL url = new URL(this.f28007a);
                URLConnection openConnection = url.openConnection();
                Intrinsics.checkIfNull(openConnection, "conn");
                int contentLength = openConnection.getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f28008b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: b */
    protected void m6928b(boolean z) {
        if (!CrashShieldHandler.m25963d(this) && z) {
            try {
                this.f28009c.m6927a(this.f28008b);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            return m6929a((String[]) objArr);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            m6928b(((Boolean) obj).booleanValue());
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }
}

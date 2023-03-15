package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3425g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p309q7.C9684l;
import p309q7.C9685m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.e0 */
/* loaded from: classes.dex */
public class C4286e0 implements Closeable {

    /* renamed from: w */
    private final URL f11668w;

    /* renamed from: x */
    private AbstractC3419d<Bitmap> f11669x;

    /* renamed from: y */
    private volatile InputStream f11670y;

    private C4286e0(URL url) {
        this.f11668w = url;
    }

    /* renamed from: c */
    private byte[] m28030c() throws IOException {
        URLConnection openConnection = this.f11668w.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f11670y = inputStream;
                byte[] m10223b = C9684l.m10223b(C9684l.m10224a(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    String valueOf = String.valueOf(this.f11668w);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 34);
                    sb2.append("Downloaded ");
                    sb2.append(m10223b.length);
                    sb2.append(" bytes from ");
                    sb2.append(valueOf);
                    Log.v("FirebaseMessaging", sb2.toString());
                }
                if (m10223b.length <= 1048576) {
                    return m10223b;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    /* renamed from: e */
    public static C4286e0 m28029e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C4286e0(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    /* renamed from: a */
    public Bitmap m28031a() throws IOException {
        Log.i("FirebaseMessaging", "Starting download of: ".concat(String.valueOf(this.f11668w)));
        byte[] m28030c = m28030c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m28030c, 0, m28030c.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: ".concat(String.valueOf(this.f11668w)));
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: ".concat(String.valueOf(this.f11668w)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            C9685m.m10221a(this.f11670y);
        } catch (NullPointerException e) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e);
        }
    }

    /* renamed from: h */
    public AbstractC3419d<Bitmap> m28028h() {
        return (AbstractC3419d) C2597i.m33076j(this.f11669x);
    }

    /* renamed from: t */
    public void m28027t(Executor executor) {
        this.f11669x = C3425g.m30767c(executor, new Callable() { // from class: com.google.firebase.messaging.d0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4286e0.this.m28031a();
            }
        });
    }
}

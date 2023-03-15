package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.internal.C2597i;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.util.c */
/* loaded from: classes.dex */
public class C2632c {
    @Nullable

    /* renamed from: a */
    private static String f7552a;

    /* renamed from: b */
    private static int f7553b;

    /* renamed from: a */
    public static String m32993a() {
        BufferedReader bufferedReader;
        String sb2;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        if (f7552a == null) {
            int i = f7553b;
            if (i == 0) {
                i = Process.myPid();
                f7553b = i;
            }
            String str = null;
            str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            if (i > 0) {
                try {
                    StringBuilder sb3 = new StringBuilder(25);
                    sb3.append("/proc/");
                    sb3.append(i);
                    sb3.append("/cmdline");
                    sb2 = sb3.toString();
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                } catch (IOException unused) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    bufferedReader = new BufferedReader(new FileReader(sb2));
                    try {
                        String readLine = bufferedReader.readLine();
                        C2597i.m33076j(readLine);
                        str = readLine.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader2 = bufferedReader;
                        C2631b.m32997a(bufferedReader2);
                        throw th;
                    }
                    C2631b.m32997a(bufferedReader);
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            }
            f7552a = str;
        }
        return f7552a;
    }
}

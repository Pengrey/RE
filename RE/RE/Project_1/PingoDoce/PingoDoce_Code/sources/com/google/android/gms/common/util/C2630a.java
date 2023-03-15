package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p119g7.C5615c;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.util.a */
/* loaded from: classes.dex */
public class C2630a {
    @Deprecated
    /* renamed from: a */
    public static byte[] m32999a(Context context, String str) throws PackageManager.NameNotFoundException {
        MessageDigest m32998b;
        PackageInfo m23570e = C5615c.m23567a(context).m23570e(str, 64);
        Signature[] signatureArr = m23570e.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (m32998b = m32998b("SHA1")) == null) {
            return null;
        }
        return m32998b.digest(m23570e.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m32998b(String str) {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}

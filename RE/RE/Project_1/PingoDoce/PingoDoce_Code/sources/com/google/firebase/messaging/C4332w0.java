package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
import p484z6.C13701c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.w0 */
/* loaded from: classes.dex */
public final class C4332w0 {

    /* renamed from: d */
    private static final Pattern f11749d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    private final String f11750a;

    /* renamed from: b */
    private final String f11751b;

    /* renamed from: c */
    private final String f11752c;

    private C4332w0(String str, String str2) {
        this.f11750a = m27882d(str2, str);
        this.f11751b = str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("!");
        sb2.append(str2);
        this.f11752c = sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C4332w0 m27885a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C4332w0(split[0], split[1]);
    }

    /* renamed from: d */
    private static String m27882d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f11749d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    /* renamed from: f */
    public static C4332w0 m27880f(String str) {
        return new C4332w0("S", str);
    }

    /* renamed from: b */
    public String m27884b() {
        return this.f11751b;
    }

    /* renamed from: c */
    public String m27883c() {
        return this.f11750a;
    }

    /* renamed from: e */
    public String m27881e() {
        return this.f11752c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4332w0) {
            C4332w0 c4332w0 = (C4332w0) obj;
            return this.f11750a.equals(c4332w0.f11750a) && this.f11751b.equals(c4332w0.f11751b);
        }
        return false;
    }

    public int hashCode() {
        return C13701c.m574b(this.f11751b, this.f11750a);
    }
}

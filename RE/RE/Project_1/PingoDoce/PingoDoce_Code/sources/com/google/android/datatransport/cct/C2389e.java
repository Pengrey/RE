package com.google.android.datatransport.cct;

/* renamed from: com.google.android.datatransport.cct.e */
/* loaded from: classes.dex */
public final class C2389e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m33697a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
            for (int i = 0; i < str.length(); i++) {
                sb2.append(str.charAt(i));
                if (str2.length() > i) {
                    sb2.append(str2.charAt(i));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}

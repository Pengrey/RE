package sb;

import android.content.Intent;

/* renamed from: sb.b */
/* loaded from: classes2.dex */
public final class C10144b {

    /* renamed from: a */
    private final String f26451a;

    /* renamed from: b */
    private final String f26452b;

    /* renamed from: c */
    private final byte[] f26453c;

    /* renamed from: d */
    private final Integer f26454d;

    /* renamed from: e */
    private final String f26455e;

    /* renamed from: f */
    private final String f26456f;

    /* renamed from: g */
    private final Intent f26457g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10144b(Intent intent) {
        this(null, null, null, null, null, null, intent);
    }

    /* renamed from: a */
    public String m9059a() {
        return this.f26451a;
    }

    public String toString() {
        byte[] bArr = this.f26453c;
        int length = bArr == null ? 0 : bArr.length;
        return "Format: " + this.f26452b + "\nContents: " + this.f26451a + "\nRaw bytes: (" + length + " bytes)\nOrientation: " + this.f26454d + "\nEC level: " + this.f26455e + "\nBarcode image: " + this.f26456f + "\nOriginal intent: " + this.f26457g + '\n';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10144b(String str, String str2, byte[] bArr, Integer num, String str3, String str4, Intent intent) {
        this.f26451a = str;
        this.f26452b = str2;
        this.f26453c = bArr;
        this.f26454d = num;
        this.f26455e = str3;
        this.f26456f = str4;
        this.f26457g = intent;
    }
}

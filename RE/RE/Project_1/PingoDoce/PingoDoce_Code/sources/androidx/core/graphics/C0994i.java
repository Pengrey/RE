package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.C0946e;
import androidx.core.provider.C1038g;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: androidx.core.graphics.i */
/* loaded from: classes.dex */
public class C0994i extends C0995j {
    /* renamed from: k */
    private Font m38811k(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m38810l = m38810l(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int m38810l2 = m38810l(fontStyle, font2.getStyle());
            if (m38810l2 < m38810l) {
                font = font2;
                m38810l = m38810l2;
            }
        }
        return font;
    }

    /* renamed from: l */
    private static int m38810l(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // androidx.core.graphics.C0995j
    /* renamed from: b */
    public Typeface mo38808b(Context context, C0946e.C0949c c0949c, Resources resources, int i) {
        C0946e.C0950d[] m39018a;
        try {
            FontFamily.Builder builder = null;
            for (C0946e.C0950d c0950d : c0949c.m39018a()) {
                try {
                    Font build = new Font.Builder(resources, c0950d.m39016b()).setWeight(c0950d.m39013e()).setSlant(c0950d.m39012f() ? 1 : 0).setTtcIndex(c0950d.m39015c()).setFontVariationSettings(c0950d.m39014d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m38811k(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0995j
    /* renamed from: c */
    public Typeface mo38807c(Context context, CancellationSignal cancellationSignal, C1038g.C1040b[] c1040bArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C1038g.C1040b c1040b : c1040bArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c1040b.m38697d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(c1040b.m38696e()).setSlant(c1040b.m38695f() ? 1 : 0).setTtcIndex(c1040b.m38698c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th2) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                        break;
                    }
                } else if (openFileDescriptor == null) {
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m38811k(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.graphics.C0995j
    /* renamed from: d */
    public Typeface mo38806d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.C0995j
    /* renamed from: e */
    public Typeface mo38805e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.graphics.C0995j
    /* renamed from: h */
    public C1038g.C1040b mo38802h(C1038g.C1040b[] c1040bArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}

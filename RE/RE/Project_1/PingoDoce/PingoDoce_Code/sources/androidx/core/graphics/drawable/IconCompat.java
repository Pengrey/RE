package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.C1070c;
import androidx.core.util.C1076h;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    static final PorterDuff.Mode f3262k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f3263a;

    /* renamed from: b */
    Object f3264b;

    /* renamed from: c */
    public byte[] f3265c;

    /* renamed from: d */
    public Parcelable f3266d;

    /* renamed from: e */
    public int f3267e;

    /* renamed from: f */
    public int f3268f;

    /* renamed from: g */
    public ColorStateList f3269g;

    /* renamed from: h */
    PorterDuff.Mode f3270h;

    /* renamed from: i */
    public String f3271i;

    /* renamed from: j */
    public String f3272j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    /* loaded from: classes.dex */
    public static class C0977a {
        /* renamed from: a */
        static IconCompat m38890a(Object obj) {
            C1076h.m38619f(obj);
            int m38887d = m38887d(obj);
            if (m38887d != 2) {
                if (m38887d != 4) {
                    if (m38887d != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.f3264b = obj;
                        return iconCompat;
                    }
                    return IconCompat.m38907c(m38886e(obj));
                }
                return IconCompat.m38904f(m38886e(obj));
            }
            return IconCompat.m38902h(null, m38888c(obj), m38889b(obj));
        }

        /* renamed from: b */
        static int m38889b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0979c.m38881a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        }

        /* renamed from: c */
        static String m38888c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0979c.m38880b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        }

        /* renamed from: d */
        static int m38887d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0979c.m38879c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e);
                return -1;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                return -1;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                return -1;
            }
        }

        /* renamed from: e */
        static Uri m38886e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0979c.m38878d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            }
        }

        /* renamed from: f */
        static Drawable m38885f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* renamed from: g */
        static Icon m38884g(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f3263a) {
                case -1:
                    return (Icon) iconCompat.f3264b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f3264b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.m38899k(), iconCompat.f3267e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f3264b, iconCompat.f3267e, iconCompat.f3268f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f3264b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT >= 26) {
                        createWithBitmap = C0978b.m38882b((Bitmap) iconCompat.f3264b);
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.m38908b((Bitmap) iconCompat.f3264b, false));
                        break;
                    }
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        createWithBitmap = C0980d.m38877a(iconCompat.m38897m());
                        break;
                    } else if (context != null) {
                        InputStream m38896n = iconCompat.m38896n(context);
                        if (m38896n == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m38897m());
                        } else if (i >= 26) {
                            createWithBitmap = C0978b.m38882b(BitmapFactory.decodeStream(m38896n));
                            break;
                        } else {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.m38908b(BitmapFactory.decodeStream(m38896n), false));
                            break;
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m38897m());
                    }
            }
            ColorStateList colorStateList = iconCompat.f3269g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f3270h;
            if (mode != IconCompat.f3262k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    /* loaded from: classes.dex */
    public static class C0978b {
        /* renamed from: a */
        static Drawable m38883a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        /* renamed from: b */
        static Icon m38882b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    /* loaded from: classes.dex */
    public static class C0979c {
        /* renamed from: a */
        static int m38881a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* renamed from: b */
        static String m38880b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* renamed from: c */
        static int m38879c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* renamed from: d */
        static Uri m38878d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    /* loaded from: classes.dex */
    public static class C0980d {
        /* renamed from: a */
        static Icon m38877a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f3263a = -1;
        this.f3265c = null;
        this.f3266d = null;
        this.f3267e = 0;
        this.f3268f = 0;
        this.f3269g = null;
        this.f3270h = f3262k;
        this.f3271i = null;
    }

    /* renamed from: a */
    public static IconCompat m38909a(Icon icon) {
        return C0977a.m38890a(icon);
    }

    /* renamed from: b */
    static Bitmap m38908b(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: c */
    public static IconCompat m38907c(Uri uri) {
        C1070c.m38632c(uri);
        return m38906d(uri.toString());
    }

    /* renamed from: d */
    public static IconCompat m38906d(String str) {
        C1070c.m38632c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f3264b = str;
        return iconCompat;
    }

    /* renamed from: e */
    public static IconCompat m38905e(Bitmap bitmap) {
        C1070c.m38632c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f3264b = bitmap;
        return iconCompat;
    }

    /* renamed from: f */
    public static IconCompat m38904f(Uri uri) {
        C1070c.m38632c(uri);
        return m38903g(uri.toString());
    }

    /* renamed from: g */
    public static IconCompat m38903g(String str) {
        C1070c.m38632c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f3264b = str;
        return iconCompat;
    }

    /* renamed from: h */
    public static IconCompat m38902h(Resources resources, String str, int i) {
        C1070c.m38632c(str);
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f3267e = i;
            if (resources != null) {
                try {
                    iconCompat.f3264b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f3264b = str;
            }
            iconCompat.f3272j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: s */
    private static String m38891s(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: i */
    public Bitmap m38901i() {
        int i = this.f3263a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f3264b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i == 1) {
            return (Bitmap) this.f3264b;
        } else {
            if (i == 5) {
                return m38908b((Bitmap) this.f3264b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    /* renamed from: j */
    public int m38900j() {
        int i = this.f3263a;
        if (i != -1 || Build.VERSION.SDK_INT < 23) {
            if (i == 2) {
                return this.f3267e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        return C0977a.m38889b(this.f3264b);
    }

    /* renamed from: k */
    public String m38899k() {
        int i = this.f3263a;
        if (i != -1 || Build.VERSION.SDK_INT < 23) {
            if (i == 2) {
                String str = this.f3272j;
                if (str != null && !TextUtils.isEmpty(str)) {
                    return this.f3272j;
                }
                return ((String) this.f3264b).split(":", -1)[0];
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return C0977a.m38888c(this.f3264b);
    }

    /* renamed from: l */
    public int m38898l() {
        int i = this.f3263a;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : C0977a.m38887d(this.f3264b);
    }

    /* renamed from: m */
    public Uri m38897m() {
        int i = this.f3263a;
        if (i != -1 || Build.VERSION.SDK_INT < 23) {
            if (i != 4 && i != 6) {
                throw new IllegalStateException("called getUri() on " + this);
            }
            return Uri.parse((String) this.f3264b);
        }
        return C0977a.m38886e(this.f3264b);
    }

    /* renamed from: n */
    public InputStream m38896n(Context context) {
        Uri m38897m = m38897m();
        String scheme = m38897m.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f3264b));
            } catch (FileNotFoundException e) {
                Log.w("IconCompat", "Unable to load image from path: " + m38897m, e);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(m38897m);
        } catch (Exception e2) {
            Log.w("IconCompat", "Unable to load image from URI: " + m38897m, e2);
            return null;
        }
    }

    /* renamed from: o */
    public void m38895o() {
        this.f3270h = PorterDuff.Mode.valueOf(this.f3271i);
        switch (this.f3263a) {
            case -1:
                Parcelable parcelable = this.f3266d;
                if (parcelable != null) {
                    this.f3264b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f3266d;
                if (parcelable2 != null) {
                    this.f3264b = parcelable2;
                    return;
                }
                byte[] bArr = this.f3265c;
                this.f3264b = bArr;
                this.f3263a = 3;
                this.f3267e = 0;
                this.f3268f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3265c, Charset.forName("UTF-16"));
                this.f3264b = str;
                if (this.f3263a == 2 && this.f3272j == null) {
                    this.f3272j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3264b = this.f3265c;
                return;
        }
    }

    /* renamed from: p */
    public void m38894p(boolean z) {
        this.f3271i = this.f3270h.name();
        switch (this.f3263a) {
            case -1:
                if (!z) {
                    this.f3266d = (Parcelable) this.f3264b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f3264b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3265c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f3266d = (Parcelable) this.f3264b;
                return;
            case 2:
                this.f3265c = ((String) this.f3264b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3265c = (byte[]) this.f3264b;
                return;
            case 4:
            case 6:
                this.f3265c = this.f3264b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @Deprecated
    /* renamed from: q */
    public Icon m38893q() {
        return m38892r(null);
    }

    /* renamed from: r */
    public Icon m38892r(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0977a.m38884g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public String toString() {
        if (this.f3263a == -1) {
            return String.valueOf(this.f3264b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(m38891s(this.f3263a));
        switch (this.f3263a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f3264b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f3264b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f3272j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(m38900j())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f3267e);
                if (this.f3268f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f3268f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f3264b);
                break;
        }
        if (this.f3269g != null) {
            sb2.append(" tint=");
            sb2.append(this.f3269g);
        }
        if (this.f3270h != f3262k) {
            sb2.append(" mode=");
            sb2.append(this.f3270h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    IconCompat(int i) {
        this.f3263a = -1;
        this.f3265c = null;
        this.f3266d = null;
        this.f3267e = 0;
        this.f3268f = 0;
        this.f3269g = null;
        this.f3270h = f3262k;
        this.f3271i = null;
        this.f3263a = i;
    }
}

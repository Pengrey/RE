package p481z3;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.C2226g;
import com.airbnb.lottie.InterfaceC2198b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p130h4.C5848d;
import p130h4.C5852h;

/* renamed from: z3.b */
/* loaded from: classes.dex */
public class C13632b {

    /* renamed from: e */
    private static final Object f34643e = new Object();

    /* renamed from: a */
    private final Context f34644a;

    /* renamed from: b */
    private final String f34645b;

    /* renamed from: c */
    private InterfaceC2198b f34646c;

    /* renamed from: d */
    private final Map<String, C2226g> f34647d;

    public C13632b(Drawable.Callback callback, String str, InterfaceC2198b interfaceC2198b, Map<String, C2226g> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f34645b = str + '/';
        } else {
            this.f34645b = str;
        }
        if (!(callback instanceof View)) {
            C5848d.m22929c("LottieDrawable must be inside of a view for images to work.");
            this.f34647d = new HashMap();
            this.f34644a = null;
            return;
        }
        this.f34644a = ((View) callback).getContext();
        this.f34647d = map;
        m764d(interfaceC2198b);
    }

    /* renamed from: c */
    private Bitmap m765c(String str, Bitmap bitmap) {
        synchronized (f34643e) {
            this.f34647d.get(str).m34308f(bitmap);
        }
        return bitmap;
    }

    /* renamed from: a */
    public Bitmap m767a(String str) {
        C2226g c2226g = this.f34647d.get(str);
        if (c2226g == null) {
            return null;
        }
        Bitmap m34313a = c2226g.m34313a();
        if (m34313a != null) {
            return m34313a;
        }
        InterfaceC2198b interfaceC2198b = this.f34646c;
        if (interfaceC2198b != null) {
            Bitmap m34436a = interfaceC2198b.m34436a(c2226g);
            if (m34436a != null) {
                m765c(str, m34436a);
            }
            return m34436a;
        }
        String m34312b = c2226g.m34312b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (m34312b.startsWith("data:") && m34312b.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(m34312b.substring(m34312b.indexOf(44) + 1), 0);
                return m765c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e) {
                C5848d.m22928d("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f34645b)) {
                AssetManager assets = this.f34644a.getAssets();
                try {
                    return m765c(str, C5852h.m22879l(BitmapFactory.decodeStream(assets.open(this.f34645b + m34312b), null, options), c2226g.m34309e(), c2226g.m34311c()));
                } catch (IllegalArgumentException e2) {
                    C5848d.m22928d("Unable to decode image.", e2);
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e3) {
            C5848d.m22928d("Unable to open asset.", e3);
            return null;
        }
    }

    /* renamed from: b */
    public boolean m766b(Context context) {
        return (context == null && this.f34644a == null) || this.f34644a.equals(context);
    }

    /* renamed from: d */
    public void m764d(InterfaceC2198b interfaceC2198b) {
        this.f34646c = interfaceC2198b;
    }
}

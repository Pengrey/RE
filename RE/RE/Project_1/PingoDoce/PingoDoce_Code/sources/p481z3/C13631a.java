package p481z3;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.C2197a;
import java.util.HashMap;
import java.util.Map;
import p005a4.C0022i;
import p130h4.C5848d;

/* renamed from: z3.a */
/* loaded from: classes.dex */
public class C13631a {

    /* renamed from: d */
    private final AssetManager f34641d;

    /* renamed from: a */
    private final C0022i<String> f34638a = new C0022i<>();

    /* renamed from: b */
    private final Map<C0022i<String>, Typeface> f34639b = new HashMap();

    /* renamed from: c */
    private final Map<String, Typeface> f34640c = new HashMap();

    /* renamed from: e */
    private String f34642e = ".ttf";

    public C13631a(Drawable.Callback callback, C2197a c2197a) {
        if (!(callback instanceof View)) {
            C5848d.m22929c("LottieDrawable must be inside of a view for images to work.");
            this.f34641d = null;
            return;
        }
        this.f34641d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    private Typeface m771a(String str) {
        Typeface typeface = this.f34640c.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f34641d, "fonts/" + str + this.f34642e);
        this.f34640c.put(str, createFromAsset);
        return createFromAsset;
    }

    /* renamed from: d */
    private Typeface m768d(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    /* renamed from: b */
    public Typeface m770b(String str, String str2) {
        this.f34638a.m42105b(str, str2);
        Typeface typeface = this.f34639b.get(this.f34638a);
        if (typeface != null) {
            return typeface;
        }
        Typeface m768d = m768d(m771a(str), str2);
        this.f34639b.put(this.f34638a, m768d);
        return m768d;
    }

    /* renamed from: c */
    public void m769c(C2197a c2197a) {
    }
}

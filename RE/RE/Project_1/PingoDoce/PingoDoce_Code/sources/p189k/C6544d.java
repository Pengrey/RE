package p189k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p070e.C4905i;

/* renamed from: k.d */
/* loaded from: classes.dex */
public class C6544d extends ContextWrapper {

    /* renamed from: a */
    private int f17714a;

    /* renamed from: b */
    private Resources.Theme f17715b;

    /* renamed from: c */
    private LayoutInflater f17716c;

    /* renamed from: d */
    private Configuration f17717d;

    /* renamed from: e */
    private Resources f17718e;

    public C6544d() {
        super(null);
    }

    /* renamed from: b */
    private Resources m20652b() {
        if (this.f17718e == null) {
            Configuration configuration = this.f17717d;
            if (configuration == null) {
                this.f17718e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f17718e = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration2 = new Configuration(resources.getConfiguration());
                configuration2.updateFrom(this.f17717d);
                this.f17718e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
            }
        }
        return this.f17718e;
    }

    /* renamed from: d */
    private void m20650d() {
        boolean z = this.f17715b == null;
        if (z) {
            this.f17715b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f17715b.setTo(theme);
            }
        }
        m20649e(this.f17715b, this.f17714a, z);
    }

    /* renamed from: a */
    public void m20653a(Configuration configuration) {
        if (this.f17718e == null) {
            if (this.f17717d == null) {
                this.f17717d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int m20651c() {
        return this.f17714a;
    }

    /* renamed from: e */
    protected void m20649e(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m20652b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f17716c == null) {
                this.f17716c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f17716c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f17715b;
        if (theme != null) {
            return theme;
        }
        if (this.f17714a == 0) {
            this.f17714a = C4905i.Theme_AppCompat_Light;
        }
        m20650d();
        return this.f17715b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f17714a != i) {
            this.f17714a = i;
            m20650d();
        }
    }

    public C6544d(Context context, int i) {
        super(context);
        this.f17714a = i;
    }

    public C6544d(Context context, Resources.Theme theme) {
        super(context);
        this.f17715b = theme;
    }
}

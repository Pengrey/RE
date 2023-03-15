package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0928a;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p070e.C4897a;
import p070e.C4902f;
import p212l2.AbstractC6967c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.m0 */
/* loaded from: classes.dex */
public class View$OnClickListenerC0505m0 extends AbstractC6967c implements View.OnClickListener {

    /* renamed from: H */
    private final SearchView f1682H;

    /* renamed from: I */
    private final SearchableInfo f1683I;

    /* renamed from: J */
    private final Context f1684J;

    /* renamed from: K */
    private final WeakHashMap<String, Drawable.ConstantState> f1685K;

    /* renamed from: L */
    private final int f1686L;

    /* renamed from: M */
    private boolean f1687M;

    /* renamed from: N */
    private int f1688N;

    /* renamed from: O */
    private ColorStateList f1689O;

    /* renamed from: P */
    private int f1690P;

    /* renamed from: Q */
    private int f1691Q;

    /* renamed from: R */
    private int f1692R;

    /* renamed from: S */
    private int f1693S;

    /* renamed from: T */
    private int f1694T;

    /* renamed from: U */
    private int f1695U;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SuggestionsAdapter.java */
    /* renamed from: androidx.appcompat.widget.m0$a */
    /* loaded from: classes.dex */
    public static final class C0506a {

        /* renamed from: a */
        public final TextView f1696a;

        /* renamed from: b */
        public final TextView f1697b;

        /* renamed from: c */
        public final ImageView f1698c;

        /* renamed from: d */
        public final ImageView f1699d;

        /* renamed from: e */
        public final ImageView f1700e;

        public C0506a(View view) {
            this.f1696a = (TextView) view.findViewById(16908308);
            this.f1697b = (TextView) view.findViewById(16908309);
            this.f1698c = (ImageView) view.findViewById(16908295);
            this.f1699d = (ImageView) view.findViewById(16908296);
            this.f1700e = (ImageView) view.findViewById(C4902f.edit_query);
        }
    }

    public View$OnClickListenerC0505m0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1687M = false;
        this.f1688N = 1;
        this.f1690P = -1;
        this.f1691Q = -1;
        this.f1692R = -1;
        this.f1693S = -1;
        this.f1694T = -1;
        this.f1695U = -1;
        this.f1682H = searchView;
        this.f1683I = searchableInfo;
        this.f1686L = searchView.getSuggestionCommitIconResId();
        this.f1684J = context;
        this.f1685K = weakHashMap;
    }

    /* renamed from: A */
    private void m40513A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1685K.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    private void m40512B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* renamed from: k */
    private Drawable m40511k(String str) {
        Drawable.ConstantState constantState = this.f1685K.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    private CharSequence m40510l(CharSequence charSequence) {
        if (this.f1689O == null) {
            TypedValue typedValue = new TypedValue();
            this.f1684J.getTheme().resolveAttribute(C4897a.textColorSearchUrl, typedValue, true);
            this.f1689O = this.f1684J.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1689O, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    private Drawable m40509m(ComponentName componentName) {
        PackageManager packageManager = this.f1684J.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: n */
    private Drawable m40508n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (this.f1685K.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState = this.f1685K.get(flattenToShortString);
            if (constantState == null) {
                return null;
            }
            return constantState.newDrawable(this.f1684J.getResources());
        }
        Drawable m40509m = m40509m(componentName);
        this.f1685K.put(flattenToShortString, m40509m != null ? m40509m.getConstantState() : null);
        return m40509m;
    }

    /* renamed from: o */
    public static String m40507o(Cursor cursor, String str) {
        return m40499w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: p */
    private Drawable m40506p() {
        Drawable m40508n = m40508n(this.f1683I.getSearchActivity());
        return m40508n != null ? m40508n : this.f1684J.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: q */
    private Drawable m40505q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m40504r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1684J.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    openInputStream.close();
                } catch (IOException e) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                }
                return createFromStream;
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (FileNotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
        return null;
    }

    /* renamed from: s */
    private Drawable m40503s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1684J.getPackageName() + "/" + parseInt;
            Drawable m40511k = m40511k(str2);
            if (m40511k != null) {
                return m40511k;
            }
            Drawable m39111f = C0928a.m39111f(this.f1684J, parseInt);
            m40513A(str2, m39111f);
            return m39111f;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m40511k2 = m40511k(str);
            if (m40511k2 != null) {
                return m40511k2;
            }
            Drawable m40505q = m40505q(Uri.parse(str));
            m40513A(str, m40505q);
            return m40505q;
        }
    }

    /* renamed from: t */
    private Drawable m40502t(Cursor cursor) {
        int i = this.f1693S;
        if (i == -1) {
            return null;
        }
        Drawable m40503s = m40503s(cursor.getString(i));
        return m40503s != null ? m40503s : m40506p();
    }

    /* renamed from: u */
    private Drawable m40501u(Cursor cursor) {
        int i = this.f1694T;
        if (i == -1) {
            return null;
        }
        return m40503s(cursor.getString(i));
    }

    /* renamed from: w */
    private static String m40499w(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: y */
    private void m40497y(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    private void m40496z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // p212l2.AbstractC6962a, p212l2.C6965b.InterfaceC6966a
    /* renamed from: a */
    public void mo19696a(Cursor cursor) {
        if (this.f1687M) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo19696a(cursor);
            if (cursor != null) {
                this.f1690P = cursor.getColumnIndex("suggest_text_1");
                this.f1691Q = cursor.getColumnIndex("suggest_text_2");
                this.f1692R = cursor.getColumnIndex("suggest_text_2_url");
                this.f1693S = cursor.getColumnIndex("suggest_icon_1");
                this.f1694T = cursor.getColumnIndex("suggest_icon_2");
                this.f1695U = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // p212l2.AbstractC6962a, p212l2.C6965b.InterfaceC6966a
    /* renamed from: c */
    public CharSequence mo19694c(Cursor cursor) {
        String m40507o;
        String m40507o2;
        if (cursor == null) {
            return null;
        }
        String m40507o3 = m40507o(cursor, "suggest_intent_query");
        if (m40507o3 != null) {
            return m40507o3;
        }
        if (!this.f1683I.shouldRewriteQueryFromData() || (m40507o2 = m40507o(cursor, "suggest_intent_data")) == null) {
            if (!this.f1683I.shouldRewriteQueryFromText() || (m40507o = m40507o(cursor, "suggest_text_1")) == null) {
                return null;
            }
            return m40507o;
        }
        return m40507o2;
    }

    @Override // p212l2.C6965b.InterfaceC6966a
    /* renamed from: d */
    public Cursor mo19693d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? BuildConfig.VERSION_NAME : charSequence.toString();
        if (this.f1682H.getVisibility() == 0 && this.f1682H.getWindowVisibility() == 0) {
            try {
                Cursor m40500v = m40500v(this.f1683I, charSequence2, 50);
                if (m40500v != null) {
                    m40500v.getCount();
                    return m40500v;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    @Override // p212l2.AbstractC6962a
    /* renamed from: e */
    public void mo19700e(View view, Context context, Cursor cursor) {
        CharSequence m40499w;
        C0506a c0506a = (C0506a) view.getTag();
        int i = this.f1695U;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (c0506a.f1696a != null) {
            m40496z(c0506a.f1696a, m40499w(cursor, this.f1690P));
        }
        if (c0506a.f1697b != null) {
            String m40499w2 = m40499w(cursor, this.f1692R);
            if (m40499w2 != null) {
                m40499w = m40510l(m40499w2);
            } else {
                m40499w = m40499w(cursor, this.f1691Q);
            }
            if (TextUtils.isEmpty(m40499w)) {
                TextView textView = c0506a.f1696a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    c0506a.f1696a.setMaxLines(2);
                }
            } else {
                TextView textView2 = c0506a.f1696a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    c0506a.f1696a.setMaxLines(1);
                }
            }
            m40496z(c0506a.f1697b, m40499w);
        }
        ImageView imageView = c0506a.f1698c;
        if (imageView != null) {
            m40497y(imageView, m40502t(cursor), 4);
        }
        ImageView imageView2 = c0506a.f1699d;
        if (imageView2 != null) {
            m40497y(imageView2, m40501u(cursor), 8);
        }
        int i3 = this.f1688N;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            c0506a.f1700e.setVisibility(8);
            return;
        }
        c0506a.f1700e.setVisibility(0);
        c0506a.f1700e.setTag(c0506a.f1696a.getText());
        c0506a.f1700e.setOnClickListener(this);
    }

    @Override // p212l2.AbstractC6962a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo19692g = mo19692g(this.f1684J, mo19695b(), viewGroup);
            if (mo19692g != null) {
                ((C0506a) mo19692g.getTag()).f1696a.setText(e.toString());
            }
            return mo19692g;
        }
    }

    @Override // p212l2.AbstractC6962a, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo19691h = mo19691h(this.f1684J, mo19695b(), viewGroup);
            if (mo19691h != null) {
                ((C0506a) mo19691h.getTag()).f1696a.setText(e.toString());
            }
            return mo19691h;
        }
    }

    @Override // p212l2.AbstractC6967c, p212l2.AbstractC6962a
    /* renamed from: h */
    public View mo19691h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo19691h = super.mo19691h(context, cursor, viewGroup);
        mo19691h.setTag(new C0506a(mo19691h));
        ((ImageView) mo19691h.findViewById(C4902f.edit_query)).setImageResource(this.f1686L);
        return mo19691h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m40512B(mo19695b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m40512B(mo19695b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1682H.m40785U((CharSequence) tag);
        }
    }

    /* renamed from: r */
    Drawable m40504r(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1684J.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* renamed from: v */
    Cursor m40500v(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(BuildConfig.VERSION_NAME).fragment(BuildConfig.VERSION_NAME);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1684J.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: x */
    public void m40498x(int i) {
        this.f1688N = i;
    }
}

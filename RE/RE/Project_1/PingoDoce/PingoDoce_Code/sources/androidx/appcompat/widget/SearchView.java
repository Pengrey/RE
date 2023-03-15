package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.C1112b0;
import androidx.customview.view.AbsSavedState;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p070e.C4897a;
import p070e.C4900d;
import p070e.C4902f;
import p070e.C4903g;
import p070e.C4904h;
import p070e.C4906j;
import p189k.InterfaceC6543c;
import p212l2.AbstractC6962a;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements InterfaceC6543c {

    /* renamed from: M0 */
    static final C0441n f1336M0;

    /* renamed from: A0 */
    private int f1337A0;

    /* renamed from: B0 */
    SearchableInfo f1338B0;

    /* renamed from: C0 */
    private Bundle f1339C0;

    /* renamed from: D0 */
    private final Runnable f1340D0;

    /* renamed from: E0 */
    private Runnable f1341E0;

    /* renamed from: F0 */
    private final WeakHashMap<String, Drawable.ConstantState> f1342F0;

    /* renamed from: G0 */
    private final View.OnClickListener f1343G0;

    /* renamed from: H0 */
    View.OnKeyListener f1344H0;

    /* renamed from: I0 */
    private final TextView.OnEditorActionListener f1345I0;

    /* renamed from: J0 */
    private final AdapterView.OnItemClickListener f1346J0;

    /* renamed from: K0 */
    private final AdapterView.OnItemSelectedListener f1347K0;

    /* renamed from: L */
    final SearchAutoComplete f1348L;

    /* renamed from: L0 */
    private TextWatcher f1349L0;

    /* renamed from: M */
    private final View f1350M;

    /* renamed from: N */
    private final View f1351N;

    /* renamed from: O */
    private final View f1352O;

    /* renamed from: P */
    final ImageView f1353P;

    /* renamed from: Q */
    final ImageView f1354Q;

    /* renamed from: R */
    final ImageView f1355R;

    /* renamed from: S */
    final ImageView f1356S;

    /* renamed from: T */
    private final View f1357T;

    /* renamed from: U */
    private C0442o f1358U;

    /* renamed from: V */
    private Rect f1359V;

    /* renamed from: W */
    private Rect f1360W;

    /* renamed from: a0 */
    private int[] f1361a0;

    /* renamed from: b0 */
    private int[] f1362b0;

    /* renamed from: c0 */
    private final ImageView f1363c0;

    /* renamed from: d0 */
    private final Drawable f1364d0;

    /* renamed from: e0 */
    private final int f1365e0;

    /* renamed from: f0 */
    private final int f1366f0;

    /* renamed from: g0 */
    private final Intent f1367g0;

    /* renamed from: h0 */
    private final Intent f1368h0;

    /* renamed from: i0 */
    private final CharSequence f1369i0;

    /* renamed from: j0 */
    private InterfaceC0439l f1370j0;

    /* renamed from: k0 */
    private InterfaceC0438k f1371k0;

    /* renamed from: l0 */
    View.OnFocusChangeListener f1372l0;

    /* renamed from: m0 */
    private InterfaceC0440m f1373m0;

    /* renamed from: n0 */
    private View.OnClickListener f1374n0;

    /* renamed from: o0 */
    private boolean f1375o0;

    /* renamed from: p0 */
    private boolean f1376p0;

    /* renamed from: q0 */
    AbstractC6962a f1377q0;

    /* renamed from: r0 */
    private boolean f1378r0;

    /* renamed from: s0 */
    private CharSequence f1379s0;

    /* renamed from: t0 */
    private boolean f1380t0;

    /* renamed from: u0 */
    private boolean f1381u0;

    /* renamed from: v0 */
    private int f1382v0;

    /* renamed from: w0 */
    private boolean f1383w0;

    /* renamed from: x0 */
    private CharSequence f1384x0;

    /* renamed from: y0 */
    private CharSequence f1385y0;

    /* renamed from: z0 */
    private boolean f1386z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0426a();

        /* renamed from: y */
        boolean f1387y;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        /* loaded from: classes.dex */
        class C0426a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0426a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState mo40767a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState mo40766b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] mo40765c(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1387y + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1387y));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1387y = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C0459c {

        /* renamed from: A */
        private SearchView f1388A;

        /* renamed from: B */
        private boolean f1389B;

        /* renamed from: C */
        final Runnable f1390C;

        /* renamed from: z */
        private int f1391z;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: classes.dex */
        class RunnableC0427a implements Runnable {
            RunnableC0427a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m40762c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C4897a.f13367p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                if (i < 600) {
                    return (i < 640 || i2 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        /* renamed from: a */
        void m40764a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1336M0.m40754c(this);
        }

        /* renamed from: b */
        boolean m40763b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: c */
        void m40762c() {
            if (this.f1389B) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1389B = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1391z <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0459c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1389B) {
                removeCallbacks(this.f1390C);
                post(this.f1390C);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1388A.m40780Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1388A.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1388A.hasFocus() && getVisibility() == 0) {
                this.f1389B = true;
                if (SearchView.m40793M(getContext())) {
                    m40764a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1389B = false;
                removeCallbacks(this.f1390C);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1389B = false;
                removeCallbacks(this.f1390C);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1389B = true;
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1388A = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1391z = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1390C = new RunnableC0427a();
            this.f1391z = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    /* loaded from: classes.dex */
    class C0428a implements TextWatcher {
        C0428a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.m40781Y(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    /* loaded from: classes.dex */
    class RunnableC0429b implements Runnable {
        RunnableC0429b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m40774f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    /* loaded from: classes.dex */
    class RunnableC0430c implements Runnable {
        RunnableC0430c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC6962a abstractC6962a = SearchView.this.f1377q0;
            if (abstractC6962a instanceof View$OnClickListenerC0505m0) {
                abstractC6962a.mo19696a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    /* loaded from: classes.dex */
    class View$OnFocusChangeListenerC0431d implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC0431d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1372l0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    /* loaded from: classes.dex */
    class View$OnLayoutChangeListenerC0432e implements View.OnLayoutChangeListener {
        View$OnLayoutChangeListenerC0432e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.m40804B();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0433f implements View.OnClickListener {
        View$OnClickListenerC0433f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1353P) {
                searchView.m40784V();
            } else if (view == searchView.f1355R) {
                searchView.m40788R();
            } else if (view == searchView.f1354Q) {
                searchView.m40783W();
            } else if (view == searchView.f1356S) {
                searchView.m40779a0();
            } else if (view == searchView.f1348L) {
                searchView.m40798H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    /* loaded from: classes.dex */
    class View$OnKeyListenerC0434g implements View.OnKeyListener {
        View$OnKeyListenerC0434g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1338B0 == null) {
                return false;
            }
            if (searchView.f1348L.isPopupShowing() && SearchView.this.f1348L.getListSelection() != -1) {
                return SearchView.this.m40782X(view, i, keyEvent);
            }
            if (!SearchView.this.f1348L.m40763b() && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.m40790P(0, null, searchView2.f1348L.getText().toString());
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    /* loaded from: classes.dex */
    class C0435h implements TextView.OnEditorActionListener {
        C0435h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m40783W();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    /* loaded from: classes.dex */
    class C0436i implements AdapterView.OnItemClickListener {
        C0436i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m40787S(i, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    /* loaded from: classes.dex */
    class C0437j implements AdapterView.OnItemSelectedListener {
        C0437j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m40786T(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    /* loaded from: classes.dex */
    public interface InterfaceC0438k {
        /* renamed from: a */
        boolean m40761a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    /* loaded from: classes.dex */
    public interface InterfaceC0439l {
        /* renamed from: a */
        boolean mo40760a(String str);

        /* renamed from: b */
        boolean mo40759b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    /* loaded from: classes.dex */
    public interface InterfaceC0440m {
        /* renamed from: a */
        boolean m40758a(int i);

        /* renamed from: b */
        boolean m40757b(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.SearchView$n */
    /* loaded from: classes.dex */
    public static class C0441n {

        /* renamed from: a */
        private Method f1403a;

        /* renamed from: b */
        private Method f1404b;

        /* renamed from: c */
        private Method f1405c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        C0441n() {
            this.f1403a = null;
            this.f1404b = null;
            this.f1405c = null;
            m40753d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1403a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1404b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1405c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m40753d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* renamed from: a */
        void m40756a(AutoCompleteTextView autoCompleteTextView) {
            m40753d();
            Method method = this.f1404b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        void m40755b(AutoCompleteTextView autoCompleteTextView) {
            m40753d();
            Method method = this.f1403a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        void m40754c(AutoCompleteTextView autoCompleteTextView) {
            m40753d();
            Method method = this.f1405c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    /* loaded from: classes.dex */
    private static class C0442o extends TouchDelegate {

        /* renamed from: a */
        private final View f1406a;

        /* renamed from: b */
        private final Rect f1407b;

        /* renamed from: c */
        private final Rect f1408c;

        /* renamed from: d */
        private final Rect f1409d;

        /* renamed from: e */
        private final int f1410e;

        /* renamed from: f */
        private boolean f1411f;

        public C0442o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1410e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1407b = new Rect();
            this.f1409d = new Rect();
            this.f1408c = new Rect();
            m40752a(rect, rect2);
            this.f1406a = view;
        }

        /* renamed from: a */
        public void m40752a(Rect rect, Rect rect2) {
            this.f1407b.set(rect);
            this.f1409d.set(rect);
            Rect rect3 = this.f1409d;
            int i = this.f1410e;
            rect3.inset(-i, -i);
            this.f1408c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f1411f;
                    if (z2 && !this.f1409d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f1411f;
                        this.f1411f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f1407b.contains(x, y)) {
                    this.f1411f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (z3) {
                if (z && !this.f1408c.contains(x, y)) {
                    motionEvent.setLocation(this.f1406a.getWidth() / 2, this.f1406a.getHeight() / 2);
                } else {
                    Rect rect = this.f1408c;
                    motionEvent.setLocation(x - rect.left, y - rect.top);
                }
                return this.f1406a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        f1336M0 = Build.VERSION.SDK_INT < 29 ? new C0441n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* renamed from: C */
    private Intent m40803C(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1385y0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1339C0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1338B0.getSearchActivity());
        return intent;
    }

    /* renamed from: D */
    private Intent m40802D(Cursor cursor, int i, String str) {
        int i2;
        String m40507o;
        try {
            String m40507o2 = View$OnClickListenerC0505m0.m40507o(cursor, "suggest_intent_action");
            if (m40507o2 == null) {
                m40507o2 = this.f1338B0.getSuggestIntentAction();
            }
            if (m40507o2 == null) {
                m40507o2 = "android.intent.action.SEARCH";
            }
            String str2 = m40507o2;
            String m40507o3 = View$OnClickListenerC0505m0.m40507o(cursor, "suggest_intent_data");
            if (m40507o3 == null) {
                m40507o3 = this.f1338B0.getSuggestIntentData();
            }
            if (m40507o3 != null && (m40507o = View$OnClickListenerC0505m0.m40507o(cursor, "suggest_intent_data_id")) != null) {
                m40507o3 = m40507o3 + "/" + Uri.encode(m40507o);
            }
            return m40803C(str2, m40507o3 == null ? null : Uri.parse(m40507o3), View$OnClickListenerC0505m0.m40507o(cursor, "suggest_intent_extra_data"), View$OnClickListenerC0505m0.m40507o(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: E */
    private Intent m40801E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1339C0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: F */
    private Intent m40800F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: G */
    private void m40799G() {
        this.f1348L.dismissDropDown();
    }

    /* renamed from: I */
    private void m40797I(View view, Rect rect) {
        view.getLocationInWindow(this.f1361a0);
        getLocationInWindow(this.f1362b0);
        int[] iArr = this.f1361a0;
        int i = iArr[1];
        int[] iArr2 = this.f1362b0;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: J */
    private CharSequence m40796J(CharSequence charSequence) {
        if (!this.f1375o0 || this.f1364d0 == null) {
            return charSequence;
        }
        int textSize = (int) (this.f1348L.getTextSize() * 1.25d);
        this.f1364d0.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1364d0), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: K */
    private boolean m40795K() {
        SearchableInfo searchableInfo = this.f1338B0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1338B0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1367g0;
        } else if (this.f1338B0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1368h0;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: M */
    static boolean m40793M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: N */
    private boolean m40792N() {
        return (this.f1378r0 || this.f1383w0) && !m40794L();
    }

    /* renamed from: O */
    private void m40791O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e) {
            Log.e("SearchView", "Failed launch activity: " + intent, e);
        }
    }

    /* renamed from: Q */
    private boolean m40789Q(int i, int i2, String str) {
        Cursor mo19695b = this.f1377q0.mo19695b();
        if (mo19695b == null || !mo19695b.moveToPosition(i)) {
            return false;
        }
        m40791O(m40802D(mo19695b, i2, str));
        return true;
    }

    /* renamed from: b0 */
    private void m40778b0() {
        post(this.f1340D0);
    }

    /* renamed from: c0 */
    private void m40777c0(int i) {
        Editable text = this.f1348L.getText();
        Cursor mo19695b = this.f1377q0.mo19695b();
        if (mo19695b == null) {
            return;
        }
        if (mo19695b.moveToPosition(i)) {
            CharSequence mo19694c = this.f1377q0.mo19694c(mo19695b);
            if (mo19694c != null) {
                setQuery(mo19694c);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    /* renamed from: e0 */
    private void m40775e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1348L.getText());
        if (!z2 && (!this.f1375o0 || this.f1386z0)) {
            z = false;
        }
        this.f1355R.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f1355R.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: g0 */
    private void m40773g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1348L;
        if (queryHint == null) {
            queryHint = BuildConfig.VERSION_NAME;
        }
        searchAutoComplete.setHint(m40796J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C4900d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C4900d.abc_search_view_preferred_width);
    }

    /* renamed from: h0 */
    private void m40772h0() {
        this.f1348L.setThreshold(this.f1338B0.getSuggestThreshold());
        this.f1348L.setImeOptions(this.f1338B0.getImeOptions());
        int inputType = this.f1338B0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1338B0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1348L.setInputType(inputType);
        AbstractC6962a abstractC6962a = this.f1377q0;
        if (abstractC6962a != null) {
            abstractC6962a.mo19696a(null);
        }
        if (this.f1338B0.getSuggestAuthority() != null) {
            View$OnClickListenerC0505m0 view$OnClickListenerC0505m0 = new View$OnClickListenerC0505m0(getContext(), this, this.f1338B0, this.f1342F0);
            this.f1377q0 = view$OnClickListenerC0505m0;
            this.f1348L.setAdapter(view$OnClickListenerC0505m0);
            ((View$OnClickListenerC0505m0) this.f1377q0).m40498x(this.f1380t0 ? 2 : 1);
        }
    }

    /* renamed from: i0 */
    private void m40771i0() {
        this.f1352O.setVisibility((m40792N() && (this.f1354Q.getVisibility() == 0 || this.f1356S.getVisibility() == 0)) ? 0 : 8);
    }

    /* renamed from: j0 */
    private void m40770j0(boolean z) {
        this.f1354Q.setVisibility((this.f1378r0 && m40792N() && hasFocus() && (z || !this.f1383w0)) ? 0 : 8);
    }

    /* renamed from: k0 */
    private void m40769k0(boolean z) {
        this.f1376p0 = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f1348L.getText());
        this.f1353P.setVisibility(i2);
        m40770j0(z2);
        this.f1350M.setVisibility(z ? 8 : 0);
        if (this.f1363c0.getDrawable() == null || this.f1375o0) {
            i = 8;
        }
        this.f1363c0.setVisibility(i);
        m40775e0();
        m40768l0(!z2);
        m40771i0();
    }

    /* renamed from: l0 */
    private void m40768l0(boolean z) {
        int i = 8;
        if (this.f1383w0 && !m40794L() && z) {
            this.f1354Q.setVisibility(8);
            i = 0;
        }
        this.f1356S.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1348L.setText(charSequence);
        this.f1348L.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: B */
    void m40804B() {
        int i;
        if (this.f1357T.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1351N.getPaddingLeft();
            Rect rect = new Rect();
            boolean m40330b = C0541y0.m40330b(this);
            int dimensionPixelSize = this.f1375o0 ? resources.getDimensionPixelSize(C4900d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C4900d.abc_dropdownitem_text_padding_left) : 0;
            this.f1348L.getDropDownBackground().getPadding(rect);
            if (m40330b) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f1348L.setDropDownHorizontalOffset(i);
            this.f1348L.setDropDownWidth((((this.f1357T.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* renamed from: H */
    void m40798H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1348L.refreshAutoCompleteResults();
            return;
        }
        C0441n c0441n = f1336M0;
        c0441n.m40755b(this.f1348L);
        c0441n.m40756a(this.f1348L);
    }

    /* renamed from: L */
    public boolean m40794L() {
        return this.f1376p0;
    }

    /* renamed from: P */
    void m40790P(int i, String str, String str2) {
        getContext().startActivity(m40803C("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: R */
    void m40788R() {
        if (TextUtils.isEmpty(this.f1348L.getText())) {
            if (this.f1375o0) {
                InterfaceC0438k interfaceC0438k = this.f1371k0;
                if (interfaceC0438k == null || !interfaceC0438k.m40761a()) {
                    clearFocus();
                    m40769k0(true);
                    return;
                }
                return;
            }
            return;
        }
        this.f1348L.setText(BuildConfig.VERSION_NAME);
        this.f1348L.requestFocus();
        this.f1348L.setImeVisibility(true);
    }

    /* renamed from: S */
    boolean m40787S(int i, int i2, String str) {
        InterfaceC0440m interfaceC0440m = this.f1373m0;
        if (interfaceC0440m == null || !interfaceC0440m.m40757b(i)) {
            m40789Q(i, 0, null);
            this.f1348L.setImeVisibility(false);
            m40799G();
            return true;
        }
        return false;
    }

    /* renamed from: T */
    boolean m40786T(int i) {
        InterfaceC0440m interfaceC0440m = this.f1373m0;
        if (interfaceC0440m == null || !interfaceC0440m.m40758a(i)) {
            m40777c0(i);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m40785U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: V */
    void m40784V() {
        m40769k0(false);
        this.f1348L.requestFocus();
        this.f1348L.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1374n0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: W */
    void m40783W() {
        Editable text = this.f1348L.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0439l interfaceC0439l = this.f1370j0;
        if (interfaceC0439l == null || !interfaceC0439l.mo40759b(text.toString())) {
            if (this.f1338B0 != null) {
                m40790P(0, null, text.toString());
            }
            this.f1348L.setImeVisibility(false);
            m40799G();
        }
    }

    /* renamed from: X */
    boolean m40782X(View view, int i, KeyEvent keyEvent) {
        if (this.f1338B0 != null && this.f1377q0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m40787S(this.f1348L.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22) {
                this.f1348L.setSelection(i == 21 ? 0 : this.f1348L.length());
                this.f1348L.setListSelection(0);
                this.f1348L.clearListSelection();
                this.f1348L.m40764a();
                return true;
            } else if (i == 19) {
                this.f1348L.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* renamed from: Y */
    void m40781Y(CharSequence charSequence) {
        Editable text = this.f1348L.getText();
        this.f1385y0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m40770j0(z);
        m40768l0(!z);
        m40775e0();
        m40771i0();
        if (this.f1370j0 != null && !TextUtils.equals(charSequence, this.f1384x0)) {
            this.f1370j0.mo40760a(charSequence.toString());
        }
        this.f1384x0 = charSequence.toString();
    }

    /* renamed from: Z */
    void m40780Z() {
        m40769k0(m40794L());
        m40778b0();
        if (this.f1348L.hasFocus()) {
            m40798H();
        }
    }

    /* renamed from: a0 */
    void m40779a0() {
        SearchableInfo searchableInfo = this.f1338B0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(m40800F(this.f1367g0, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(m40801E(this.f1368h0, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // p189k.InterfaceC6543c
    /* renamed from: c */
    public void mo19712c() {
        if (this.f1386z0) {
            return;
        }
        this.f1386z0 = true;
        int imeOptions = this.f1348L.getImeOptions();
        this.f1337A0 = imeOptions;
        this.f1348L.setImeOptions(imeOptions | 33554432);
        this.f1348L.setText(BuildConfig.VERSION_NAME);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1381u0 = true;
        super.clearFocus();
        this.f1348L.clearFocus();
        this.f1348L.setImeVisibility(false);
        this.f1381u0 = false;
    }

    /* renamed from: d0 */
    public void m40776d0(CharSequence charSequence, boolean z) {
        this.f1348L.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1348L;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1385y0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m40783W();
    }

    @Override // p189k.InterfaceC6543c
    /* renamed from: f */
    public void mo19711f() {
        m40776d0(BuildConfig.VERSION_NAME, false);
        clearFocus();
        m40769k0(true);
        this.f1348L.setImeOptions(this.f1337A0);
        this.f1386z0 = false;
    }

    /* renamed from: f0 */
    void m40774f0() {
        int[] iArr = this.f1348L.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1351N.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1352O.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1348L.getImeOptions();
    }

    public int getInputType() {
        return this.f1348L.getInputType();
    }

    public int getMaxWidth() {
        return this.f1382v0;
    }

    public CharSequence getQuery() {
        return this.f1348L.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1379s0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1338B0;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.f1338B0.getHintId());
        }
        return this.f1369i0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f1366f0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f1365e0;
    }

    public AbstractC6962a getSuggestionsAdapter() {
        return this.f1377q0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1340D0);
        post(this.f1341E0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m40797I(this.f1348L, this.f1359V);
            Rect rect = this.f1360W;
            Rect rect2 = this.f1359V;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0442o c0442o = this.f1358U;
            if (c0442o == null) {
                C0442o c0442o2 = new C0442o(this.f1360W, this.f1359V, this.f1348L);
                this.f1358U = c0442o2;
                setTouchDelegate(c0442o2);
                return;
            }
            c0442o.m40752a(this.f1360W, this.f1359V);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        if (m40794L()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f1382v0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1382v0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f1382v0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m37835a());
        m40769k0(savedState.f1387y);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1387y = m40794L();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m40778b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (!this.f1381u0 && isFocusable()) {
            if (!m40794L()) {
                boolean requestFocus = this.f1348L.requestFocus(i, rect);
                if (requestFocus) {
                    m40769k0(false);
                }
                return requestFocus;
            }
            return super.requestFocus(i, rect);
        }
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1339C0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m40788R();
        } else {
            m40784V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1375o0 == z) {
            return;
        }
        this.f1375o0 = z;
        m40769k0(z);
        m40773g0();
    }

    public void setImeOptions(int i) {
        this.f1348L.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1348L.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1382v0 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0438k interfaceC0438k) {
        this.f1371k0 = interfaceC0438k;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1372l0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0439l interfaceC0439l) {
        this.f1370j0 = interfaceC0439l;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1374n0 = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0440m interfaceC0440m) {
        this.f1373m0 = interfaceC0440m;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1379s0 = charSequence;
        m40773g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1380t0 = z;
        AbstractC6962a abstractC6962a = this.f1377q0;
        if (abstractC6962a instanceof View$OnClickListenerC0505m0) {
            ((View$OnClickListenerC0505m0) abstractC6962a).m40498x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1338B0 = searchableInfo;
        if (searchableInfo != null) {
            m40772h0();
            m40773g0();
        }
        boolean m40795K = m40795K();
        this.f1383w0 = m40795K;
        if (m40795K) {
            this.f1348L.setPrivateImeOptions("nm");
        }
        m40769k0(m40794L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1378r0 = z;
        m40769k0(m40794L());
    }

    public void setSuggestionsAdapter(AbstractC6962a abstractC6962a) {
        this.f1377q0 = abstractC6962a;
        this.f1348L.setAdapter(abstractC6962a);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4897a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1359V = new Rect();
        this.f1360W = new Rect();
        this.f1361a0 = new int[2];
        this.f1362b0 = new int[2];
        this.f1340D0 = new RunnableC0429b();
        this.f1341E0 = new RunnableC0430c();
        this.f1342F0 = new WeakHashMap<>();
        View$OnClickListenerC0433f view$OnClickListenerC0433f = new View$OnClickListenerC0433f();
        this.f1343G0 = view$OnClickListenerC0433f;
        this.f1344H0 = new View$OnKeyListenerC0434g();
        C0435h c0435h = new C0435h();
        this.f1345I0 = c0435h;
        C0436i c0436i = new C0436i();
        this.f1346J0 = c0436i;
        C0437j c0437j = new C0437j();
        this.f1347K0 = c0437j;
        this.f1349L0 = new C0428a();
        C0520s0 m40453v = C0520s0.m40453v(context, attributeSet, C4906j.f13465T1, i, 0);
        LayoutInflater.from(context).inflate(m40453v.m40461n(C4906j.f13509d2, C4903g.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C4902f.search_src_text);
        this.f1348L = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1350M = findViewById(C4902f.search_edit_frame);
        View findViewById = findViewById(C4902f.search_plate);
        this.f1351N = findViewById;
        View findViewById2 = findViewById(C4902f.submit_area);
        this.f1352O = findViewById2;
        ImageView imageView = (ImageView) findViewById(C4902f.search_button);
        this.f1353P = imageView;
        ImageView imageView2 = (ImageView) findViewById(C4902f.search_go_btn);
        this.f1354Q = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C4902f.search_close_btn);
        this.f1355R = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C4902f.search_voice_btn);
        this.f1356S = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C4902f.search_mag_icon);
        this.f1363c0 = imageView5;
        C1112b0.m38399v0(findViewById, m40453v.m40468g(C4906j.f13514e2));
        C1112b0.m38399v0(findViewById2, m40453v.m40468g(C4906j.f13534i2));
        int i2 = C4906j.f13529h2;
        imageView.setImageDrawable(m40453v.m40468g(i2));
        imageView2.setImageDrawable(m40453v.m40468g(C4906j.f13499b2));
        imageView3.setImageDrawable(m40453v.m40468g(C4906j.f13485Y1));
        imageView4.setImageDrawable(m40453v.m40468g(C4906j.f13544k2));
        imageView5.setImageDrawable(m40453v.m40468g(i2));
        this.f1364d0 = m40453v.m40468g(C4906j.f13524g2);
        C0526u0.m40411a(imageView, getResources().getString(C4904h.abc_searchview_description_search));
        this.f1365e0 = m40453v.m40461n(C4906j.f13539j2, C4903g.abc_search_dropdown_item_icons_2line);
        this.f1366f0 = m40453v.m40461n(C4906j.f13489Z1, 0);
        imageView.setOnClickListener(view$OnClickListenerC0433f);
        imageView3.setOnClickListener(view$OnClickListenerC0433f);
        imageView2.setOnClickListener(view$OnClickListenerC0433f);
        imageView4.setOnClickListener(view$OnClickListenerC0433f);
        searchAutoComplete.setOnClickListener(view$OnClickListenerC0433f);
        searchAutoComplete.addTextChangedListener(this.f1349L0);
        searchAutoComplete.setOnEditorActionListener(c0435h);
        searchAutoComplete.setOnItemClickListener(c0436i);
        searchAutoComplete.setOnItemSelectedListener(c0437j);
        searchAutoComplete.setOnKeyListener(this.f1344H0);
        searchAutoComplete.setOnFocusChangeListener(new View$OnFocusChangeListenerC0431d());
        setIconifiedByDefault(m40453v.m40474a(C4906j.f13504c2, true));
        int m40469f = m40453v.m40469f(C4906j.f13473V1, -1);
        if (m40469f != -1) {
            setMaxWidth(m40469f);
        }
        this.f1369i0 = m40453v.m40459p(C4906j.f13494a2);
        this.f1379s0 = m40453v.m40459p(C4906j.f13519f2);
        int m40464k = m40453v.m40464k(C4906j.f13481X1, -1);
        if (m40464k != -1) {
            setImeOptions(m40464k);
        }
        int m40464k2 = m40453v.m40464k(C4906j.f13477W1, -1);
        if (m40464k2 != -1) {
            setInputType(m40464k2);
        }
        setFocusable(m40453v.m40474a(C4906j.f13469U1, true));
        m40453v.m40452w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1367g0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1368h0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1357T = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0432e());
        }
        m40769k0(this.f1375o0);
        m40773g0();
    }
}

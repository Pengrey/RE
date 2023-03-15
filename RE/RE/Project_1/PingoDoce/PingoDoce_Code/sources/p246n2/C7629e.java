package p246n2;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.TextView;
import androidx.databinding.InterfaceC1276g;
import p287p2.C8399a;

/* renamed from: n2.e */
/* loaded from: classes.dex */
public class C7629e {

    /* compiled from: TextViewBindingAdapter.java */
    /* renamed from: n2.e$a */
    /* loaded from: classes.dex */
    class C7630a implements TextWatcher {

        /* renamed from: w */
        final /* synthetic */ InterfaceC7632c f20190w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC7633d f20191x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC1276g f20192y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC7631b f20193z;

        C7630a(InterfaceC7632c interfaceC7632c, InterfaceC7633d interfaceC7633d, InterfaceC1276g interfaceC1276g, InterfaceC7631b interfaceC7631b) {
            this.f20190w = interfaceC7632c;
            this.f20191x = interfaceC7633d;
            this.f20192y = interfaceC1276g;
            this.f20193z = interfaceC7631b;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            InterfaceC7631b interfaceC7631b = this.f20193z;
            if (interfaceC7631b != null) {
                interfaceC7631b.afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            InterfaceC7632c interfaceC7632c = this.f20190w;
            if (interfaceC7632c != null) {
                interfaceC7632c.beforeTextChanged(charSequence, i, i2, i3);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            InterfaceC7633d interfaceC7633d = this.f20191x;
            if (interfaceC7633d != null) {
                interfaceC7633d.onTextChanged(charSequence, i, i2, i3);
            }
            InterfaceC1276g interfaceC1276g = this.f20192y;
            if (interfaceC1276g != null) {
                interfaceC1276g.mo3578c();
            }
        }
    }

    /* compiled from: TextViewBindingAdapter.java */
    /* renamed from: n2.e$b */
    /* loaded from: classes.dex */
    public interface InterfaceC7631b {
        void afterTextChanged(Editable editable);
    }

    /* compiled from: TextViewBindingAdapter.java */
    /* renamed from: n2.e$c */
    /* loaded from: classes.dex */
    public interface InterfaceC7632c {
        void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    /* compiled from: TextViewBindingAdapter.java */
    /* renamed from: n2.e$d */
    /* loaded from: classes.dex */
    public interface InterfaceC7633d {
        void onTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: a */
    public static String m17891a(TextView textView) {
        return textView.getText().toString();
    }

    /* renamed from: b */
    private static boolean m17890b(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m17889c(TextView textView, Drawable drawable) {
        if (Build.VERSION.SDK_INT < 17) {
            m17888d(textView, drawable);
            return;
        }
        m17886f(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
    }

    /* renamed from: d */
    public static void m17888d(TextView textView, Drawable drawable) {
        m17886f(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    /* renamed from: e */
    public static void m17887e(TextView textView, Drawable drawable) {
        m17886f(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
    }

    /* renamed from: f */
    private static void m17886f(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    /* renamed from: g */
    public static void m17885g(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!m17890b(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    /* renamed from: h */
    public static void m17884h(TextView textView, InterfaceC7632c interfaceC7632c, InterfaceC7633d interfaceC7633d, InterfaceC7631b interfaceC7631b, InterfaceC1276g interfaceC1276g) {
        C7630a c7630a = (interfaceC7632c == null && interfaceC7631b == null && interfaceC7633d == null && interfaceC1276g == null) ? null : new C7630a(interfaceC7632c, interfaceC7633d, interfaceC1276g, interfaceC7631b);
        TextWatcher textWatcher = (TextWatcher) C7628d.m17892a(textView, c7630a, C8399a.textWatcher);
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (c7630a != null) {
            textView.addTextChangedListener(c7630a);
        }
    }
}

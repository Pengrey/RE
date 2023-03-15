package p221le;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AlignmentSpan;
import android.widget.DatePicker;
import android.widget.Toast;
import androidx.activity.result.AbstractC0304b;
import androidx.appcompat.app.ActivityC0325c;
import androidx.appcompat.app.DialogC0323b;
import com.github.aachartmodel.aainfographics.BuildConfig;
import ge.C5646c;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p221le.UiWidgets;
import p468yc.C13195u;

/* renamed from: le.h */
/* loaded from: classes2.dex */
public final class UiWidgets {

    /* renamed from: a */
    private final ActivityC0325c f18698a;

    /* renamed from: b */
    private final int f18699b;

    /* renamed from: c */
    private final int f18700c;

    /* renamed from: d */
    private final SimpleDateFormat f18701d;

    /* renamed from: e */
    private Toast f18702e;

    /* renamed from: f */
    private Dialog f18703f;

    /* renamed from: g */
    private DatePickerDialog f18704g;

    /* compiled from: UiWidgets.kt */
    /* renamed from: le.h$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC7044a {
        /* renamed from: a */
        void m19483a(boolean z);
    }

    /* compiled from: UiWidgets.kt */
    /* renamed from: le.h$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC7045b {
        /* renamed from: a */
        void m19482a(String str);
    }

    /* compiled from: UiWidgets.kt */
    /* renamed from: le.h$c */
    /* loaded from: classes2.dex */
    public static final class C7046c {
        private C7046c() {
        }

        public /* synthetic */ C7046c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: UiWidgets.kt */
    /* renamed from: le.h$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC7047d {
        void onDismiss();
    }

    /* compiled from: UiWidgets.kt */
    /* renamed from: le.h$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC7048e {
        /* renamed from: a */
        void m19481a(Bitmap bitmap);
    }

    static {
        new C7046c(null);
    }

    public UiWidgets(ActivityC0325c activityC0325c, int i, int i2, SimpleDateFormat simpleDateFormat) {
        Intrinsics.isThisObjectNull(activityC0325c, "context");
        Intrinsics.isThisObjectNull(simpleDateFormat, "calendarDateFormat");
        this.f18698a = activityC0325c;
        this.f18699b = i;
        this.f18700c = i2;
        this.f18701d = simpleDateFormat;
    }

    /* renamed from: a */
    public static /* synthetic */ void m19508a(AbstractC0304b abstractC0304b, UiWidgets uiWidgets, DialogInterface dialogInterface, int i) {
        m19486w(abstractC0304b, uiWidgets, dialogInterface, i);
    }

    /* renamed from: b */
    public static /* synthetic */ void m19507b(InterfaceC7044a interfaceC7044a, DialogInterface dialogInterface, int i) {
        m19494o(interfaceC7044a, dialogInterface, i);
    }

    /* renamed from: c */
    public static /* synthetic */ void m19506c(SimpleDateFormat simpleDateFormat, UiWidgets uiWidgets, InterfaceC7045b interfaceC7045b, DatePicker datePicker, int i, int i2, int i3) {
        m19490s(simpleDateFormat, uiWidgets, interfaceC7045b, datePicker, i, i2, i3);
    }

    /* renamed from: d */
    public static /* synthetic */ void m19505d(InterfaceC7047d interfaceC7047d, DialogInterface dialogInterface, int i) {
        m19488u(interfaceC7047d, dialogInterface, i);
    }

    /* renamed from: e */
    public static /* synthetic */ void m19504e(InterfaceC7044a interfaceC7044a, DialogInterface dialogInterface, int i) {
        m19493p(interfaceC7044a, dialogInterface, i);
    }

    /* renamed from: f */
    public static /* synthetic */ void m19503f(AbstractC0304b abstractC0304b, UiWidgets uiWidgets, DialogInterface dialogInterface, int i) {
        m19485x(abstractC0304b, uiWidgets, dialogInterface, i);
    }

    /* renamed from: g */
    private final C13195u m19502g() {
        DatePickerDialog datePickerDialog = this.f18704g;
        if (datePickerDialog != null) {
            datePickerDialog.cancel();
            return C13195u.f34156a;
        }
        return null;
    }

    /* renamed from: h */
    private final C13195u m19501h() {
        Dialog dialog = this.f18703f;
        if (dialog != null) {
            dialog.cancel();
            return C13195u.f34156a;
        }
        return null;
    }

    /* renamed from: i */
    private final C13195u m19500i() {
        Toast toast = this.f18702e;
        if (toast != null) {
            toast.cancel();
            return C13195u.f34156a;
        }
        return null;
    }

    /* renamed from: k */
    public static /* synthetic */ void m19498k(UiWidgets uiWidgets, SimpleDateFormat simpleDateFormat, String str, long j, int i, InterfaceC7045b interfaceC7045b, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i = 18;
        }
        uiWidgets.m19499j(simpleDateFormat, str, j2, i, interfaceC7045b);
    }

    /* renamed from: n */
    public static /* synthetic */ void m19495n(UiWidgets uiWidgets, String str, String str2, String str3, String str4, InterfaceC7044a interfaceC7044a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = BuildConfig.VERSION_NAME;
        }
        uiWidgets.m19496m(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, interfaceC7044a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m19494o(InterfaceC7044a interfaceC7044a, DialogInterface dialogInterface, int i) {
        Intrinsics.isThisObjectNull(interfaceC7044a, "$callback");
        dialogInterface.dismiss();
        interfaceC7044a.m19483a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m19493p(InterfaceC7044a interfaceC7044a, DialogInterface dialogInterface, int i) {
        Intrinsics.isThisObjectNull(interfaceC7044a, "$callback");
        dialogInterface.dismiss();
        interfaceC7044a.m19483a(false);
    }

    /* renamed from: r */
    public static /* synthetic */ void m19491r(UiWidgets uiWidgets, SimpleDateFormat simpleDateFormat, String str, long j, long j2, InterfaceC7045b interfaceC7045b, int i, Object obj) {
        uiWidgets.m19492q(simpleDateFormat, (i & 2) != 0 ? null : str, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2, interfaceC7045b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m19490s(SimpleDateFormat simpleDateFormat, UiWidgets uiWidgets, InterfaceC7045b interfaceC7045b, DatePicker datePicker, int i, int i2, int i3) {
        String valueOf;
        String valueOf2;
        Date parse;
        Intrinsics.isThisObjectNull(simpleDateFormat, "$dateFormat");
        Intrinsics.isThisObjectNull(uiWidgets, "this$0");
        Intrinsics.isThisObjectNull(interfaceC7045b, "$callback");
        if (i2 < 9) {
            valueOf = "0" + (i2 + 1);
        } else {
            valueOf = String.valueOf(i2 + 1);
        }
        if (i3 < 10) {
            valueOf2 = "0" + i3;
        } else {
            valueOf2 = String.valueOf(i3);
        }
        String str = valueOf2 + "/" + valueOf + "/" + i;
        try {
            parse = uiWidgets.f18701d.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (parse == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.util.Date");
        }
        String format = simpleDateFormat.format(parse);
        Intrinsics.checkIfNull(format, "dateFormat.format(calend…rmat.parse(date) as Date)");
        str = format;
        interfaceC7045b.m19482a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m19488u(InterfaceC7047d interfaceC7047d, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (interfaceC7047d != null) {
            interfaceC7047d.onDismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m19486w(AbstractC0304b abstractC0304b, UiWidgets uiWidgets, DialogInterface dialogInterface, int i) {
        Intrinsics.isThisObjectNull(abstractC0304b, "$camaraLauncher");
        Intrinsics.isThisObjectNull(uiWidgets, "this$0");
        abstractC0304b.m41324a(Intent.createChooser(new Intent("android.media.action.IMAGE_CAPTURE"), uiWidgets.f18698a.getString(C5646c.dialog_for_photo_source_camera)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m19485x(AbstractC0304b abstractC0304b, UiWidgets uiWidgets, DialogInterface dialogInterface, int i) {
        Intrinsics.isThisObjectNull(abstractC0304b, "$galleryLauncher");
        Intrinsics.isThisObjectNull(uiWidgets, "this$0");
        abstractC0304b.m41324a(Intent.createChooser(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), uiWidgets.f18698a.getString(C5646c.dialog_for_photo_source_album)));
    }

    /* renamed from: j */
    public final void m19499j(SimpleDateFormat simpleDateFormat, String str, long j, int i, InterfaceC7045b interfaceC7045b) {
        Intrinsics.isThisObjectNull(simpleDateFormat, "dateFormat");
        Intrinsics.isThisObjectNull(str, "initDate");
        Intrinsics.isThisObjectNull(interfaceC7045b, "callback");
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -i);
        C13195u c13195u = C13195u.f34156a;
        m19492q(simpleDateFormat, str, j, calendar.getTimeInMillis(), interfaceC7045b);
    }

    /* renamed from: l */
    public final void m19497l(String str, Spanned spanned, String str2, String str3, final InterfaceC7044a interfaceC7044a) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(spanned, "message");
        Intrinsics.isThisObjectNull(interfaceC7044a, "callback");
        m19501h();
        if (this.f18698a.isFinishing()) {
            return;
        }
        DialogC0323b.C0324a m41263q = new DialogC0323b.C0324a(this.f18698a, this.f18699b).m41272h(spanned).m41276d(false).m41263q(str);
        if (str2 == null) {
            str2 = this.f18698a.getString(C5646c.dialog_btn_yes);
            Intrinsics.checkIfNull(str2, "context.getString(R.string.dialog_btn_yes)");
        }
        DialogC0323b.C0324a m41266n = m41263q.m41266n(str2, new DialogInterface.OnClickListener() { // from class: le.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UiWidgets.m19494o(UiWidgets.InterfaceC7044a.this, dialogInterface, i);
            }
        });
        if (str3 == null) {
            str3 = this.f18698a.getString(C5646c.dialog_btn_no);
            Intrinsics.checkIfNull(str3, "context.getString(R.string.dialog_btn_no)");
        }
        DialogC0323b m41279a = m41266n.m41270j(str3, new DialogInterface.OnClickListener() { // from class: le.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UiWidgets.m19493p(UiWidgets.InterfaceC7044a.this, dialogInterface, i);
            }
        }).m41279a();
        this.f18703f = m41279a;
        m41279a.show();
    }

    /* renamed from: m */
    public final void m19496m(String str, String str2, String str3, String str4, InterfaceC7044a interfaceC7044a) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(str2, "message");
        Intrinsics.isThisObjectNull(interfaceC7044a, "callback");
        m19497l(str, new SpannableString(str2), str3, str4, interfaceC7044a);
    }

    /* renamed from: q */
    public final void m19492q(final SimpleDateFormat simpleDateFormat, String str, long j, long j2, final InterfaceC7045b interfaceC7045b) {
        Intrinsics.isThisObjectNull(simpleDateFormat, "dateFormat");
        Intrinsics.isThisObjectNull(interfaceC7045b, "callback");
        if (this.f18698a.isFinishing()) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        boolean z = false;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            }
        }
        if (z) {
            try {
                Date parse = simpleDateFormat.parse(str);
                if (parse == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.util.Date");
                }
                calendar.setTime(parse);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        m19502g();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.f18698a, this.f18700c, new DatePickerDialog.OnDateSetListener() { // from class: le.b
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                UiWidgets.m19490s(simpleDateFormat, this, interfaceC7045b, datePicker, i, i2, i3);
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        this.f18704g = datePickerDialog;
        if (j2 != 0) {
            datePickerDialog.getDatePicker().setMaxDate(j2);
        }
        if (j != 0) {
            datePickerDialog.getDatePicker().setMinDate(j);
        }
        datePickerDialog.show();
    }

    /* renamed from: t */
    public final void m19489t(String str, Spanned spanned, final InterfaceC7047d interfaceC7047d) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(spanned, "message");
        m19501h();
        if (this.f18698a.isFinishing()) {
            return;
        }
        DialogC0323b m41279a = new DialogC0323b.C0324a(this.f18698a, this.f18699b).m41272h(spanned).m41263q(str).m41276d(false).m41269k(17039370, new DialogInterface.OnClickListener() { // from class: le.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UiWidgets.m19488u(UiWidgets.InterfaceC7047d.this, dialogInterface, i);
            }
        }).m41279a();
        this.f18703f = m41279a;
        m41279a.show();
    }

    /* renamed from: v */
    public final void m19487v(final AbstractC0304b abstractC0304b, final AbstractC0304b abstractC0304b2) {
        Intrinsics.isThisObjectNull(abstractC0304b, "camaraLauncher");
        Intrinsics.isThisObjectNull(abstractC0304b2, "galleryLauncher");
        if (this.f18698a.isFinishing()) {
            return;
        }
        new DialogC0323b.C0324a(this.f18698a, this.f18699b).m41273g(C5646c.dialog_for_photo_source).m41267m(C5646c.dialog_for_photo_source_camera, new DialogInterface.OnClickListener() { // from class: le.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UiWidgets.m19486w(AbstractC0304b.this, this, dialogInterface, i);
            }
        }).m41271i(C5646c.dialog_for_photo_source_album, new DialogInterface.OnClickListener() { // from class: le.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UiWidgets.m19485x(AbstractC0304b.this, this, dialogInterface, i);
            }
        }).m41261s();
    }

    /* renamed from: y */
    public final void m19484y(String str) {
        Intrinsics.isThisObjectNull(str, "message");
        m19500i();
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, str.length() - 1, 18);
        Toast makeText = Toast.makeText(this.f18698a, spannableString, 1);
        this.f18702e = makeText;
        makeText.show();
    }
}

package ai;

import ai.SpeechRecognizerBehavior;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0325c;
import androidx.core.content.C0928a;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.bottomsheet.DialogC3502a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p106fe.C5456c;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p221le.UiWidgets;
import p378u5.C10841b;
import p378u5.ResourcesProvider;
import p426wg.AbstractC11832j6;

/* renamed from: ai.t */
/* loaded from: classes2.dex */
public interface SpeechRecognizerBehavior extends RecognitionListener {

    /* compiled from: SpeechRecognizerBehavior.kt */
    /* renamed from: ai.t$a */
    /* loaded from: classes2.dex */
    public static final class C0167a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SpeechRecognizerBehavior.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.base.behaviors.SpeechRecognizerBehavior$DefaultImpls", m20196f = "SpeechRecognizerBehavior.kt", m20195l = {205}, m20194m = "launchAudioRecorder")
        /* renamed from: ai.t$a$a */
        /* loaded from: classes2.dex */
        public static final class C0168a extends AbstractC6757d {

            /* renamed from: w */
            Object f351w;

            /* renamed from: x */
            Object f352x;

            /* renamed from: y */
            /* synthetic */ Object f353y;

            /* renamed from: z */
            int f354z;

            C0168a(InterfaceC1886d interfaceC1886d) {
                super(interfaceC1886d);
            }

            public final Object invokeSuspend(Object obj) {
                this.f353y = obj;
                this.f354z |= Integer.MIN_VALUE;
                return C0167a.m41714m(null, null, this);
            }
        }

        /* compiled from: SpeechRecognizerBehavior.kt */
        /* renamed from: ai.t$a$b */
        /* loaded from: classes2.dex */
        public static final class C0169b implements UiWidgets.InterfaceC7047d {

            /* renamed from: a */
            final /* synthetic */ ActivityC0325c f355a;

            C0169b(ActivityC0325c activityC0325c) {
                this.f355a = activityC0325c;
            }

            public void onDismiss() {
                this.f355a.startActivity(C5456c.m24291a("com.google.android.googlequicksearchbox"));
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m41726a(SpeechRecognizerBehavior speechRecognizerBehavior, DialogC3502a dialogC3502a, View view) {
            m41717j(speechRecognizerBehavior, dialogC3502a, view);
        }

        /* renamed from: b */
        public static /* synthetic */ void m41725b(SpeechRecognizerBehavior speechRecognizerBehavior, ActivityC0325c activityC0325c, View view) {
            m41716k(speechRecognizerBehavior, activityC0325c, view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m41724c(SpeechRecognizerBehavior speechRecognizerBehavior, DialogInterface dialogInterface) {
            m41718i(speechRecognizerBehavior, dialogInterface);
        }

        /* renamed from: d */
        public static /* synthetic */ void m41723d(SpeechRecognizerBehavior speechRecognizerBehavior, View view) {
            m41715l(speechRecognizerBehavior, view);
        }

        /* renamed from: e */
        public static void m41722e(SpeechRecognizerBehavior speechRecognizerBehavior) {
            speechRecognizerBehavior.m41736B().cancel();
            speechRecognizerBehavior.m41734e(false);
            m41707t(speechRecognizerBehavior);
            speechRecognizerBehavior.m41733f();
        }

        /* renamed from: f */
        public static SpeechRecognizer m41721f(SpeechRecognizerBehavior speechRecognizerBehavior, ActivityC0325c activityC0325c) {
            Intrinsics.isThisObjectNull(activityC0325c, "receiver");
            SpeechRecognizer createSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(activityC0325c);
            createSpeechRecognizer.setRecognitionListener(speechRecognizerBehavior);
            Intrinsics.checkIfNull(createSpeechRecognizer, "createSpeechRecognizer(t…eechRecognizerBehavior) }");
            return createSpeechRecognizer;
        }

        /* renamed from: g */
        public static AbstractC11832j6 m41720g(SpeechRecognizerBehavior speechRecognizerBehavior, ActivityC0325c activityC0325c) {
            Intrinsics.isThisObjectNull(activityC0325c, "receiver");
            AbstractC11832j6 m4145Q = AbstractC11832j6.m4145Q(activityC0325c.getLayoutInflater());
            Intrinsics.checkIfNull(m4145Q, "inflate(\n            layoutInflater\n        )");
            return m4145Q;
        }

        /* renamed from: h */
        public static DialogC3502a m41719h(final SpeechRecognizerBehavior speechRecognizerBehavior, final ActivityC0325c activityC0325c) {
            Intrinsics.isThisObjectNull(activityC0325c, "receiver");
            final DialogC3502a dialogC3502a = new DialogC3502a(activityC0325c);
            dialogC3502a.setContentView(speechRecognizerBehavior.m41727x().m37802s());
            dialogC3502a.setCancelable(false);
            dialogC3502a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ai.p
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    SpeechRecognizerBehavior.C0167a.m41718i(SpeechRecognizerBehavior.this, dialogInterface);
                }
            });
            speechRecognizerBehavior.m41727x().f30674x.setOnClickListener(new View.OnClickListener() { // from class: ai.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SpeechRecognizerBehavior.C0167a.m41717j(SpeechRecognizerBehavior.this, dialogC3502a, view);
                }
            });
            speechRecognizerBehavior.m41727x().f30671C.setOnClickListener(new View.OnClickListener() { // from class: ai.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SpeechRecognizerBehavior.C0167a.m41716k(SpeechRecognizerBehavior.this, activityC0325c, view);
                }
            });
            speechRecognizerBehavior.m41727x().f30676z.setOnClickListener(new View.OnClickListener() { // from class: ai.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SpeechRecognizerBehavior.C0167a.m41715l(SpeechRecognizerBehavior.this, view);
                }
            });
            speechRecognizerBehavior.m41733f();
            return dialogC3502a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static void m41718i(SpeechRecognizerBehavior speechRecognizerBehavior, DialogInterface dialogInterface) {
            Intrinsics.isThisObjectNull(speechRecognizerBehavior, "this$0");
            m41707t(speechRecognizerBehavior);
            speechRecognizerBehavior.m41733f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public static void m41717j(SpeechRecognizerBehavior speechRecognizerBehavior, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(speechRecognizerBehavior, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            speechRecognizerBehavior.m41729r(BuildConfig.VERSION_NAME);
            speechRecognizerBehavior.m41728t();
            dialogC3502a.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static void m41716k(SpeechRecognizerBehavior speechRecognizerBehavior, ActivityC0325c activityC0325c, View view) {
            Intrinsics.isThisObjectNull(speechRecognizerBehavior, "this$0");
            Intrinsics.isThisObjectNull(activityC0325c, "$this_initializeVoiceBottomSheetDialog");
            if (!speechRecognizerBehavior.m41735c()) {
                SpeechRecognizer m41736B = speechRecognizerBehavior.m41736B();
                Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                intent.putExtra("android.speech.extra.LANGUAGE", Locale.getDefault().toString());
                intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
                intent.putExtra("calling_package", activityC0325c.getPackageName());
                m41736B.startListening(intent);
                speechRecognizerBehavior.m41734e(true);
                return;
            }
            speechRecognizerBehavior.m41728t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public static void m41715l(SpeechRecognizerBehavior speechRecognizerBehavior, View view) {
            Intrinsics.isThisObjectNull(speechRecognizerBehavior, "this$0");
            if (speechRecognizerBehavior.m41730q().length() > 0) {
                speechRecognizerBehavior.m41737A(speechRecognizerBehavior.m41730q());
                speechRecognizerBehavior.m41729r(BuildConfig.VERSION_NAME);
                speechRecognizerBehavior.m41733f();
                speechRecognizerBehavior.m41727x().f30671C.performClick();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
        /* renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object m41714m(ai.SpeechRecognizerBehavior r6, androidx.appcompat.app.ActivityC0325c r7, bd.InterfaceC1886d r8) {
            /*
                boolean r0 = r8 instanceof ai.SpeechRecognizerBehavior.C0167a.C0168a
                if (r0 == 0) goto L13
                r0 = r8
                ai.t$a$a r0 = (ai.SpeechRecognizerBehavior.C0167a.C0168a) r0
                int r1 = r0.f354z
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f354z = r1
                goto L18
            L13:
                ai.t$a$a r0 = new ai.t$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f353y
                java.lang.Object r1 = cd.C2111b.m34640d()
                int r2 = r0.f354z
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f352x
                r7 = r6
                androidx.appcompat.app.c r7 = (androidx.appcompat.app.ActivityC0325c) r7
                java.lang.Object r6 = r0.f351w
                ai.t r6 = (ai.SpeechRecognizerBehavior) r6
                p468yc.C13186n.m1453b(r8)
                goto L57
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                p468yc.C13186n.m1453b(r8)
                r8 = 0
                java.lang.String[] r8 = new java.lang.String[r8]
                java.lang.String r2 = "android.permission.RECORD_AUDIO"
                l5.c r8 = p249n5.PermissionsBuilder.m17728b(r7, r2, r8)
                o5.b r8 = r8.build()
                r0.f351w = r6
                r0.f352x = r7
                r0.f354z = r3
                java.lang.Object r8 = p234m5.SuspendExtensions.m19106a(r8, r0)
                if (r8 != r1) goto L57
                return r1
            L57:
                java.util.List r8 = (java.util.List) r8
                boolean r0 = p195k5.C6599b.m20515a(r8)
                if (r0 == 0) goto L67
                com.google.android.material.bottomsheet.a r6 = r6.m41731m()
                r6.show()
                goto L8d
            L67:
                boolean r6 = p195k5.C6599b.m20514b(r8)
                if (r6 == 0) goto L8d
                le.a r0 = p221le.UiEventsLiveData.f18671a
                r6 = 2131886293(0x7f1200d5, float:1.940716E38)
                java.lang.String r1 = r7.getString(r6)
                java.lang.String r6 = "getString(R.string.dialog_caution_title)"
                p181jd.Intrinsics.checkIfNull(r1, r6)
                r6 = 2131886736(0x7f120290, float:1.940806E38)
                java.lang.String r2 = r7.getString(r6)
                java.lang.String r6 = "getString(R.string.lbl_permission_denied)"
                p181jd.Intrinsics.checkIfNull(r2, r6)
                r3 = 0
                r4 = 4
                r5 = 0
                p221le.UiEventsLiveData.m19514p(r0, r1, r2, r3, r4, r5)
            L8d:
                yc.u r6 = p468yc.C13195u.f34156a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.SpeechRecognizerBehavior.C0167a.m41714m(ai.t, androidx.appcompat.app.c, bd.d):java.lang.Object");
        }

        /* renamed from: n */
        public static void m41713n(SpeechRecognizerBehavior speechRecognizerBehavior) {
            TextView textView = speechRecognizerBehavior.m41727x().f30673E;
            textView.setText(BuildConfig.VERSION_NAME);
            textView.setHint(textView.getContext().getString(C2336R.string.lbl_shopping_speech_to_text_on_begin));
            speechRecognizerBehavior.m41727x().f30672D.setVisibility(0);
        }

        /* renamed from: o */
        public static void m41712o(SpeechRecognizerBehavior speechRecognizerBehavior) {
            TextView textView = speechRecognizerBehavior.m41727x().f30673E;
            textView.setText(BuildConfig.VERSION_NAME);
            textView.setHint(textView.getContext().getString(C2336R.string.lbl_shopping_speech_to_text_on_end));
            speechRecognizerBehavior.m41727x().f30672D.setVisibility(4);
        }

        /* renamed from: p */
        public static void m41711p(SpeechRecognizerBehavior speechRecognizerBehavior, int i) {
            if (i == 3) {
                speechRecognizerBehavior.m41728t();
                speechRecognizerBehavior.onResults(null);
                speechRecognizerBehavior.m41732g();
            } else if (i != 8) {
                speechRecognizerBehavior.m41728t();
                speechRecognizerBehavior.onResults(null);
            }
        }

        /* renamed from: q */
        public static void m41710q(SpeechRecognizerBehavior speechRecognizerBehavior, Bundle bundle) {
            ArrayList<String> stringArrayList;
            String str = null;
            if (bundle != null && (stringArrayList = bundle.getStringArrayList("results_recognition")) != null) {
                str = stringArrayList.get(0);
            }
            if (str != null) {
                if (str.length() > 0) {
                    TextView textView = speechRecognizerBehavior.m41727x().f30673E;
                    textView.setText(BuildConfig.VERSION_NAME);
                    textView.setHint(str);
                }
            }
        }

        /* renamed from: r */
        public static void m41709r(SpeechRecognizerBehavior speechRecognizerBehavior, Bundle bundle) {
            TextView textView = speechRecognizerBehavior.m41727x().f30673E;
            textView.setText(BuildConfig.VERSION_NAME);
            textView.setHint(textView.getContext().getString(C2336R.string.lbl_shopping_speech_to_text_on_ready));
            speechRecognizerBehavior.m41733f();
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            if (r9 == null) goto L21;
         */
        /* renamed from: s */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void m41708s(ai.SpeechRecognizerBehavior r8, android.os.Bundle r9) {
            /*
                r0 = 0
                r8.m41734e(r0)
                java.lang.String r1 = ""
                if (r9 == 0) goto L1a
                java.lang.String r2 = "results_recognition"
                java.util.ArrayList r9 = r9.getStringArrayList(r2)
                if (r9 == 0) goto L17
                java.lang.Object r9 = r9.get(r0)
                java.lang.String r9 = (java.lang.String) r9
                goto L18
            L17:
                r9 = 0
            L18:
                if (r9 != 0) goto L1b
            L1a:
                r9 = r1
            L1b:
                int r2 = r9.length()
                r3 = 1
                if (r2 != 0) goto L24
                r2 = r3
                goto L25
            L24:
                r2 = r0
            L25:
                if (r2 == 0) goto L3c
                wg.j6 r8 = r8.m41727x()
                android.widget.TextView r8 = r8.f30673E
                android.content.Context r9 = r8.getContext()
                r0 = 2131886839(0x7f1202f7, float:1.9408268E38)
                java.lang.String r9 = r9.getString(r0)
                r8.setHint(r9)
                goto Lb4
            L3c:
                wg.j6 r2 = r8.m41727x()
                android.widget.TextView r2 = r2.f30670B
                r2.setText(r9)
                wg.j6 r2 = r8.m41727x()
                androidx.constraintlayout.widget.ConstraintLayout r2 = r2.f30669A
                r2.setVisibility(r0)
                wg.j6 r2 = r8.m41727x()
                android.widget.TextView r2 = r2.f30675y
                r2.setVisibility(r0)
                wg.j6 r0 = r8.m41727x()
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r0.f30671C
                p181jd.Intrinsics.checkIfNull(r0, r1)
                u5.a r1 = p378u5.C10841b.m6897b(r0)
                r2 = 2131230991(0x7f08010f, float:1.807805E38)
                android.content.Context r1 = r1.m6899a()
                android.graphics.drawable.Drawable r1 = androidx.core.content.C0928a.m39111f(r1, r2)
                r0.setImageDrawable(r1)
                u5.a r1 = p378u5.C10841b.m6897b(r0)
                r2 = 2130968815(0x7f0400ef, float:1.7546294E38)
                r4 = 2131951722(0x7f13006a, float:1.9539867E38)
                android.util.TypedValue r5 = new android.util.TypedValue
                r5.<init>()
                android.view.ContextThemeWrapper r6 = new android.view.ContextThemeWrapper
                android.content.Context r7 = r1.m6899a()
                r6.<init>(r7, r4)
                android.content.res.Resources$Theme r4 = r6.getTheme()
                r4.resolveAttribute(r2, r5, r3)
                int r2 = r5.resourceId
                android.content.Context r1 = r1.m6899a()
                int r1 = androidx.core.content.C0928a.m39113d(r1, r2)
                android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
                java.lang.String r2 = "ColorStateList.valueOf(c…r(attrResId, themeResId))"
                p181jd.Intrinsics.checkIfNull(r1, r2)
                r0.setBackgroundTintList(r1)
                com.google.android.material.bottomsheet.a r0 = r8.m41731m()
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto Lb4
                r8.m41729r(r9)
            Lb4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.SpeechRecognizerBehavior.C0167a.m41708s(ai.t, android.os.Bundle):void");
        }

        /* renamed from: t */
        private static void m41707t(SpeechRecognizerBehavior speechRecognizerBehavior) {
            TextView textView = speechRecognizerBehavior.m41727x().f30673E;
            textView.setText(BuildConfig.VERSION_NAME);
            textView.setHint(textView.getContext().getString(C2336R.string.lbl_shopping_speech_to_text_on_stop));
        }

        /* renamed from: u */
        public static void m41706u(SpeechRecognizerBehavior speechRecognizerBehavior) {
            speechRecognizerBehavior.m41727x().f30669A.setVisibility(4);
            speechRecognizerBehavior.m41727x().f30675y.setVisibility(4);
            speechRecognizerBehavior.m41727x().f30672D.setVisibility(4);
            FloatingActionButton floatingActionButton = speechRecognizerBehavior.m41727x().f30671C;
            Intrinsics.checkIfNull(floatingActionButton, BuildConfig.VERSION_NAME);
            floatingActionButton.setImageDrawable(C0928a.m39111f(C10841b.m6897b(floatingActionButton).m6899a(), C2336R.C2337drawable.ic_mic));
            ResourcesProvider m6897b = C10841b.m6897b(floatingActionButton);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6897b.m6899a(), 2131951721).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
            ColorStateList valueOf = ColorStateList.valueOf(C0928a.m39113d(m6897b.m6899a(), typedValue.resourceId));
            Intrinsics.checkIfNull(valueOf, "ColorStateList.valueOf(c…r(attrResId, themeResId))");
            floatingActionButton.setBackgroundTintList(valueOf);
        }

        /* renamed from: v */
        public static void m41705v(SpeechRecognizerBehavior speechRecognizerBehavior, ActivityC0325c activityC0325c) {
            Intrinsics.isThisObjectNull(activityC0325c, "receiver");
            UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
            String string = activityC0325c.getString(C2336R.string.dialog_caution_title);
            Intrinsics.checkIfNull(string, "getString(pt.pingodoce.a…ing.dialog_caution_title)");
            String string2 = activityC0325c.getString(C2336R.string.lbl_shopping_speech_to_text_audio_error);
            Intrinsics.checkIfNull(string2, "getString(pt.pingodoce.a…eech_to_text_audio_error)");
            uiEventsLiveData.m19515o(string, string2, new C0169b(activityC0325c));
        }
    }

    /* renamed from: A */
    void m41737A(String str);

    /* renamed from: B */
    SpeechRecognizer m41736B();

    /* renamed from: c */
    boolean m41735c();

    /* renamed from: e */
    void m41734e(boolean z);

    /* renamed from: f */
    void m41733f();

    /* renamed from: g */
    void m41732g();

    /* renamed from: m */
    DialogC3502a m41731m();

    void onResults(Bundle bundle);

    /* renamed from: q */
    String m41730q();

    /* renamed from: r */
    void m41729r(String str);

    /* renamed from: t */
    void m41728t();

    /* renamed from: x */
    AbstractC11832j6 m41727x();
}

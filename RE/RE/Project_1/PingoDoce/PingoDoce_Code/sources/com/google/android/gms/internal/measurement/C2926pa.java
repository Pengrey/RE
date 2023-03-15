package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.pa */
/* loaded from: classes.dex */
final class C2926pa {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m32202a(AbstractC2955r7 abstractC2955r7) {
        StringBuilder sb2 = new StringBuilder(abstractC2955r7.mo32153g());
        for (int i = 0; i < abstractC2955r7.mo32153g(); i++) {
            byte mo32155b = abstractC2955r7.mo32155b(i);
            if (mo32155b == 34) {
                sb2.append("\\\"");
            } else if (mo32155b == 39) {
                sb2.append("\\'");
            } else if (mo32155b != 92) {
                switch (mo32155b) {
                    case 7:
                        sb2.append("\\a");
                        continue;
                    case 8:
                        sb2.append("\\b");
                        continue;
                    case 9:
                        sb2.append("\\t");
                        continue;
                    case 10:
                        sb2.append("\\n");
                        continue;
                    case 11:
                        sb2.append("\\v");
                        continue;
                    case 12:
                        sb2.append("\\f");
                        continue;
                    case 13:
                        sb2.append("\\r");
                        continue;
                    default:
                        if (mo32155b >= 32 && mo32155b <= 126) {
                            sb2.append((char) mo32155b);
                            continue;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((mo32155b >>> 6) & 3) + 48));
                            sb2.append((char) (((mo32155b >>> 3) & 7) + 48));
                            sb2.append((char) ((mo32155b & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}

package com.auth0.android.jwt;

import com.google.gson.AbstractC4376l;
import com.google.gson.C4373i;
import com.google.gson.C4378n;
import com.google.gson.InterfaceC4374j;
import com.google.gson.InterfaceC4375k;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.auth0.android.jwt.c */
/* loaded from: classes.dex */
class C2261c implements InterfaceC4375k<C2262d> {
    /* renamed from: c */
    private Date m34260c(C4378n c4378n, String str) {
        if (c4378n.m27754y(str)) {
            return new Date(c4378n.m27755x(str).mo27749h() * 1000);
        }
        return null;
    }

    /* renamed from: d */
    private String m34259d(C4378n c4378n, String str) {
        if (c4378n.m27754y(str)) {
            return c4378n.m27755x(str).mo27748l();
        }
        return null;
    }

    /* renamed from: e */
    private List<String> m34258e(C4378n c4378n, String str) {
        List<String> emptyList = Collections.emptyList();
        if (c4378n.m27754y(str)) {
            AbstractC4376l m27755x = c4378n.m27755x(str);
            if (m27755x.m27761o()) {
                C4373i m27764b = m27755x.m27764b();
                ArrayList arrayList = new ArrayList(m27764b.size());
                for (int i = 0; i < m27764b.size(); i++) {
                    arrayList.add(m27764b.m27766v(i).mo27748l());
                }
                return arrayList;
            }
            return Collections.singletonList(m27755x.mo27748l());
        }
        return emptyList;
    }

    @Override // com.google.gson.InterfaceC4375k
    /* renamed from: b */
    public C2262d mo27765a(AbstractC4376l abstractC4376l, Type type, InterfaceC4374j interfaceC4374j) throws JsonParseException {
        if (!abstractC4376l.m27760p() && abstractC4376l.m27759q()) {
            C4378n m27763f = abstractC4376l.m27763f();
            String m34259d = m34259d(m27763f, "iss");
            String m34259d2 = m34259d(m27763f, "sub");
            Date m34260c = m34260c(m27763f, "exp");
            Date m34260c2 = m34260c(m27763f, "nbf");
            Date m34260c3 = m34260c(m27763f, "iat");
            String m34259d3 = m34259d(m27763f, "jti");
            List<String> m34258e = m34258e(m27763f, "aud");
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, AbstractC4376l> entry : m27763f.m27756v()) {
                hashMap.put(entry.getKey(), new C2260b(entry.getValue()));
            }
            return new C2262d(m34259d, m34259d2, m34260c, m34260c2, m34260c3, m34259d3, m34258e, hashMap);
        }
        throw new DecodeException("The token's payload had an invalid JSON format.");
    }
}

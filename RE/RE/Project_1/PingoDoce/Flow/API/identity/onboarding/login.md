Request:
```json
POST /api/v2/identity/onboarding/login HTTP/1.1
Host: app-proxy.pingodoce.pt
Pdapp-Storeid: 451
Pdapp-Cardnumber: 
Pdapp-Lcid: 
Pdapp-Hid: 
Pdapp-Clubs: 
X-App-Version: v-3.1.5 buildType-release flavor-prod
X-Device-Version: Android-29
X-Screen-Density: 3.5
Authorization: Bearer eyJhbGciOiJSUzUxMiIsInR5cCI6ImF0K2p3dCJ9.eyJuYmYiOjE2Nzk1OTUwMzcsImV4cCI6MTY3OTU5ODYzNywiaXNzIjoiaHR0cHM6Ly9hcHAtcHJveHkucGluZ29kb2NlLnB0LyIsImF1ZCI6InBkYXBwIiwiY2xpZW50X2lkIjoiUERBcHBDbGllbnQiLCJzdWIiOiJkN2YwMjliMi03NWZiLTQxMjItZmU0Yi0wOGRiMmI2ZDI0MTkiLCJhdXRoX3RpbWUiOjE2Nzk1OTE3MDAsImlkcCI6ImxvY2FsIiwic2NvcGUiOlsicGRhcHAuYW5vbnltb3VzX2FjY2VzcyIsIm9mZmxpbmVfYWNjZXNzIl0sImFtciI6WyJwd2QiXX0.X3XWYOkUZUumBH55erG-an3DICSlvm0eNjWzm74OzAyyDqnBXCp0UvIpN3vUwuIUELonR8-0Ogypfdh3DZwaDgiyG_mr3Ib80spWouz2FuAssxI4T7gU9JXi5GPDT4Oesr2i1swk_Dwgn5nqAK1k7Aeo-48EbhUTx0rKe1jqalCQVaiQk7oFxCpQQ9rCySPs0uo3CbN_XgQwLKc1BeVb_rrpEStm8H20IbNZF7-ONKmoaXlSZq_zV3GRQKMN7NX_nN9I_p64fOFydbK9V1bg8rawithDAjTOpr-BSaKhFMjGs94AGHYvixgZpvrBmg76d8OuHK9d6GjfdhhUgTFZQg
Accept-Language: en-US
Content-Type: application/json; charset=UTF-8
Content-Length: 129
Accept-Encoding: gzip, deflate
User-Agent: okhttp/4.10.0
Connection: close

{"phoneNumber":"<PHONE NUMBER>","password":"<PIN NUMBER>","consents":{"version":"","type":"","privacyUrl":"","termsOfUseUrl":"","title":""}}
```

Response:
```json
HTTP/1.1 200 OK
Connection: close
Content-Type: application/json; charset=utf-8
Date: Thu, 23 Mar 2023 18:16:16 GMT
Vary: Accept-Encoding
Request-Context: appId=cid-v1:b18b1f5c-1067-4634-a8b5-28282182ef3d
Strict-Transport-Security: max-age=2592000; preload
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Content-Security-Policy: default-src 'self'; object-src 'none'; frame-ancestors 'none'; sandbox allow-forms allow-same-origin allow-scripts; base-uri 'self';
X-Content-Security-Policy: default-src 'self'; object-src 'none'; frame-ancestors 'none'; sandbox allow-forms allow-same-origin allow-scripts; base-uri 'self';
Referrer-Policy: no-referrer
api-supported-versions: 1,2
X-Powered-By: ASP.NET
Content-Length: 1516

{"profile":{"userId":"3dfd4728-56d6-4720-4df1-08db26b5e22c","firstName":"%3Ciframe%20scr=http://pengrey.com%20%3C","lastName":"<Script>Alert(1);</Script>","phoneNumber":"<PHONE NUMBER>","email":"<EMAIL>","emailValidated":true,"loyaltyId":"64147ea7c77762af853639c2","householdId":"5826423315","customerStatus":"Registered","birthDate":"0001-01-01T00:00:00","ompdCard":"2442081034716"},"token":{"access_token":"eyJhbGciOiJSUzUxMiIsInR5cCI6ImF0K2p3dCJ9.eyJuYmYiOjE2Nzk1OTUzNzYsImV4cCI6MTY3OTU5ODk3NiwiaXNzIjoiaHR0cHM6Ly9 <SNIP> kYpGGhMj4xtUvWTALETrnIbNHL_jfPnLozR8GLDji366GRpzKsPvkqoSo_vIl03XqZznMGKe3QbrTq8f4PSDy_yDftzL8RbUaibjq69uTzmNbEaOxsvgAWmTLi5c1aFT7JoJPNoBv6xxJ-Fo-MhUD74_BDgHR9pUtmv88wHT_Mjx0GqvvKOC01tu1Lztzxo-jOtwON6J3ZTj-L4YIB3HbjaKwfhJ5RClcWd09RBJH1xKdyvyrEZ2BoIt8kmTw6gz-VOT3z0MHY1OpknL3Zk76OauD1e-RFkXCQ","expires_in":3600,"refresh_token":"Uph5gDEET5cTChNzUM0x1OXjFHhauOF88thOiCUZtzE","token_type":"Bearer","scope":"offline_access openid pdapp.anonymous_access pdapp.change_number pdapp.full_access pdapp.onboarding_access pdapp.sms_access"}}
```
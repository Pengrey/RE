Request:
```json
POST /api/v2/identity/pinrecoverywebandsms/recoverpin HTTP/1.1
Host: app-proxy.pingodoce.pt
Content-Type: application/json; charset=UTF-8
Content-Length: 27
Accept-Encoding: gzip, deflate
User-Agent: okhttp/4.10.0
Connection: close

{"phoneNumber":"939330480"}
```

Response:
```json
HTTP/1.1 200 OK
Connection: close
Content-Type: application/json; charset=utf-8
Date: Fri, 24 Mar 2023 14:11:51 GMT
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
Content-Length: 50

{"flow":"Email","maskedEmail":"p******@gmail.com"}
```
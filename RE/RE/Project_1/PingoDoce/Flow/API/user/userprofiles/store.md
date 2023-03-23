Request:
```json
GET /api/v2/user/userprofiles/store HTTP/1.1
Host: app-proxy.pingodoce.pt
Pdapp-Storeid: -1
Pdapp-Cardnumber: 
Pdapp-Lcid: 64147ea7c77762af853639c2
Pdapp-Hid: 5826423315
Pdapp-Clubs: 
X-App-Version: v-3.1.5 buildType-release flavor-prod
X-Device-Version: Android-29
X-Screen-Density: 3.5
Authorization: Bearer eyJhbGciOiJSUzUxMiIsInR5cCI6ImF0K2p3dCJ9.eyJuYmYiOjE2Nzk1OTUzNzYsImV4cCI6MTY3OTU5ODk3NiwiaXNzIjoiaHR0cHM6Ly9hcHAtcHJveHkucGluZ29kb2NlLnB0LyIsImF1ZCI6InBkYXBwIiwiY2xpZW50X2lkIjoiUERBcHBDbGllbnQiLCJzdWIiOiIzZGZkNDcyOC01NmQ2LTQ3MjAtNGRmMS0wOGRiMjZiNWUyMmMiLCJhdXRoX3RpbWUiOjE2Nzk1OTUzNzYsImlkcCI6ImxvY2FsIiwic2NvcGUiOlsib3BlbmlkIiwicGRhcHAuYW5vbnltb3VzX2FjY2VzcyIsInBkYXBwLmNoYW5nZV9udW1iZXIiLCJwZGFwcC5mdWxsX2FjY2VzcyIsInBkYXBwLm9uYm9hcmRpbmdfYWNjZXNzIiwicGRhcHAuc21zX2FjY2VzcyIsIm9mZmxpbmVfYWNjZXNzIl0sImFtciI6WyJwd2QiXX0.JXz6cbw81wkeA_GGtI2Ny06uuv0sgxjZ1zaLpupOo30j0XhtZ7QCkYpGGhMj4xtUvWTALETrnIbNHL_jfPnLozR8GLDji366GRpzKsPvkqoSo_vIl03XqZznMGKe3QbrTq8f4PSDy_yDftzL8RbUaibjq69uTzmNbEaOxsvgAWmTLi5c1aFT7JoJPNoBv6xxJ-Fo-MhUD74_BDgHR9pUtmv88wHT_Mjx0GqvvKOC01tu1Lztzxo-jOtwON6J3ZTj-L4YIB3HbjaKwfhJ5RClcWd09RBJH1xKdyvyrEZ2BoIt8kmTw6gz-VOT3z0MHY1OpknL3Zk76OauD1e-RFkXCQ
Accept-Language: en-US
Accept-Encoding: gzip, deflate
User-Agent: okhttp/4.10.0
Connection: close


```

Response:
```json
HTTP/1.1 200 OK
Connection: close
Content-Type: application/json; charset=utf-8
Date: Thu, 23 Mar 2023 18:16:18 GMT
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
Content-Length: 1264

{"id":814,"name":"Carlos Mardel","address":"Rua Carlos Mardel N.º 12\n1900-122 - Lisboa","phone":"+351 938875814","email":"recrutamentocentro@pingodoce.pt","schedules":[{"dayOfWeek":4,"openingTime":"2023-03-23T07:30:00","closingTime":"2023-03-23T21:00:00","isOnMaintenance":false},{"dayOfWeek":5,"openingTime":"2023-03-24T07:30:00","closingTime":"2023-03-24T21:00:00","isOnMaintenance":false},{"dayOfWeek":6,"openingTime":"2023-03-25T07:30:00","closingTime":"2023-03-25T21:00:00","isOnMaintenance":false},{"dayOfWeek":0,"openingTime":"2023-03-26T07:30:00","closingTime":"2023-03-26T21:00:00","isOnMaintenance":false},{"dayOfWeek":1,"openingTime":"2023-03-27T07:30:00","closingTime":"2023-03-27T21:00:00","isOnMaintenance":false},{"dayOfWeek":2,"openingTime":"2023-03-28T07:30:00","closingTime":"2023-03-28T21:00:00","isOnMaintenance":false},{"dayOfWeek":3,"openingTime":"2023-03-29T07:30:00","closingTime":"2023-03-29T21:00:00","isOnMaintenance":false}],"specialSchedules":[{"dayOfWeek":0,"openingTime":"2023-04-09T07:30:00","closingTime":"2023-04-09T14:00:00","isOnMaintenance":false}],"takeAwaySchedules":[],"coordinates":{"latitude":38.73405075073242,"longitude":-9.133259773254395},"isDefault":true,"distance":0.0,"isOnMaintenance":false,"searchEnabled":true}
```
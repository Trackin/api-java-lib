# api-java-lib
Java Library (BETA) to use the Trackin API. Get a quickstart to use our api with this library.

All the api request are already there, you just need to call them!

**Before anything, you need to specify your api key and subscription id:**

```java
ApiInvoker.setApiKey("trackinExt-zcjc-DUMMYBve52-APIawH7O6LfM-KEYcFnFOBC-1LZnIvQ");
ApiInvoker.setSubId(454l);

```
(this is an example, not live credentials)

Once this is set up, you can make your requests.

Creating a delivery is really easy, see the `createNewDeliveryExample` class!

The only required information is the contact you want to deliver. All the rest is optional!

** This library is still in Beta and can contain some small little bugs **
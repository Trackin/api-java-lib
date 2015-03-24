# api-java-lib
Java Library to use the Trackin API. Get a quickstart to use our api by using this library.

All the api request are already there, you just need to call them!

**Before anything, you need to specify your api key and subscription id:**

```java
ApiInvoker.setApiKey("trackinExt-zcjc-DUMMYBve52-APIawH7O6LfM-KEYcFnFOBC-1LZnIvQ");
ApiInvoker.setSubId(454l);

```

Once this is set up, you can make your requests.

Creating a delivery is really easy, see the `createNewDeliveryExample` class!

The only required information is the contact you want to deliver. All the rest is optionnal
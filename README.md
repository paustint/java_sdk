#Aria Java SDK

The Java SDK is a library that makes it easy to use the [Aria](http://www.ariasystems.com/) web services of Core API/Object-Query API/AdminTools API in your java application.

## Installation

Make sure the java version is 1.7.
```
* C:\Users>java -version
* java version "1.7.0_09"
* Java(TM) SE Runtime Environment (build 1.7.0_09-b05)
* Java HotSpot(TM) Client VM (build 23.5-b02, mixed mode, sharing)
```
Download the Java SDK library AriaSDK.jar from the dist folder and the dependent third-party libraries from the download folder of this java_sdk repository.

Import the above libraries to the java application from where the Aria APIs are to be called.

## Usage

1. Create an instance of the BaseAriaBillingDTO by specifying the dispatcher url and call type as CallType.REST or CallType.SOAP. Also specify the library type as LibraryType.CORE or LibraryType.ADMINTOOLS or LibraryType.OBJECT_QUERY. If library type is not specified, then it defaults to Core API.

            /*REST CALL*/
            BaseAriaBillingDTO baseAriaBillingDTO = new BaseAriaBillingDTO(
                        "https://secure.future.stage.ariasystems.net/api/ws/api_ws_class_dispatcher.php", "logger",
                        false/* Debug */, CallType.REST, OutPutFormat.OUTPUT_JSON, LibraryType.OBJECT_QUERY);

            /*SOAP CALL*/
            BaseAriaBillingDTO baseAriaBillingDTO = new BaseAriaBillingDTO(
                        "https://secure.future.stage.ariasystems.net/api/ws/api_ws_class_dispatcher.php", "logger",
                        false/* Debug */, CallType.SOAP, OutPutFormat.OUTPUT_JSON, LibraryType.OBJECT_QUERY);

	In the above example, "https://secure.future.stage.ariasystems.net/api/ws/api_ws_class_dispatcher.php" is the dispatcher url.
	In the case of Object-Query, the dispatcher url will be similar to "https://secure.future.stage.ariasystems.net/api/AriaQuery/objects.php".
	In the case of AdminTools, the dispatcher url will be similar to "https://admintools.future.stage.ariasystems.net/index.php/Dispatcher/index".

2. Instantiate the com.aria.sdk.classes.AriaBillingComplete with the above DTO. The AriaBillingComplete class has methods for each Core API of Aria.

            AriaBillingComplete ariaBillingComplete = AriaBillingBuilder.getAriaSDK(baseAriaBillingDTO);

      Similarly, to access the Object-Query APIs, instantiate the com.aria.sdk.classes.AriaBillingIntegration as follows.

            AriaBillingIntegration ariaBillingIntegration = AriaBillingBuilder.getAriaObjectSDK(baseAriaBillingDTO);

      Similarly, to access the AdminTools APIs, instantiate the com.aria.sdk.classes.AriaBillingAdministration as follows:
            AriaBillingAdministration ariaBillingAdministration = AriaBillingBuilder.getAriaAdminSDK(baseAriaBillingDTO);

3. Call the desired API method on the corresponding instance by passing appropriate inputs objects, client_no and auth_key.

	In the following example, a sample client_no of 100 and auth_key as 'zzzzz' is used.

            // Form the api inputs
            com.aria.common.shared.EventListRow eventListRow1 = new com.aria.common.shared.EventListRow();
            eventListRow1.setEventList(120L);
            com.aria.common.shared.EventListRow eventListRow2 = new com.aria.common.shared.EventListRow();
            eventListRow2.setEventList(130L);
            com.aria.common.shared.EventListArray eventListArray = new com.aria.common.shared.EventListArray();
            eventListArray.getEventListRow().add(eventListRow1);
            eventListArray.getEventListRow().add(eventListRow2);

            // Call the API
            Map<String,Object> hashMapReturnValues = ariaBillingComplete.subscribeEvents(100L,"zzzz", eventListArray);

4. The API response values can be read from the Map object returned by the API method as shown below.

            // Read the output from the map as below.
            System.out.println("error_code: " + hashMapReturnValues.get("error_code"));
            System.out.println("error_msg: " + hashMapReturnValues.get("error_msg"));

##More Information

Check out [Aria Developer Central](http://developer.ariasystems.net) for more examples, details, and support on [Aria](http://www.ariasystems.com/) services and features.

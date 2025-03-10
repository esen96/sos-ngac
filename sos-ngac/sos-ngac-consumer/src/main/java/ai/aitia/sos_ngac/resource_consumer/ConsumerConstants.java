package ai.aitia.sos_ngac.resource_consumer;

public class ConsumerConstants {
	
	// Members
	public static final String BASE_PACKAGE = "ai.aitia";
	
	public static final String INTERFACE_SECURE = "HTTP-SECURE-JSON";
	public static final String INTERFACE_INSECURE = "HTTP-INSECURE-JSON";
	public static final String HTTP_METHOD = "http-method";
	
	public static final String REQUEST_RESOURCE_SERVICE_DEFINITION = "request-resource";
	public static final String REQUEST_RESOURCE_URI = "/request";

	
	private ConsumerConstants() {
		throw new UnsupportedOperationException();
	}

}

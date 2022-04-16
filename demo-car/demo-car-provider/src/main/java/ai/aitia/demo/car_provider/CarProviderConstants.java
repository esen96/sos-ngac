package ai.aitia.demo.car_provider;

public class CarProviderConstants {
	
	//=================================================================================================
	// members
	
	public static final String BASE_PACKAGE = "ai.aitia";
	
	public static final String CREATE_CAR_SERVICE_DEFINITION = "create-car";
	public static final String GET_CAR_SERVICE_DEFINITION = "get-car";
	
	/* -------------------------------------------------------------------- */
	public static final String ADMIN_INTERFACE_SERVICE_DEFINITION = "admin-interface";
	public static final String QUERY_INTERFACE_SERVICE_DEFINITION = "query-interface";
	public static final String ADMIN_INTERFACE_URI = "/pai";
	public static final String QUERY_INTERFACE_URI = "/pqi";
	public static final String NGAC_SERVER_QUERY_API = "/pqapi/";
	public static final String NGAC_SERVER_ADMIN_API = "/paapi/";
	public static final String NGAC_SERVER_ADDRESS = "http://127.0.0.1:8001";
	/* -------------------------------------------------------------------- */
	
	public static final String INTERFACE_SECURE = "HTTP-SECURE-JSON";
	public static final String INTERFACE_INSECURE = "HTTP-INSECURE-JSON";
	public static final String HTTP_METHOD = "http-method";
	public static final String CAR_URI = "/car";
	public static final String BY_ID_PATH = "/{id}";
	public static final String PATH_VARIABLE_ID = "id";
	public static final String REQUEST_PARAM_KEY_BRAND = "request-param-brand";
	public static final String REQUEST_PARAM_BRAND = "brand";
	public static final String REQUEST_PARAM_KEY_COLOR = "request-param-color";
	public static final String REQUEST_PARAM_COLOR = "color";	
	
	//=================================================================================================
	// assistant methods

	//-------------------------------------------------------------------------------------------------
	private CarProviderConstants() {
		throw new UnsupportedOperationException();
	}
}

package test;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.NoNodeAvailableException;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;


public class Demo_ES {

	public static void main(String[] args) throws UnknownHostException {
	
	    Map<String, Object> json = new HashMap<String, Object>();
	    json.put("user","kimchy");
	    json.put("postDate",new Date());
	    json.put("message","trying out Elasticsearch");
	    TransportClient client = null;
	
	    try {
	    	client = new PreBuiltTransportClient(Settings.EMPTY)
	    	        .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300));
	    	
	    } catch (NoNodeAvailableException e) {
	        System.out.println(e.toString());
	    }
	
	    System.out.println("test");
	    client.close();
	}
}
package ro.tuc.dsrl.ds.handson.assig.two.client.communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import ro.tuc.dsrl.ds.handson.assig.two.common.entities.Car;
import ro.tuc.dsrl.ds.handson.assig.two.common.serviceinterfaces.IPriceService;
import ro.tuc.dsrl.ds.handson.assig.two.common.serviceinterfaces.ITaxService;
import ro.tuc.dsrl.ds.handson.assig.two.rpc.Naming;

import java.io.IOException;

/**
 * @Author: Technical University of Cluj-Napoca, Romania Distributed Systems,
 *          http://dsrl.coned.utcluj.ro/
 * @Module: assignment-two-client
 * @Since: Sep 24, 2015
 * @Description: Starting point of the Client application.
 */
public class ClientStart {
	private static final Log LOGGER = LogFactory.getLog(ClientStart.class);

	private ClientStart() {
	}

	public static void main(String[] args) throws IOException {
		ITaxService taxService = null;
		IPriceService priceService = null;
		try {
			taxService = Naming.lookup(ITaxService.class,
					ServerConnection.getInstance());
			priceService = Naming.lookup(IPriceService.class,
					ServerConnection.getInstance());

			Car car = new Car(2009, 2000, 1000);
			System.out.println("Tax value: "
					+ taxService.computeTax(car));
			System.out.println("Price value: " + priceService.computePrice(car));
			ServerConnection.getInstance().closeAll();
			
		} catch (Exception e) {
			LOGGER.error("",e);
			ServerConnection.getInstance().closeAll();
		}
	}
}

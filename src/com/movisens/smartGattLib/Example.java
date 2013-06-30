package com.movisens.smartGattLib;

import java.util.UUID;

import com.movisens.smartGattLib.characteristics.HeartRateMeasurement;


public class Example {

	public static void main(String[] args) {
		// onConnected
		// TODO: iterate over available services
		UUID serviceUuid = null;// service.getUuid();
		if (Service.HEART_RATE.equals(serviceUuid)) {

			// TODO: iterate over characteristics
			UUID characteristicUuid = null;// characteristic.getUuid();
			if (Characteristic.HEART_RATE_MEASUREMENT.equals(characteristicUuid)) {
				// TODO: Enable notification
			}
		}

		// onCharacteristicChanged
		UUID characteristicUuid = null;// characteristic.getUuid();
		if (Characteristic.HEART_RATE_MEASUREMENT.equals(characteristicUuid)) {
			byte[] value = null;// characteristic.getValue();
			HeartRateMeasurement hrm = new HeartRateMeasurement(value);
			hrm.getHr();
			hrm.getEe();
		}
	}
}
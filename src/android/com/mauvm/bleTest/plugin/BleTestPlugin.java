package com.mauvm.bleTest.plugin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BleTestPlugin extends CordovaPlugin {

	public boolean execute( String action, JSONArray data, CallbackContext callbackContext ) throws JSONException {

		if( action.equals( "test" ) ) {

			if( getPackageManager().hasSystemFeature( PackageManager.FEATURE_BLUETOOTH_LE ) ) {
				callbackContext.success();
			} else {
				callbackContext.error( "BLE not supported." );
			}

			return true;
		}

		return false;

	}

}

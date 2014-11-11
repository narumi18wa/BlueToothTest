package jp.itnav.derushio.bluetoothtest;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import jp.itnav.derushio.bluetoothmanager.BluetoothManagedActivity;


public class SendOnlyActivity extends BluetoothManagedActivity {

	public static final String BLUETOOTH_DEVICE_NAME = "deviceName";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_send_only);

		setTargetDeviceName(getIntent().getStringExtra(BLUETOOTH_DEVICE_NAME));
		Log.d("btAddress", getTargetDeviceName());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_send_only, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	public void mouseMoveUp(View v) {
		writeMessage("x0y-500s0m0e");
	}

	public void mouseMoveLeft(View v) {
		writeMessage("x-500y0s0m0e");
	}

	public void mouseMoveRight(View v) {
		writeMessage("x500y0s0m0e");
	}

	public void mouseMoveDown(View v) {
		writeMessage("x0y500s0m0e");
	}

	public void mouseActionClick(View v) {
		writeMessage("x0y0s0m1e");
	}

}

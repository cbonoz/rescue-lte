package gov.nist.oism.asd.ltecoveragetool.maps;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.here.sdk.core.GeoCoordinates;
import com.here.sdk.mapviewlite.MapScene;
import com.here.sdk.mapviewlite.MapStyle;

import java.util.Locale;

import gov.nist.oism.asd.ltecoveragetool.NewRecordingActivity;
import gov.nist.oism.asd.ltecoveragetool.R;
import gov.nist.oism.asd.ltecoveragetool.RecordActivity;
import gov.nist.oism.asd.ltecoveragetool.util.LteLog;

/**
 * Add a GeoJSON line to a map.
 * Used for both modes 1 and 2.
 */
public class GpsLineLayerActivity extends RecordActivity  implements LocationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // These items should be set up before the parent onCreate is called.
//        Mapbox.getInstance(getApplicationContext(), getString(R.string.testing_token));
        setContentView(R.layout.activity_record_mapping);
        findViewById(R.id.floor_button_layout).setVisibility(View.GONE); // hide floor buttons.
        mapMode = getIntent().getStringExtra(NewRecordingActivity.MAP_MODE_KEY);
        LteLog.d("selected_mapmode", mapMode);

        super.onCreate(savedInstanceState);

        // Get a MapViewLite instance from the layout.
        mapView = findViewById(R.id.map_view);
        mapView.onCreate(savedInstanceState);
//<<<<<<< HEAD
//        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
//        fusedLocationClient.getLastLocation()
//                .addOnSuccessListener(this, location -> {
//                    // Got last known location. In some rare situations this can be null.
//                    if (location != null) {
//                        // Logic to handle location object
//                        lastLat = location.getLatitude();
//                        lastLng = location.getLongitude();
//                        mapView.getCamera().setTarget(new GeoCoordinates(lastLat, lastLng));
//                    }
//                });
//        // This contains the MapView in XML and needs to be called after the access token is configured.
////        mapView = findViewById(R.id.mapView);
////        mapView.onCreate(savedInstanceState);
////        mapView.getMapAsync(this);
//=======
        Location location = getLastKnownLocation();
        lastLat = location.getLatitude();
        lastLng = location.getLongitude();
        mapView.getCamera().setTarget(new GeoCoordinates(lastLat, lastLng));
    }

    private void loadMapScene() {
        // Load a scene from the SDK to render the map with a map style.
        mapView.getMapScene().loadScene(MapStyle.NORMAL_DAY, new MapScene.LoadSceneCallback() {
            @Override
            public void onLoadScene(@Nullable MapScene.ErrorCode errorCode) {
                if (errorCode == null) {
                    mapView.getCamera().setZoomLevel(14);
                } else {
                    Log.d(getClass().getSimpleName(), "onLoadScene failed: " + errorCode.toString());
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
        loadMapScene();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }


    @Override
    public void onLocationChanged(Location location) {
        lastLat = location.getLatitude();
        lastLng = location.getLongitude();
        LteLog.d("loc", String.format(Locale.US, "%f, %f", lastLat, lastLng));
        mapView.getCamera().setTarget(new GeoCoordinates(lastLat, lastLng));
    }

    @Override
    public void onProviderDisabled(String provider) {
        Log.d("Latitude","disable");
    }

    @Override
    public void onProviderEnabled(String provider) {
        Log.d("Latitude","enable");
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        Log.d("Latitude","status");
    }
}
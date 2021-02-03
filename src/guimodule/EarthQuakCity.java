package guimodule;

import java.util.ArrayList;
import java.util.List;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class EarthQuakCity extends PApplet
{
	private UnfoldingMap map;
	public void setup() {
		size(950,600,OPENGL);
		map = new UnfoldingMap(this,200,50,700,500,new Google.GoogleMapProvider());
		map.zoomToLevel(2);
		MapUtils.createDefaultEventDispatcher(this, map);
		Location valLoc = new Location(-38.14f,-73.03f);
		SimplePointMarker val = new SimplePointMarker(valLoc);
		map.addMarker(val);
		Feature valEq = new PointFeature(valLoc);
		valEq.addProperty("title", "Valdivia,Chile");
		valEq.addProperty("magnitude", "9.5");
		valEq.addProperty("date", "May 22, 1960");
		valEq.addProperty("year", "1960");
		Marker valMk = new SimplePointMarker(valLoc,valEq.getProperties());
		map.addMarker(valMk);
		
		
		
	}
    public void draw() {
    	background(10);
    	map.draw();
     	addKey();
    }
	private void addKey() {
		// TODO Auto-generated method stub
		
	}
}
